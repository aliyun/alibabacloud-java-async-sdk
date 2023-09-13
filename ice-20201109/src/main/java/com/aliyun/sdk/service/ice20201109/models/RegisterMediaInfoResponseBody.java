// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMediaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterMediaInfoResponseBody</p>
 */
public class RegisterMediaInfoResponseBody extends TeaModel {
    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("RequestId")
    private String requestId;

    private RegisterMediaInfoResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mediaId; 
        private String requestId; 

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterMediaInfoResponseBody build() {
            return new RegisterMediaInfoResponseBody(this);
        } 

    } 

}
