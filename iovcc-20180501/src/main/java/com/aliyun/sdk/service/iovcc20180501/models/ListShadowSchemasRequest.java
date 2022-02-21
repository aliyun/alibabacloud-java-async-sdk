// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShadowSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListShadowSchemasRequest</p>
 */
public class ListShadowSchemasRequest extends Request {
    @Query
    @NameInMap("PageIndex")
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("QueryType")
    private String queryType;

    @Query
    @NameInMap("QueryValue")
    private String queryValue;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListShadowSchemasRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.queryType = builder.queryType;
        this.queryValue = builder.queryValue;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShadowSchemasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return queryValue
     */
    public String getQueryValue() {
        return this.queryValue;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListShadowSchemasRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private String projectId; 
        private String queryType; 
        private String queryValue; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListShadowSchemasRequest response) {
            super(response);
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.queryType = response.queryType;
            this.queryValue = response.queryValue;
            this.regionId = response.regionId;
        } 

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * QueryValue.
         */
        public Builder queryValue(String queryValue) {
            this.putQueryParameter("QueryValue", queryValue);
            this.queryValue = queryValue;
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
        public ListShadowSchemasRequest build() {
            return new ListShadowSchemasRequest(this);
        } 

    } 

}
