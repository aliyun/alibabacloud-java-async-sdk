// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateModelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelResponseBody</p>
 */
public class CreateModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateModelResponseBody model) {
            this.modelId = model.modelId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>model-rbvg5wzljz****ks92</p>
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DAD3112-AE22-5563-9A02-5C7E8****E35</p>
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
