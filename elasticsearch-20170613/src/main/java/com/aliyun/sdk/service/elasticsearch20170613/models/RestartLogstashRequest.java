// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartLogstashRequest} extends {@link RequestModel}
 *
 * <p>RestartLogstashRequest</p>
 */
public class RestartLogstashRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("force")
    private Boolean force;

    private RestartLogstashRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartLogstashRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<RestartLogstashRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(RestartLogstashRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.force = response.force;
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
         * force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public RestartLogstashRequest build() {
            return new RestartLogstashRequest(this);
        } 

    } 

}
