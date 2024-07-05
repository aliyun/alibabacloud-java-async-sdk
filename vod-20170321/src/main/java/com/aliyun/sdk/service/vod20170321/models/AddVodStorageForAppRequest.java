// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodStorageForAppRequest} extends {@link RequestModel}
 *
 * <p>AddVodStorageForAppRequest</p>
 */
public class AddVodStorageForAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
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
         * The IDs of applications. You can obtain the application ID from the `AppId` parameter in the response to the [CreateAppInfo](~~CreateAppInfo~~) or [ListAppInfo](~~ListAppInfo~~) operation.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The address of an Object Storage Service (OSS) bucket. This parameter does not take effect. You can call this operation to add only VOD buckets.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * The storage class. Default value: **vod_oss_bucket**.
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
