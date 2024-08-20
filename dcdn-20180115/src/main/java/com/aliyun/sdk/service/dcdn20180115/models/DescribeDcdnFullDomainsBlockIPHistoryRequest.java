// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnFullDomainsBlockIPHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnFullDomainsBlockIPHistoryRequest</p>
 */
public class DescribeDcdnFullDomainsBlockIPHistoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String IPList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDcdnFullDomainsBlockIPHistoryRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.IPList = builder.IPList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnFullDomainsBlockIPHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return IPList
     */
    public String getIPList() {
        return this.IPList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnFullDomainsBlockIPHistoryRequest, Builder> {
        private String endTime; 
        private String IPList; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnFullDomainsBlockIPHistoryRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.IPList = request.IPList;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The IP address or CIDR block to query.
         */
        public Builder IPList(String IPList) {
            this.putBodyParameter("IPList", IPList);
            this.IPList = IPList;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnFullDomainsBlockIPHistoryRequest build() {
            return new DescribeDcdnFullDomainsBlockIPHistoryRequest(this);
        } 

    } 

}
