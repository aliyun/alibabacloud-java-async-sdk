// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodStorageForAppResponseBody} extends {@link TeaModel}
 *
 * <p>AddVodStorageForAppResponseBody</p>
 */
public class AddVodStorageForAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    private AddVodStorageForAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageLocation = builder.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodStorageForAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public static final class Builder {
        private String requestId; 
        private String storageLocation; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The address of the VOD bucket.
         */
        public Builder storageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }

        public AddVodStorageForAppResponseBody build() {
            return new AddVodStorageForAppResponseBody(this);
        } 

    } 

}
