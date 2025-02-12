// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDomainTopFingerprintRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainTopFingerprintRequest</p>
 */
public class DescribeDomainTopFingerprintRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDomainTopFingerprintRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.limit = builder.limit;
        this.region = builder.region;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopFingerprintRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDomainTopFingerprintRequest, Builder> {
        private String domain; 
        private Long endTime; 
        private Long interval; 
        private Long limit; 
        private String region; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainTopFingerprintRequest request) {
            super(request);
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.limit = request.limit;
            this.region = request.region;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <blockquote>
         * <p> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1723552200</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The interval for returning data. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The region in which your service is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: a region in the Chinese mainland.</li>
         * <li><strong>cn-hongkong</strong>: a region outside the Chinese mainland.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <blockquote>
         * <p> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1719211800</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDomainTopFingerprintRequest build() {
            return new DescribeDomainTopFingerprintRequest(this);
        } 

    } 

}
