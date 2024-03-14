// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerGatewayRemoteSyncRequest} extends {@link RequestModel}
 *
 * <p>TriggerGatewayRemoteSyncRequest</p>
 */
public class TriggerGatewayRemoteSyncRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    @Validation(required = true)
    private String indexId;

    @Query
    @NameInMap("Path")
    private String path;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private TriggerGatewayRemoteSyncRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.path = builder.path;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerGatewayRemoteSyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<TriggerGatewayRemoteSyncRequest, Builder> {
        private String gatewayId; 
        private String indexId; 
        private String path; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(TriggerGatewayRemoteSyncRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.path = request.path;
            this.securityToken = request.securityToken;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public TriggerGatewayRemoteSyncRequest build() {
            return new TriggerGatewayRemoteSyncRequest(this);
        } 

    } 

}
