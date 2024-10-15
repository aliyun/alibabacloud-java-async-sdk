// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TravelStandardQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TravelStandardQueryResponseBody</p>
 */
public class TravelStandardQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TravelStandardQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210bcc3a16583004579056128d33d7</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TravelStandardQueryResponseBody build() {
            return new TravelStandardQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TravelStandardQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardQueryResponseBody</p>
     */
    public static class MainReserveRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("open_service_type_list")
        private java.util.List < String > openServiceTypeList;

        @com.aliyun.core.annotation.NameInMap("rule_code")
        private Long ruleCode;

        @com.aliyun.core.annotation.NameInMap("rule_desc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("rule_id")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("rule_name")
        private String ruleName;

        private MainReserveRule(Builder builder) {
            this.openServiceTypeList = builder.openServiceTypeList;
            this.ruleCode = builder.ruleCode;
            this.ruleDesc = builder.ruleDesc;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainReserveRule create() {
            return builder().build();
        }

        /**
         * @return openServiceTypeList
         */
        public java.util.List < String > getOpenServiceTypeList() {
            return this.openServiceTypeList;
        }

        /**
         * @return ruleCode
         */
        public Long getRuleCode() {
            return this.ruleCode;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private java.util.List < String > openServiceTypeList; 
            private Long ruleCode; 
            private String ruleDesc; 
            private Long ruleId; 
            private String ruleName; 

            /**
             * open_service_type_list.
             */
            public Builder openServiceTypeList(java.util.List < String > openServiceTypeList) {
                this.openServiceTypeList = openServiceTypeList;
                return this;
            }

            /**
             * rule_code.
             */
            public Builder ruleCode(Long ruleCode) {
                this.ruleCode = ruleCode;
                return this;
            }

            /**
             * rule_desc.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * rule_id.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * rule_name.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public MainReserveRule build() {
                return new MainReserveRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardQueryResponseBody</p>
     */
    public static class ModuleConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ModuleConfigList(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleConfigList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ModuleConfigList build() {
                return new ModuleConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardQueryResponseBody</p>
     */
    public static class ReserveRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("main_reserve_rule")
        private MainReserveRule mainReserveRule;

        @com.aliyun.core.annotation.NameInMap("module_config_list")
        private java.util.List < ModuleConfigList> moduleConfigList;

        private ReserveRule(Builder builder) {
            this.mainReserveRule = builder.mainReserveRule;
            this.moduleConfigList = builder.moduleConfigList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReserveRule create() {
            return builder().build();
        }

        /**
         * @return mainReserveRule
         */
        public MainReserveRule getMainReserveRule() {
            return this.mainReserveRule;
        }

        /**
         * @return moduleConfigList
         */
        public java.util.List < ModuleConfigList> getModuleConfigList() {
            return this.moduleConfigList;
        }

        public static final class Builder {
            private MainReserveRule mainReserveRule; 
            private java.util.List < ModuleConfigList> moduleConfigList; 

            /**
             * main_reserve_rule.
             */
            public Builder mainReserveRule(MainReserveRule mainReserveRule) {
                this.mainReserveRule = mainReserveRule;
                return this;
            }

            /**
             * module_config_list.
             */
            public Builder moduleConfigList(java.util.List < ModuleConfigList> moduleConfigList) {
                this.moduleConfigList = moduleConfigList;
                return this;
            }

            public ReserveRule build() {
                return new ReserveRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activated_service_type_list")
        private java.util.List < String > activatedServiceTypeList;

        @com.aliyun.core.annotation.NameInMap("reserve_rule")
        private ReserveRule reserveRule;

        private Module(Builder builder) {
            this.activatedServiceTypeList = builder.activatedServiceTypeList;
            this.reserveRule = builder.reserveRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return activatedServiceTypeList
         */
        public java.util.List < String > getActivatedServiceTypeList() {
            return this.activatedServiceTypeList;
        }

        /**
         * @return reserveRule
         */
        public ReserveRule getReserveRule() {
            return this.reserveRule;
        }

        public static final class Builder {
            private java.util.List < String > activatedServiceTypeList; 
            private ReserveRule reserveRule; 

            /**
             * activated_service_type_list.
             */
            public Builder activatedServiceTypeList(java.util.List < String > activatedServiceTypeList) {
                this.activatedServiceTypeList = activatedServiceTypeList;
                return this;
            }

            /**
             * reserve_rule.
             */
            public Builder reserveRule(ReserveRule reserveRule) {
                this.reserveRule = reserveRule;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
