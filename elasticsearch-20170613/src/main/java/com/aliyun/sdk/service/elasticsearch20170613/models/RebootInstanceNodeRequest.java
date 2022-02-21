// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstanceNodeRequest} extends {@link RequestModel}
 *
 * <p>RebootInstanceNodeRequest</p>
 */
public class RebootInstanceNodeRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("ecsId")
    @Validation(required = true)
    private String ecsId;

    @Query
    @NameInMap("eventId")
    @Validation(required = true)
    private String eventId;

    private RebootInstanceNodeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.ecsId = builder.ecsId;
        this.eventId = builder.eventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootInstanceNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ecsId
     */
    public String getEcsId() {
        return this.ecsId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    public static final class Builder extends Request.Builder<RebootInstanceNodeRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String ecsId; 
        private String eventId; 

        private Builder() {
            super();
        } 

        private Builder(RebootInstanceNodeRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.ecsId = response.ecsId;
            this.eventId = response.eventId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ecsId.
         */
        public Builder ecsId(String ecsId) {
            this.putQueryParameter("ecsId", ecsId);
            this.ecsId = ecsId;
            return this;
        }

        /**
         * eventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("eventId", eventId);
            this.eventId = eventId;
            return this;
        }

        @Override
        public RebootInstanceNodeRequest build() {
            return new RebootInstanceNodeRequest(this);
        } 

    } 

}
