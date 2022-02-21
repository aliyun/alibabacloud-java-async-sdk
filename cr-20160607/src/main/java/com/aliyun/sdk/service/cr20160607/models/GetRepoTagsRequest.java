// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagsRequest} extends {@link RequestModel}
 *
 * <p>GetRepoTagsRequest</p>
 */
public class GetRepoTagsRequest extends Request {
    @Path
    @NameInMap("RepoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetRepoTagsRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetRepoTagsRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private Integer page; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoTagsRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.page = response.page;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * RepoNamespace.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putPathParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putPathParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetRepoTagsRequest build() {
            return new GetRepoTagsRequest(this);
        } 

    } 

}
