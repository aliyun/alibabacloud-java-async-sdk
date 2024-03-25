// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomAuthPermissionRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomAuthPermissionRequest</p>
 */
public class DeleteCustomAuthPermissionRequest extends Request {
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
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private DeleteCustomAuthPermissionRequest(Builder builder) {
        super(builder);
        this.identity = builder.identity;
        this.identityType = builder.identityType;
        this.instanceId = builder.instanceId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomAuthPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<DeleteCustomAuthPermissionRequest, Builder> {
        private String identity; 
        private String identityType; 
        private String instanceId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomAuthPermissionRequest request) {
            super(request);
            this.identity = request.identity;
            this.identityType = request.identityType;
            this.instanceId = request.instanceId;
            this.topic = request.topic;
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
         * Topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public DeleteCustomAuthPermissionRequest build() {
            return new DeleteCustomAuthPermissionRequest(this);
        } 

    } 

}
