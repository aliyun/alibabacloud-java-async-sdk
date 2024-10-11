// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodDomainRealTimeDetailDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodDomainRealTimeDetailDataRequest</p>
 */
public class DescribeVodDomainRealTimeDetailDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Field")
    @com.aliyun.core.annotation.Validation(required = true)
    private String field;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspNameEn")
    private String ispNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationNameEn")
    private String locationNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Merge")
    private String merge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergeLocIsp")
    private String mergeLocIsp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeVodDomainRealTimeDetailDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.ispNameEn = builder.ispNameEn;
        this.locationNameEn = builder.locationNameEn;
        this.merge = builder.merge;
        this.mergeLocIsp = builder.mergeLocIsp;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainRealTimeDetailDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return ispNameEn
     */
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    /**
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    /**
     * @return merge
     */
    public String getMerge() {
        return this.merge;
    }

    /**
     * @return mergeLocIsp
     */
    public String getMergeLocIsp() {
        return this.mergeLocIsp;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeVodDomainRealTimeDetailDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String field; 
        private String ispNameEn; 
        private String locationNameEn; 
        private String merge; 
        private String mergeLocIsp; 
        private Long ownerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodDomainRealTimeDetailDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.field = request.field;
            this.ispNameEn = request.ispNameEn;
            this.locationNameEn = request.locationNameEn;
            this.merge = request.merge;
            this.mergeLocIsp = request.mergeLocIsp;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The accelerated domain name. You can specify a maximum of 20 accelerated domain names in each call. Separate domain names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2019-11-30T05:40:00Z.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-23T12:40:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of data that you want to query. You can specify multiple data types and separate them with commas (,). Valid values:</p>
         * <p>qps: the number of queries per second bps: bandwidth data http_code: HTTP status codes</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bps</p>
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * <p>The name of the Internet service provider (ISP).</p>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * <p>The name of the region. If you do not specify a region, data in all regions is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>shanghai</p>
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * <p>Specifies whether to return a summary value. Valid values:</p>
         * <p>true false (default)</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder merge(String merge) {
            this.putQueryParameter("Merge", merge);
            this.merge = merge;
            return this;
        }

        /**
         * <p>Specifies whether to return a summary value. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: groups the results by domain name and merges the results by region and ISP.</li>
         * <li><strong>false</strong>: groups the results by domain name.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder mergeLocIsp(String mergeLocIsp) {
            this.putQueryParameter("MergeLocIsp", mergeLocIsp);
            this.mergeLocIsp = mergeLocIsp;
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
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2019-11-30T05:33:00Z.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-23T12:35:12Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeVodDomainRealTimeDetailDataRequest build() {
            return new DescribeVodDomainRealTimeDetailDataRequest(this);
        } 

    } 

}
