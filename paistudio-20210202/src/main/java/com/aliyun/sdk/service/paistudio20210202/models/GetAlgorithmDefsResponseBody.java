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
 * {@link GetAlgorithmDefsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmDefsResponseBody</p>
 */
public class GetAlgorithmDefsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Specs")
    private java.util.List<java.util.Map<String, ?>> specs;

    private GetAlgorithmDefsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.specs = builder.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmDefsResponseBody create() {
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
     * @return specs
     */
    public java.util.List<java.util.Map<String, ?>> getSpecs() {
        return this.specs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<java.util.Map<String, ?>> specs; 

        private Builder() {
        } 

        private Builder(GetAlgorithmDefsResponseBody model) {
            this.requestId = model.requestId;
            this.specs = model.specs;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Specs.
         */
        public Builder specs(java.util.List<java.util.Map<String, ?>> specs) {
            this.specs = specs;
            return this;
        }

        public GetAlgorithmDefsResponseBody build() {
            return new GetAlgorithmDefsResponseBody(this);
        } 

    } 

}
