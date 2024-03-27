// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSummaryDataRequest} extends {@link RequestModel}
 *
 * <p>GetSummaryDataRequest</p>
 */
public class GetSummaryDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Group")
    private String group;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Uids")
    private java.util.List < String > uids;

    private GetSummaryDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.group = builder.group;
        this.startTime = builder.startTime;
        this.uids = builder.uids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSummaryDataRequest create() {
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
     * @return uids
     */
    public java.util.List < String > getUids() {
        return this.uids;
    }

    public static final class Builder extends Request.Builder<GetSummaryDataRequest, Builder> {
        private String endTime; 
        private String group; 
        private String startTime; 
        private java.util.List < String > uids; 

        private Builder() {
            super();
        } 

        private Builder(GetSummaryDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.group = request.group;
            this.startTime = request.startTime;
            this.uids = request.uids;
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
         * The list of Alibaba Cloud account IDs whose data needs to be queried.(used after enabling multi-account management).
         */
        public Builder uids(java.util.List < String > uids) {
            String uidsShrink = shrink(uids, "Uids", "json");
            this.putQueryParameter("Uids", uidsShrink);
            this.uids = uids;
            return this;
        }

        @Override
        public GetSummaryDataRequest build() {
            return new GetSummaryDataRequest(this);
        } 

    } 

}
