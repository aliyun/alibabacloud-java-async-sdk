// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link OpenTrialPackageRequest} extends {@link RequestModel}
 *
 * <p>OpenTrialPackageRequest</p>
 */
public class OpenTrialPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCloseSwitch")
    private Integer autoCloseSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private OpenTrialPackageRequest(Builder builder) {
        super(builder);
        this.autoCloseSwitch = builder.autoCloseSwitch;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenTrialPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoCloseSwitch
     */
    public Integer getAutoCloseSwitch() {
        return this.autoCloseSwitch;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<OpenTrialPackageRequest, Builder> {
        private Integer autoCloseSwitch; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(OpenTrialPackageRequest request) {
            super(request);
            this.autoCloseSwitch = request.autoCloseSwitch;
            this.regionId = request.regionId;
        } 

        /**
         * AutoCloseSwitch.
         */
        public Builder autoCloseSwitch(Integer autoCloseSwitch) {
            this.putQueryParameter("AutoCloseSwitch", autoCloseSwitch);
            this.autoCloseSwitch = autoCloseSwitch;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public OpenTrialPackageRequest build() {
            return new OpenTrialPackageRequest(this);
        } 

    } 

}
