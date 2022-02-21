// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterCustomFaceResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterCustomFaceResponseBody</p>
 */
public class RegisterCustomFaceResponseBody extends TeaModel {
    @NameInMap("FaceId")
    private String faceId;

    @NameInMap("RequestId")
    private String requestId;

    private RegisterCustomFaceResponseBody(Builder builder) {
        this.faceId = builder.faceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterCustomFaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return faceId
     */
    public String getFaceId() {
        return this.faceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String faceId; 
        private String requestId; 

        /**
         * FaceId.
         */
        public Builder faceId(String faceId) {
            this.faceId = faceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterCustomFaceResponseBody build() {
            return new RegisterCustomFaceResponseBody(this);
        } 

    } 

}
