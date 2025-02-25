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
 * {@link DescribeDataDistResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataDistResultRequest</p>
 */
public class DescribeDataDistResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataNames")
    private String dataNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataVersions")
    private String dataVersions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private java.util.List<String> ensRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDate")
    private String maxDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDate")
    private String minDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribeDataDistResultRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataNames = builder.dataNames;
        this.dataVersions = builder.dataVersions;
        this.ensRegionIds = builder.ensRegionIds;
        this.instanceIds = builder.instanceIds;
        this.maxDate = builder.maxDate;
        this.minDate = builder.minDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataDistResultRequest create() {
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
     * @return dataNames
     */
    public String getDataNames() {
        return this.dataNames;
    }

    /**
     * @return dataVersions
     */
    public String getDataVersions() {
        return this.dataVersions;
    }

    /**
     * @return ensRegionIds
     */
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
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

    public static final class Builder extends Request.Builder<DescribeDataDistResultRequest, Builder> {
        private String appId; 
        private String dataNames; 
        private String dataVersions; 
        private java.util.List<String> ensRegionIds; 
        private String instanceIds; 
        private String maxDate; 
        private String minDate; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataDistResultRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataNames = request.dataNames;
            this.dataVersions = request.dataVersions;
            this.ensRegionIds = request.ensRegionIds;
            this.instanceIds = request.instanceIds;
            this.maxDate = request.maxDate;
            this.minDate = request.minDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the data file. Separate multiple names with commas (,). By default, all data files are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudgame-shanghai/deploy_app/20220215/1644895216305ACG_M21B-ota-1.1.2-D-0215.0628_V1_0002-pre-weiduan.zip</p>
         */
        public Builder dataNames(String dataNames) {
            this.putQueryParameter("DataNames", dataNames);
            this.dataNames = dataNames;
            return this;
        }

        /**
         * <p>The version number of the data file. Separate multiple numbers with commas (,). By default, all versions of data files are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>4885</p>
         */
        public Builder dataVersions(String dataVersions) {
            this.putQueryParameter("DataVersions", dataVersions);
            this.dataVersions = dataVersions;
            return this;
        }

        /**
         * <p>The IDs of the ENS nodes.</p>
         */
        public Builder ensRegionIds(java.util.List<String> ensRegionIds) {
            String ensRegionIdsShrink = shrink(ensRegionIds, "EnsRegionIds", "json");
            this.putQueryParameter("EnsRegionIds", ensRegionIdsShrink);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * <p>The IDs of ENS instances. Separate multiple IDs with commas (,). By default, all instances are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>i-7ecpqvkicnchxccozrp,i-6ecpqvkicnchxccozrp</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-01</p>
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
         * <p>2022-01-02</p>
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. This parameter is optional if you want to return the distribution status of all data files.</p>
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
         * <p>The number of entries per page. This parameter is optional if you want to return the distribution status of all data files.</p>
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
        public DescribeDataDistResultRequest build() {
            return new DescribeDataDistResultRequest(this);
        } 

    } 

}
