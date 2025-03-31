// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCustomAuthPermissionRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomAuthPermissionRequest</p>
 */
public class UpdateCustomAuthPermissionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Effect")
    @com.aliyun.core.annotation.Validation(required = true)
    private String effect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Identity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PermitAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permitAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to allow or deny access.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        public Builder effect(String effect) {
            this.putBodyParameter("Effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * <p>Username or Client ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder identity(String identity) {
            this.putBodyParameter("Identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * <p>The identity type. Valid values:</p>
         * <ul>
         * <li>USER</li>
         * <li>CLIENT</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder identityType(String identityType) {
            this.putBodyParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * <p>ID of the Cloud Message Queue MQTT version instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-0pp12gl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The permissions that you want to grant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUB_SUB</p>
         */
        public Builder permitAction(String permitAction) {
            this.putBodyParameter("PermitAction", permitAction);
            this.permitAction = permitAction;
            return this;
        }

        /**
         * <p>Authorized Topic, supporting multi-level MQTT topics and wildcards.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test/t1</p>
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
