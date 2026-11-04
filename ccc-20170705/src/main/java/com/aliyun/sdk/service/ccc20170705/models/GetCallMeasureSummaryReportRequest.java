// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetCallMeasureSummaryReportRequest} extends {@link RequestModel}
 *
 * <p>GetCallMeasureSummaryReportRequest</p>
 */
public class GetCallMeasureSummaryReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Day")
    private Integer day;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intervalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Month")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer month;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private GetCallMeasureSummaryReportRequest(Builder builder) {
        super(builder);
        this.day = builder.day;
        this.intervalType = builder.intervalType;
        this.month = builder.month;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallMeasureSummaryReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return day
     */
    public Integer getDay() {
        return this.day;
    }

    /**
     * @return intervalType
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * @return month
     */
    public Integer getMonth() {
        return this.month;
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
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<GetCallMeasureSummaryReportRequest, Builder> {
        private Integer day; 
        private String intervalType; 
        private Integer month; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(GetCallMeasureSummaryReportRequest request) {
            super(request);
            this.day = request.day;
            this.intervalType = request.intervalType;
            this.month = request.month;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.year = request.year;
        } 

        /**
         * Day.
         */
        public Builder day(Integer day) {
            this.putQueryParameter("Day", day);
            this.day = day;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder intervalType(String intervalType) {
            this.putQueryParameter("IntervalType", intervalType);
            this.intervalType = intervalType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder month(Integer month) {
            this.putQueryParameter("Month", month);
            this.month = month;
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
         * <p>This parameter is required.</p>
         */
        public Builder year(Integer year) {
            this.putQueryParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public GetCallMeasureSummaryReportRequest build() {
            return new GetCallMeasureSummaryReportRequest(this);
        } 

    } 

}
