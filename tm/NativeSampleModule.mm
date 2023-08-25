#import "NativeSampleModule.h"
#import "NSString+Reverse.h"

@implementation NativeSampleModule

- (NSString *)reverseString:(NSString *)input {
    return [input reverse];
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeSampleModuleSpecJSI>(params);
}

@end
