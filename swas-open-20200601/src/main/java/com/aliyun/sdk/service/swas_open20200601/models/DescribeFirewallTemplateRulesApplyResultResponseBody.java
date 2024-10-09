// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        public DescribeFirewallTemplateRulesApplyResultResponseBody build() {
            return new DescribeFirewallTemplateRulesApplyResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFirewallTemplateRulesApplyResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallTemplateRulesApplyResultResponseBody</p>
     */
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
             * <p>The error codes when the firewall template rule fails to be applied.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message that is displayed when the firewall template rule fails to be applied.</p>
             * 
             * <strong>example:</strong>
             * <p>An error occurred while processing your request.</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>The port range. Valid values: 1 to 65535. Specify a port range in the format of &lt;start port number&gt;/&lt;end port number&gt;. Example: <code>1024/1055</code>, which indicates that the port range of 1024 to 1055.</p>
             * <blockquote>
             * <p> If you set RuleProtocol to ICMP, you must set Port to -1/-1.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The remarks of the firewall rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The transport layer protocol that the rule supports. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * <li>TCP+UDP</li>
             * <li>ICMP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ruleProtocol(String ruleProtocol) {
                this.ruleProtocol = ruleProtocol;
                return this;
            }

            /**
             * <p>The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>119.145.XX.XX</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The status of applying the firewall template rule to the simple application servers.</p>
             * <ul>
             * <li>Pending: The template rule does not start to be applied to the simple application servers.</li>
             * <li>Applying: The template rule is being applied to the simple application servers.</li>
             * <li>Success: The template rule is successfully applied to the simple application servers.</li>
             * <li>PartFailed: The template rule fails to be applied to some simple application servers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
