#include "NativeSampleModuleCxx.h"

namespace facebook::react {

NativeSampleModuleCxx::NativeSampleModuleCxx(std::shared_ptr<CallInvoker> jsInvoker)
    : NativeSampleModuleCxxCxxSpec(std::move(jsInvoker)) {}

std::string NativeSampleModuleCxx::reverseString(jsi::Runtime& rt, std::string input) {
  return std::string(input.rbegin(), input.rend());
}

} // namespace facebook::react
