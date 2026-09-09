// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSensitiveStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribeSensitiveStatisticRequest</p>
 */
public class DescribeSensitiveStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticType")
    private String statisticType;

    private DescribeSensitiveStatisticRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.startTime = builder.startTime;
        this.statisticType = builder.statisticType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statisticType
     */
    public String getStatisticType() {
        return this.statisticType;
    }

    public static final class Builder extends Request.Builder<DescribeSensitiveStatisticRequest, Builder> {
        private String clusterId; 
        private Long endTime; 
        private String instanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long startTime; 
        private String statisticType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSensitiveStatisticRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.startTime = request.startTime;
            this.statisticType = request.statisticType;
        } 

        /**
         * <p>The hybrid cloud cluster ID.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>428</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
         * <blockquote>
         * <p>Only data within the last month can be queried. <strong>StartTime</strong> cannot be earlier than one month before the current time. The query fails if the value is out of the supported range.
         * This parameter is optional. Default value: the current time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1725966000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number to return in a paged query. Default value: <strong>1</strong>, which indicates the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>, which indicates 10 entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
         * <blockquote>
         * <p>Only data within the last month can be queried. <strong>StartTime</strong> cannot be earlier than one month before the current time. The query fails if the value is out of the supported range.
         * This parameter is optional. Default value: one month before the current time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1672502400</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type of data statistics. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address statistics.</li>
         * <li><strong>host</strong>: domain name statistics.</li>
         * <li><strong>sensitive_code</strong>: sensitive data type statistics.</li>
         * <li><strong>api</strong>: sensitive data API statistics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder statisticType(String statisticType) {
            this.putQueryParameter("StatisticType", statisticType);
            this.statisticType = statisticType;
            return this;
        }

        @Override
        public DescribeSensitiveStatisticRequest build() {
            return new DescribeSensitiveStatisticRequest(this);
        } 

    } 

}
