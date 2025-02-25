// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAiStoreReceiveConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAiStoreReceiveConfigResponseBody</p>
 */
public class CreateAiStoreReceiveConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private AiStoreReceiveConfig data;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAiStoreReceiveConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiStoreReceiveConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public AiStoreReceiveConfig getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AiStoreReceiveConfig data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(AiStoreReceiveConfig data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAiStoreReceiveConfigResponseBody build() {
            return new CreateAiStoreReceiveConfigResponseBody(this);
        } 

    } 

}
