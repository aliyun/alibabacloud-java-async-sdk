// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGlobalEventsStorageRegionRequest} extends {@link RequestModel}
 *
 * <p>UpdateGlobalEventsStorageRegionRequest</p>
 */
public class UpdateGlobalEventsStorageRegionRequest extends Request {
    @Query
    @NameInMap("StorageRegion")
    @Validation(required = true)
    private String storageRegion;

    private UpdateGlobalEventsStorageRegionRequest(Builder builder) {
        super(builder);
        this.storageRegion = builder.storageRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGlobalEventsStorageRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public static final class Builder extends Request.Builder<UpdateGlobalEventsStorageRegionRequest, Builder> {
        private String storageRegion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGlobalEventsStorageRegionRequest request) {
            super(request);
            this.storageRegion = request.storageRegion;
        } 

        /**
         * The region where you want to store global events.
         * <p>
         * 
         * Valid values:
         * 
         * *   ap-southeast-1
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     the Singapore region
         * 
         *     <!-- -->
         * 
         * *   cn-hangzhou
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     the China (Hangzhou) region
         * 
         *     <!-- -->
         */
        public Builder storageRegion(String storageRegion) {
            this.putQueryParameter("StorageRegion", storageRegion);
            this.storageRegion = storageRegion;
            return this;
        }

        @Override
        public UpdateGlobalEventsStorageRegionRequest build() {
            return new UpdateGlobalEventsStorageRegionRequest(this);
        } 

    } 

}
