// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReleaseRequest} extends {@link RequestModel}
 *
 * <p>CreateReleaseRequest</p>
 */
public class CreateReleaseRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateReleaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReleaseRequest create() {
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

    public static final class Builder extends Request.Builder<CreateReleaseRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReleaseRequest response) {
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
        public CreateReleaseRequest build() {
            return new CreateReleaseRequest(this);
        } 

    } 

}
