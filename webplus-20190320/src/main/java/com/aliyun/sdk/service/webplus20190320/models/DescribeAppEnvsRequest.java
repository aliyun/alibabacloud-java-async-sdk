// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppEnvsRequest</p>
 */
public class DescribeAppEnvsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("EnvName")
    private String envName;

    @Query
    @NameInMap("EnvSearch")
    private String envSearch;

    @Query
    @NameInMap("IncludeTerminated")
    private Boolean includeTerminated;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RecentUpdated")
    private Boolean recentUpdated;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackSearch")
    private String stackSearch;

    private DescribeAppEnvsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.envName = builder.envName;
        this.envSearch = builder.envSearch;
        this.includeTerminated = builder.includeTerminated;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recentUpdated = builder.recentUpdated;
        this.regionId = builder.regionId;
        this.stackSearch = builder.stackSearch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return envName
     */
    public String getEnvName() {
        return this.envName;
    }

    /**
     * @return envSearch
     */
    public String getEnvSearch() {
        return this.envSearch;
    }

    /**
     * @return includeTerminated
     */
    public Boolean getIncludeTerminated() {
        return this.includeTerminated;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recentUpdated
     */
    public Boolean getRecentUpdated() {
        return this.recentUpdated;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackSearch
     */
    public String getStackSearch() {
        return this.stackSearch;
    }

    public static final class Builder extends Request.Builder<DescribeAppEnvsRequest, Builder> {
        private String appId; 
        private String envId; 
        private String envName; 
        private String envSearch; 
        private Boolean includeTerminated; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean recentUpdated; 
        private String regionId; 
        private String stackSearch; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppEnvsRequest response) {
            super(response);
            this.appId = response.appId;
            this.envId = response.envId;
            this.envName = response.envName;
            this.envSearch = response.envSearch;
            this.includeTerminated = response.includeTerminated;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.recentUpdated = response.recentUpdated;
            this.regionId = response.regionId;
            this.stackSearch = response.stackSearch;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * EnvName.
         */
        public Builder envName(String envName) {
            this.putQueryParameter("EnvName", envName);
            this.envName = envName;
            return this;
        }

        /**
         * EnvSearch.
         */
        public Builder envSearch(String envSearch) {
            this.putQueryParameter("EnvSearch", envSearch);
            this.envSearch = envSearch;
            return this;
        }

        /**
         * IncludeTerminated.
         */
        public Builder includeTerminated(Boolean includeTerminated) {
            this.putQueryParameter("IncludeTerminated", includeTerminated);
            this.includeTerminated = includeTerminated;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * RecentUpdated.
         */
        public Builder recentUpdated(Boolean recentUpdated) {
            this.putQueryParameter("RecentUpdated", recentUpdated);
            this.recentUpdated = recentUpdated;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StackSearch.
         */
        public Builder stackSearch(String stackSearch) {
            this.putQueryParameter("StackSearch", stackSearch);
            this.stackSearch = stackSearch;
            return this;
        }

        @Override
        public DescribeAppEnvsRequest build() {
            return new DescribeAppEnvsRequest(this);
        } 

    } 

}
