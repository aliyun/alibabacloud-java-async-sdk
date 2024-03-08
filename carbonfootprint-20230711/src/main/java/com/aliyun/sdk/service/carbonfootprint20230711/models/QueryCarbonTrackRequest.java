// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCarbonTrackRequest} extends {@link RequestModel}
 *
 * <p>QueryCarbonTrackRequest</p>
 */
public class QueryCarbonTrackRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("FilterRDAccount")
    private Integer filterRDAccount;

    @Query
    @NameInMap("Group")
    private String group;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TopNum")
    private Integer topNum;

    @Query
    @NameInMap("Uids")
    private java.util.List < String > uids;

    private QueryCarbonTrackRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filterRDAccount = builder.filterRDAccount;
        this.group = builder.group;
        this.startTime = builder.startTime;
        this.topNum = builder.topNum;
        this.uids = builder.uids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCarbonTrackRequest create() {
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
     * @return filterRDAccount
     */
    public Integer getFilterRDAccount() {
        return this.filterRDAccount;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return topNum
     */
    public Integer getTopNum() {
        return this.topNum;
    }

    /**
     * @return uids
     */
    public java.util.List < String > getUids() {
        return this.uids;
    }

    public static final class Builder extends Request.Builder<QueryCarbonTrackRequest, Builder> {
        private String endTime; 
        private Integer filterRDAccount; 
        private String group; 
        private String startTime; 
        private Integer topNum; 
        private java.util.List < String > uids; 

        private Builder() {
            super();
        } 

        private Builder(QueryCarbonTrackRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.filterRDAccount = request.filterRDAccount;
            this.group = request.group;
            this.startTime = request.startTime;
            this.topNum = request.topNum;
            this.uids = request.uids;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * FilterRDAccount.
         */
        public Builder filterRDAccount(Integer filterRDAccount) {
            this.putQueryParameter("FilterRDAccount", filterRDAccount);
            this.filterRDAccount = filterRDAccount;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TopNum.
         */
        public Builder topNum(Integer topNum) {
            this.putQueryParameter("TopNum", topNum);
            this.topNum = topNum;
            return this;
        }

        /**
         * Uids.
         */
        public Builder uids(java.util.List < String > uids) {
            String uidsShrink = shrink(uids, "Uids", "json");
            this.putQueryParameter("Uids", uidsShrink);
            this.uids = uids;
            return this;
        }

        @Override
        public QueryCarbonTrackRequest build() {
            return new QueryCarbonTrackRequest(this);
        } 

    } 

}
