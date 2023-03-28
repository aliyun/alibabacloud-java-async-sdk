// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseAICInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseAICInstanceRequest</p>
 */
public class ReleaseAICInstanceRequest extends Request {
    @Query
    @NameInMap("ServerId")
    @Validation(required = true)
    private String serverId;

    private ReleaseAICInstanceRequest(Builder builder) {
        super(builder);
        this.serverId = builder.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseAICInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseAICInstanceRequest, Builder> {
        private String serverId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseAICInstanceRequest request) {
            super(request);
            this.serverId = request.serverId;
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
        public ReleaseAICInstanceRequest build() {
            return new ReleaseAICInstanceRequest(this);
        } 

    } 

}
