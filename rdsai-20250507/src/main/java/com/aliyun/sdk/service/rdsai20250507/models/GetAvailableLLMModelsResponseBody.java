// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetAvailableLLMModelsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAvailableLLMModelsResponseBody</p>
 */
public class GetAvailableLLMModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Models")
    private java.util.List<String> models;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAvailableLLMModelsResponseBody(Builder builder) {
        this.models = builder.models;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailableLLMModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return models
     */
    public java.util.List<String> getModels() {
        return this.models;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> models; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAvailableLLMModelsResponseBody model) {
            this.models = model.models;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The models.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;glm-5&quot;,&quot;deepseek-v3.2&quot;]</p>
         */
        public Builder models(java.util.List<String> models) {
            this.models = models;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAvailableLLMModelsResponseBody build() {
            return new GetAvailableLLMModelsResponseBody(this);
        } 

    } 

}
