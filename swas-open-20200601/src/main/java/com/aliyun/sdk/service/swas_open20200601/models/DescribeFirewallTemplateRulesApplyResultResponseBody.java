// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFirewallTemplateRulesApplyResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallTemplateRulesApplyResultResponseBody</p>
 */
public class DescribeFirewallTemplateRulesApplyResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    private DescribeFirewallTemplateRulesApplyResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallTemplateRulesApplyResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Data> data; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned results.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBody build() {
            return new DescribeFirewallTemplateRulesApplyResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleProtocol")
        private String ruleProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleProtocol = builder.ruleProtocol;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleProtocol
         */
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorInfo; 
            private String port; 
            private String remark; 
            private String ruleProtocol; 
            private String sourceCidrIp; 
            private Boolean success; 

            /**
             * The error codes when the firewall template rule fails to be applied.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message that is displayed when the firewall template rule fails to be applied.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: `1024/1055`, which indicates that the port range of 1024 to 1055.
             * <p>
             * 
             * >  If you set RuleProtocol to ICMP, you must set Port to -1/-1.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The remarks of the firewall rule.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The transport layer protocol that the rule supports. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
             * *   TCP+UDP
             * *   ICMP
             */
            public Builder ruleProtocol(String ruleProtocol) {
                this.ruleProtocol = ruleProtocol;
                return this;
            }

            /**
             * The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * The status of applying the firewall template rule to the simple application servers.
             * <p>
             * 
             * *   Pending: The template rule does not start to be applied to the simple application servers.
             * *   Applying: The template rule is being applied to the simple application servers.
             * *   Success: The template rule is successfully applied to the simple application servers.
             * *   PartFailed: The template rule fails to be applied to some simple application servers.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
