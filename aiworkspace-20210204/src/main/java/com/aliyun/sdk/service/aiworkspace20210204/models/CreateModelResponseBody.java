// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelResponseBody</p>
 */
public class CreateModelResponseBody extends TeaModel {
    @NameInMap("ModelId")
    private String modelId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateModelResponseBody(Builder builder) {
        this.modelId = builder.modelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String modelId; 
        private String requestId; 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModelResponseBody build() {
            return new CreateModelResponseBody(this);
        } 

    } 

}
