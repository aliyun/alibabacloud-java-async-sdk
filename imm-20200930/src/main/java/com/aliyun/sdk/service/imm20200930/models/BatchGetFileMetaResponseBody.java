// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetFileMetaResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetFileMetaResponseBody</p>
 */
public class BatchGetFileMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List < File > files;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchGetFileMetaResponseBody(Builder builder) {
        this.files = builder.files;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetFileMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return files
     */
    public java.util.List < File > getFiles() {
        return this.files;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < File > files; 
        private String requestId; 

        /**
         * Files.
         */
        public Builder files(java.util.List < File > files) {
            this.files = files;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchGetFileMetaResponseBody build() {
            return new BatchGetFileMetaResponseBody(this);
        } 

    } 

}
