// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link ListEvaluationScoreHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListEvaluationScoreHistoryRequest</p>
 */
public class ListEvaluationScoreHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private ListEvaluationScoreHistoryRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.endDate = builder.endDate;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationScoreHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ListEvaluationScoreHistoryRequest, Builder> {
        private Long accountId; 
        private String endDate; 
        private String regionId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationScoreHistoryRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.endDate = request.endDate;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
         * <p>By default, the historical scores that were generated in the seven days before the current date are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-11</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
         * <p>You can query the historical scores within the previous 180 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-11</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ListEvaluationScoreHistoryRequest build() {
            return new ListEvaluationScoreHistoryRequest(this);
        } 

    } 

}
