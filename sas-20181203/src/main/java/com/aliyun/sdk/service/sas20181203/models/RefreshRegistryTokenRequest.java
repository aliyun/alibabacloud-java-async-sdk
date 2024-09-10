// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshRegistryTokenRequest} extends {@link RequestModel}
 *
 * <p>RefreshRegistryTokenRequest</p>
 */
public class RefreshRegistryTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registryId;

    private RefreshRegistryTokenRequest(Builder builder) {
        super(builder);
        this.registryId = builder.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshRegistryTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryId
     */
    public Long getRegistryId() {
        return this.registryId;
    }

    public static final class Builder extends Request.Builder<RefreshRegistryTokenRequest, Builder> {
        private Long registryId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshRegistryTokenRequest request) {
            super(request);
            this.registryId = request.registryId;
        } 

        /**
         * RegistryId.
         */
        public Builder registryId(Long registryId) {
            this.putQueryParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        @Override
        public RefreshRegistryTokenRequest build() {
            return new RefreshRegistryTokenRequest(this);
        } 

    } 

}
