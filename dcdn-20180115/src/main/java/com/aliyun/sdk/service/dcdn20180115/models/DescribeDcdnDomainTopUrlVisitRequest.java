// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainTopUrlVisitRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainTopUrlVisitRequest</p>
 */
public class DescribeDcdnDomainTopUrlVisitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainTopUrlVisitRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainTopUrlVisitRequest create() {
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainTopUrlVisitRequest, Builder> {
        private String domainName; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainTopUrlVisitRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
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
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li><strong>traf</strong>: by network traffic</li>
         * <li><strong>pv</strong>: by the number of visits</li>
         * </ul>
         * <p>Default value: <strong>pv</strong></p>
         * 
         * <strong>example:</strong>
         * <p>pv</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The start of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         * <p>To query the data on a specified day, use the format: yyyy-MM-ddT16:00:00Z.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the data in the last 24 hours is queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-10-03T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnDomainTopUrlVisitRequest build() {
            return new DescribeDcdnDomainTopUrlVisitRequest(this);
        } 

    } 

}
