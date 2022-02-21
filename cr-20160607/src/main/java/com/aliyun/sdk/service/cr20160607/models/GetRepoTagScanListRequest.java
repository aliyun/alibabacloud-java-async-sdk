// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagScanListRequest} extends {@link RequestModel}
 *
 * <p>GetRepoTagScanListRequest</p>
 */
public class GetRepoTagScanListRequest extends Request {
    @Path
    @NameInMap("RepoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Path
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Severity")
    private String severity;

    private GetRepoTagScanListRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.tag = builder.tag;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanListRequest create() {
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
     * @return tag
     */
    public String getTag() {
        return this.tag;
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

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    public static final class Builder extends Request.Builder<GetRepoTagScanListRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private String tag; 
        private Integer page; 
        private Integer pageSize; 
        private String regionId; 
        private String severity; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoTagScanListRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.tag = response.tag;
            this.page = response.page;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.severity = response.severity;
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
         * Tag.
         */
        public Builder tag(String tag) {
            this.putPathParameter("Tag", tag);
            this.tag = tag;
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

        /**
         * Severity.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        @Override
        public GetRepoTagScanListRequest build() {
            return new GetRepoTagScanListRequest(this);
        } 

    } 

}
