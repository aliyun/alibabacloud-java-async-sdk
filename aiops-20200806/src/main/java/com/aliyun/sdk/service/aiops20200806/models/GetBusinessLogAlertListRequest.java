// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessLogAlertListRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessLogAlertListRequest</p>
 */
public class GetBusinessLogAlertListRequest extends Request {
    @Query
    @NameInMap("EventId")
    private Long eventId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetBusinessLogAlertListRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessLogAlertListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetBusinessLogAlertListRequest, Builder> {
        private Long eventId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessLogAlertListRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.operaUid = request.operaUid;
        } 

        /**
         * EventId.
         */
        public Builder eventId(Long eventId) {
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
        public GetBusinessLogAlertListRequest build() {
            return new GetBusinessLogAlertListRequest(this);
        } 

    } 

}
