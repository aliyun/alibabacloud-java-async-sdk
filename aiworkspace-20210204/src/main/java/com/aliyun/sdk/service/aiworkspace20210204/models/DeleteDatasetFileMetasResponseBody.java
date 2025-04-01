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
 * {@link DeleteDatasetFileMetasResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDatasetFileMetasResponseBody</p>
 */
public class DeleteDatasetFileMetasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedDetails")
    private java.util.List<DatasetFileMetaResponse> failedDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private DeleteDatasetFileMetasResponseBody(Builder builder) {
        this.failedDetails = builder.failedDetails;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetFileMetasResponseBody create() {
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

        private Builder(DeleteDatasetFileMetasResponseBody model) {
            this.failedDetails = model.failedDetails;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * FailedDetails.
         */
        public Builder failedDetails(java.util.List<DatasetFileMetaResponse> failedDetails) {
            this.failedDetails = failedDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public DeleteDatasetFileMetasResponseBody build() {
            return new DeleteDatasetFileMetasResponseBody(this);
        } 

    } 

}
