// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @Query
    @NameInMap("AppVersions")
    private String appVersions;

    @Query
    @NameInMap("ClusterNames")
    private String clusterNames;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("MaxDate")
    private String maxDate;

    @Query
    @NameInMap("MinDate")
    private String minDate;

    @Query
    @NameInMap("OutAppInfoParams")
    private String outAppInfoParams;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListApplicationsRequest(Builder builder) {
        super(builder);
        this.appVersions = builder.appVersions;
        this.clusterNames = builder.clusterNames;
        this.level = builder.level;
        this.maxDate = builder.maxDate;
        this.minDate = builder.minDate;
        this.outAppInfoParams = builder.outAppInfoParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersions
     */
    public String getAppVersions() {
        return this.appVersions;
    }

    /**
     * @return clusterNames
     */
    public String getClusterNames() {
        return this.clusterNames;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return maxDate
     */
    public String getMaxDate() {
        return this.maxDate;
    }

    /**
     * @return minDate
     */
    public String getMinDate() {
        return this.minDate;
    }

    /**
     * @return outAppInfoParams
     */
    public String getOutAppInfoParams() {
        return this.outAppInfoParams;
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

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {
        private String appVersions; 
        private String clusterNames; 
        private String level; 
        private String maxDate; 
        private String minDate; 
        private String outAppInfoParams; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsRequest response) {
            super(response);
            this.appVersions = response.appVersions;
            this.clusterNames = response.clusterNames;
            this.level = response.level;
            this.maxDate = response.maxDate;
            this.minDate = response.minDate;
            this.outAppInfoParams = response.outAppInfoParams;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * AppVersions.
         */
        public Builder appVersions(String appVersions) {
            this.putQueryParameter("AppVersions", appVersions);
            this.appVersions = appVersions;
            return this;
        }

        /**
         * ClusterNames.
         */
        public Builder clusterNames(String clusterNames) {
            this.putQueryParameter("ClusterNames", clusterNames);
            this.clusterNames = clusterNames;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * MaxDate.
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * MinDate.
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * OutAppInfoParams.
         */
        public Builder outAppInfoParams(String outAppInfoParams) {
            this.putQueryParameter("OutAppInfoParams", outAppInfoParams);
            this.outAppInfoParams = outAppInfoParams;
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

        @Override
        public ListApplicationsRequest build() {
            return new ListApplicationsRequest(this);
        } 

    } 

}
