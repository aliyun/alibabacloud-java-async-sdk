// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAICInstanceRequest} extends {@link RequestModel}
 *
 * <p>ResetAICInstanceRequest</p>
 */
public class ResetAICInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerId")
    private String serverId;

    private ResetAICInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.serverId = builder.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAICInstanceRequest create() {
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
     * @return serverId
     */
    public String getServerId() {
        return this.serverId;
    }

    public static final class Builder extends Request.Builder<ResetAICInstanceRequest, Builder> {
        private String instanceId; 
        private String serverId; 

        private Builder() {
            super();
        } 

        private Builder(ResetAICInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.serverId = request.serverId;
        } 

        /**
         * The ID of the AIC instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the server.
         */
        public Builder serverId(String serverId) {
            this.putQueryParameter("ServerId", serverId);
            this.serverId = serverId;
            return this;
        }

        @Override
        public ResetAICInstanceRequest build() {
            return new ResetAICInstanceRequest(this);
        } 

    } 

}
