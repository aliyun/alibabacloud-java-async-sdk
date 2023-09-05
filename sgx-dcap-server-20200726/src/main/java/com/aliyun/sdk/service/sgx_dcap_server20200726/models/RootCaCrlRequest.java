// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RootCaCrlRequest} extends {@link RequestModel}
 *
 * <p>RootCaCrlRequest</p>
 */
public class RootCaCrlRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private RootCaCrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RootCaCrlRequest create() {
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

    public static final class Builder extends Request.Builder<RootCaCrlRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RootCaCrlRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RootCaCrlRequest build() {
            return new RootCaCrlRequest(this);
        } 

    } 

}
