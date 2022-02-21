// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnReportRequest</p>
 */
public class DescribeCdnReportRequest extends Request {
    @Query
    @NameInMap("Area")
    private String area;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("HttpCode")
    private String httpCode;

    @Query
    @NameInMap("IsOverseas")
    private String isOverseas;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReportId")
    @Validation(required = true)
    private Long reportId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeCdnReportRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.httpCode = builder.httpCode;
        this.isOverseas = builder.isOverseas;
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private Long reportId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnReportRequest response) {
            super(response);
            this.area = response.area;
            this.domainName = response.domainName;
            this.endTime = response.endTime;
            this.httpCode = response.httpCode;
            this.isOverseas = response.isOverseas;
            this.ownerId = response.ownerId;
            this.reportId = response.reportId;
            this.startTime = response.startTime;
        } 

        /**
         * Area.
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.putQueryParameter("HttpCode", httpCode);
            this.httpCode = httpCode;
            return this;
        }

        /**
         * IsOverseas.
         */
        public Builder isOverseas(String isOverseas) {
            this.putQueryParameter("IsOverseas", isOverseas);
            this.isOverseas = isOverseas;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ReportId.
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * StartTime.
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
