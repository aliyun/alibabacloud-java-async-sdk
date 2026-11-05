// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationSessionLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationSessionLogsResponseBody</p>
 */
public class DescribeApplicationSessionLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Long pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeApplicationSessionLogsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationSessionLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String applicationId; 
        private Items items; 
        private Long pageNumber; 
        private Long pageRecordCount; 
        private String requestId; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeApplicationSessionLogsResponseBody model) {
            this.applicationId = model.applicationId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Long pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeApplicationSessionLogsResponseBody build() {
            return new DescribeApplicationSessionLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationSessionLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationSessionLogsResponseBody</p>
     */
    public static class ItemsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private String agent;

        @com.aliyun.core.annotation.NameInMap("Api")
        private String api;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DetailDurationMs")
        private Long detailDurationMs;

        @com.aliyun.core.annotation.NameInMap("DetailIsError")
        private Boolean detailIsError;

        @com.aliyun.core.annotation.NameInMap("DetailStatus")
        private String detailStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StopReason")
        private String stopReason;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Thinking")
        private String thinking;

        @com.aliyun.core.annotation.NameInMap("ThinkingSignature")
        private String thinkingSignature;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UsageCacheRead")
        private Long usageCacheRead;

        @com.aliyun.core.annotation.NameInMap("UsageCacheWrite")
        private Long usageCacheWrite;

        @com.aliyun.core.annotation.NameInMap("UsageCostCacheRead")
        private Long usageCostCacheRead;

        @com.aliyun.core.annotation.NameInMap("UsageCostCacheWrite")
        private Long usageCostCacheWrite;

        @com.aliyun.core.annotation.NameInMap("UsageCostInput")
        private Long usageCostInput;

        @com.aliyun.core.annotation.NameInMap("UsageCostOutput")
        private Long usageCostOutput;

        @com.aliyun.core.annotation.NameInMap("UsageCostTotal")
        private Long usageCostTotal;

        @com.aliyun.core.annotation.NameInMap("UsageInput")
        private Long usageInput;

        @com.aliyun.core.annotation.NameInMap("UsageOutput")
        private Long usageOutput;

        @com.aliyun.core.annotation.NameInMap("UsageTotalTokens")
        private Long usageTotalTokens;

        private ItemsItems(Builder builder) {
            this.agent = builder.agent;
            this.api = builder.api;
            this.content = builder.content;
            this.detailDurationMs = builder.detailDurationMs;
            this.detailIsError = builder.detailIsError;
            this.detailStatus = builder.detailStatus;
            this.id = builder.id;
            this.model = builder.model;
            this.parentId = builder.parentId;
            this.provider = builder.provider;
            this.role = builder.role;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.stopReason = builder.stopReason;
            this.text = builder.text;
            this.thinking = builder.thinking;
            this.thinkingSignature = builder.thinkingSignature;
            this.time = builder.time;
            this.timestamp = builder.timestamp;
            this.toolName = builder.toolName;
            this.totalTokens = builder.totalTokens;
            this.type = builder.type;
            this.usageCacheRead = builder.usageCacheRead;
            this.usageCacheWrite = builder.usageCacheWrite;
            this.usageCostCacheRead = builder.usageCostCacheRead;
            this.usageCostCacheWrite = builder.usageCostCacheWrite;
            this.usageCostInput = builder.usageCostInput;
            this.usageCostOutput = builder.usageCostOutput;
            this.usageCostTotal = builder.usageCostTotal;
            this.usageInput = builder.usageInput;
            this.usageOutput = builder.usageOutput;
            this.usageTotalTokens = builder.usageTotalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsItems create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public String getAgent() {
            return this.agent;
        }

        /**
         * @return api
         */
        public String getApi() {
            return this.api;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return detailDurationMs
         */
        public Long getDetailDurationMs() {
            return this.detailDurationMs;
        }

        /**
         * @return detailIsError
         */
        public Boolean getDetailIsError() {
            return this.detailIsError;
        }

        /**
         * @return detailStatus
         */
        public String getDetailStatus() {
            return this.detailStatus;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopReason
         */
        public String getStopReason() {
            return this.stopReason;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return thinking
         */
        public String getThinking() {
            return this.thinking;
        }

        /**
         * @return thinkingSignature
         */
        public String getThinkingSignature() {
            return this.thinkingSignature;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usageCacheRead
         */
        public Long getUsageCacheRead() {
            return this.usageCacheRead;
        }

        /**
         * @return usageCacheWrite
         */
        public Long getUsageCacheWrite() {
            return this.usageCacheWrite;
        }

        /**
         * @return usageCostCacheRead
         */
        public Long getUsageCostCacheRead() {
            return this.usageCostCacheRead;
        }

        /**
         * @return usageCostCacheWrite
         */
        public Long getUsageCostCacheWrite() {
            return this.usageCostCacheWrite;
        }

        /**
         * @return usageCostInput
         */
        public Long getUsageCostInput() {
            return this.usageCostInput;
        }

        /**
         * @return usageCostOutput
         */
        public Long getUsageCostOutput() {
            return this.usageCostOutput;
        }

        /**
         * @return usageCostTotal
         */
        public Long getUsageCostTotal() {
            return this.usageCostTotal;
        }

        /**
         * @return usageInput
         */
        public Long getUsageInput() {
            return this.usageInput;
        }

        /**
         * @return usageOutput
         */
        public Long getUsageOutput() {
            return this.usageOutput;
        }

        /**
         * @return usageTotalTokens
         */
        public Long getUsageTotalTokens() {
            return this.usageTotalTokens;
        }

        public static final class Builder {
            private String agent; 
            private String api; 
            private String content; 
            private Long detailDurationMs; 
            private Boolean detailIsError; 
            private String detailStatus; 
            private String id; 
            private String model; 
            private String parentId; 
            private String provider; 
            private String role; 
            private String sessionId; 
            private String status; 
            private String stopReason; 
            private String text; 
            private String thinking; 
            private String thinkingSignature; 
            private String time; 
            private String timestamp; 
            private String toolName; 
            private Long totalTokens; 
            private String type; 
            private Long usageCacheRead; 
            private Long usageCacheWrite; 
            private Long usageCostCacheRead; 
            private Long usageCostCacheWrite; 
            private Long usageCostInput; 
            private Long usageCostOutput; 
            private Long usageCostTotal; 
            private Long usageInput; 
            private Long usageOutput; 
            private Long usageTotalTokens; 

            private Builder() {
            } 

            private Builder(ItemsItems model) {
                this.agent = model.agent;
                this.api = model.api;
                this.content = model.content;
                this.detailDurationMs = model.detailDurationMs;
                this.detailIsError = model.detailIsError;
                this.detailStatus = model.detailStatus;
                this.id = model.id;
                this.model = model.model;
                this.parentId = model.parentId;
                this.provider = model.provider;
                this.role = model.role;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.stopReason = model.stopReason;
                this.text = model.text;
                this.thinking = model.thinking;
                this.thinkingSignature = model.thinkingSignature;
                this.time = model.time;
                this.timestamp = model.timestamp;
                this.toolName = model.toolName;
                this.totalTokens = model.totalTokens;
                this.type = model.type;
                this.usageCacheRead = model.usageCacheRead;
                this.usageCacheWrite = model.usageCacheWrite;
                this.usageCostCacheRead = model.usageCostCacheRead;
                this.usageCostCacheWrite = model.usageCostCacheWrite;
                this.usageCostInput = model.usageCostInput;
                this.usageCostOutput = model.usageCostOutput;
                this.usageCostTotal = model.usageCostTotal;
                this.usageInput = model.usageInput;
                this.usageOutput = model.usageOutput;
                this.usageTotalTokens = model.usageTotalTokens;
            } 

            /**
             * Agent.
             */
            public Builder agent(String agent) {
                this.agent = agent;
                return this;
            }

            /**
             * Api.
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DetailDurationMs.
             */
            public Builder detailDurationMs(Long detailDurationMs) {
                this.detailDurationMs = detailDurationMs;
                return this;
            }

            /**
             * DetailIsError.
             */
            public Builder detailIsError(Boolean detailIsError) {
                this.detailIsError = detailIsError;
                return this;
            }

            /**
             * DetailStatus.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
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
             * StopReason.
             */
            public Builder stopReason(String stopReason) {
                this.stopReason = stopReason;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Thinking.
             */
            public Builder thinking(String thinking) {
                this.thinking = thinking;
                return this;
            }

            /**
             * ThinkingSignature.
             */
            public Builder thinkingSignature(String thinkingSignature) {
                this.thinkingSignature = thinkingSignature;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * ToolName.
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UsageCacheRead.
             */
            public Builder usageCacheRead(Long usageCacheRead) {
                this.usageCacheRead = usageCacheRead;
                return this;
            }

            /**
             * UsageCacheWrite.
             */
            public Builder usageCacheWrite(Long usageCacheWrite) {
                this.usageCacheWrite = usageCacheWrite;
                return this;
            }

            /**
             * UsageCostCacheRead.
             */
            public Builder usageCostCacheRead(Long usageCostCacheRead) {
                this.usageCostCacheRead = usageCostCacheRead;
                return this;
            }

            /**
             * UsageCostCacheWrite.
             */
            public Builder usageCostCacheWrite(Long usageCostCacheWrite) {
                this.usageCostCacheWrite = usageCostCacheWrite;
                return this;
            }

            /**
             * UsageCostInput.
             */
            public Builder usageCostInput(Long usageCostInput) {
                this.usageCostInput = usageCostInput;
                return this;
            }

            /**
             * UsageCostOutput.
             */
            public Builder usageCostOutput(Long usageCostOutput) {
                this.usageCostOutput = usageCostOutput;
                return this;
            }

            /**
             * UsageCostTotal.
             */
            public Builder usageCostTotal(Long usageCostTotal) {
                this.usageCostTotal = usageCostTotal;
                return this;
            }

            /**
             * UsageInput.
             */
            public Builder usageInput(Long usageInput) {
                this.usageInput = usageInput;
                return this;
            }

            /**
             * UsageOutput.
             */
            public Builder usageOutput(Long usageOutput) {
                this.usageOutput = usageOutput;
                return this;
            }

            /**
             * UsageTotalTokens.
             */
            public Builder usageTotalTokens(Long usageTotalTokens) {
                this.usageTotalTokens = usageTotalTokens;
                return this;
            }

            public ItemsItems build() {
                return new ItemsItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationSessionLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationSessionLogsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<ItemsItems> items;

        private Items(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<ItemsItems> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<ItemsItems> items; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.items = model.items;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<ItemsItems> items) {
                this.items = items;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
