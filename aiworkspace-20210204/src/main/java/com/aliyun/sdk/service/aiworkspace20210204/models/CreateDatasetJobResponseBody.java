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
 * {@link CreateDatasetJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetJobResponseBody</p>
 */
public class CreateDatasetJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetJobId")
    private String datasetJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDatasetJobResponseBody(Builder builder) {
        this.datasetJobId = builder.datasetJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetJobId
     */
    public String getDatasetJobId() {
        return this.datasetJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String datasetJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDatasetJobResponseBody model) {
            this.datasetJobId = model.datasetJobId;
            this.requestId = model.requestId;
        } 

        /**
         * DatasetJobId.
         */
        public Builder datasetJobId(String datasetJobId) {
            this.datasetJobId = datasetJobId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatasetJobResponseBody build() {
            return new CreateDatasetJobResponseBody(this);
        } 

    } 

}
