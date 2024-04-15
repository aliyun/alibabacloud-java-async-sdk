// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskEncryptionServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskEncryptionServiceRequest</p>
 */
public class CreateDiskEncryptionServiceRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateDiskEncryptionServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskEncryptionServiceRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDiskEncryptionServiceRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskEncryptionServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDiskEncryptionServiceRequest build() {
            return new CreateDiskEncryptionServiceRequest(this);
        } 

    } 

}
