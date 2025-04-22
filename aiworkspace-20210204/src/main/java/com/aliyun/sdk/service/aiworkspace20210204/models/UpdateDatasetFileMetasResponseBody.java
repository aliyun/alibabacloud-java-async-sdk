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
 * {@link UpdateDatasetFileMetasResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDatasetFileMetasResponseBody</p>
 */
public class UpdateDatasetFileMetasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedDetails")
    private java.util.List<DatasetFileMetaResponse> failedDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private UpdateDatasetFileMetasResponseBody(Builder builder) {
        this.failedDetails = builder.failedDetails;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetFileMetasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedDetails
     */
    public java.util.List<DatasetFileMetaResponse> getFailedDetails() {
        return this.failedDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<DatasetFileMetaResponse> failedDetails; 
        private String requestId; 
        private Boolean status; 

        private Builder() {
        } 

        private Builder(UpdateDatasetFileMetasResponseBody model) {
            this.failedDetails = model.failedDetails;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The metadata records that fail to be updated for the dataset files.</p>
         */
        public Builder failedDetails(java.util.List<DatasetFileMetaResponse> failedDetails) {
            this.failedDetails = failedDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the metadata records of all dataset files were updated. Valid values: true and false. If the value is false, view the failure details specified by FailedDetails.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public UpdateDatasetFileMetasResponseBody build() {
            return new UpdateDatasetFileMetasResponseBody(this);
        } 

    } 

}
