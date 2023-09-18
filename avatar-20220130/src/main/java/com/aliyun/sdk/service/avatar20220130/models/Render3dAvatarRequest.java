// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Render3dAvatarRequest} extends {@link RequestModel}
 *
 * <p>Render3dAvatarRequest</p>
 */
public class Render3dAvatarRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private Render3dAvatarRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.code = builder.code;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Render3dAvatarRequest create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<Render3dAvatarRequest, Builder> {
        private String appId; 
        private String code; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(Render3dAvatarRequest request) {
            super(request);
            this.appId = request.appId;
            this.code = request.code;
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
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
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
        public Render3dAvatarRequest build() {
            return new Render3dAvatarRequest(this);
        } 

    } 

}
