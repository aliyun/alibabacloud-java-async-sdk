// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMemoryResponseBody</p>
 */
public class CreateMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("memoryId")
    private String memoryId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMemoryResponseBody(Builder builder) {
        this.memoryId = builder.memoryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return memoryId
     */
    public String getMemoryId() {
        return this.memoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String memoryId; 
        private String requestId; 

        /**
         * memoryId.
         */
        public Builder memoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMemoryResponseBody build() {
            return new CreateMemoryResponseBody(this);
        } 

    } 

}
