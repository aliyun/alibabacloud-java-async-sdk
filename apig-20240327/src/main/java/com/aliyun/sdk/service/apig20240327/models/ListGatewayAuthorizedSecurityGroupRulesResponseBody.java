// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayAuthorizedSecurityGroupRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayAuthorizedSecurityGroupRulesResponseBody</p>
 */
public class ListGatewayAuthorizedSecurityGroupRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewayAuthorizedSecurityGroupRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayAuthorizedSecurityGroupRulesResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayAuthorizedSecurityGroupRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBody build() {
            return new ListGatewayAuthorizedSecurityGroupRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayAuthorizedSecurityGroupRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayAuthorizedSecurityGroupRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authCidrs")
        private java.util.List<String> authCidrs;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ipProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("portRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("securityGroupName")
        private String securityGroupName;

        @com.aliyun.core.annotation.NameInMap("securityGroupRuleId")
        private String securityGroupRuleId;

        @com.aliyun.core.annotation.NameInMap("sourceSecurityGroupId")
        private String sourceSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Items(Builder builder) {
            this.authCidrs = builder.authCidrs;
            this.description = builder.description;
            this.ipProtocol = builder.ipProtocol;
            this.portRange = builder.portRange;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.securityGroupRuleId = builder.securityGroupRuleId;
            this.sourceSecurityGroupId = builder.sourceSecurityGroupId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        /**
         * @return securityGroupRuleId
         */
        public String getSecurityGroupRuleId() {
            return this.securityGroupRuleId;
        }

        /**
         * @return sourceSecurityGroupId
         */
        public String getSourceSecurityGroupId() {
            return this.sourceSecurityGroupId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<String> authCidrs; 
            private String description; 
            private String ipProtocol; 
            private String portRange; 
            private String securityGroupId; 
            private String securityGroupName; 
            private String securityGroupRuleId; 
            private String sourceSecurityGroupId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.authCidrs = model.authCidrs;
                this.description = model.description;
                this.ipProtocol = model.ipProtocol;
                this.portRange = model.portRange;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
                this.securityGroupRuleId = model.securityGroupRuleId;
                this.sourceSecurityGroupId = model.sourceSecurityGroupId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The list of authorized CIDR blocks.</p>
             */
            public Builder authCidrs(java.util.List<String> authCidrs) {
                this.authCidrs = authCidrs;
                return this;
            }

            /**
             * <p>The rule description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The port range.</p>
             * 
             * <strong>example:</strong>
             * <p>8080/8089</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1ftp5sm9os***</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The security group name.</p>
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gsgr-cqadis5lhtgmv***</p>
             */
            public Builder securityGroupRuleId(String securityGroupRuleId) {
                this.securityGroupRuleId = securityGroupRuleId;
                return this;
            }

            /**
             * <p>The ID of the source security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp19akuepfe***</p>
             */
            public Builder sourceSecurityGroupId(String sourceSecurityGroupId) {
                this.sourceSecurityGroupId = sourceSecurityGroupId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1g63b5q2q29***</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayAuthorizedSecurityGroupRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayAuthorizedSecurityGroupRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
            } 

            /**
             * <p>The security group rules.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
