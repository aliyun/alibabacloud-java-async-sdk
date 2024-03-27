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

    @Query
    @NameInMap("UseCode")
    private Integer useCode;

    private QueryCarbonTrackRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filterRDAccount = builder.filterRDAccount;
        this.group = builder.group;
        this.startTime = builder.startTime;
        this.topNum = builder.topNum;
        this.uids = builder.uids;
        this.useCode = builder.useCode;
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

    /**
     * @return useCode
     */
    public Integer getUseCode() {
        return this.useCode;
    }

    public static final class Builder extends Request.Builder<QueryCarbonTrackRequest, Builder> {
        private String endTime; 
        private Integer filterRDAccount; 
        private String group; 
        private String startTime; 
        private Integer topNum; 
        private java.util.List < String > uids; 
        private Integer useCode; 

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
            this.useCode = request.useCode;
        } 

        /**
         * The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format. Example: 2023-02-01 23:59:59.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Whether to count the carbon emission details of multiple accounts. You can pass it in after opening the multi-account management. The default value and 0 is No and 1 is Yes.
         */
        public Builder filterRDAccount(Integer filterRDAccount) {
            this.putQueryParameter("FilterRDAccount", filterRDAccount);
            this.filterRDAccount = filterRDAccount;
            return this;
        }

        /**
         * The statistical dimension. A value of productCode specifies that statistics are collected based on cloud service. A value of region specifies that statistics are collected based on region. A value of subUid specifies that statistics are collected based on Resource Access Management (RAM) user. If you do not specify this parameter, statistics are collected based on Alibaba Cloud account.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format. Example: 2023-01-01 00:00:00.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * After sorting in reverse order according to the data value of the return value, only the first TopNum data will be returned. If no data is passed, all data will be returned by default.
         */
        public Builder topNum(Integer topNum) {
            this.putQueryParameter("TopNum", topNum);
            this.topNum = topNum;
            return this;
        }

        /**
         * The list of Alibaba Cloud account IDs whose data needs to be queried.(used after enabling multi-account management).
         */
        public Builder uids(java.util.List < String > uids) {
            String uidsShrink = shrink(uids, "Uids", "json");
            this.putQueryParameter("Uids", uidsShrink);
            this.uids = uids;
            return this;
        }

        /**
         * Whether the return result uses code as the identifier(0 meas not used and 1 means used). If not passed, the default code is used.
         * <p>
         * 
         * For example, when the return result is to summarize carbon emissions according to the cloud product dimension, the identifier of ECS is "ecs" when 0 is passed, and "Elastic Compute Service" when 1 is passed.
         */
        public Builder useCode(Integer useCode) {
            this.putQueryParameter("UseCode", useCode);
            this.useCode = useCode;
            return this;
        }

        @Override
        public QueryCarbonTrackRequest build() {
            return new QueryCarbonTrackRequest(this);
        } 

    } 

}
