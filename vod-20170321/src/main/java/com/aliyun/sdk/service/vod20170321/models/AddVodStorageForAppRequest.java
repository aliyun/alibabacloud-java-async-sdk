// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The list of application IDs. You can obtain the application ID from the AppId response parameter of the <a href="~~CreateAppInfo~~">CreateAppInfo</a> or <a href="~~ListAppInfo~~">ListAppInfo</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The address of the OSS bucket. This parameter is required when StorageType is set to user_oss_bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket.oss-cn-shanghai.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * <p>The storage type. Valid values: vod_oss_bucket and user_oss_bucket. Default value: <strong>vod_oss_bucket</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>vod_oss_bucket</p>
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
