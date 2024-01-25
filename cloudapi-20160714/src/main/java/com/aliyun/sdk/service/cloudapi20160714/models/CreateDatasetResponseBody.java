// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetResponseBody</p>
 */
public class CreateDatasetResponseBody extends TeaModel {
    @NameInMap("DatasetId")
    private String datasetId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDatasetResponseBody(Builder builder) {
        this.datasetId = builder.datasetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String datasetId; 
        private String requestId; 

        /**
         * The ID of the dataset.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * The ID of the request.
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
