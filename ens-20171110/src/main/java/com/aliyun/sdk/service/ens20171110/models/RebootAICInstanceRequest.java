// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootAICInstanceRequest} extends {@link RequestModel}
 *
 * <p>RebootAICInstanceRequest</p>
 */
public class RebootAICInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerId")
    private String serverId;

    private RebootAICInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return serverId
     */
    public String getServerId() {
        return this.serverId;
    }

    public static final class Builder extends Request.Builder<RebootAICInstanceRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > instanceIds; 
        private String serverId; 

        private Builder() {
            super();
        } 

        private Builder(RebootAICInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
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
         * The IDs of the AIC instance groups.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
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
        public RebootAICInstanceRequest build() {
            return new RebootAICInstanceRequest(this);
        } 

    } 

}
