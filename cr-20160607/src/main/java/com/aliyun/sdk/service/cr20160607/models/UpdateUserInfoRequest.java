// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserInfoRequest</p>
 */
public class UpdateUserInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateUserInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserInfoRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateUserInfoRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserInfoRequest response) {
            super(response);
            this.regionId = response.regionId;
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
        public UpdateUserInfoRequest build() {
            return new UpdateUserInfoRequest(this);
        } 

    } 

}
