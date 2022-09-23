// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHubClusterFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateHubClusterFeatureRequest</p>
 */
public class UpdateHubClusterFeatureRequest extends Request {
    @Query
    @NameInMap("ApiServerEipId")
    private String apiServerEipId;

    @Query
    @NameInMap("AuditLogEnabled")
    private Boolean auditLogEnabled;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("EnableArgoCD")
    private Boolean enableArgoCD;

    @Query
    @NameInMap("EnableMesh")
    private Boolean enableMesh;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PublicApiServerEnabled")
    private Boolean publicApiServerEnabled;

    private UpdateHubClusterFeatureRequest(Builder builder) {
        super(builder);
        this.apiServerEipId = builder.apiServerEipId;
        this.auditLogEnabled = builder.auditLogEnabled;
        this.clusterId = builder.clusterId;
        this.deletionProtection = builder.deletionProtection;
        this.enableArgoCD = builder.enableArgoCD;
        this.enableMesh = builder.enableMesh;
        this.name = builder.name;
        this.publicApiServerEnabled = builder.publicApiServerEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHubClusterFeatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiServerEipId
     */
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    /**
     * @return auditLogEnabled
     */
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return enableArgoCD
     */
    public Boolean getEnableArgoCD() {
        return this.enableArgoCD;
    }

    /**
     * @return enableMesh
     */
    public Boolean getEnableMesh() {
        return this.enableMesh;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return publicApiServerEnabled
     */
    public Boolean getPublicApiServerEnabled() {
        return this.publicApiServerEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateHubClusterFeatureRequest, Builder> {
        private String apiServerEipId; 
        private Boolean auditLogEnabled; 
        private String clusterId; 
        private Boolean deletionProtection; 
        private Boolean enableArgoCD; 
        private Boolean enableMesh; 
        private String name; 
        private Boolean publicApiServerEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHubClusterFeatureRequest request) {
            super(request);
            this.apiServerEipId = request.apiServerEipId;
            this.auditLogEnabled = request.auditLogEnabled;
            this.clusterId = request.clusterId;
            this.deletionProtection = request.deletionProtection;
            this.enableArgoCD = request.enableArgoCD;
            this.enableMesh = request.enableMesh;
            this.name = request.name;
            this.publicApiServerEnabled = request.publicApiServerEnabled;
        } 

        /**
         * ApiServerEipId.
         */
        public Builder apiServerEipId(String apiServerEipId) {
            this.putQueryParameter("ApiServerEipId", apiServerEipId);
            this.apiServerEipId = apiServerEipId;
            return this;
        }

        /**
         * AuditLogEnabled.
         */
        public Builder auditLogEnabled(Boolean auditLogEnabled) {
            this.putQueryParameter("AuditLogEnabled", auditLogEnabled);
            this.auditLogEnabled = auditLogEnabled;
            return this;
        }

        /**
         * 集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DeletionProtection.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * EnableArgoCD.
         */
        public Builder enableArgoCD(Boolean enableArgoCD) {
            this.putQueryParameter("EnableArgoCD", enableArgoCD);
            this.enableArgoCD = enableArgoCD;
            return this;
        }

        /**
         * EnableMesh.
         */
        public Builder enableMesh(Boolean enableMesh) {
            this.putQueryParameter("EnableMesh", enableMesh);
            this.enableMesh = enableMesh;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PublicApiServerEnabled.
         */
        public Builder publicApiServerEnabled(Boolean publicApiServerEnabled) {
            this.putQueryParameter("PublicApiServerEnabled", publicApiServerEnabled);
            this.publicApiServerEnabled = publicApiServerEnabled;
            return this;
        }

        @Override
        public UpdateHubClusterFeatureRequest build() {
            return new UpdateHubClusterFeatureRequest(this);
        } 

    } 

}
