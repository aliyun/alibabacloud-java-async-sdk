// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CopyCdsFileResponseBody} extends {@link TeaModel}
 *
 * <p>CopyCdsFileResponseBody</p>
 */
public class CopyCdsFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CopyCdsFileModel")
    private CopyCdsFileModel copyCdsFileModel;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CopyCdsFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.copyCdsFileModel = builder.copyCdsFileModel;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCdsFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return copyCdsFileModel
     */
    public CopyCdsFileModel getCopyCdsFileModel() {
        return this.copyCdsFileModel;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private CopyCdsFileModel copyCdsFileModel; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(CopyCdsFileResponseBody model) {
            this.code = model.code;
            this.copyCdsFileModel = model.copyCdsFileModel;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The operation result. The value success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details about the file copying.</p>
         */
        public Builder copyCdsFileModel(CopyCdsFileModel copyCdsFileModel) {
            this.copyCdsFileModel = copyCdsFileModel;
            return this;
        }

        /**
         * <p>The error message that is returned. This parameter is not returned if the value of Code is success.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>93AD30C1-16B8-5C54-AD23-A51FF53F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CopyCdsFileResponseBody build() {
            return new CopyCdsFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CopyCdsFileResponseBody} extends {@link TeaModel}
     *
     * <p>CopyCdsFileResponseBody</p>
     */
    public static class CopyCdsFileModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
        private String asyncTaskId;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        private CopyCdsFileModel(Builder builder) {
            this.asyncTaskId = builder.asyncTaskId;
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CopyCdsFileModel create() {
            return builder().build();
        }

        /**
         * @return asyncTaskId
         */
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private String asyncTaskId; 
            private String fileId; 

            private Builder() {
            } 

            private Builder(CopyCdsFileModel model) {
                this.asyncTaskId = model.asyncTaskId;
                this.fileId = model.fileId;
            } 

            /**
             * <p>The ID of the asynchronous task. This parameter is not returned if you copy a file. This parameter is returned if you copy a folder in the backend in an asynchronous manner. You can call the GetAsyncTask operation to obtain the ID and details of an asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>4221bf6e6ab43a255edc4463bffa6f5f5d31****</p>
             */
            public Builder asyncTaskId(String asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * <p>The ID of the copied file or folder.</p>
             * 
             * <strong>example:</strong>
             * <p>6400727cb878821bcb414615a609b4072463****</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            public CopyCdsFileModel build() {
                return new CopyCdsFileModel(this);
            } 

        } 

    }
}
