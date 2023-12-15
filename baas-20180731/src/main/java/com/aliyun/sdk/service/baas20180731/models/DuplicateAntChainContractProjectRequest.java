// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DuplicateAntChainContractProjectRequest} extends {@link RequestModel}
 *
 * <p>DuplicateAntChainContractProjectRequest</p>
 */
public class DuplicateAntChainContractProjectRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ProjectId")
    private String projectId;

    @Body
    @NameInMap("ProjectVersion")
    private String projectVersion;

    private DuplicateAntChainContractProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.projectVersion = builder.projectVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DuplicateAntChainContractProjectRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectVersion
     */
    public String getProjectVersion() {
        return this.projectVersion;
    }

    public static final class Builder extends Request.Builder<DuplicateAntChainContractProjectRequest, Builder> {
        private String regionId; 
        private String description; 
        private String name; 
        private String projectId; 
        private String projectVersion; 

        private Builder() {
            super();
        } 

        private Builder(DuplicateAntChainContractProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.projectId = request.projectId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
         * ProjectVersion.
         */
        public Builder projectVersion(String projectVersion) {
            this.putBodyParameter("ProjectVersion", projectVersion);
            this.projectVersion = projectVersion;
            return this;
        }

        @Override
        public DuplicateAntChainContractProjectRequest build() {
            return new DuplicateAntChainContractProjectRequest(this);
        } 

    } 

}
