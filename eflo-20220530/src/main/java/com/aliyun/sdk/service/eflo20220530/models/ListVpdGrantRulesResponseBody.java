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
 * {@link ListVpdGrantRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpdGrantRulesResponseBody</p>
 */
public class ListVpdGrantRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVpdGrantRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpdGrantRulesResponseBody create() {
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
         * <p>The HTTP status code.</p>
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
         * <p>A56F7D3C-8850-5AF4-A342-2D71C9A9D1CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVpdGrantRulesResponseBody build() {
            return new ListVpdGrantRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpdGrantRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpdGrantRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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
             * <p>1643013506000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The current network sample is authorized to the specified Lingjun HUB sample ID.</p>
             * 
             * <strong>example:</strong>
             * <p>er-kkopgtne</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>Authorization Entry ID</p>
             * 
             * <strong>example:</strong>
             * <p>grant-rule-8rgvqazb</p>
             */
            public Builder grantRuleId(String grantRuleId) {
                this.grantRuleId = grantRuleId;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the current instance is authorized.</p>
             * 
             * <strong>example:</strong>
             * <p>1672372231790</p>
             */
            public Builder grantTenantId(String grantTenantId) {
                this.grantTenantId = grantTenantId;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-8rgvqazb</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-1</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The type of the authorized product. Valid values:</p>
             * <ul>
             * <li><strong>VPD</strong>: indicates a VPD instance of the Lingjun network segment.</li>
             * <li><strong>VCC</strong>: indicates that Lingjun connects to the VCC instance.</li>
             * </ul>
             * <p>The caller does not need to specify.</p>
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
             * <p>rg-aek2l4sq6l7unhi</p>
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
             * <p>Whether the current authorized instance has been bound</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder used(Boolean used) {
                this.used = used;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVpdGrantRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpdGrantRulesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long total; 

            /**
             * <p>Lingjun CIDR block authorization information list</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
