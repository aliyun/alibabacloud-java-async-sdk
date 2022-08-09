// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootAICInstanceRequest} extends {@link RequestModel}
 *
 * <p>RebootAICInstanceRequest</p>
 */
public class RebootAICInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ServerId")
    private String serverId;

    private RebootAICInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.serverId = builder.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootAICInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<RebootAICInstanceRequest, Builder> {
        private String instanceId; 
        private String serverId; 

        private Builder() {
            super();
        } 

        private Builder(RebootAICInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.serverId = request.serverId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ServerId.
         */
        public Builder serverId(String serverId) {
            this.putQueryParameter("ServerId", serverId);
            this.serverId = serverId;
            return this;
        }

        @Override
        public RebootAICInstanceRequest build() {
            return new RebootAICInstanceRequest(this);
        } 

    } 

}
