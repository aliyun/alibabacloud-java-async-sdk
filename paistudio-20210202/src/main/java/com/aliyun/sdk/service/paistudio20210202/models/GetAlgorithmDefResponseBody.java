// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetAlgorithmDefResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmDefResponseBody</p>
 */
public class GetAlgorithmDefResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private java.util.Map<String, ?> spec;

    private GetAlgorithmDefResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmDefResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spec
     */
    public java.util.Map<String, ?> getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, ?> spec; 

        private Builder() {
        } 

        private Builder(GetAlgorithmDefResponseBody model) {
            this.requestId = model.requestId;
            this.spec = model.spec;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(java.util.Map<String, ?> spec) {
            this.spec = spec;
            return this;
        }

        public GetAlgorithmDefResponseBody build() {
            return new GetAlgorithmDefResponseBody(this);
        } 

    } 

}
