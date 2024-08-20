// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnReportRequest</p>
 */
public class DescribeDcdnReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOverseas")
    private String isOverseas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDcdnReportRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.httpCode = builder.httpCode;
        this.isOverseas = builder.isOverseas;
        this.reportId = builder.reportId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return isOverseas
     */
    public String getIsOverseas() {
        return this.isOverseas;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnReportRequest, Builder> {
        private String area; 
        private String domainName; 
        private String endTime; 
        private String httpCode; 
        private String isOverseas; 
        private Long reportId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnReportRequest request) {
            super(request);
            this.area = request.area;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.httpCode = request.httpCode;
            this.isOverseas = request.isOverseas;
            this.reportId = request.reportId;
            this.startTime = request.startTime;
        } 

        /**
         * The region. You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query regions.
         * <p>
         * 
         * *   If you do not specify a region, data in all regions is queried.
         * *   If you specify a region, data in the specified region is returned. You can specify one or more regions. Separate regions with commas (,).
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * The domain names that you want to query. Separate domain names with commas (,).
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: HTTP 2xx status codes
         * *   **3xx**: HTTP 3xx status codes
         * *   **4xx**: HTTP 4xx status codes
         * *   **5xx**: HTTP 5xx status codes
         * 
         * If you do not specify an HTTP status code, data for all preceding HTTP status codes is queried.
         */
        public Builder httpCode(String httpCode) {
            this.putQueryParameter("HttpCode", httpCode);
            this.httpCode = httpCode;
            return this;
        }

        /**
         * Specify whether the region is outside the Chinese mainland. Valid values:
         * <p>
         * 
         * *   **1**: outside the Chinese mainland
         * *   **0**: inside the Chinese mainland
         */
        public Builder isOverseas(String isOverseas) {
            this.putQueryParameter("IsOverseas", isOverseas);
            this.isOverseas = isOverseas;
            return this;
        }

        /**
         * The ID of the operations report that you want to query. You can enter only one ID in each call. You can call the [DescribeDcdnSubList](~~270075~~) operation to query report IDs.
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnReportRequest build() {
            return new DescribeDcdnReportRequest(this);
        } 

    } 

}
