// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LicenseAuthRequest} extends {@link RequestModel}
 *
 * <p>LicenseAuthRequest</p>
 */
public class LicenseAuthRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("License")
    @Validation(required = true)
    private String license;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private LicenseAuthRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.license = builder.license;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LicenseAuthRequest create() {
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
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<LicenseAuthRequest, Builder> {
        private String appId; 
        private String license; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(LicenseAuthRequest request) {
            super(request);
            this.appId = request.appId;
            this.license = request.license;
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
         * License.
         */
        public Builder license(String license) {
            this.putQueryParameter("License", license);
            this.license = license;
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
        public LicenseAuthRequest build() {
            return new LicenseAuthRequest(this);
        } 

    } 

}
