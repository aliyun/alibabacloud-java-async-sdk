// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodPlayerMetricDataDemoRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodPlayerMetricDataDemoRequest</p>
 */
public class DescribeVodPlayerMetricDataDemoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private String filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Top")
    private Long top;

    private DescribeVodPlayerMetricDataDemoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.interval = builder.interval;
        this.metrics = builder.metrics;
        this.os = builder.os;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.terminalType = builder.terminalType;
        this.top = builder.top;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerMetricDataDemoRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    /**
     * @return top
     */
    public Long getTop() {
        return this.top;
    }

    public static final class Builder extends Request.Builder<DescribeVodPlayerMetricDataDemoRequest, Builder> {
        private String appId; 
        private String endTime; 
        private String filters; 
        private String interval; 
        private String metrics; 
        private String os; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startTime; 
        private String terminalType; 
        private Long top; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodPlayerMetricDataDemoRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.interval = request.interval;
            this.metrics = request.metrics;
            this.os = request.os;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.terminalType = request.terminalType;
            this.top = request.top;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-05T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(String filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Vv,Uv,AvgPerVv</p>
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-24T00:55:06Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        /**
         * Top.
         */
        public Builder top(Long top) {
            this.putQueryParameter("Top", top);
            this.top = top;
            return this;
        }

        @Override
        public DescribeVodPlayerMetricDataDemoRequest build() {
            return new DescribeVodPlayerMetricDataDemoRequest(this);
        } 

    } 

}
