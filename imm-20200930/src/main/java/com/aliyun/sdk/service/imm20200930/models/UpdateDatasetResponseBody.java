// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link UpdateDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDatasetResponseBody</p>
 */
public class UpdateDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dataset")
    private Dataset dataset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateDatasetResponseBody(Builder builder) {
        this.dataset = builder.dataset;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataset
     */
    public Dataset getDataset() {
        return this.dataset;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Dataset dataset; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateDatasetResponseBody model) {
            this.dataset = model.dataset;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The dataset.</p>
         */
        public Builder dataset(Dataset dataset) {
            this.dataset = dataset;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDatasetResponseBody build() {
            return new UpdateDatasetResponseBody(this);
        } 

    } 

}
