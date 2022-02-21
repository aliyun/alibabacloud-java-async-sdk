// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallMeasureSummaryReportRequest} extends {@link RequestModel}
 *
 * <p>GetCallMeasureSummaryReportRequest</p>
 */
public class GetCallMeasureSummaryReportRequest extends Request {
    @Query
    @NameInMap("Day")
    private Integer day;

    @Query
    @NameInMap("IntervalType")
    @Validation(required = true)
    private String intervalType;

    @Query
    @NameInMap("Month")
    @Validation(required = true)
    private Integer month;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Year")
    @Validation(required = true)
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

        private Builder(GetCallMeasureSummaryReportRequest response) {
            super(response);
            this.day = response.day;
            this.intervalType = response.intervalType;
            this.month = response.month;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.year = response.year;
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
         * IntervalType.
         */
        public Builder intervalType(String intervalType) {
            this.putQueryParameter("IntervalType", intervalType);
            this.intervalType = intervalType;
            return this;
        }

        /**
         * Month.
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
         * Year.
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
