// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnUserBillTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserBillTypeRequest</p>
 */
public class DescribeCdnUserBillTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeCdnUserBillTypeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserBillTypeRequest create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeCdnUserBillTypeRequest, Builder> {
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserBillTypeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>The end time must be later than the start time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-31T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>The minimum data granularity is 5 minutes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCdnUserBillTypeRequest build() {
            return new DescribeCdnUserBillTypeRequest(this);
        } 

    } 

}
