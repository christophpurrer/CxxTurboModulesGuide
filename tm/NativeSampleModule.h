#ifdef __APPLE__

#pragma once

#if __has_include(<React-Codegen/AppSpecs/AppSpecs.h>) // CocoaPod headers on Apple
#include <React-Codegen/AppSpecs/AppSpecs.h>
#elif __has_include("AppSpecs/AppSpecs.h") // CMake headers on Android
#include "AppSpecs/AppSpecs.h"
#endif

NS_ASSUME_NONNULL_BEGIN

@interface NativeSampleModule : NSObject <NativeSampleModuleSpec>

@end

NS_ASSUME_NONNULL_END

#endif
