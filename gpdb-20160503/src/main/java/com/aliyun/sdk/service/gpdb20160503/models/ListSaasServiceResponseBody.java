// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSaasServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListSaasServiceResponseBody</p>
 */
public class ListSaasServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListSaasServiceResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSaasServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListSaasServiceResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of instance details.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34b32a0a-08ef-4a87-b6be-cdd9f56fc3ad</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListSaasServiceResponseBody build() {
            return new ListSaasServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSaasServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListSaasServiceResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Components(Builder builder) {
            this.componentId = builder.componentId;
            this.componentType = builder.componentType;
            this.createTime = builder.createTime;
            this.cu = builder.cu;
            this.deletionProtection = builder.deletionProtection;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String componentId; 
            private String componentType; 
            private String createTime; 
            private String cu; 
            private Boolean deletionProtection; 
            private String status; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentId = model.componentId;
                this.componentType = model.componentType;
                this.createTime = model.createTime;
                this.cu = model.cu;
                this.deletionProtection = model.deletionProtection;
                this.status = model.status;
            } 

            /**
             * <p>The component ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0644c5aa-5306-478b-ac39-bb4660cdc9f7</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The type of the subcomponent.</p>
             * 
             * <strong>example:</strong>
             * <p>gamestudio</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-09T04:54:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The compute resource of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The release protection status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The service status. Valid values:</p>
             * <ul>
             * <li>active: Running.</li>
             * <li>creating: Being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSaasServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListSaasServiceResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Plan")
        private String plan;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.components = builder.components;
            this.createTime = builder.createTime;
            this.cu = builder.cu;
            this.deletionProtection = builder.deletionProtection;
            this.expireTime = builder.expireTime;
            this.payType = builder.payType;
            this.plan = builder.plan;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return components
         */
        public java.util.List<Components> getComponents() {
            return this.components;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return plan
         */
        public String getPlan() {
            return this.plan;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<Components> components; 
            private String createTime; 
            private Integer cu; 
            private Boolean deletionProtection; 
            private String expireTime; 
            private String payType; 
            private String plan; 
            private String serviceId; 
            private String serviceName; 
            private String serviceType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.components = model.components;
                this.createTime = model.createTime;
                this.cu = model.cu;
                this.deletionProtection = model.deletionProtection;
                this.expireTime = model.expireTime;
                this.payType = model.payType;
                this.plan = model.plan;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.serviceType = model.serviceType;
                this.status = model.status;
            } 

            /**
             * <p>The list of service subcomponents.</p>
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-09T04:54:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The compute resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>Indicates whether the release protection feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-15T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The billing type. Valid values:</p>
             * <ul>
             * <li><strong>POSTPAY</strong>: Pay-as-you-go.</li>
             * <li><strong>PREPAY</strong>: Subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>deprecated</p>
             */
            public Builder plan(String plan) {
                this.plan = plan;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agdb-xxxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>agdb-xxxx</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li><strong>memory</strong></li>
             * <li><strong>drama</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>memory</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The service status. Valid values:</p>
             * <ul>
             * <li>active: Running.</li>
             * <li>creating: Being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
