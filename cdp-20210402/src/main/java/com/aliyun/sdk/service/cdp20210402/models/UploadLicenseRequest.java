// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadLicenseRequest} extends {@link RequestModel}
 *
 * <p>UploadLicenseRequest</p>
 */
public class UploadLicenseRequest extends Request {
    @Path
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UploadLicenseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UploadLicenseRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UploadLicenseRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putPathParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UploadLicenseRequest build() {
            return new UploadLicenseRequest(this);
        } 

    } 

}
