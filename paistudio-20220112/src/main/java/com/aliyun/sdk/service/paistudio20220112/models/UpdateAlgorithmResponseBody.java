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
 * {@link UpdateAlgorithmResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAlgorithmResponseBody</p>
 */
public class UpdateAlgorithmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAlgorithmResponseBody(Builder builder) {
        this.algorithmId = builder.algorithmId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlgorithmResponseBody create() {
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

        private Builder(UpdateAlgorithmResponseBody model) {
            this.algorithmId = model.algorithmId;
            this.requestId = model.requestId;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAlgorithmResponseBody build() {
            return new UpdateAlgorithmResponseBody(this);
        } 

    } 

}
