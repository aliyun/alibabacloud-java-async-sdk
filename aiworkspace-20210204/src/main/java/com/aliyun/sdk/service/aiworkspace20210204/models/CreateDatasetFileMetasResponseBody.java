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
 * {@link CreateDatasetFileMetasResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetFileMetasResponseBody</p>
 */
public class CreateDatasetFileMetasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedDetails")
    private java.util.List<DatasetFileMetaResponse> failedDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    @com.aliyun.core.annotation.NameInMap("SucceedDetails")
    private java.util.List<DatasetFileMetaResponse> succeedDetails;

    private CreateDatasetFileMetasResponseBody(Builder builder) {
        this.failedDetails = builder.failedDetails;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.succeedDetails = builder.succeedDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetFileMetasResponseBody create() {
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

    /**
     * @return succeedDetails
     */
    public java.util.List<DatasetFileMetaResponse> getSucceedDetails() {
        return this.succeedDetails;
    }

    public static final class Builder {
        private java.util.List<DatasetFileMetaResponse> failedDetails; 
        private String requestId; 
        private Boolean status; 
        private java.util.List<DatasetFileMetaResponse> succeedDetails; 

        private Builder() {
        } 

        private Builder(CreateDatasetFileMetasResponseBody model) {
            this.failedDetails = model.failedDetails;
            this.requestId = model.requestId;
            this.status = model.status;
            this.succeedDetails = model.succeedDetails;
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

        /**
         * SucceedDetails.
         */
        public Builder succeedDetails(java.util.List<DatasetFileMetaResponse> succeedDetails) {
            this.succeedDetails = succeedDetails;
            return this;
        }

        public CreateDatasetFileMetasResponseBody build() {
            return new CreateDatasetFileMetasResponseBody(this);
        } 

    } 

}
