// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeKnowledgeBaseStatsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBaseStatsResponseBody</p>
 */
public class DescribeKnowledgeBaseStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeKnowledgeBaseStatsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBaseStatsResponseBody create() {
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeBaseStatsResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
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

        public DescribeKnowledgeBaseStatsResponseBody build() {
            return new DescribeKnowledgeBaseStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKnowledgeBaseStatsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocumentCount")
        private Integer documentCount;

        @com.aliyun.core.annotation.NameInMap("KbHits")
        private Long kbHits;

        @com.aliyun.core.annotation.NameInMap("KbUuid")
        private String kbUuid;

        @com.aliyun.core.annotation.NameInMap("TotalChunkCount")
        private Integer totalChunkCount;

        @com.aliyun.core.annotation.NameInMap("TotalFileSize")
        private Long totalFileSize;

        private Data(Builder builder) {
            this.documentCount = builder.documentCount;
            this.kbHits = builder.kbHits;
            this.kbUuid = builder.kbUuid;
            this.totalChunkCount = builder.totalChunkCount;
            this.totalFileSize = builder.totalFileSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return documentCount
         */
        public Integer getDocumentCount() {
            return this.documentCount;
        }

        /**
         * @return kbHits
         */
        public Long getKbHits() {
            return this.kbHits;
        }

        /**
         * @return kbUuid
         */
        public String getKbUuid() {
            return this.kbUuid;
        }

        /**
         * @return totalChunkCount
         */
        public Integer getTotalChunkCount() {
            return this.totalChunkCount;
        }

        /**
         * @return totalFileSize
         */
        public Long getTotalFileSize() {
            return this.totalFileSize;
        }

        public static final class Builder {
            private Integer documentCount; 
            private Long kbHits; 
            private String kbUuid; 
            private Integer totalChunkCount; 
            private Long totalFileSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.documentCount = model.documentCount;
                this.kbHits = model.kbHits;
                this.kbUuid = model.kbUuid;
                this.totalChunkCount = model.totalChunkCount;
                this.totalFileSize = model.totalFileSize;
            } 

            /**
             * DocumentCount.
             */
            public Builder documentCount(Integer documentCount) {
                this.documentCount = documentCount;
                return this;
            }

            /**
             * KbHits.
             */
            public Builder kbHits(Long kbHits) {
                this.kbHits = kbHits;
                return this;
            }

            /**
             * KbUuid.
             */
            public Builder kbUuid(String kbUuid) {
                this.kbUuid = kbUuid;
                return this;
            }

            /**
             * TotalChunkCount.
             */
            public Builder totalChunkCount(Integer totalChunkCount) {
                this.totalChunkCount = totalChunkCount;
                return this;
            }

            /**
             * TotalFileSize.
             */
            public Builder totalFileSize(Long totalFileSize) {
                this.totalFileSize = totalFileSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
