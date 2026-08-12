// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link UpdateVolumeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVolumeResponseBody</p>
 */
public class UpdateVolumeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("volume")
    private E2BVolume volume;

    private UpdateVolumeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVolumeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return volume
     */
    public E2BVolume getVolume() {
        return this.volume;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private E2BVolume volume; 

        private Builder() {
        } 

        private Builder(UpdateVolumeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.volume = model.volume;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * volume.
         */
        public Builder volume(E2BVolume volume) {
            this.volume = volume;
            return this;
        }

        public UpdateVolumeResponseBody build() {
            return new UpdateVolumeResponseBody(this);
        } 

    } 

}
