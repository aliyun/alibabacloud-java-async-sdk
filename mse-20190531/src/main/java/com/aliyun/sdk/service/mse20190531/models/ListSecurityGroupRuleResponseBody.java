// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListSecurityGroupRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityGroupRuleResponseBody</p>
 */
public class ListSecurityGroupRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSecurityGroupRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityGroupRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9EC7BDBF-3C38-5C9C-95DD-61E298CD43E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSecurityGroupRuleResponseBody build() {
            return new ListSecurityGroupRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityGroupRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityGroupRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthCidrs")
        private java.util.List<String> authCidrs;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        private Data(Builder builder) {
            this.authCidrs = builder.authCidrs;
            this.description = builder.description;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ipProtocol = builder.ipProtocol;
            this.portRange = builder.portRange;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authCidrs
         */
        public java.util.List<String> getAuthCidrs() {
            return this.authCidrs;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List<String> authCidrs; 
            private String description; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String ipProtocol; 
            private String portRange; 
            private String securityGroupId; 

            /**
             * AuthCidrs.
             */
            public Builder authCidrs(java.util.List<String> authCidrs) {
                this.authCidrs = authCidrs;
                return this;
            }

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-12a432a1f5da423997d8880bd32c304d</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the security group authorization record.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The port range.</p>
             * 
             * <strong>example:</strong>
             * <p>8000/8000</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1cg6qlyjepj0y6cf2c</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
