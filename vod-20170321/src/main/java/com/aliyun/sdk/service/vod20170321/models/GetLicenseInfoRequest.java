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
 * {@link GetLicenseInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLicenseInfoRequest</p>
 */
public class GetLicenseInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseId;

    private GetLicenseInfoRequest(Builder builder) {
        super(builder);
        this.licenseId = builder.licenseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLicenseInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseId
     */
    public String getLicenseId() {
        return this.licenseId;
    }

    public static final class Builder extends Request.Builder<GetLicenseInfoRequest, Builder> {
        private String licenseId; 

        private Builder() {
            super();
        } 

        private Builder(GetLicenseInfoRequest request) {
            super(request);
            this.licenseId = request.licenseId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder licenseId(String licenseId) {
            this.putQueryParameter("LicenseId", licenseId);
            this.licenseId = licenseId;
            return this;
        }

        @Override
        public GetLicenseInfoRequest build() {
            return new GetLicenseInfoRequest(this);
        } 

    } 

}
