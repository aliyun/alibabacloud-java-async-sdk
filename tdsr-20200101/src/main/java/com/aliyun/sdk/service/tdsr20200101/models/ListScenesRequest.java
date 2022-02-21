// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenesRequest} extends {@link RequestModel}
 *
 * <p>ListScenesRequest</p>
 */
public class ListScenesRequest extends Request {
    @Query
    @NameInMap("IsPublishQuery")
    private Boolean isPublishQuery;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListScenesRequest(Builder builder) {
        super(builder);
        this.isPublishQuery = builder.isPublishQuery;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScenesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isPublishQuery
     */
    public Boolean getIsPublishQuery() {
        return this.isPublishQuery;
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

    public static final class Builder extends Request.Builder<ListScenesRequest, Builder> {
        private Boolean isPublishQuery; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListScenesRequest response) {
            super(response);
            this.isPublishQuery = response.isPublishQuery;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * IsPublishQuery.
         */
        public Builder isPublishQuery(Boolean isPublishQuery) {
            this.putQueryParameter("IsPublishQuery", isPublishQuery);
            this.isPublishQuery = isPublishQuery;
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
        public ListScenesRequest build() {
            return new ListScenesRequest(this);
        } 

    } 

}
