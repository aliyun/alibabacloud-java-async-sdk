// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyAntChainContractProjectRequest} extends {@link RequestModel}
 *
 * <p>CopyAntChainContractProjectRequest</p>
 */
public class CopyAntChainContractProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectDescription")
    private String projectDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectVersion;

    private CopyAntChainContractProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectDescription = builder.projectDescription;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.projectVersion = builder.projectVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyAntChainContractProjectRequest create() {
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
     * @return projectDescription
     */
    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return projectVersion
     */
    public String getProjectVersion() {
        return this.projectVersion;
    }

    public static final class Builder extends Request.Builder<CopyAntChainContractProjectRequest, Builder> {
        private String regionId; 
        private String projectDescription; 
        private String projectId; 
        private String projectName; 
        private String projectVersion; 

        private Builder() {
            super();
        } 

        private Builder(CopyAntChainContractProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectDescription = request.projectDescription;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.projectVersion = request.projectVersion;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ProjectDescription.
         */
        public Builder projectDescription(String projectDescription) {
            this.putBodyParameter("ProjectDescription", projectDescription);
            this.projectDescription = projectDescription;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * ProjectVersion.
         */
        public Builder projectVersion(String projectVersion) {
            this.putBodyParameter("ProjectVersion", projectVersion);
            this.projectVersion = projectVersion;
            return this;
        }

        @Override
        public CopyAntChainContractProjectRequest build() {
            return new CopyAntChainContractProjectRequest(this);
        } 

    } 

}
