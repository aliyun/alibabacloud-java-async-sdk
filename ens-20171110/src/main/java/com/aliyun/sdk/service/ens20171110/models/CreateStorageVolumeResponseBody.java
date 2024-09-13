// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageVolumeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStorageVolumeResponseBody</p>
 */
public class CreateStorageVolumeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VolumeId")
    private java.util.List < String > volumeId;

    private CreateStorageVolumeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.volumeId = builder.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageVolumeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return volumeId
     */
    public java.util.List < String > getVolumeId() {
        return this.volumeId;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > volumeId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array of volume IDs.
         */
        public Builder volumeId(java.util.List < String > volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public CreateStorageVolumeResponseBody build() {
            return new CreateStorageVolumeResponseBody(this);
        } 

    } 

}
