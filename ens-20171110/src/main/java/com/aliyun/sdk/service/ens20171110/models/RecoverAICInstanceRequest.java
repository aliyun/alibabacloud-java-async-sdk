// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverAICInstanceRequest} extends {@link RequestModel}
 *
 * <p>RecoverAICInstanceRequest</p>
 */
public class RecoverAICInstanceRequest extends Request {
    @Query
    @NameInMap("ServerId")
    @Validation(required = true)
    private String serverId;

    private RecoverAICInstanceRequest(Builder builder) {
        super(builder);
        this.serverId = builder.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverAICInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<RecoverAICInstanceRequest, Builder> {
        private String serverId; 

        private Builder() {
            super();
        } 

        private Builder(RecoverAICInstanceRequest request) {
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
        public RecoverAICInstanceRequest build() {
            return new RecoverAICInstanceRequest(this);
        } 

    } 

}
