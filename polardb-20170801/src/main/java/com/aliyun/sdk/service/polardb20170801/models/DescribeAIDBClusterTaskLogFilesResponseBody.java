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
 * {@link DescribeAIDBClusterTaskLogFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterTaskLogFilesResponseBody</p>
 */
public class DescribeAIDBClusterTaskLogFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeAIDBClusterTaskLogFilesResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterTaskLogFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private Items items; 
        private Long pageNumber; 
        private Integer pageRecordCount; 
        private Long pageSize; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterTaskLogFilesResponseBody model) {
            this.endTime = model.endTime;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7E2FE3BB-C677-5FF9-9FC5-9CF364BD6BE5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeAIDBClusterTaskLogFilesResponseBody build() {
            return new DescribeAIDBClusterTaskLogFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterTaskLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTaskLogFilesResponseBody</p>
     */
    public static class SlsLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogTime")
        private String logTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private SlsLogItems(Builder builder) {
            this.logTime = builder.logTime;
            this.message = builder.message;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsLogItems create() {
            return builder().build();
        }

        /**
         * @return logTime
         */
        public String getLogTime() {
            return this.logTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String logTime; 
            private String message; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(SlsLogItems model) {
                this.logTime = model.logTime;
                this.message = model.message;
                this.timestamp = model.timestamp;
            } 

            /**
             * LogTime.
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
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
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public SlsLogItems build() {
                return new SlsLogItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterTaskLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTaskLogFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlsLogItems")
        private java.util.List<SlsLogItems> slsLogItems;

        private Items(Builder builder) {
            this.slsLogItems = builder.slsLogItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return slsLogItems
         */
        public java.util.List<SlsLogItems> getSlsLogItems() {
            return this.slsLogItems;
        }

        public static final class Builder {
            private java.util.List<SlsLogItems> slsLogItems; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.slsLogItems = model.slsLogItems;
            } 

            /**
             * SlsLogItems.
             */
            public Builder slsLogItems(java.util.List<SlsLogItems> slsLogItems) {
                this.slsLogItems = slsLogItems;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
