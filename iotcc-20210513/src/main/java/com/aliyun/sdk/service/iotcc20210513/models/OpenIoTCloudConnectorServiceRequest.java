// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenIoTCloudConnectorServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenIoTCloudConnectorServiceRequest</p>
 */
public class OpenIoTCloudConnectorServiceRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private OpenIoTCloudConnectorServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenIoTCloudConnectorServiceRequest create() {
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

    public static final class Builder extends Request.Builder<OpenIoTCloudConnectorServiceRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(OpenIoTCloudConnectorServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public OpenIoTCloudConnectorServiceRequest build() {
            return new OpenIoTCloudConnectorServiceRequest(this);
        } 

    } 

}
