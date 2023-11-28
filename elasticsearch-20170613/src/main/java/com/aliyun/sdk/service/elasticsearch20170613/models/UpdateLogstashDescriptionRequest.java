// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLogstashDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogstashDescriptionRequest</p>
 */
public class UpdateLogstashDescriptionRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("description")
    private String description;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private UpdateLogstashDescriptionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogstashDescriptionRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateLogstashDescriptionRequest, Builder> {
        private String instanceId; 
        private String description; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogstashDescriptionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.description = request.description;
            this.clientToken = request.clientToken;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateLogstashDescriptionRequest build() {
            return new UpdateLogstashDescriptionRequest(this);
        } 

    } 

}
