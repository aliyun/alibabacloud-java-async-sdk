// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ReleaseIpAddressRequest} extends {@link RequestModel}
 *
 * <p>ReleaseIpAddressRequest</p>
 */
public class ReleaseIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eipId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ReleaseIpAddressRequest(Builder builder) {
        super(builder);
        this.eipId = builder.eipId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseIpAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipId
     */
    public String getEipId() {
        return this.eipId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ReleaseIpAddressRequest, Builder> {
        private String eipId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseIpAddressRequest request) {
            super(request);
            this.eipId = request.eipId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder eipId(String eipId) {
            this.putQueryParameter("EipId", eipId);
            this.eipId = eipId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ReleaseIpAddressRequest build() {
            return new ReleaseIpAddressRequest(this);
        } 

    } 

}
