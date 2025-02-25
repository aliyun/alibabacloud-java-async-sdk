// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessMetricAlertTopNRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessMetricAlertTopNRequest</p>
 */
public class GetBusinessMetricAlertTopNRequest extends Request {
    @Query
    @NameInMap("AlertType")
    private String alertType;

    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("TopNum")
    private Long topNum;

    private GetBusinessMetricAlertTopNRequest(Builder builder) {
        super(builder);
        this.alertType = builder.alertType;
        this.eventId = builder.eventId;
        this.operaUid = builder.operaUid;
        this.topNum = builder.topNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessMetricAlertTopNRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return topNum
     */
    public Long getTopNum() {
        return this.topNum;
    }

    public static final class Builder extends Request.Builder<GetBusinessMetricAlertTopNRequest, Builder> {
        private String alertType; 
        private String eventId; 
        private String operaUid; 
        private Long topNum; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessMetricAlertTopNRequest request) {
            super(request);
            this.alertType = request.alertType;
            this.eventId = request.eventId;
            this.operaUid = request.operaUid;
            this.topNum = request.topNum;
        } 

        /**
         * AlertType.
         */
        public Builder alertType(String alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
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
         * TopNum.
         */
        public Builder topNum(Long topNum) {
            this.putQueryParameter("TopNum", topNum);
            this.topNum = topNum;
            return this;
        }

        @Override
        public GetBusinessMetricAlertTopNRequest build() {
            return new GetBusinessMetricAlertTopNRequest(this);
        } 

    } 

}
