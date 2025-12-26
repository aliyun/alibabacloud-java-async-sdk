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
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attributes")
    private String attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pid")
    private String pid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceStatus")
    private String serviceStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.regionId = builder.regionId;
        this.attributes = builder.attributes;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.pid = builder.pid;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceName = builder.serviceName;
        this.serviceStatus = builder.serviceStatus;
        this.serviceType = builder.serviceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String workspace; 
        private String regionId; 
        private String attributes; 
        private String description; 
        private String displayName; 
        private String pid; 
        private String resourceGroupId; 
        private String serviceName; 
        private String serviceStatus; 
        private String serviceType; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.regionId = request.regionId;
            this.attributes = request.attributes;
            this.description = request.description;
            this.displayName = request.displayName;
            this.pid = request.pid;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceName = request.serviceName;
            this.serviceStatus = request.serviceStatus;
            this.serviceType = request.serviceType;
            this.tags = request.tags;
        } 

        /**
         * <p>Workspace name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1793369865235921-cn-shenzhen</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Extended attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;language&quot;:&quot;java&quot;}</p>
         */
        public Builder attributes(String attributes) {
            this.putBodyParameter("attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>Service description, only valid when <code>serviceType=RUM</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>mag测试应用</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Display name, only valid when <code>serviceType=RUM</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>mag测试应用</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Application ID, generally not required to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>bx3udsi5ie@ed2ba6beebdb6de</p>
         */
        public Builder pid(String pid) {
            this.putBodyParameter("pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Service name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mag_test</p>
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>Service status, not required for service creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder serviceStatus(String serviceStatus) {
            this.putBodyParameter("serviceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * <p>Service type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
