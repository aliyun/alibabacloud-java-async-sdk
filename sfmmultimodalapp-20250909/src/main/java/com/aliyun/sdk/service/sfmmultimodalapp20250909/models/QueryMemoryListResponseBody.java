// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link QueryMemoryListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMemoryListResponseBody</p>
 */
public class QueryMemoryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMemoryListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMemoryListResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryMemoryListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public QueryMemoryListResponseBody build() {
            return new QueryMemoryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMemoryListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMemoryListResponseBody</p>
     */
    public static class MemoryNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("MemoryNodeId")
        private String memoryNodeId;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private java.util.Map<String, ?> metaData;

        @com.aliyun.core.annotation.NameInMap("MetaDataJson")
        private String metaDataJson;

        @com.aliyun.core.annotation.NameInMap("OldContent")
        private String oldContent;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private MemoryNodes(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.event = builder.event;
            this.memoryNodeId = builder.memoryNodeId;
            this.metaData = builder.metaData;
            this.metaDataJson = builder.metaDataJson;
            this.oldContent = builder.oldContent;
            this.projectId = builder.projectId;
            this.timestamp = builder.timestamp;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryNodes create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return memoryNodeId
         */
        public String getMemoryNodeId() {
            return this.memoryNodeId;
        }

        /**
         * @return metaData
         */
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        /**
         * @return metaDataJson
         */
        public String getMetaDataJson() {
            return this.metaDataJson;
        }

        /**
         * @return oldContent
         */
        public String getOldContent() {
            return this.oldContent;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String content; 
            private Long createTime; 
            private String event; 
            private String memoryNodeId; 
            private java.util.Map<String, ?> metaData; 
            private String metaDataJson; 
            private String oldContent; 
            private String projectId; 
            private Long timestamp; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(MemoryNodes model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.event = model.event;
                this.memoryNodeId = model.memoryNodeId;
                this.metaData = model.metaData;
                this.metaDataJson = model.metaDataJson;
                this.oldContent = model.oldContent;
                this.projectId = model.projectId;
                this.timestamp = model.timestamp;
                this.updateTime = model.updateTime;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * MemoryNodeId.
             */
            public Builder memoryNodeId(String memoryNodeId) {
                this.memoryNodeId = memoryNodeId;
                return this;
            }

            /**
             * MetaData.
             */
            public Builder metaData(java.util.Map<String, ?> metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * MetaDataJson.
             */
            public Builder metaDataJson(String metaDataJson) {
                this.metaDataJson = metaDataJson;
                return this;
            }

            /**
             * OldContent.
             */
            public Builder oldContent(String oldContent) {
                this.oldContent = oldContent;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public MemoryNodes build() {
                return new MemoryNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMemoryListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMemoryListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemoryNodes")
        private java.util.List<MemoryNodes> memoryNodes;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private String pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private Data(Builder builder) {
            this.memoryNodes = builder.memoryNodes;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return memoryNodes
         */
        public java.util.List<MemoryNodes> getMemoryNodes() {
            return this.memoryNodes;
        }

        /**
         * @return pageNum
         */
        public String getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<MemoryNodes> memoryNodes; 
            private String pageNum; 
            private String pageSize; 
            private String total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.memoryNodes = model.memoryNodes;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * MemoryNodes.
             */
            public Builder memoryNodes(java.util.List<MemoryNodes> memoryNodes) {
                this.memoryNodes = memoryNodes;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(String pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
