// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiStoreUserTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiStoreUserTaskResponseBody</p>
 */
public class GetAiStoreUserTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    private AiStoreUserTask data;

    @NameInMap("RequestId")
    private String requestId;

    private GetAiStoreUserTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiStoreUserTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public AiStoreUserTask getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AiStoreUserTask data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(AiStoreUserTask data) {
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

        public GetAiStoreUserTaskResponseBody build() {
            return new GetAiStoreUserTaskResponseBody(this);
        } 

    } 

}
