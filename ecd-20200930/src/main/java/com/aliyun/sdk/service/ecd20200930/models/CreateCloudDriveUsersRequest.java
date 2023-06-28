// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudDriveUsersRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudDriveUsersRequest</p>
 */
public class CreateCloudDriveUsersRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private java.util.List < String > endUserId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UserMaxSize")
    @Validation(required = true, minimum = 1)
    private Long userMaxSize;

    private CreateCloudDriveUsersRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.userMaxSize = builder.userMaxSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudDriveUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return endUserId
     */
    public java.util.List < String > getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userMaxSize
     */
    public Long getUserMaxSize() {
        return this.userMaxSize;
    }

    public static final class Builder extends Request.Builder<CreateCloudDriveUsersRequest, Builder> {
        private String cdsId; 
        private java.util.List < String > endUserId; 
        private String regionId; 
        private Long userMaxSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudDriveUsersRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.userMaxSize = request.userMaxSize;
        } 

        /**
         * The ID of the cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The IDs of the end users.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The maximum storage space of an end user. Unit: bytes.
         */
        public Builder userMaxSize(Long userMaxSize) {
            this.putQueryParameter("UserMaxSize", userMaxSize);
            this.userMaxSize = userMaxSize;
            return this;
        }

        @Override
        public CreateCloudDriveUsersRequest build() {
            return new CreateCloudDriveUsersRequest(this);
        } 

    } 

}
