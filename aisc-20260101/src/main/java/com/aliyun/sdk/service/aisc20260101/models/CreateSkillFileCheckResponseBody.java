// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link CreateSkillFileCheckResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSkillFileCheckResponseBody</p>
 */
public class CreateSkillFileCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSkillFileCheckResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillFileCheckResponseBody create() {
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

        private Builder(CreateSkillFileCheckResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The task creation result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9FDE3D6F-26BD-5937-B0E5-8F47962B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSkillFileCheckResponseBody build() {
            return new CreateSkillFileCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSkillFileCheckResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSkillFileCheckResponseBody</p>
     */
    public static class UploadResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("FileHash")
        private String fileHash;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("IdentifyId")
        private String identifyId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private UploadResults(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.fileHash = builder.fileHash;
            this.fileName = builder.fileName;
            this.identifyId = builder.identifyId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadResults create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return fileHash
         */
        public String getFileHash() {
            return this.fileHash;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return identifyId
         */
        public String getIdentifyId() {
            return this.identifyId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorMsg; 
            private String fileHash; 
            private String fileName; 
            private String identifyId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(UploadResults model) {
                this.errorMsg = model.errorMsg;
                this.fileHash = model.fileHash;
                this.fileName = model.fileName;
                this.identifyId = model.identifyId;
                this.success = model.success;
            } 

            /**
             * <p>The error message returned when the file fails to be uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>Network error.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The SHA256 hash of the uploaded file.</p>
             * 
             * <strong>example:</strong>
             * <p>514f44ebed1d0c1df5e16a116080b64b</p>
             */
            public Builder fileHash(String fileHash) {
                this.fileHash = fileHash;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test-file</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The unique ID of the uploaded file. You can use this ID to query the task result.</p>
             * 
             * <strong>example:</strong>
             * <p>1824jcadg01bsl10b</p>
             */
            public Builder identifyId(String identifyId) {
                this.identifyId = identifyId;
                return this;
            }

            /**
             * <p>Indicates whether the operation is successful. Valid values:</p>
             * <ul>
             * <li>true: Successful.</li>
             * <li>false: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public UploadResults build() {
                return new UploadResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSkillFileCheckResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSkillFileCheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("RootTaskId")
        private String rootTaskId;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("UploadResults")
        private java.util.List<UploadResults> uploadResults;

        private Data(Builder builder) {
            this.failCount = builder.failCount;
            this.rootTaskId = builder.rootTaskId;
            this.successCount = builder.successCount;
            this.uploadResults = builder.uploadResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return rootTaskId
         */
        public String getRootTaskId() {
            return this.rootTaskId;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return uploadResults
         */
        public java.util.List<UploadResults> getUploadResults() {
            return this.uploadResults;
        }

        public static final class Builder {
            private Integer failCount; 
            private String rootTaskId; 
            private Integer successCount; 
            private java.util.List<UploadResults> uploadResults; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failCount = model.failCount;
                this.rootTaskId = model.rootTaskId;
                this.successCount = model.successCount;
                this.uploadResults = model.uploadResults;
            } 

            /**
             * <p>The number of files that failed to be uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The root task ID returned after the task is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>c6e7fa8a77df6e182ac3fcf1478ab83a</p>
             */
            public Builder rootTaskId(String rootTaskId) {
                this.rootTaskId = rootTaskId;
                return this;
            }

            /**
             * <p>The number of files that are uploaded successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The upload results.</p>
             */
            public Builder uploadResults(java.util.List<UploadResults> uploadResults) {
                this.uploadResults = uploadResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
