// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateDatasetJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetJobConfigResponseBody</p>
 */
public class CreateDatasetJobConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetJobConfigId")
    private String datasetJobConfigId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDatasetJobConfigResponseBody(Builder builder) {
        this.datasetJobConfigId = builder.datasetJobConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetJobConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetJobConfigId
     */
    public String getDatasetJobConfigId() {
        return this.datasetJobConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String datasetJobConfigId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDatasetJobConfigResponseBody model) {
            this.datasetJobConfigId = model.datasetJobConfigId;
            this.requestId = model.requestId;
        } 

        /**
         * DatasetJobConfigId.
         */
        public Builder datasetJobConfigId(String datasetJobConfigId) {
            this.datasetJobConfigId = datasetJobConfigId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatasetJobConfigResponseBody build() {
            return new CreateDatasetJobConfigResponseBody(this);
        } 

    } 

}
