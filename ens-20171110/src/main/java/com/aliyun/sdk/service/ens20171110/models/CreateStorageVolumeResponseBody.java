// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateStorageVolumeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStorageVolumeResponseBody</p>
 */
public class CreateStorageVolumeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VolumeId")
    private java.util.List<String> volumeId;

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
    public java.util.List<String> getVolumeId() {
        return this.volumeId;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> volumeId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7030AB96-57CF-1C68-9FEE-D60E547FD79C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of volume IDs.</p>
         */
        public Builder volumeId(java.util.List<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public CreateStorageVolumeResponseBody build() {
            return new CreateStorageVolumeResponseBody(this);
        } 

    } 

}
