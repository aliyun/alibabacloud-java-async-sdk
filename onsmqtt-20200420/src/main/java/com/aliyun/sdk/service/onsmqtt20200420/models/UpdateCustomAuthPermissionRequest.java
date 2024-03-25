// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomAuthPermissionRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomAuthPermissionRequest</p>
 */
public class UpdateCustomAuthPermissionRequest extends Request {
    @Body
    @NameInMap("Effect")
    @Validation(required = true)
    private String effect;

    @Body
    @NameInMap("Identity")
    @Validation(required = true)
    private String identity;

    @Body
    @NameInMap("IdentityType")
    @Validation(required = true)
    private String identityType;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PermitAction")
    @Validation(required = true)
    private String permitAction;

    @Body
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private UpdateCustomAuthPermissionRequest(Builder builder) {
        super(builder);
        this.effect = builder.effect;
        this.identity = builder.identity;
        this.identityType = builder.identityType;
        this.instanceId = builder.instanceId;
        this.permitAction = builder.permitAction;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomAuthPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return permitAction
     */
    public String getPermitAction() {
        return this.permitAction;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<UpdateCustomAuthPermissionRequest, Builder> {
        private String effect; 
        private String identity; 
        private String identityType; 
        private String instanceId; 
        private String permitAction; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomAuthPermissionRequest request) {
            super(request);
            this.effect = request.effect;
            this.identity = request.identity;
            this.identityType = request.identityType;
            this.instanceId = request.instanceId;
            this.permitAction = request.permitAction;
            this.topic = request.topic;
        } 

        /**
         * Effect.
         */
        public Builder effect(String effect) {
            this.putBodyParameter("Effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * Identity.
         */
        public Builder identity(String identity) {
            this.putBodyParameter("Identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * IdentityType.
         */
        public Builder identityType(String identityType) {
            this.putBodyParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PermitAction.
         */
        public Builder permitAction(String permitAction) {
            this.putBodyParameter("PermitAction", permitAction);
            this.permitAction = permitAction;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public UpdateCustomAuthPermissionRequest build() {
            return new UpdateCustomAuthPermissionRequest(this);
        } 

    } 

}
