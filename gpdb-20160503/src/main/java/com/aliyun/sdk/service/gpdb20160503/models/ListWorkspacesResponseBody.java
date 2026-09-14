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
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListWorkspacesResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListWorkspacesResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of workspace details.</p>
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
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class AuthServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        private AuthServices(Builder builder) {
            this.serviceId = builder.serviceId;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthServices create() {
            return builder().build();
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String serviceId; 
            private String serviceType; 

            private Builder() {
            } 

            private Builder(AuthServices model) {
                this.serviceId = model.serviceId;
                this.serviceType = model.serviceType;
            } 

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agdb-eqxwj5tj5ojx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li>memory</li>
             * <li>drama</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>drama</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public AuthServices build() {
                return new AuthServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Apikeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthServices")
        private java.util.List<AuthServices> authServices;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyPrefix")
        private String keyPrefix;

        private Apikeys(Builder builder) {
            this.authServices = builder.authServices;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.keyId = builder.keyId;
            this.keyName = builder.keyName;
            this.keyPrefix = builder.keyPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apikeys create() {
            return builder().build();
        }

        /**
         * @return authServices
         */
        public java.util.List<AuthServices> getAuthServices() {
            return this.authServices;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyPrefix
         */
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public static final class Builder {
            private java.util.List<AuthServices> authServices; 
            private String createTime; 
            private String description; 
            private String keyId; 
            private String keyName; 
            private String keyPrefix; 

            private Builder() {
            } 

            private Builder(Apikeys model) {
                this.authServices = model.authServices;
                this.createTime = model.createTime;
                this.description = model.description;
                this.keyId = model.keyId;
                this.keyName = model.keyName;
                this.keyPrefix = model.keyPrefix;
            } 

            /**
             * <p>The services authorized for the API key.</p>
             */
            public Builder authServices(java.util.List<AuthServices> authServices) {
                this.authServices = authServices;
                return this;
            }

            /**
             * <p>The creation time of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-09T02:26:48Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>my api key</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxxx</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The name of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>my-apikey</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>The prefix of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-xxxxxx</p>
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            public Apikeys build() {
                return new Apikeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("componentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("componentType")
        private String componentType;

        private Components(Builder builder) {
            this.createTime = builder.createTime;
            this.cu = builder.cu;
            this.deletionProtection = builder.deletionProtection;
            this.status = builder.status;
            this.componentId = builder.componentId;
            this.componentType = builder.componentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
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

        public static final class Builder {
            private String createTime; 
            private String cu; 
            private Boolean deletionProtection; 
            private String status; 
            private String componentId; 
            private String componentType; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.createTime = model.createTime;
                this.cu = model.cu;
                this.deletionProtection = model.deletionProtection;
                this.status = model.status;
                this.componentId = model.componentId;
                this.componentType = model.componentType;
            } 

            /**
             * <p>The creation time of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-09T02:26:48Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Cu.
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * componentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * componentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

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

        private Services(Builder builder) {
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

        public static Services create() {
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
            private String cu; 
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

            private Builder(Services model) {
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
             * Components.
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-09T02:26:48Z</p>
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
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-26T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The billing type. Valid values:</p>
             * <ul>
             * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
             * <li><strong>PREPAY</strong>: subscription.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If this parameter is not specified, the default value is pay-as-you-go.</li>
             * <li>In subscription billing mode, a discount is available when you purchase a duration of one year or longer. Select the billing type as needed.</li>
             * </ul>
             * </blockquote>
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
             * <li>memory</li>
             * <li>drama</li>
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
             * <li>creating: The service is being created.</li>
             * <li>active: The service is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apikeys")
        private java.util.List<Apikeys> apikeys;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Services")
        private java.util.List<Services> services;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Items(Builder builder) {
            this.apikeys = builder.apikeys;
            this.createTime = builder.createTime;
            this.services = builder.services;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return apikeys
         */
        public java.util.List<Apikeys> getApikeys() {
            return this.apikeys;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return services
         */
        public java.util.List<Services> getServices() {
            return this.services;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private java.util.List<Apikeys> apikeys; 
            private String createTime; 
            private java.util.List<Services> services; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apikeys = model.apikeys;
                this.createTime = model.createTime;
                this.services = model.services;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>The list of API keys for the workspace.</p>
             */
            public Builder apikeys(java.util.List<Apikeys> apikeys) {
                this.apikeys = apikeys;
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
             * <p>The services in the workspace.</p>
             */
            public Builder services(java.util.List<Services> services) {
                this.services = services;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-ws-wkb4fp3j9u79ha</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * <ul>
             * <li>Maximum length: 50.</li>
             * <li>Must be unique.</li>
             * <li>Special characters are not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>anchashid8FocugQ.oxs.xaliyun.com/oxspopscand8FocugQ#</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
