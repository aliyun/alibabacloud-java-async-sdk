// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveCdsFileResponseBody} extends {@link TeaModel}
 *
 * <p>MoveCdsFileResponseBody</p>
 */
public class MoveCdsFileResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MoveCdsFileModel")
    private MoveCdsFileModel moveCdsFileModel;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private MoveCdsFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.moveCdsFileModel = builder.moveCdsFileModel;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveCdsFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return moveCdsFileModel
     */
    public MoveCdsFileModel getMoveCdsFileModel() {
        return this.moveCdsFileModel;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private MoveCdsFileModel moveCdsFileModel; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * MoveCdsFileModel.
         */
        public Builder moveCdsFileModel(MoveCdsFileModel moveCdsFileModel) {
            this.moveCdsFileModel = moveCdsFileModel;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MoveCdsFileResponseBody build() {
            return new MoveCdsFileResponseBody(this);
        } 

    } 

    public static class MoveCdsFileModel extends TeaModel {
        @NameInMap("AsyncTaskId")
        private String asyncTaskId;

        @NameInMap("Exist")
        private Boolean exist;

        @NameInMap("FileId")
        private String fileId;

        private MoveCdsFileModel(Builder builder) {
            this.asyncTaskId = builder.asyncTaskId;
            this.exist = builder.exist;
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoveCdsFileModel create() {
            return builder().build();
        }

        /**
         * @return asyncTaskId
         */
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        /**
         * @return exist
         */
        public Boolean getExist() {
            return this.exist;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private String asyncTaskId; 
            private Boolean exist; 
            private String fileId; 

            /**
             * AsyncTaskId.
             */
            public Builder asyncTaskId(String asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * Exist.
             */
            public Builder exist(Boolean exist) {
                this.exist = exist;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            public MoveCdsFileModel build() {
                return new MoveCdsFileModel(this);
            } 

        } 

    }
}
