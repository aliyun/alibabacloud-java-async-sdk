// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateFileMetaResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUpdateFileMetaResponseBody</p>
 */
public class BatchUpdateFileMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List < Files> files;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchUpdateFileMetaResponseBody(Builder builder) {
        this.files = builder.files;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateFileMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return files
     */
    public java.util.List < Files> getFiles() {
        return this.files;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Files> files; 
        private String requestId; 

        /**
         * Files.
         */
        public Builder files(java.util.List < Files> files) {
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

        public BatchUpdateFileMetaResponseBody build() {
            return new BatchUpdateFileMetaResponseBody(this);
        } 

    } 

    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Files(Builder builder) {
            this.message = builder.message;
            this.success = builder.success;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String message; 
            private Boolean success; 
            private String URI; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
