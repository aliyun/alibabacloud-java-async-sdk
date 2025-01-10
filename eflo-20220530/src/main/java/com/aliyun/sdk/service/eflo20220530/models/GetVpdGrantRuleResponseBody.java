// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetVpdGrantRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpdGrantRuleResponseBody</p>
 */
public class GetVpdGrantRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVpdGrantRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpdGrantRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVpdGrantRuleResponseBody build() {
            return new GetVpdGrantRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpdGrantRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpdGrantRuleResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("GrantRuleId")
        private String grantRuleId;

        @com.aliyun.core.annotation.NameInMap("GrantTenantId")
        private String grantTenantId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Boolean used;

        private Content(Builder builder) {
            this.createTime = builder.createTime;
            this.erId = builder.erId;
            this.grantRuleId = builder.grantRuleId;
            this.grantTenantId = builder.grantTenantId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.product = builder.product;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.tenantId = builder.tenantId;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return grantRuleId
         */
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        /**
         * @return grantTenantId
         */
        public String getGrantTenantId() {
            return this.grantTenantId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return used
         */
        public Boolean getUsed() {
            return this.used;
        }

        public static final class Builder {
            private String createTime; 
            private String erId; 
            private String grantRuleId; 
            private String grantTenantId; 
            private String instanceId; 
            private String instanceName; 
            private String product; 
            private String regionId; 
            private String resourceGroupId; 
            private String tenantId; 
            private Boolean used; 

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1648085472000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Lingjun HUB Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-kkopgtne</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>Authorized Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>grant-rule-xxxxxx</p>
             */
            public Builder grantRuleId(String grantRuleId) {
                this.grantRuleId = grantRuleId;
                return this;
            }

            /**
             * <p>Authorized Tenant ID</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder grantTenantId(String grantTenantId) {
                this.grantTenantId = grantTenantId;
                return this;
            }

            /**
             * <p>Network Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-xxxxxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Network Instance Name</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-lingjun</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Network Product Code:</p>
             * <ul>
             * <li><strong>VPD</strong>: Lingjun CIDR block</li>
             * <li><strong>VCC</strong>: Lingjun Connection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPD</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2l4sq6l7u***</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1655449505171</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Whether the current authorization information has been used; default is false</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder used(Boolean used) {
                this.used = used;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
