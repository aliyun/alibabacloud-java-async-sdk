// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DelFreeLicenseRequest} extends {@link RequestModel}
 *
 * <p>DelFreeLicenseRequest</p>
 */
public class DelFreeLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseItemId;

    private DelFreeLicenseRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.licenseItemId = builder.licenseItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelFreeLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appItemId
     */
    public String getAppItemId() {
        return this.appItemId;
    }

    /**
     * @return licenseItemId
     */
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    public static final class Builder extends Request.Builder<DelFreeLicenseRequest, Builder> {
        private String appItemId; 
        private String licenseItemId; 

        private Builder() {
            super();
        } 

        private Builder(DelFreeLicenseRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.licenseItemId = request.licenseItemId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appItemId(String appItemId) {
            this.putQueryParameter("AppItemId", appItemId);
            this.appItemId = appItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder licenseItemId(String licenseItemId) {
            this.putQueryParameter("LicenseItemId", licenseItemId);
            this.licenseItemId = licenseItemId;
            return this;
        }

        @Override
        public DelFreeLicenseRequest build() {
            return new DelFreeLicenseRequest(this);
        } 

    } 

}
