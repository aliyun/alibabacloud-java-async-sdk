// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20260603.models;

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
 * {@link GetModelDeploymentSpecResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelDeploymentSpecResponseBody</p>
 */
public class GetModelDeploymentSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InferenceSpec")
    private java.util.Map<String, ?> inferenceSpec;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetModelDeploymentSpecResponseBody(Builder builder) {
        this.inferenceSpec = builder.inferenceSpec;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelDeploymentSpecResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inferenceSpec
     */
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> inferenceSpec; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetModelDeploymentSpecResponseBody model) {
            this.inferenceSpec = model.inferenceSpec;
            this.requestId = model.requestId;
        } 

        /**
         * InferenceSpec.
         */
        public Builder inferenceSpec(java.util.Map<String, ?> inferenceSpec) {
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetModelDeploymentSpecResponseBody build() {
            return new GetModelDeploymentSpecResponseBody(this);
        } 

    } 

}
