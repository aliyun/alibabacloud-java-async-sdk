// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetResponseBody</p>
 */
public class CreateDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dataset")
    private Dataset dataset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDatasetResponseBody(Builder builder) {
        this.dataset = builder.dataset;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetResponseBody create() {
        return builder().build();
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

        /**
         * <p>The information about the dataset.</p>
         */
        public Builder dataset(Dataset dataset) {
            this.dataset = dataset;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D74B3A9-5AC0-49F9-914D-E01589D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatasetResponseBody build() {
            return new CreateDatasetResponseBody(this);
        } 

    } 

}
