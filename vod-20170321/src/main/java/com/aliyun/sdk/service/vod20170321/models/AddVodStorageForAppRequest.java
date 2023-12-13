// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodStorageForAppRequest} extends {@link RequestModel}
 *
 * <p>AddVodStorageForAppRequest</p>
 */
public class AddVodStorageForAppRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("StorageLocation")
    private String storageLocation;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    private AddVodStorageForAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.storageLocation = builder.storageLocation;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodStorageForAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<AddVodStorageForAppRequest, Builder> {
        private String appId; 
        private String storageLocation; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(AddVodStorageForAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.storageLocation = request.storageLocation;
            this.storageType = request.storageType;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * StorageLocation.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public AddVodStorageForAppRequest build() {
            return new AddVodStorageForAppRequest(this);
        } 

    } 

}
