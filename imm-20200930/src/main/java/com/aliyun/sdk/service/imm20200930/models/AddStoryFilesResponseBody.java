// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link AddStoryFilesResponseBody} extends {@link TeaModel}
 *
 * <p>AddStoryFilesResponseBody</p>
 */
public class AddStoryFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddStoryFilesResponseBody(Builder builder) {
        this.files = builder.files;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStoryFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Files> files; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddStoryFilesResponseBody model) {
            this.files = model.files;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The objects that were added.</p>
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddStoryFilesResponseBody build() {
            return new AddStoryFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddStoryFilesResponseBody} extends {@link TeaModel}
     *
     * <p>AddStoryFilesResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Files(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String URI; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.URI = model.URI;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceNotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified resource %s is not found.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The URI of the object.</p>
             * <p>The OSS URI follows the <code>oss://{bucketname}/{objectname}</code> format, where <code>bucketname</code> is the name of the bucket in the same region as the current project and <code>objectname</code> is the path of the object with the extension included.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object</p>
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
