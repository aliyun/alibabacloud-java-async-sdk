// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKmsIdRequest} extends {@link RequestModel}
 *
 * <p>UpdateKmsIdRequest</p>
 */
public class UpdateKmsIdRequest extends Request {
    @Query
    @NameInMap("KmsId")
    @Validation(required = true)
    private String kmsId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateKmsIdRequest(Builder builder) {
        super(builder);
        this.kmsId = builder.kmsId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKmsIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsId
     */
    public String getKmsId() {
        return this.kmsId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateKmsIdRequest, Builder> {
        private String kmsId; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKmsIdRequest response) {
            super(response);
            this.kmsId = response.kmsId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * KmsId.
         */
        public Builder kmsId(String kmsId) {
            this.putQueryParameter("KmsId", kmsId);
            this.kmsId = kmsId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
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
        public UpdateKmsIdRequest build() {
            return new UpdateKmsIdRequest(this);
        } 

    } 

}
