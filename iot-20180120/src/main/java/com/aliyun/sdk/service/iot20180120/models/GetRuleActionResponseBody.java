// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleActionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleActionResponseBody</p>
 */
public class GetRuleActionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleActionInfo")
    private RuleActionInfo ruleActionInfo;

    @NameInMap("Success")
    private Boolean success;

    private GetRuleActionResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.ruleActionInfo = builder.ruleActionInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleActionInfo
     */
    public RuleActionInfo getRuleActionInfo() {
        return this.ruleActionInfo;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private RuleActionInfo ruleActionInfo; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleActionInfo.
         */
        public Builder ruleActionInfo(RuleActionInfo ruleActionInfo) {
            this.ruleActionInfo = ruleActionInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRuleActionResponseBody build() {
            return new GetRuleActionResponseBody(this);
        } 

    } 

    public static class RuleActionInfo extends TeaModel {
        @NameInMap("Configuration")
        private String configuration;

        @NameInMap("ErrorActionFlag")
        private Boolean errorActionFlag;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("Type")
        private String type;

        private RuleActionInfo(Builder builder) {
            this.configuration = builder.configuration;
            this.errorActionFlag = builder.errorActionFlag;
            this.id = builder.id;
            this.ruleId = builder.ruleId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActionInfo create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return errorActionFlag
         */
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String configuration; 
            private Boolean errorActionFlag; 
            private Long id; 
            private Long ruleId; 
            private String type; 

            /**
             * Configuration.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * ErrorActionFlag.
             */
            public Builder errorActionFlag(Boolean errorActionFlag) {
                this.errorActionFlag = errorActionFlag;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleActionInfo build() {
                return new RuleActionInfo(this);
            } 

        } 

    }
}
