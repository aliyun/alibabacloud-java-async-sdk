// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootARMServerInstanceRequest} extends {@link RequestModel}
 *
 * <p>RebootARMServerInstanceRequest</p>
 */
public class RebootARMServerInstanceRequest extends Request {
    @Query
    @NameInMap("ServerId")
    private String serverId;

    @Query
    @NameInMap("ServerIds")
    private java.util.List < String > serverIds;

    private RebootARMServerInstanceRequest(Builder builder) {
        super(builder);
        this.serverId = builder.serverId;
        this.serverIds = builder.serverIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootARMServerInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serverId
     */
    public String getServerId() {
        return this.serverId;
    }

    /**
     * @return serverIds
     */
    public java.util.List < String > getServerIds() {
        return this.serverIds;
    }

    public static final class Builder extends Request.Builder<RebootARMServerInstanceRequest, Builder> {
        private String serverId; 
        private java.util.List < String > serverIds; 

        private Builder() {
            super();
        } 

        private Builder(RebootARMServerInstanceRequest request) {
            super(request);
            this.serverId = request.serverId;
            this.serverIds = request.serverIds;
        } 

        /**
         * ServerId.
         */
        public Builder serverId(String serverId) {
            this.putQueryParameter("ServerId", serverId);
            this.serverId = serverId;
            return this;
        }

        /**
         * ServerIds.
         */
        public Builder serverIds(java.util.List < String > serverIds) {
            String serverIdsShrink = shrink(serverIds, "ServerIds", "json");
            this.putQueryParameter("ServerIds", serverIdsShrink);
            this.serverIds = serverIds;
            return this;
        }

        @Override
        public RebootARMServerInstanceRequest build() {
            return new RebootARMServerInstanceRequest(this);
        } 

    } 

}
