// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RetryKnowledgeBaseFailedSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>RetryKnowledgeBaseFailedSourcesResponseBody</p>
 */
public class RetryKnowledgeBaseFailedSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("enqueuedCount")
    private Long enqueuedCount;

    @com.aliyun.core.annotation.NameInMap("enqueuedIds")
    private java.util.List<String> enqueuedIds;

    @com.aliyun.core.annotation.NameInMap("failedCount")
    private Long failedCount;

    @com.aliyun.core.annotation.NameInMap("failedSources")
    private java.util.List<FailedSources> failedSources;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skippedCount")
    private Long skippedCount;

    private RetryKnowledgeBaseFailedSourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.directoryId = builder.directoryId;
        this.enqueuedCount = builder.enqueuedCount;
        this.enqueuedIds = builder.enqueuedIds;
        this.failedCount = builder.failedCount;
        this.failedSources = builder.failedSources;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.skippedCount = builder.skippedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryKnowledgeBaseFailedSourcesResponseBody create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return enqueuedCount
     */
    public Long getEnqueuedCount() {
        return this.enqueuedCount;
    }

    /**
     * @return enqueuedIds
     */
    public java.util.List<String> getEnqueuedIds() {
        return this.enqueuedIds;
    }

    /**
     * @return failedCount
     */
    public Long getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return failedSources
     */
    public java.util.List<FailedSources> getFailedSources() {
        return this.failedSources;
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
     * @return skippedCount
     */
    public Long getSkippedCount() {
        return this.skippedCount;
    }

    public static final class Builder {
        private String code; 
        private String directoryId; 
        private Long enqueuedCount; 
        private java.util.List<String> enqueuedIds; 
        private Long failedCount; 
        private java.util.List<FailedSources> failedSources; 
        private String message; 
        private String requestId; 
        private Long skippedCount; 

        private Builder() {
        } 

        private Builder(RetryKnowledgeBaseFailedSourcesResponseBody model) {
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.enqueuedCount = model.enqueuedCount;
            this.enqueuedIds = model.enqueuedIds;
            this.failedCount = model.failedCount;
            this.failedSources = model.failedSources;
            this.message = model.message;
            this.requestId = model.requestId;
            this.skippedCount = model.skippedCount;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>企业知识库目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>成功入队重试的数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enqueuedCount(Long enqueuedCount) {
            this.enqueuedCount = enqueuedCount;
            return this;
        }

        /**
         * <p>enqueuedIds。</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder enqueuedIds(java.util.List<String> enqueuedIds) {
            this.enqueuedIds = enqueuedIds;
            return this;
        }

        /**
         * <p>目录下失败资源总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * failedSources.
         */
        public Builder failedSources(java.util.List<FailedSources> failedSources) {
            this.failedSources = failedSources;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>跳过（非 FAILED 状态）的数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder skippedCount(Long skippedCount) {
            this.skippedCount = skippedCount;
            return this;
        }

        public RetryKnowledgeBaseFailedSourcesResponseBody build() {
            return new RetryKnowledgeBaseFailedSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetryKnowledgeBaseFailedSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>RetryKnowledgeBaseFailedSourcesResponseBody</p>
     */
    public static class FailedSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private FailedSources(Builder builder) {
            this.name = builder.name;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedSources create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String name; 
            private String sourceId; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(FailedSources model) {
                this.name = model.name;
                this.sourceId = model.sourceId;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>数据源 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSourceId</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>数据源类型</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public FailedSources build() {
                return new FailedSources(this);
            } 

        } 

    }
}
