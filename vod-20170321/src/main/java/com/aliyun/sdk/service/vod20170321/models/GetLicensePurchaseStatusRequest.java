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
 * {@link GetLicensePurchaseStatusRequest} extends {@link RequestModel}
 *
 * <p>GetLicensePurchaseStatusRequest</p>
 */
public class GetLicensePurchaseStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseItemIds")
    private String licenseItemIds;

    private GetLicensePurchaseStatusRequest(Builder builder) {
        super(builder);
        this.licenseItemIds = builder.licenseItemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLicensePurchaseStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseItemIds
     */
    public String getLicenseItemIds() {
        return this.licenseItemIds;
    }

    public static final class Builder extends Request.Builder<GetLicensePurchaseStatusRequest, Builder> {
        private String licenseItemIds; 

        private Builder() {
            super();
        } 

        private Builder(GetLicensePurchaseStatusRequest request) {
            super(request);
            this.licenseItemIds = request.licenseItemIds;
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
        public GetLicensePurchaseStatusRequest build() {
            return new GetLicensePurchaseStatusRequest(this);
        } 

    } 

}
