// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClientStartRequest} extends {@link RequestModel}
 *
 * <p>ClientStartRequest</p>
 */
public class ClientStartRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private ClientStartRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientStartRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ClientStartRequest, Builder> {
        private String appId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ClientStartRequest request) {
            super(request);
            this.appId = request.appId;
            this.tenantId = request.tenantId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ClientStartRequest build() {
            return new ClientStartRequest(this);
        } 

    } 

}
