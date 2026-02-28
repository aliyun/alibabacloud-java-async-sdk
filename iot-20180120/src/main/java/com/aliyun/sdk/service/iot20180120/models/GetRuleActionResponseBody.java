// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRuleActionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleActionResponseBody</p>
 */
public class GetRuleActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleActionInfo")
    private RuleActionInfo ruleActionInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRuleActionResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.ruleActionInfo = model.ruleActionInfo;
            this.success = model.success;
        } 

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F2D0755D-F350-40FE-9A6D-491859DB5E5F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the rule action forwarded error operation data that failed to be forwarded to the destination cloud service. A data forwarding failure indicates that forwarding retries also failed.</p>
         * <ul>
         * <li><strong>true</strong>: forwards error operation data.</li>
         * <li><strong>false</strong>: forwards normal data instead of error operation data.</li>
         * </ul>
         */
        public Builder ruleActionInfo(RuleActionInfo ruleActionInfo) {
            this.ruleActionInfo = ruleActionInfo;
            return this;
        }

        /**
         * <p>The rule action information returned if the call was successful. For more information, see the following parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRuleActionResponseBody build() {
            return new GetRuleActionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuleActionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleActionResponseBody</p>
     */
    public static class RuleActionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("ErrorActionFlag")
        private Boolean errorActionFlag;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(RuleActionInfo model) {
                this.configuration = model.configuration;
                this.errorActionFlag = model.errorActionFlag;
                this.id = model.id;
                this.ruleId = model.ruleId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of rule action.</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The type of the rule action. Valid values:</p>
             * <ul>
             * <li><strong>REPUBLISH</strong>: forwards data to another topic.</li>
             * <li><strong>OTS</strong>: stores data to Tablestore.</li>
             * <li><strong>MNS</strong>: sends data to Message Service (MNS).</li>
             * <li><strong>FC</strong>: sends data to Function Compute.</li>
             * <li><strong>RDS</strong>: Save to cloud databases.</li>
             * <li><strong>AMQP</strong>: forwards data to an AMQP consumer group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder errorActionFlag(Boolean errorActionFlag) {
                this.errorActionFlag = errorActionFlag;
                return this;
            }

            /**
             * <p>The ID of the rule based on which the rule action is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
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
             * <p>The configurations of the rule action.</p>
             * 
             * <strong>example:</strong>
             * <p>REPUBLISH</p>
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
