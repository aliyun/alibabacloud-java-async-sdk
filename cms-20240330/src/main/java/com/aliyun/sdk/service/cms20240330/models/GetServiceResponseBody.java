// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("service")
    private Service service;

    private GetServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return service
     */
    public Service getService() {
        return this.service;
    }

    public static final class Builder {
        private String requestId; 
        private Service service; 

        private Builder() {
        } 

        private Builder(GetServiceResponseBody model) {
            this.requestId = model.requestId;
            this.service = model.service;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-BE6E-5F82-A484-CE9C2196C7DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Service object.</p>
         */
        public Builder service(Service service) {
            this.service = service;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Service extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("serviceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("serviceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Service(Builder builder) {
            this.attributes = builder.attributes;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.pid = builder.pid;
            this.regionId = builder.regionId;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.serviceStatus = builder.serviceStatus;
            this.serviceType = builder.serviceType;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Service create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
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
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String attributes; 
            private String createTime; 
            private String description; 
            private String displayName; 
            private String pid; 
            private String regionId; 
            private String serviceId; 
            private String serviceName; 
            private String serviceStatus; 
            private String serviceType; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Service model) {
                this.attributes = model.attributes;
                this.createTime = model.createTime;
                this.description = model.description;
                this.displayName = model.displayName;
                this.pid = model.pid;
                this.regionId = model.regionId;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.serviceStatus = model.serviceStatus;
                this.serviceType = model.serviceType;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Extended information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;language&quot;:&quot;java&quot;}</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-13T03:32:55Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description, only valid when serviceType=RUM.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Display name, only valid when serviceType=RUM.</p>
             * 
             * <strong>example:</strong>
             * <p>demo应用</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Legacy ARMS application ID</p>
             * 
             * <strong>example:</strong>
             * <p>by6rjzro2j@0fe8dfa799e5906</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cwzxvuc6uo@4bc6b15ad81f166174ffb</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Service name</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Service status, only valid when serviceType=RUM.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>Service type.</p>
             * 
             * <strong>example:</strong>
             * <p>TRACE</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>Workspace name</p>
             * 
             * <strong>example:</strong>
             * <p>default-cms-1106439496876715-cn-hangzhou</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Service build() {
                return new Service(this);
            } 

        } 

    }
}
