// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCausePlanRequest} extends {@link RequestModel}
 *
 * <p>ListCausePlanRequest</p>
 */
public class ListCausePlanRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RootCauseId")
    private String rootCauseId;

    private ListCausePlanRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
        this.rootCauseId = builder.rootCauseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCausePlanRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return rootCauseId
     */
    public String getRootCauseId() {
        return this.rootCauseId;
    }

    public static final class Builder extends Request.Builder<ListCausePlanRequest, Builder> {
        private String eventId; 
        private String instanceId; 
        private String rootCauseId; 

        private Builder() {
            super();
        } 

        private Builder(ListCausePlanRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.instanceId = request.instanceId;
            this.rootCauseId = request.rootCauseId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RootCauseId.
         */
        public Builder rootCauseId(String rootCauseId) {
            this.putQueryParameter("RootCauseId", rootCauseId);
            this.rootCauseId = rootCauseId;
            return this;
        }

        @Override
        public ListCausePlanRequest build() {
            return new ListCausePlanRequest(this);
        } 

    } 

}
