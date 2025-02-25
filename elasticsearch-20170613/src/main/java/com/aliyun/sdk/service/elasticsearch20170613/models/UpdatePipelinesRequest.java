// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePipelinesRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelinesRequest</p>
 */
public class UpdatePipelinesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trigger")
    private Boolean trigger;

    private UpdatePipelinesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelinesRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
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

    public static final class Builder extends Request.Builder<UpdatePipelinesRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String clientToken; 
        private Boolean trigger; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelinesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
            this.trigger = request.trigger;
        } 

        /**
         * <p>The ID of the Logstash cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-oew1qbgl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to deploy the pipeline immediately.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder trigger(Boolean trigger) {
            this.putQueryParameter("trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        @Override
        public UpdatePipelinesRequest build() {
            return new UpdatePipelinesRequest(this);
        } 

    } 

}
