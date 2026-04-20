// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteAIDBClusterDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAIDBClusterDatasetResponseBody</p>
 */
public class DeleteAIDBClusterDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataServiceId")
    private String dataServiceId;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAIDBClusterDatasetResponseBody(Builder builder) {
        this.dataServiceId = builder.dataServiceId;
        this.datasetId = builder.datasetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIDBClusterDatasetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataServiceId
     */
    public String getDataServiceId() {
        return this.dataServiceId;
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
        private String dataServiceId; 
        private String datasetId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAIDBClusterDatasetResponseBody model) {
            this.dataServiceId = model.dataServiceId;
            this.datasetId = model.datasetId;
            this.requestId = model.requestId;
        } 

        /**
         * DataServiceId.
         */
        public Builder dataServiceId(String dataServiceId) {
            this.dataServiceId = dataServiceId;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAIDBClusterDatasetResponseBody build() {
            return new DeleteAIDBClusterDatasetResponseBody(this);
        } 

    } 

}
