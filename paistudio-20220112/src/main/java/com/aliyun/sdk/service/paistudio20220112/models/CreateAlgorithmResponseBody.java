// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link CreateAlgorithmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlgorithmResponseBody</p>
 */
public class CreateAlgorithmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAlgorithmResponseBody(Builder builder) {
        this.algorithmId = builder.algorithmId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlgorithmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String algorithmId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAlgorithmResponseBody model) {
            this.algorithmId = model.algorithmId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>algo-xsldfvu1334</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlgorithmResponseBody build() {
            return new CreateAlgorithmResponseBody(this);
        } 

    } 

}
