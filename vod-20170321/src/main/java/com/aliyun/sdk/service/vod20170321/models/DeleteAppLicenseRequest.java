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
 * {@link DeleteAppLicenseRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppLicenseRequest</p>
 */
public class DeleteAppLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    private String appItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseItemIds")
    private String licenseItemIds;

    private DeleteAppLicenseRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.licenseItemIds = builder.licenseItemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppLicenseRequest create() {
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
     * @return licenseItemIds
     */
    public String getLicenseItemIds() {
        return this.licenseItemIds;
    }

    public static final class Builder extends Request.Builder<DeleteAppLicenseRequest, Builder> {
        private String appItemId; 
        private String licenseItemIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppLicenseRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.licenseItemIds = request.licenseItemIds;
        } 

        /**
         * AppItemId.
         */
        public Builder appItemId(String appItemId) {
            this.putQueryParameter("AppItemId", appItemId);
            this.appItemId = appItemId;
            return this;
        }

        /**
         * LicenseItemIds.
         */
        public Builder licenseItemIds(String licenseItemIds) {
            this.putQueryParameter("LicenseItemIds", licenseItemIds);
            this.licenseItemIds = licenseItemIds;
            return this;
        }

        @Override
        public DeleteAppLicenseRequest build() {
            return new DeleteAppLicenseRequest(this);
        } 

    } 

}
