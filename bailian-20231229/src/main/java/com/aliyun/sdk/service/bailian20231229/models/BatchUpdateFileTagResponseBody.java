// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link BatchUpdateFileTagResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUpdateFileTagResponseBody</p>
 */
public class BatchUpdateFileTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchUpdateFileTagResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateFileTagResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchUpdateFileTagResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchUpdateFileTagResponseBody build() {
            return new BatchUpdateFileTagResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchUpdateFileTagResponseBody} extends {@link TeaModel}
     *
     * <p>BatchUpdateFileTagResponseBody</p>
     */
    public static class UpdateFileTagResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private UpdateFileTagResultList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.fileId = builder.fileId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateFileTagResultList create() {
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
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String fileId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(UpdateFileTagResultList model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.fileId = model.fileId;
                this.success = model.success;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public UpdateFileTagResultList build() {
                return new UpdateFileTagResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchUpdateFileTagResponseBody} extends {@link TeaModel}
     *
     * <p>BatchUpdateFileTagResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpdateFileTagResultList")
        private java.util.List<UpdateFileTagResultList> updateFileTagResultList;

        private Data(Builder builder) {
            this.updateFileTagResultList = builder.updateFileTagResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return updateFileTagResultList
         */
        public java.util.List<UpdateFileTagResultList> getUpdateFileTagResultList() {
            return this.updateFileTagResultList;
        }

        public static final class Builder {
            private java.util.List<UpdateFileTagResultList> updateFileTagResultList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.updateFileTagResultList = model.updateFileTagResultList;
            } 

            /**
             * UpdateFileTagResultList.
             */
            public Builder updateFileTagResultList(java.util.List<UpdateFileTagResultList> updateFileTagResultList) {
                this.updateFileTagResultList = updateFileTagResultList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
