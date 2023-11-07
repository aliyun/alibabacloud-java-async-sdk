// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGlobalEventsStorageRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetGlobalEventsStorageRegionResponseBody</p>
 */
public class GetGlobalEventsStorageRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageRegion")
    private String storageRegion;

    private GetGlobalEventsStorageRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageRegion = builder.storageRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalEventsStorageRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public static final class Builder {
        private String requestId; 
        private String storageRegion; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The region where global events are stored.
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
            this.storageRegion = storageRegion;
            return this;
        }

        public GetGlobalEventsStorageRegionResponseBody build() {
            return new GetGlobalEventsStorageRegionResponseBody(this);
        } 

    } 

}
