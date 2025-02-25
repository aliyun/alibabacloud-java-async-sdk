// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadCSGClientLogRequest} extends {@link RequestModel}
 *
 * <p>UploadCSGClientLogRequest</p>
 */
public class UploadCSGClientLogRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("ClientRegionId")
    @Validation(required = true)
    private String clientRegionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private UploadCSGClientLogRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientRegionId = builder.clientRegionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadCSGClientLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientRegionId
     */
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<UploadCSGClientLogRequest, Builder> {
        private String clientId; 
        private String clientRegionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(UploadCSGClientLogRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientRegionId = request.clientRegionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientRegionId.
         */
        public Builder clientRegionId(String clientRegionId) {
            this.putQueryParameter("ClientRegionId", clientRegionId);
            this.clientRegionId = clientRegionId;
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
        public UploadCSGClientLogRequest build() {
            return new UploadCSGClientLogRequest(this);
        } 

    } 

}
