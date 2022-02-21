// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutProjectRequest} extends {@link RequestModel}
 *
 * <p>PutProjectRequest</p>
 */
public class PutProjectRequest extends Request {
    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ServiceRole")
    private String serviceRole;

    private PutProjectRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.serviceRole = builder.serviceRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return serviceRole
     */
    public String getServiceRole() {
        return this.serviceRole;
    }

    public static final class Builder extends Request.Builder<PutProjectRequest, Builder> {
        private String project; 
        private String regionId; 
        private String serviceRole; 

        private Builder() {
            super();
        } 

        private Builder(PutProjectRequest response) {
            super(response);
            this.project = response.project;
            this.regionId = response.regionId;
            this.serviceRole = response.serviceRole;
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

        /**
         * ServiceRole.
         */
        public Builder serviceRole(String serviceRole) {
            this.putQueryParameter("ServiceRole", serviceRole);
            this.serviceRole = serviceRole;
            return this;
        }

        @Override
        public PutProjectRequest build() {
            return new PutProjectRequest(this);
        } 

    } 

}
