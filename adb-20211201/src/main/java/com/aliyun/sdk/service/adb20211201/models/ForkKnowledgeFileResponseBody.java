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
 * {@link ForkKnowledgeFileResponseBody} extends {@link TeaModel}
 *
 * <p>ForkKnowledgeFileResponseBody</p>
 */
public class ForkKnowledgeFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ForkKnowledgeFileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForkKnowledgeFileResponseBody create() {
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

        private Builder(ForkKnowledgeFileResponseBody model) {
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

        public ForkKnowledgeFileResponseBody build() {
            return new ForkKnowledgeFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ForkKnowledgeFileResponseBody} extends {@link TeaModel}
     *
     * <p>ForkKnowledgeFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileLocation")
        private String fileLocation;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OwnerFileId")
        private String ownerFileId;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private String processStatus;

        @com.aliyun.core.annotation.NameInMap("SourceFileId")
        private String sourceFileId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.fileId = builder.fileId;
            this.fileLocation = builder.fileLocation;
            this.message = builder.message;
            this.ownerFileId = builder.ownerFileId;
            this.processStatus = builder.processStatus;
            this.sourceFileId = builder.sourceFileId;
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
         * @return fileLocation
         */
        public String getFileLocation() {
            return this.fileLocation;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return ownerFileId
         */
        public String getOwnerFileId() {
            return this.ownerFileId;
        }

        /**
         * @return processStatus
         */
        public String getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return sourceFileId
         */
        public String getSourceFileId() {
            return this.sourceFileId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String fileId; 
            private String fileLocation; 
            private String message; 
            private String ownerFileId; 
            private String processStatus; 
            private String sourceFileId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileId = model.fileId;
                this.fileLocation = model.fileLocation;
                this.message = model.message;
                this.ownerFileId = model.ownerFileId;
                this.processStatus = model.processStatus;
                this.sourceFileId = model.sourceFileId;
                this.success = model.success;
            } 

            /**
             * <p>The ID of the newly created reference record, represented as a decimal string. Use this ID for subsequent management of the record. This parameter is returned only when the operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The address of the new reference record, in the format of fork://<source file ID>/<new file ID>. This parameter is returned only when the operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>fork://123/456</p>
             */
            public Builder fileLocation(String fileLocation) {
                this.fileLocation = fileLocation;
                return this;
            }

            /**
             * <p>The description of the operation result. If the business operation fails, this parameter indicates the cause or the security error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Fork succeeded</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the content host file, represented as a decimal string. Currently, this value is the same as the source file ID. This parameter is returned only when the operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder ownerFileId(String ownerFileId) {
                this.ownerFileId = ownerFileId;
                return this;
            }

            /**
             * <p>The status of the new reference record. The value is fixed to DUPLICATED. This parameter is returned only when the operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>DUPLICATED</p>
             */
            public Builder processStatus(String processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * <p>The ID of the source file, represented as a decimal string. This parameter is returned only when the operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder sourceFileId(String sourceFileId) {
                this.sourceFileId = sourceFileId;
                return this;
            }

            /**
             * <p>Indicates whether the business operation is successful. If the operation fails, the Data parameter contains only Success and Message.</p>
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
