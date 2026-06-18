// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SubmitUploadTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitUploadTaskResponseBody</p>
 */
public class SubmitUploadTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadId")
    private Long uploadId;

    private SubmitUploadTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitUploadTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadId
     */
    public Long getUploadId() {
        return this.uploadId;
    }

    public static final class Builder {
        private String requestId; 
        private Long uploadId; 

        private Builder() {
        } 

        private Builder(SubmitUploadTaskResponseBody model) {
            this.requestId = model.requestId;
            this.uploadId = model.uploadId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the file upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>1593805857882113</p>
         */
        public Builder uploadId(Long uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public SubmitUploadTaskResponseBody build() {
            return new SubmitUploadTaskResponseBody(this);
        } 

    } 

}
