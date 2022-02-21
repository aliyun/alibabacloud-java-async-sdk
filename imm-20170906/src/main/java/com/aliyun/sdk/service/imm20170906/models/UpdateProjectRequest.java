// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectRequest</p>
 */
public class UpdateProjectRequest extends Request {
    @Query
    @NameInMap("NewCU")
    private Integer newCU;

    @Query
    @NameInMap("NewServiceRole")
    private String newServiceRole;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateProjectRequest(Builder builder) {
        super(builder);
        this.newCU = builder.newCU;
        this.newServiceRole = builder.newServiceRole;
        this.project = builder.project;
        this.regionId = builder.regionId;
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
     * @return newCU
     */
    public Integer getNewCU() {
        return this.newCU;
    }

    /**
     * @return newServiceRole
     */
    public String getNewServiceRole() {
        return this.newServiceRole;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateProjectRequest, Builder> {
        private Integer newCU; 
        private String newServiceRole; 
        private String project; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectRequest response) {
            super(response);
            this.newCU = response.newCU;
            this.newServiceRole = response.newServiceRole;
            this.project = response.project;
            this.regionId = response.regionId;
        } 

        /**
         * NewCU.
         */
        public Builder newCU(Integer newCU) {
            this.putQueryParameter("NewCU", newCU);
            this.newCU = newCU;
            return this;
        }

        /**
         * NewServiceRole.
         */
        public Builder newServiceRole(String newServiceRole) {
            this.putQueryParameter("NewServiceRole", newServiceRole);
            this.newServiceRole = newServiceRole;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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
        public UpdateProjectRequest build() {
            return new UpdateProjectRequest(this);
        } 

    } 

}
