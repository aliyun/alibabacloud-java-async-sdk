// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryActiveUserStatisticRequest} extends {@link RequestModel}
 *
 * <p>QueryActiveUserStatisticRequest</p>
 */
public class QueryActiveUserStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private QueryActiveUserStatisticRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.endTime = builder.endTime;
        this.officeSiteId = builder.officeSiteId;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryActiveUserStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryActiveUserStatisticRequest, Builder> {
        private Integer bizType; 
        private String endTime; 
        private String officeSiteId; 
        private String period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryActiveUserStatisticRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.endTime = request.endTime;
            this.officeSiteId = request.officeSiteId;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The business channel type code. Valid values:</p>
         * <ul>
         * <li>1 (default): Enterprise Edition.</li>
         * <li>3: Cloud Office.</li>
         * <li>10: Standard Edition.</li>
         * <li>20: Business Edition.</li>
         * <li>30: Education Business Edition.</li>
         * <li>40: Cloud Phone isolated resources.</li>
         * <li>50: AgentBay.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The end time of the query. The format is the same as StartTime. If the value is later than the current time, it is automatically truncated to the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T06:32:31Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The workspace ID. If specified, only active users of cloud desktops in this workspace are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-885351****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The aggregation interval for statistics. Valid values:</p>
         * <ul>
         * <li>ONE_MINUTE: 1 minute.</li>
         * <li>TWO_MINUTE: 2 minutes.</li>
         * <li>FIVE_MINUTE (default): 5 minutes.</li>
         * <li>ONE_HOUR: 1 hour.</li>
         * <li>ONE_DAY: 1 day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIVE_MINUTE</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The start time of the query. The following formats are supported:</p>
         * <ul>
         * <li>UTC format: yyyy-MM-ddTHH:mm:ssZ.</li>
         * <li>Standard format: yyyy-MM-dd HH:mm:ss.</li>
         * </ul>
         * <p>The value cannot be earlier than 6 months before the current time or later than EndTime.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-30T06:32:31Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryActiveUserStatisticRequest build() {
            return new QueryActiveUserStatisticRequest(this);
        } 

    } 

}
