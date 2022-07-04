// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileDetectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileDetectResponseBody</p>
 */
public class CreateFileDetectResponseBody extends TeaModel {
    @NameInMap("HashKey")
    private String hashKey;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFileDetectResponseBody(Builder builder) {
        this.hashKey = builder.hashKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDetectResponseBody create() {
        return builder().build();
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hashKey; 
        private String requestId; 

        /**
         * HashKey.
         */
        public Builder hashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFileDetectResponseBody build() {
            return new CreateFileDetectResponseBody(this);
        } 

    } 

}
