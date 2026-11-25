// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterTaskMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIDBClusterTaskMetricsRequest</p>
 */
public class DescribeAIDBClusterTaskMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelativeDBClusterId")
    private String relativeDBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeAIDBClusterTaskMetricsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.metricType = builder.metricType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.relativeDBClusterId = builder.relativeDBClusterId;
        this.reverse = builder.reverse;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterTaskMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
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
     * @return relativeDBClusterId
     */
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeAIDBClusterTaskMetricsRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String metricType; 
        private Long pageNumber; 
        private Long pageSize; 
        private String relativeDBClusterId; 
        private Boolean reverse; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAIDBClusterTaskMetricsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.metricType = request.metricType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.relativeDBClusterId = request.relativeDBClusterId;
            this.reverse = request.reverse;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cluster ID. Usage note: This parameter accepts only the ID of a training AIDB cluster created by calling CreateAIDBClusterTask. MaaS clusters with RunType set to maas are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2zejpr***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the query. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code> (UTC time).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-15T15:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The metric type. Valid values:</p>
         * <ul>
         * <li><code>all</code></li>
         * <li><code>train</code></li>
         * <li><code>eval</code></li>
         * </ul>
         * <blockquote>
         * <p>Default value: <em>all</em>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The page number of the query results.</p>
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
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The instance ID of the associated PolarDB.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zejpr***</p>
         */
        public Builder relativeDBClusterId(String relativeDBClusterId) {
            this.putQueryParameter("RelativeDBClusterId", relativeDBClusterId);
            this.relativeDBClusterId = relativeDBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to sort the results in descending order. Default value: <em>false</em>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The start time of the query. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code> (UTC time).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-15T14:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeAIDBClusterTaskMetricsRequest build() {
            return new DescribeAIDBClusterTaskMetricsRequest(this);
        } 

    } 

}
