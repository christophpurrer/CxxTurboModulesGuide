#import "NSString+Reverse.h"

@implementation NSString (Reverse)

- (NSString *)reverse {
    NSString* string = [self copy];
    NSMutableString *reversedString = [NSMutableString string];
    NSInteger charIndex = [string length];
    while (charIndex > 0) {
        charIndex--;
        NSRange subStrRange = NSMakeRange(charIndex, 1);
        [reversedString appendString:[string substringWithRange:subStrRange]];
    }
    return reversedString;
}
@end
