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
    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 1000000)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListProjectRolesRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListProjectRolesRequest, Builder> {
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRolesRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public ListProjectRolesRequest build() {
            return new ListProjectRolesRequest(this);
        } 

    } 

}
