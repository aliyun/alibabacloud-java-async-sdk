// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelinesRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelinesRequest</p>
 */
public class CreatePipelinesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("trigger")
    private Boolean trigger;

    private CreatePipelinesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelinesRequest create() {
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
     * @return trigger
     */
    public Boolean getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<CreatePipelinesRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private Boolean trigger; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelinesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.trigger = response.trigger;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * trigger.
         */
        public Builder trigger(Boolean trigger) {
            this.putQueryParameter("trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        @Override
        public CreatePipelinesRequest build() {
            return new CreatePipelinesRequest(this);
        } 

    } 

}
