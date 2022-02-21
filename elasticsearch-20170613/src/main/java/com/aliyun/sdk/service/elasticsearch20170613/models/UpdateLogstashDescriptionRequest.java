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

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private UpdateLogstashDescriptionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateLogstashDescriptionRequest, Builder> {
        private String instanceId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogstashDescriptionRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
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

        @Override
        public UpdateLogstashDescriptionRequest build() {
            return new UpdateLogstashDescriptionRequest(this);
        } 

    } 

}
