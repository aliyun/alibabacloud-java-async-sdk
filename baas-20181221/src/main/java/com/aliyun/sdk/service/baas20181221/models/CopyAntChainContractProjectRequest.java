// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyAntChainContractProjectRequest} extends {@link RequestModel}
 *
 * <p>CopyAntChainContractProjectRequest</p>
 */
public class CopyAntChainContractProjectRequest extends Request {
    @Body
    @NameInMap("ProjectDescription")
    private String projectDescription;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("ProjectVersion")
    @Validation(required = true)
    private String projectVersion;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CopyAntChainContractProjectRequest(Builder builder) {
        super(builder);
        this.projectDescription = builder.projectDescription;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.projectVersion = builder.projectVersion;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CopyAntChainContractProjectRequest, Builder> {
        private String projectDescription; 
        private String projectId; 
        private String projectName; 
        private String projectVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CopyAntChainContractProjectRequest response) {
            super(response);
            this.projectDescription = response.projectDescription;
            this.projectId = response.projectId;
            this.projectName = response.projectName;
            this.projectVersion = response.projectVersion;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CopyAntChainContractProjectRequest build() {
            return new CopyAntChainContractProjectRequest(this);
        } 

    } 

}
