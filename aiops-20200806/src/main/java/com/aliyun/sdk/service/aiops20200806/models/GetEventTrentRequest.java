// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventTrentRequest} extends {@link RequestModel}
 *
 * <p>GetEventTrentRequest</p>
 */
public class GetEventTrentRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("GranularityType")
    private String granularityType;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TimeType")
    private String timeType;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private GetEventTrentRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.granularityType = builder.granularityType;
        this.operaUid = builder.operaUid;
        this.startTime = builder.startTime;
        this.timeType = builder.timeType;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventTrentRequest create() {
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
     * @return granularityType
     */
    public String getGranularityType() {
        return this.granularityType;
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
     * @return timeType
     */
    public String getTimeType() {
        return this.timeType;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetEventTrentRequest, Builder> {
        private String endTime; 
        private String granularityType; 
        private String operaUid; 
        private String startTime; 
        private String timeType; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetEventTrentRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.granularityType = request.granularityType;
            this.operaUid = request.operaUid;
            this.startTime = request.startTime;
            this.timeType = request.timeType;
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
         * GranularityType.
         */
        public Builder granularityType(String granularityType) {
            this.putQueryParameter("GranularityType", granularityType);
            this.granularityType = granularityType;
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
         * TimeType.
         */
        public Builder timeType(String timeType) {
            this.putQueryParameter("TimeType", timeType);
            this.timeType = timeType;
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
        public GetEventTrentRequest build() {
            return new GetEventTrentRequest(this);
        } 

    } 

}
