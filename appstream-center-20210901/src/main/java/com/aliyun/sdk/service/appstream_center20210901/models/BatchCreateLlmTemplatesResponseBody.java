// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link BatchCreateLlmTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateLlmTemplatesResponseBody</p>
 */
public class BatchCreateLlmTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchCreateLlmTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateLlmTemplatesResponseBody create() {
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

        private Builder(BatchCreateLlmTemplatesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchCreateLlmTemplatesResponseBody build() {
            return new BatchCreateLlmTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateLlmTemplatesResponseBody</p>
     */
    public static class SkippedItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LlmCode")
        private String llmCode;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private SkippedItems(Builder builder) {
            this.llmCode = builder.llmCode;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkippedItems create() {
            return builder().build();
        }

        /**
         * @return llmCode
         */
        public String getLlmCode() {
            return this.llmCode;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String llmCode; 
            private String reason; 

            private Builder() {
            } 

            private Builder(SkippedItems model) {
                this.llmCode = model.llmCode;
                this.reason = model.reason;
            } 

            /**
             * LlmCode.
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public SkippedItems build() {
                return new SkippedItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateLlmTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateLlmTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LlmTemplateIds")
        private java.util.List<String> llmTemplateIds;

        @com.aliyun.core.annotation.NameInMap("SkippedItems")
        private java.util.List<SkippedItems> skippedItems;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.llmTemplateIds = builder.llmTemplateIds;
            this.skippedItems = builder.skippedItems;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return llmTemplateIds
         */
        public java.util.List<String> getLlmTemplateIds() {
            return this.llmTemplateIds;
        }

        /**
         * @return skippedItems
         */
        public java.util.List<SkippedItems> getSkippedItems() {
            return this.skippedItems;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<String> llmTemplateIds; 
            private java.util.List<SkippedItems> skippedItems; 
            private Integer successCount; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.llmTemplateIds = model.llmTemplateIds;
                this.skippedItems = model.skippedItems;
                this.successCount = model.successCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * LlmTemplateIds.
             */
            public Builder llmTemplateIds(java.util.List<String> llmTemplateIds) {
                this.llmTemplateIds = llmTemplateIds;
                return this;
            }

            /**
             * SkippedItems.
             */
            public Builder skippedItems(java.util.List<SkippedItems> skippedItems) {
                this.skippedItems = skippedItems;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
