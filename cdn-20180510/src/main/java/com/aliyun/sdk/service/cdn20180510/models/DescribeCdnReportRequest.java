// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnReportRequest</p>
 */
public class DescribeCdnReportRequest extends Request {
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

    private DescribeCdnReportRequest(Builder builder) {
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

    public static DescribeCdnReportRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCdnReportRequest, Builder> {
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

        private Builder(DescribeCdnReportRequest request) {
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
         * <p>The region. You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query regions.</p>
         * <ul>
         * <li>If you do not specify a region, data in all regions is queried.</li>
         * <li>If you specify a region, data in the specified region is queried. You can specify one or more regions. If you specify multiple regions, separate the regions with commas (,).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shanghai</p>
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * <p>The domain name that you want to query. Separate domain names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example1.com,example2.com">www.example1.com,example2.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-17T01:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong></li>
         * <li><strong>3xx</strong></li>
         * <li><strong>4xx</strong></li>
         * <li><strong>5xx</strong></li>
         * </ul>
         * <p>If you do not specify this parameter, all HTTP status codes are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2xx</p>
         */
        public Builder httpCode(String httpCode) {
            this.putQueryParameter("HttpCode", httpCode);
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>Specifies whether the region is outside the Chinese mainland. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: outside the Chinese mainland</li>
         * <li><strong>0</strong>: inside the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isOverseas(String isOverseas) {
            this.putQueryParameter("IsOverseas", isOverseas);
            this.isOverseas = isOverseas;
            return this;
        }

        /**
         * <p>The ID of the operations report that you want to query. You can specify only one ID in each request. You can call the <a href="https://help.aliyun.com/document_detail/271655.html">DescribeCdnSubList</a> operation to query report IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-17T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCdnReportRequest build() {
            return new DescribeCdnReportRequest(this);
        } 

    } 

}
