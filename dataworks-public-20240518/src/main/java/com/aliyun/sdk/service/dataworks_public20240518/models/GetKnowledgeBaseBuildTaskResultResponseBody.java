// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetKnowledgeBaseBuildTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBaseBuildTaskResultResponseBody</p>
 */
public class GetKnowledgeBaseBuildTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetKnowledgeBaseBuildTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseBuildTaskResultResponseBody create() {
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
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBaseBuildTaskResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code, which is used to determine the error type when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned when the request is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetKnowledgeBaseBuildTaskResultResponseBody build() {
            return new GetKnowledgeBaseBuildTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeBaseBuildTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseBuildTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExpiresIn")
        private Integer expiresIn;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
        private String taskInstanceId;

        private Data(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.expiresIn = builder.expiresIn;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.taskInstanceId = builder.taskInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return expiresIn
         */
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return taskInstanceId
         */
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Integer expiresIn; 
            private String knowledgeBaseId; 
            private String taskInstanceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.downloadUrl = model.downloadUrl;
                this.expiresIn = model.expiresIn;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.taskInstanceId = model.taskInstanceId;
            } 

            /**
             * <p>The temporary Object Storage Service (OSS) download URL issued to the current caller when this operation is called. The URL is not stored.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.invalid/short-lived-result-download">https://example.invalid/short-lived-result-download</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The validity period of the download URL, in seconds. Request a new URL after it expires.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder expiresIn(Integer expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the result belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The ID of the task instance that produced the result.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder taskInstanceId(String taskInstanceId) {
                this.taskInstanceId = taskInstanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
