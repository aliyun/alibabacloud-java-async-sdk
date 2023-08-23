// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEsExecuteDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeEsExecuteDataRequest</p>
 */
public class DescribeEsExecuteDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeEsExecuteDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ruleId = builder.ruleId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEsExecuteDataRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEsExecuteDataRequest, Builder> {
        private String endTime; 
        private String ruleId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEsExecuteDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ruleId = request.ruleId;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the rule. You can call the [DescribeCdnDomainConfigs](~~90924~~) operation to query script IDs.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeEsExecuteDataRequest build() {
            return new DescribeEsExecuteDataRequest(this);
        } 

    } 

}
