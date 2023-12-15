// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private CreateAntChainContractProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumId = builder.consortiumId;
        this.projectDescription = builder.projectDescription;
        this.projectName = builder.projectName;
        this.projectVersion = builder.projectVersion;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateAntChainContractProjectRequest, Builder> {
        private String regionId; 
        private String consortiumId; 
        private String projectDescription; 
        private String projectName; 
        private String projectVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainContractProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consortiumId = request.consortiumId;
            this.projectDescription = request.projectDescription;
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

        @Override
        public CreateAntChainContractProjectRequest build() {
            return new CreateAntChainContractProjectRequest(this);
        } 

    } 

}
