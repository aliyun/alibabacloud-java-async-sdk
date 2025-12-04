// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetResponseBody</p>
 */
public class GetDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dataset")
    private Dataset dataset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDatasetResponseBody(Builder builder) {
        this.dataset = builder.dataset;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Dataset dataset; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDatasetResponseBody model) {
            this.dataset = model.dataset;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Dataset.
         */
        public Builder dataset(Dataset dataset) {
            this.dataset = dataset;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>204EAF68-CCE3-5112-8DA0-E7A60F02XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDatasetResponseBody build() {
            return new GetDatasetResponseBody(this);
        } 

    } 

}
