// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectRequest</p>
 */
public class UpdateProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevEnvironmentEnabled")
    private Boolean devEnvironmentEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevRoleDisabled")
    private Boolean devRoleDisabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaiTaskEnabled")
    private Boolean paiTaskEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.devEnvironmentEnabled = builder.devEnvironmentEnabled;
        this.devRoleDisabled = builder.devRoleDisabled;
        this.displayName = builder.displayName;
        this.id = builder.id;
        this.paiTaskEnabled = builder.paiTaskEnabled;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return devEnvironmentEnabled
     */
    public Boolean getDevEnvironmentEnabled() {
        return this.devEnvironmentEnabled;
    }

    /**
     * @return devRoleDisabled
     */
    public Boolean getDevRoleDisabled() {
        return this.devRoleDisabled;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return paiTaskEnabled
     */
    public Boolean getPaiTaskEnabled() {
        return this.paiTaskEnabled;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateProjectRequest, Builder> {
        private String regionId; 
        private String description; 
        private Boolean devEnvironmentEnabled; 
        private Boolean devRoleDisabled; 
        private String displayName; 
        private Long id; 
        private Boolean paiTaskEnabled; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.devEnvironmentEnabled = request.devEnvironmentEnabled;
            this.devRoleDisabled = request.devRoleDisabled;
            this.displayName = request.displayName;
            this.id = request.id;
            this.paiTaskEnabled = request.paiTaskEnabled;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the workspace.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the development environment. Valid values:</p>
         * <ul>
         * <li>true: enables the development environment. In this case, the development environment is isolated from the production environment in the workspace.</li>
         * <li>false: disables the development environment. In this case, only the production environment is used in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder devEnvironmentEnabled(Boolean devEnvironmentEnabled) {
            this.putBodyParameter("DevEnvironmentEnabled", devEnvironmentEnabled);
            this.devEnvironmentEnabled = devEnvironmentEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to disable the Develop role. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * <p>Note: If you disable the Develop role, you cannot assume the Develop role to develop nodes in workflows and edit node code. The Develop role cannot be enabled again after it is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder devRoleDisabled(Boolean devRoleDisabled) {
            this.putBodyParameter("DevRoleDisabled", devRoleDisabled);
            this.devRoleDisabled = devRoleDisabled;
            return this;
        }

        /**
         * <p>The display name of the workspace.</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Specifies whether to enable scheduling of Platform for AI (PAI) tasks. Valid values:</p>
         * <ul>
         * <li>true: enables scheduling of PAI tasks. In this case, you can create a PAI node in a DataWorks workspace and configure scheduling properties for the node to implement periodic scheduling of PAI tasks.</li>
         * <li>false: disables scheduling of PAI tasks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paiTaskEnabled(Boolean paiTaskEnabled) {
            this.putBodyParameter("PaiTaskEnabled", paiTaskEnabled);
            this.paiTaskEnabled = paiTaskEnabled;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateProjectRequest build() {
            return new UpdateProjectRequest(this);
        } 

    } 

}
