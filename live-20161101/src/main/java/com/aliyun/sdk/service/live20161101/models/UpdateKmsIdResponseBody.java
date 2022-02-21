// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKmsIdResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKmsIdResponseBody</p>
 */
public class UpdateKmsIdResponseBody extends TeaModel {
    @NameInMap("KmsId")
    private String kmsId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserId")
    private String userId;

    private UpdateKmsIdResponseBody(Builder builder) {
        this.kmsId = builder.kmsId;
        this.requestId = builder.requestId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKmsIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return kmsId
     */
    public String getKmsId() {
        return this.kmsId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String kmsId; 
        private String requestId; 
        private String userId; 

        /**
         * KmsId.
         */
        public Builder kmsId(String kmsId) {
            this.kmsId = kmsId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UpdateKmsIdResponseBody build() {
            return new UpdateKmsIdResponseBody(this);
        } 

    } 

}
