// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnDomainTopReferVisitRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainTopReferVisitRequest</p>
 */
public class DescribeDcdnDomainTopReferVisitRequest extends Request {
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

    private DescribeDcdnDomainTopReferVisitRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainTopReferVisitRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainTopReferVisitRequest, Builder> {
        private String domainName; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainTopReferVisitRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name.</p>
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
         * <p>Default value: <strong>pv</strong>.</p>
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
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>To query the data on a specified day, use the yyyy-MM-ddT16:00:00Z format.</p>
         * <p>If you do not set this parameter, data collected within the last 24 hours is queried.</p>
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
        public DescribeDcdnDomainTopReferVisitRequest build() {
            return new DescribeDcdnDomainTopReferVisitRequest(this);
        } 

    } 

}
