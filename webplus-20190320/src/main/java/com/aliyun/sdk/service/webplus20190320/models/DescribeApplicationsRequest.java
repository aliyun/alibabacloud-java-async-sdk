// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationsRequest</p>
 */
public class DescribeApplicationsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("AppSearch")
    private String appSearch;

    @Query
    @NameInMap("CategorySearch")
    private String categorySearch;

    @Query
    @NameInMap("EnvSearch")
    private String envSearch;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackSearch")
    private String stackSearch;

    private DescribeApplicationsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appSearch = builder.appSearch;
        this.categorySearch = builder.categorySearch;
        this.envSearch = builder.envSearch;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.stackSearch = builder.stackSearch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationsRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appSearch
     */
    public String getAppSearch() {
        return this.appSearch;
    }

    /**
     * @return categorySearch
     */
    public String getCategorySearch() {
        return this.categorySearch;
    }

    /**
     * @return envSearch
     */
    public String getEnvSearch() {
        return this.envSearch;
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

    public static final class Builder extends Request.Builder<DescribeApplicationsRequest, Builder> {
        private String appId; 
        private String appName; 
        private String appSearch; 
        private String categorySearch; 
        private String envSearch; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String stackSearch; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationsRequest response) {
            super(response);
            this.appId = response.appId;
            this.appName = response.appName;
            this.appSearch = response.appSearch;
            this.categorySearch = response.categorySearch;
            this.envSearch = response.envSearch;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppSearch.
         */
        public Builder appSearch(String appSearch) {
            this.putQueryParameter("AppSearch", appSearch);
            this.appSearch = appSearch;
            return this;
        }

        /**
         * CategorySearch.
         */
        public Builder categorySearch(String categorySearch) {
            this.putQueryParameter("CategorySearch", categorySearch);
            this.categorySearch = categorySearch;
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
        public DescribeApplicationsRequest build() {
            return new DescribeApplicationsRequest(this);
        } 

    } 

}
