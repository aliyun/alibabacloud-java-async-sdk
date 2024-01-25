// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetEventStatisticsRequest</p>
 */
public class GetEventStatisticsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private GetEventStatisticsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.operaUid = builder.operaUid;
        this.startTime = builder.startTime;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventStatisticsRequest create() {
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
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetEventStatisticsRequest, Builder> {
        private String endTime; 
        private String operaUid; 
        private String startTime; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetEventStatisticsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.operaUid = request.operaUid;
            this.startTime = request.startTime;
            this.uid = request.uid;
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
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
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
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetEventStatisticsRequest build() {
            return new GetEventStatisticsRequest(this);
        } 

    } 

}
