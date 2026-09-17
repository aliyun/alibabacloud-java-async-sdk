// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeSqlPatternCompareReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlPatternCompareReportRequest</p>
 */
public class DescribeSqlPatternCompareReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeRate")
    private String changeRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludePattern")
    private Boolean includePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportId;

    private DescribeSqlPatternCompareReportRequest(Builder builder) {
        super(builder);
        this.changeRate = builder.changeRate;
        this.DBClusterId = builder.DBClusterId;
        this.includePattern = builder.includePattern;
        this.metricType = builder.metricType;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlPatternCompareReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeRate
     */
    public String getChangeRate() {
        return this.changeRate;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return includePattern
     */
    public Boolean getIncludePattern() {
        return this.includePattern;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<DescribeSqlPatternCompareReportRequest, Builder> {
        private String changeRate; 
        private String DBClusterId; 
        private Boolean includePattern; 
        private String metricType; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlPatternCompareReportRequest request) {
            super(request);
            this.changeRate = request.changeRate;
            this.DBClusterId = request.DBClusterId;
            this.includePattern = request.includePattern;
            this.metricType = request.metricType;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.reportId = request.reportId;
        } 

        /**
         * <p>The average change rate filter range for CHANGED reports. The format is <code>left~right</code>, where values are expressed as percentages and the interval is left-exclusive and right-inclusive. Examples:</p>
         * <ul>
         * <li><code>100~500</code>: greater than 100% and less than or equal to 500%.</li>
         * <li><code>100~</code>: greater than 100% with no upper limit.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The left boundary is required and must be no less than 0. The right boundary must be no less than the left boundary.</li>
         * <li>This parameter is ignored for NEW reports.</li>
         * <li>When the time window 1 metric value is 0 and the time window 2 value is greater than 0, the Pattern is classified as zero-baseline growth and is categorized as <code>SEVERE</code> (significant change). To exclude such Patterns, set an upper limit for the change rate.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100~500</p>
         */
        public Builder changeRate(String changeRate) {
            this.putQueryParameter("ChangeRate", changeRate);
            this.changeRate = changeRate;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-2ze1234567890****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to return the parameterized SQL Pattern text. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Returns the Pattern text.</li>
         * <li><code>false</code>: Does not return the Pattern text, which reduces the response size.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includePattern(Boolean includePattern) {
            this.putQueryParameter("IncludePattern", includePattern);
            this.includePattern = includePattern;
            return this;
        }

        /**
         * <p>The analysis metric. Valid values:</p>
         * <ul>
         * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
         * <li><code>CPU_COST</code>: the CPU consumption.</li>
         * <li><code>SHUFFLE_SIZE</code>: the amount of shuffle data.</li>
         * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
         * <li><code>SCAN_SIZE</code>: the amount of scanned data.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU_COST</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>Sorts the query results by a specified field. The value is a JSON array string, such as <code>[{&quot;Field&quot;:&quot;Time2SumValue&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</code>. The array can contain only one object. Parameters:</p>
         * <ul>
         * <li><code>Field</code>: the sort field. This parameter is case-sensitive. Valid values:<ul>
         * <li>NEW report: <code>Time2SumValue</code>, <code>Time2AvgValue</code>, <code>Time2MaxValue</code>.</li>
         * <li>CHANGED report: <code>AvgChangeRatePercent</code>, <code>AvgTime1Value</code>, <code>AvgTime2Value</code>, <code>SumChangeRatePercent</code>, <code>SumTime1Value</code>, <code>SumTime2Value</code>, <code>MaxChangeRatePercent</code>, <code>MaxTime1Value</code>, <code>MaxTime2Value</code>.</li>
         * <li>All report types and analysis metrics: <code>AvgRt</code>, <code>MaxRt</code>.</li>
         * <li><code>QUERY_COUNT</code>: <code>TotalQueryTime</code>.</li>
         * <li><code>CPU_COST</code>: <code>QueryCount</code>, <code>AvgPlanningTime</code>, <code>MaxPlanningTime</code>, <code>AvgExecutionTime</code>, <code>MaxExecutionTime</code>.</li>
         * <li><code>SHUFFLE_SIZE</code>, <code>PEAK_MEMORY</code>: <code>QueryCount</code>.</li>
         * <li><code>SCAN_SIZE</code>: <code>QueryCount</code>, <code>TotalScanCost</code>.</li>
         * </ul>
         * </li>
         * <li><code>Type</code>: the sort order. This parameter is case-insensitive. Valid values:<ul>
         * <li><code>Asc</code>: ascending order.</li>
         * <li><code>Desc</code>: descending order.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>NEW reports are sorted by <code>Time2SumValue</code> in descending order by default.</li>
         * <li>CHANGED reports are sorted by <code>AvgChangeRatePercent</code> in descending order by default.</li>
         * <li>The value of <code>Field</code> must be applicable to the current report type and <code>MetricType</code>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;AvgChangeRatePercent&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <p>Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the SQL Pattern comparison report.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public DescribeSqlPatternCompareReportRequest build() {
            return new DescribeSqlPatternCompareReportRequest(this);
        } 

    } 

}
