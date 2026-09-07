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
 * {@link QueryHistoryActiveUserStatisticRequest} extends {@link RequestModel}
 *
 * <p>QueryHistoryActiveUserStatisticRequest</p>
 */
public class QueryHistoryActiveUserStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private QueryHistoryActiveUserStatisticRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.endDate = builder.endDate;
        this.officeSiteId = builder.officeSiteId;
        this.period = builder.period;
        this.startDate = builder.startDate;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryActiveUserStatisticRequest create() {
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
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<QueryHistoryActiveUserStatisticRequest, Builder> {
        private Integer bizType; 
        private String endDate; 
        private String officeSiteId; 
        private String period; 
        private String startDate; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryHistoryActiveUserStatisticRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.endDate = request.endDate;
            this.officeSiteId = request.officeSiteId;
            this.period = request.period;
            this.startDate = request.startDate;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The business channel type code.</p>
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
         * <p>The end date of the query. The date is in the yyyy-MM-dd format. The maximum value is yesterday (N-1 data).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-31</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The workspace ID. If specified, only active users within the specified workspace are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-467671****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The start date of the query. The date is in the yyyy-MM-dd format. The value cannot be earlier than 6 months ago or later than EndDate.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The user group ID. If specified, only active users within the specified user group are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-12345678</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public QueryHistoryActiveUserStatisticRequest build() {
            return new QueryHistoryActiveUserStatisticRequest(this);
        } 

    } 

}
