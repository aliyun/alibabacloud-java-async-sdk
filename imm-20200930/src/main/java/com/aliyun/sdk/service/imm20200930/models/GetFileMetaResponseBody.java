// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFileMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileMetaResponseBody</p>
 */
public class GetFileMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List < File > files;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileMetaResponseBody(Builder builder) {
        this.files = builder.files;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileMetaResponseBody create() {
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
         * <p>The metadata returned.</p>
         */
        public Builder files(java.util.List < File > files) {
            this.files = files;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F84C6D9-5AC0-49F9-914D-F02678E3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileMetaResponseBody build() {
            return new GetFileMetaResponseBody(this);
        } 

    } 

}
