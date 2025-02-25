// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlertDetailTrendDataRequest} extends {@link RequestModel}
 *
 * <p>GetAlertDetailTrendDataRequest</p>
 */
public class GetAlertDetailTrendDataRequest extends Request {
    @Query
    @NameInMap("AbnormalId")
    private Long abnormalId;

    @Query
    @NameInMap("AlertId")
    private Long alertId;

    @Query
    @NameInMap("BeginTime")
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetAlertDetailTrendDataRequest(Builder builder) {
        super(builder);
        this.abnormalId = builder.abnormalId;
        this.alertId = builder.alertId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertDetailTrendDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalId
     */
    public Long getAbnormalId() {
        return this.abnormalId;
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetAlertDetailTrendDataRequest, Builder> {
        private Long abnormalId; 
        private Long alertId; 
        private Long beginTime; 
        private Long endTime; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertDetailTrendDataRequest request) {
            super(request);
            this.abnormalId = request.abnormalId;
            this.alertId = request.alertId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.operaUid = request.operaUid;
        } 

        /**
         * AbnormalId.
         */
        public Builder abnormalId(Long abnormalId) {
            this.putQueryParameter("AbnormalId", abnormalId);
            this.abnormalId = abnormalId;
            return this;
        }

        /**
         * AlertId.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
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

        @Override
        public GetAlertDetailTrendDataRequest build() {
            return new GetAlertDetailTrendDataRequest(this);
        } 

    } 

}
