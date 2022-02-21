// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @Query
    @NameInMap("ProjectDesc")
    @Validation(required = true)
    private String projectDesc;

    @Query
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.projectDesc = builder.projectDesc;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectDesc
     */
    public String getProjectDesc() {
        return this.projectDesc;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String projectDesc; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest response) {
            super(response);
            this.projectDesc = response.projectDesc;
            this.projectName = response.projectName;
            this.regionId = response.regionId;
        } 

        /**
         * ProjectDesc.
         */
        public Builder projectDesc(String projectDesc) {
            this.putQueryParameter("ProjectDesc", projectDesc);
            this.projectDesc = projectDesc;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
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
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
