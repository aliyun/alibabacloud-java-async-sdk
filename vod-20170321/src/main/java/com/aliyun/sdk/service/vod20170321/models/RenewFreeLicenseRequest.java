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
 * {@link RenewFreeLicenseRequest} extends {@link RequestModel}
 *
 * <p>RenewFreeLicenseRequest</p>
 */
public class RenewFreeLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer validPeriod;

    private RenewFreeLicenseRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.licenseItemId = builder.licenseItemId;
        this.validPeriod = builder.validPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewFreeLicenseRequest create() {
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

    /**
     * @return validPeriod
     */
    public Integer getValidPeriod() {
        return this.validPeriod;
    }

    public static final class Builder extends Request.Builder<RenewFreeLicenseRequest, Builder> {
        private String appItemId; 
        private String licenseItemId; 
        private Integer validPeriod; 

        private Builder() {
            super();
        } 

        private Builder(RenewFreeLicenseRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.licenseItemId = request.licenseItemId;
            this.validPeriod = request.validPeriod;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder validPeriod(Integer validPeriod) {
            this.putQueryParameter("ValidPeriod", validPeriod);
            this.validPeriod = validPeriod;
            return this;
        }

        @Override
        public RenewFreeLicenseRequest build() {
            return new RenewFreeLicenseRequest(this);
        } 

    } 

}
