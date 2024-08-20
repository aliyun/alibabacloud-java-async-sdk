// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainIpaConnDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainIpaConnDataRequest</p>
 */
public class DescribeDcdnDomainIpaConnDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitBy")
    private String splitBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainIpaConnDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainIpaConnDataRequest create() {
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
     * @return splitBy
     */
    public String getSplitBy() {
        return this.splitBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainIpaConnDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String splitBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainIpaConnDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
        } 

        /**
         * The domain names accelerated by IPA. Separate multiple domain names with commas (,).
         * <p>
         * 
         * > If you do not specify this parameter, the merged data of all accelerated domain names is returned.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Specifies how query results are grouped. By default, this parameter is empty. Valid values:
         * <p>
         * 
         * *   domain: Query results are grouped by accelerated domain name.
         * *   An empty string: Query results are not grouped.
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * The start of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnDomainIpaConnDataRequest build() {
            return new DescribeDcdnDomainIpaConnDataRequest(this);
        } 

    } 

}
