// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectRolesRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRolesRequest</p>
 */
public class ListProjectRolesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 1000000)
    private Long projectId;

    private ListProjectRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRolesRequest create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListProjectRolesRequest, Builder> {
        private String regionId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRolesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
        } 

        /**
         * Dataworks ID of the region where the workspace is located.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Dataworks ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListProjectRolesRequest build() {
            return new ListProjectRolesRequest(this);
        } 

    } 

}
