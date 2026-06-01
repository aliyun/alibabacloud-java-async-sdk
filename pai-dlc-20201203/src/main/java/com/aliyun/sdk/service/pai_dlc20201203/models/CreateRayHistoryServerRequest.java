// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CreateRayHistoryServerRequest} extends {@link RequestModel}
 *
 * <p>CreateRayHistoryServerRequest</p>
 */
public class CreateRayHistoryServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRuntimeMinutes")
    private Integer maxRuntimeMinutes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoragePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storagePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateRayHistoryServerRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.displayName = builder.displayName;
        this.ecsSpec = builder.ecsSpec;
        this.maxRuntimeMinutes = builder.maxRuntimeMinutes;
        this.resourceId = builder.resourceId;
        this.storagePath = builder.storagePath;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRayHistoryServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return maxRuntimeMinutes
     */
    public Integer getMaxRuntimeMinutes() {
        return this.maxRuntimeMinutes;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return storagePath
     */
    public String getStoragePath() {
        return this.storagePath;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateRayHistoryServerRequest, Builder> {
        private String accessibility; 
        private String displayName; 
        private String ecsSpec; 
        private Integer maxRuntimeMinutes; 
        private String resourceId; 
        private String storagePath; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRayHistoryServerRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.displayName = request.displayName;
            this.ecsSpec = request.ecsSpec;
            this.maxRuntimeMinutes = request.maxRuntimeMinutes;
            this.resourceId = request.resourceId;
            this.storagePath = request.storagePath;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-ray-history-server</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * EcsSpec.
         */
        public Builder ecsSpec(String ecsSpec) {
            this.putBodyParameter("EcsSpec", ecsSpec);
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * MaxRuntimeMinutes.
         */
        public Builder maxRuntimeMinutes(Integer maxRuntimeMinutes) {
            this.putBodyParameter("MaxRuntimeMinutes", maxRuntimeMinutes);
            this.maxRuntimeMinutes = maxRuntimeMinutes;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
         */
        public Builder storagePath(String storagePath) {
            this.putBodyParameter("StoragePath", storagePath);
            this.storagePath = storagePath;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateRayHistoryServerRequest build() {
            return new CreateRayHistoryServerRequest(this);
        } 

    } 

}
