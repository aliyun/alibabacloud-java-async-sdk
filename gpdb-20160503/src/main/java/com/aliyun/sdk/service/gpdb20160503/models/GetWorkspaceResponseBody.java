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
 * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceResponseBody</p>
 */
public class GetWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Apikeys")
    private java.util.List<Apikeys> apikeys;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private GetWorkspaceResponseBody(Builder builder) {
        this.apikeys = builder.apikeys;
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.services = builder.services;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private java.util.List<Services> services; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(GetWorkspaceResponseBody model) {
            this.apikeys = model.apikeys;
            this.createTime = model.createTime;
            this.requestId = model.requestId;
            this.services = model.services;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>The list of workspace API keys.</p>
         */
        public Builder apikeys(java.util.List<Apikeys> apikeys) {
            this.apikeys = apikeys;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * <p>The list of service details.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-*****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-first-workspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public GetWorkspaceResponseBody build() {
            return new GetWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceResponseBody</p>
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
             * <p>agdb-xxxxxx</p>
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
             * <p>memory</p>
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
     * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceResponseBody</p>
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
             * <p>The service ID.</p>
             */
            public Builder authServices(java.util.List<AuthServices> authServices) {
                this.authServices = authServices;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>Sat Mar 14 14:44:27 GMT+08:00 2026</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>my test key</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxxxxx</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The name of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>my test key</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>The prefix of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-1235*****</p>
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
     * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Services(Builder builder) {
            this.createTime = builder.createTime;
            this.cu = builder.cu;
            this.expireTime = builder.expireTime;
            this.payType = builder.payType;
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
            private String createTime; 
            private String cu; 
            private String expireTime; 
            private String payType; 
            private String serviceId; 
            private String serviceName; 
            private String serviceType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.createTime = model.createTime;
                this.cu = model.cu;
                this.expireTime = model.expireTime;
                this.payType = model.payType;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.serviceType = model.serviceType;
                this.status = model.status;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-01T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The compute resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-21T16:00:00Z</p>
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
             * <li>In subscription billing mode, a discount is available when you purchase a duration of one year or longer. Select a billing type as needed.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agdb-xxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>agdb-xxx</p>
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
             * <li>creating: being created.</li>
             * <li>active: running.</li>
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
}
