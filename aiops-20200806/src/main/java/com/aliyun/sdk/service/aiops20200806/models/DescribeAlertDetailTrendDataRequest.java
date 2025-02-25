// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertDetailTrendDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertDetailTrendDataRequest</p>
 */
public class DescribeAlertDetailTrendDataRequest extends Request {
    @Query
    @NameInMap("AlertId")
    @Validation(required = true)
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

    private DescribeAlertDetailTrendDataRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertDetailTrendDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeAlertDetailTrendDataRequest, Builder> {
        private Long alertId; 
        private Long beginTime; 
        private Long endTime; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertDetailTrendDataRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.operaUid = request.operaUid;
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
        public DescribeAlertDetailTrendDataRequest build() {
            return new DescribeAlertDetailTrendDataRequest(this);
        } 

    } 

}
