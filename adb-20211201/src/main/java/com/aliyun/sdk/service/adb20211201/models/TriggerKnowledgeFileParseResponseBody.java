// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link TriggerKnowledgeFileParseResponseBody} extends {@link TeaModel}
 *
 * <p>TriggerKnowledgeFileParseResponseBody</p>
 */
public class TriggerKnowledgeFileParseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TriggerKnowledgeFileParseResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerKnowledgeFileParseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TriggerKnowledgeFileParseResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TriggerKnowledgeFileParseResponseBody build() {
            return new TriggerKnowledgeFileParseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TriggerKnowledgeFileParseResponseBody} extends {@link TeaModel}
     *
     * <p>TriggerKnowledgeFileParseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PreviousStatus")
        private String previousStatus;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private String processStatus;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.fileId = builder.fileId;
            this.message = builder.message;
            this.previousStatus = builder.previousStatus;
            this.processStatus = builder.processStatus;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return previousStatus
         */
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        /**
         * @return processStatus
         */
        public String getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String fileId; 
            private String message; 
            private String previousStatus; 
            private String processStatus; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileId = model.fileId;
                this.message = model.message;
                this.previousStatus = model.previousStatus;
                this.processStatus = model.processStatus;
                this.success = model.success;
            } 

            /**
             * <p>The ID of the file submitted for reparsing, which is a decimal string. This parameter is returned only when the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The description of the operation result. If the operation fails, this parameter indicates the cause or the security error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Reparse task submitted</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The status before submission. Valid values: PENDING, COMPLETED, FAILED, SKIPPED, and DUPLICATED. This parameter is returned only when the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder previousStatus(String previousStatus) {
                this.previousStatus = previousStatus;
                return this;
            }

            /**
             * <p>The status after submission. The value is fixed to PENDING. This parameter is returned only when the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder processStatus(String processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * <p>Indicates whether the operation is successful. If the operation fails, the Data parameter contains only the Success and Message parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
