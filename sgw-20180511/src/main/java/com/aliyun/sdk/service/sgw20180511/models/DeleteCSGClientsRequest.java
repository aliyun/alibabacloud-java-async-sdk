// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCSGClientsRequest} extends {@link RequestModel}
 *
 * <p>DeleteCSGClientsRequest</p>
 */
public class DeleteCSGClientsRequest extends Request {
    @Query
    @NameInMap("ClientIds")
    private java.util.List < String > clientIds;

    @Query
    @NameInMap("ClientRegionId")
    @Validation(required = true)
    private String clientRegionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteCSGClientsRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.clientRegionId = builder.clientRegionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCSGClientsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIds
     */
    public java.util.List < String > getClientIds() {
        return this.clientIds;
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

    public static final class Builder extends Request.Builder<DeleteCSGClientsRequest, Builder> {
        private java.util.List < String > clientIds; 
        private String clientRegionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCSGClientsRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.clientRegionId = request.clientRegionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * ClientIds.
         */
        public Builder clientIds(java.util.List < String > clientIds) {
            String clientIdsShrink = shrink(clientIds, "ClientIds", "json");
            this.putQueryParameter("ClientIds", clientIdsShrink);
            this.clientIds = clientIds;
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
        public DeleteCSGClientsRequest build() {
            return new DeleteCSGClientsRequest(this);
        } 

    } 

}
