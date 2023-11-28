// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDictRequest} extends {@link RequestModel}
 *
 * <p>UpdateDictRequest</p>
 */
public class UpdateDictRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private UpdateDictRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDictRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDictRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDictRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
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
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
        public UpdateDictRequest build() {
            return new UpdateDictRequest(this);
        } 

    } 

}
