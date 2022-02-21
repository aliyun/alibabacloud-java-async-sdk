// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindPrepublishesByParentIdRequest} extends {@link RequestModel}
 *
 * <p>FindPrepublishesByParentIdRequest</p>
 */
public class FindPrepublishesByParentIdRequest extends Request {
    @Query
    @NameInMap("ParentId")
    @Validation(required = true)
    private Integer parentId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private FindPrepublishesByParentIdRequest(Builder builder) {
        super(builder);
        this.parentId = builder.parentId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindPrepublishesByParentIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentId
     */
    public Integer getParentId() {
        return this.parentId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<FindPrepublishesByParentIdRequest, Builder> {
        private Integer parentId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(FindPrepublishesByParentIdRequest response) {
            super(response);
            this.parentId = response.parentId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * ParentId.
         */
        public Builder parentId(Integer parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
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
        public FindPrepublishesByParentIdRequest build() {
            return new FindPrepublishesByParentIdRequest(this);
        } 

    } 

}
