// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventDetailRequest} extends {@link RequestModel}
 *
 * <p>GetEventDetailRequest</p>
 */
public class GetEventDetailRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetEventDetailRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.id = builder.id;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventDetailRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetEventDetailRequest, Builder> {
        private String eventId; 
        private Long id; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetEventDetailRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.id = request.id;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public GetEventDetailRequest build() {
            return new GetEventDetailRequest(this);
        } 

    } 

}
