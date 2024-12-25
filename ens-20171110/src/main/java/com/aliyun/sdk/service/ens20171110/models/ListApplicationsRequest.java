// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersions")
    private String appVersions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterNames")
    private String clusterNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDate")
    private String maxDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDate")
    private String minDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutAppInfoParams")
    private String outAppInfoParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
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

        private Builder(ListApplicationsRequest request) {
            super(request);
            this.appVersions = request.appVersions;
            this.clusterNames = request.clusterNames;
            this.level = request.level;
            this.maxDate = request.maxDate;
            this.minDate = request.minDate;
            this.outAppInfoParams = request.outAppInfoParams;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The version number of the application. Separate multiple version numbers with commas (,). If you want to query data of all versions of applications, specify All for this parameter. By default, only data of applications in the stable versions are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>v1,v2</p>
         */
        public Builder appVersions(String appVersions) {
            this.putQueryParameter("AppVersions", appVersions);
            this.appVersions = appVersions;
            return this;
        }

        /**
         * <p>The name of the application cluster. Separate multiple names with commas (,). If you want to query applications of all clusters in your account, specify All for this parameter. Default value: All.</p>
         * 
         * <strong>example:</strong>
         * <p>poc,pre</p>
         */
        public Builder clusterNames(String clusterNames) {
            this.putQueryParameter("ClusterNames", clusterNames);
            this.clusterNames = clusterNames;
            return this;
        }

        /**
         * <p>The region level by which edge resources of the application are collected. The value is of the enumeration type. Valid values:</p>
         * <ul>
         * <li>National: Chinese mainland</li>
         * <li>Big: area</li>
         * <li>Middle: province</li>
         * <li>Small: city</li>
         * <li>RegionId: edge node</li>
         * </ul>
         * <p>Default value: National.</p>
         * 
         * <strong>example:</strong>
         * <p>National</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-20</p>
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-15</p>
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * <p>Specifies whether to return other information about the application, such as statistics on resource instances and pods. The value must be a JSON string. By default, all information is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appInfo&quot;:true,&quot;detailStat&quot;: true, &quot;appVersionStat&quot;: true, &quot;districtStat&quot;:true ,&quot;instanceStat&quot;: true, &quot;podCountStat&quot;: true}</p>
         */
        public Builder outAppInfoParams(String outAppInfoParams) {
            this.putQueryParameter("OutAppInfoParams", outAppInfoParams);
            this.outAppInfoParams = outAppInfoParams;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. This parameter is optional if you want to return all information about the applications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. This parameter is optional if you want to return all information about the applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
