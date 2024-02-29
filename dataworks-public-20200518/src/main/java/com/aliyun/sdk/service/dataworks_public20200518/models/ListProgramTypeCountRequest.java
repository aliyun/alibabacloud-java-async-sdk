// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProgramTypeCountRequest} extends {@link RequestModel}
 *
 * <p>ListProgramTypeCountRequest</p>
 */
public class ListProgramTypeCountRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    private ListProgramTypeCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProgramTypeCountRequest create() {
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
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListProgramTypeCountRequest, Builder> {
        private String regionId; 
        private String projectEnv; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListProgramTypeCountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
        } 

        /**
         * The unique identifier of the zone.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The environment of the workspace, including projects in PROD and DEV.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * The ID of the DataWorks workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListProgramTypeCountRequest build() {
            return new ListProgramTypeCountRequest(this);
        } 

    } 

}
