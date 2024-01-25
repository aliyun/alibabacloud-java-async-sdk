// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlertTrentRequest} extends {@link RequestModel}
 *
 * <p>GetAlertTrentRequest</p>
 */
public class GetAlertTrentRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private String aliUid;

    @Query
    @NameInMap("EventId")
    @Validation(required = true)
    private String eventId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetAlertTrentRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.eventId = builder.eventId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertTrentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
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

    public static final class Builder extends Request.Builder<GetAlertTrentRequest, Builder> {
        private String aliUid; 
        private String eventId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertTrentRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.eventId = request.eventId;
            this.operaUid = request.operaUid;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
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

        @Override
        public GetAlertTrentRequest build() {
            return new GetAlertTrentRequest(this);
        } 

    } 

}
