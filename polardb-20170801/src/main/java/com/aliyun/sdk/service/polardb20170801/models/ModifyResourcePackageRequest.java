// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyResourcePackageRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourcePackageRequest</p>
 */
public class ModifyResourcePackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoQuota")
    private Boolean autoQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcePackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourcePackageId;

    private ModifyResourcePackageRequest(Builder builder) {
        super(builder);
        this.autoQuota = builder.autoQuota;
        this.resourcePackageId = builder.resourcePackageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourcePackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoQuota
     */
    public Boolean getAutoQuota() {
        return this.autoQuota;
    }

    /**
     * @return resourcePackageId
     */
    public String getResourcePackageId() {
        return this.resourcePackageId;
    }

    public static final class Builder extends Request.Builder<ModifyResourcePackageRequest, Builder> {
        private Boolean autoQuota; 
        private String resourcePackageId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourcePackageRequest request) {
            super(request);
            this.autoQuota = request.autoQuota;
            this.resourcePackageId = request.resourcePackageId;
        } 

        /**
         * AutoQuota.
         */
        public Builder autoQuota(Boolean autoQuota) {
            this.putQueryParameter("AutoQuota", autoQuota);
            this.autoQuota = autoQuota;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-bp11b0i9389******</p>
         */
        public Builder resourcePackageId(String resourcePackageId) {
            this.putQueryParameter("ResourcePackageId", resourcePackageId);
            this.resourcePackageId = resourcePackageId;
            return this;
        }

        @Override
        public ModifyResourcePackageRequest build() {
            return new ModifyResourcePackageRequest(this);
        } 

    } 

}
