// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUserAuthRequest} extends {@link RequestModel}
 *
 * <p>CheckUserAuthRequest</p>
 */
public class CheckUserAuthRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CheckUserAuthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserAuthRequest create() {
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

    public static final class Builder extends Request.Builder<CheckUserAuthRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckUserAuthRequest request) {
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
        public CheckUserAuthRequest build() {
            return new CheckUserAuthRequest(this);
        } 

    } 

}
