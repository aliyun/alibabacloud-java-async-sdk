// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainContractProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainContractProjectRequest</p>
 */
public class CreateAntChainContractProjectRequest extends Request {
    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("ProjectDescription")
    private String projectDescription;

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

    private CreateAntChainContractProjectRequest(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.projectDescription = builder.projectDescription;
        this.projectName = builder.projectName;
        this.projectVersion = builder.projectVersion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainContractProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return projectDescription
     */
    public String getProjectDescription() {
        return this.projectDescription;
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

    public static final class Builder extends Request.Builder<CreateAntChainContractProjectRequest, Builder> {
        private String consortiumId; 
        private String projectDescription; 
        private String projectName; 
        private String projectVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainContractProjectRequest response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.projectDescription = response.projectDescription;
            this.projectName = response.projectName;
            this.projectVersion = response.projectVersion;
            this.regionId = response.regionId;
        } 

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
        public CreateAntChainContractProjectRequest build() {
            return new CreateAntChainContractProjectRequest(this);
        } 

    } 

}
