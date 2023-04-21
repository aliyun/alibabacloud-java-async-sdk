// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCdsFileResponseBody} extends {@link TeaModel}
 *
 * <p>CopyCdsFileResponseBody</p>
 */
public class CopyCdsFileResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CopyCdsFileModel")
    private CopyCdsFileModel copyCdsFileModel;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CopyCdsFileModel.
         */
        public Builder copyCdsFileModel(CopyCdsFileModel copyCdsFileModel) {
            this.copyCdsFileModel = copyCdsFileModel;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CopyCdsFileResponseBody build() {
            return new CopyCdsFileResponseBody(this);
        } 

    } 

    public static class CopyCdsFileModel extends TeaModel {
        @NameInMap("AsyncTaskId")
        private String asyncTaskId;

        @NameInMap("FileId")
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

            /**
             * AsyncTaskId.
             */
            public Builder asyncTaskId(String asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * FileId.
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
