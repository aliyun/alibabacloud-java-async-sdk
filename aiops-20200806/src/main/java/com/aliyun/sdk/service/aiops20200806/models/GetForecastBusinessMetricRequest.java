// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetForecastBusinessMetricRequest} extends {@link RequestModel}
 *
 * <p>GetForecastBusinessMetricRequest</p>
 */
public class GetForecastBusinessMetricRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetForecastBusinessMetricRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetForecastBusinessMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetForecastBusinessMetricRequest, Builder> {
        private String eventId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetForecastBusinessMetricRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.operaUid = request.operaUid;
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

        @Override
        public GetForecastBusinessMetricRequest build() {
            return new GetForecastBusinessMetricRequest(this);
        } 

    } 

}
