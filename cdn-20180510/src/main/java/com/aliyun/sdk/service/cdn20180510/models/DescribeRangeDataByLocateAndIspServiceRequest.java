// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRangeDataByLocateAndIspServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRangeDataByLocateAndIspServiceRequest</p>
 */
public class DescribeRangeDataByLocateAndIspServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspNames")
    private String ispNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationNames")
    private String locationNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeRangeDataByLocateAndIspServiceRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.endTime = builder.endTime;
        this.ispNames = builder.ispNames;
        this.locationNames = builder.locationNames;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRangeDataByLocateAndIspServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ispNames
     */
    public String getIspNames() {
        return this.ispNames;
    }

    /**
     * @return locationNames
     */
    public String getLocationNames() {
        return this.locationNames;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRangeDataByLocateAndIspServiceRequest, Builder> {
        private String domainNames; 
        private String endTime; 
        private String ispNames; 
        private String locationNames; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRangeDataByLocateAndIspServiceRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.endTime = request.endTime;
            this.ispNames = request.ispNames;
            this.locationNames = request.locationNames;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The accelerated domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time. The maximum time range that can be specified is 1 hour.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-30T05:40:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the ISP. You can specify only one ISP name in each call.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query ISPs.</p>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        public Builder ispNames(String ispNames) {
            this.putQueryParameter("IspNames", ispNames);
            this.ispNames = ispNames;
            return this;
        }

        /**
         * <p>The names of the regions. Separate multiple region names with commas (,).</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>liaoning,guangxi</p>
         */
        public Builder locationNames(String locationNames) {
            this.putQueryParameter("LocationNames", locationNames);
            this.locationNames = locationNames;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-30T05:33:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRangeDataByLocateAndIspServiceRequest build() {
            return new DescribeRangeDataByLocateAndIspServiceRequest(this);
        } 

    } 

}
