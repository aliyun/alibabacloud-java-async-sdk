// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiStoreUserTaskByNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiStoreUserTaskByNameResponseBody</p>
 */
public class GetAiStoreUserTaskByNameResponseBody extends TeaModel {
    @NameInMap("Data")
    private AiStoreUserTask data;

    @NameInMap("RequestId")
    private String requestId;

    private GetAiStoreUserTaskByNameResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiStoreUserTaskByNameResponseBody create() {
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

        public GetAiStoreUserTaskByNameResponseBody build() {
            return new GetAiStoreUserTaskByNameResponseBody(this);
        } 

    } 

}
