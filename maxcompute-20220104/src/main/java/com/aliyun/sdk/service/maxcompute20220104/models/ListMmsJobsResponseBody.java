// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListMmsJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmsJobsResponseBody</p>
 */
public class ListMmsJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMmsJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsJobsResponseBody create() {
        return builder().build();
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

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMmsJobsResponseBody build() {
            return new ListMmsJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsJobsResponseBody</p>
     */
    public static class ObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("dstDbName")
        private String dstDbName;

        @com.aliyun.core.annotation.NameInMap("dstSchemaName")
        private String dstSchemaName;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("srcDbName")
        private String srcDbName;

        @com.aliyun.core.annotation.NameInMap("srcSchemaName")
        private String srcSchemaName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("stopped")
        private Boolean stopped;

        @com.aliyun.core.annotation.NameInMap("taskDone")
        private Integer taskDone;

        @com.aliyun.core.annotation.NameInMap("taskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ObjectList(Builder builder) {
            this.createTime = builder.createTime;
            this.dbId = builder.dbId;
            this.dstDbName = builder.dstDbName;
            this.dstSchemaName = builder.dstSchemaName;
            this.id = builder.id;
            this.name = builder.name;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.srcDbName = builder.srcDbName;
            this.srcSchemaName = builder.srcSchemaName;
            this.status = builder.status;
            this.stopped = builder.stopped;
            this.taskDone = builder.taskDone;
            this.taskNum = builder.taskNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dstDbName
         */
        public String getDstDbName() {
            return this.dstDbName;
        }

        /**
         * @return dstSchemaName
         */
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return srcDbName
         */
        public String getSrcDbName() {
            return this.srcDbName;
        }

        /**
         * @return srcSchemaName
         */
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopped
         */
        public Boolean getStopped() {
            return this.stopped;
        }

        /**
         * @return taskDone
         */
        public Integer getTaskDone() {
            return this.taskDone;
        }

        /**
         * @return taskNum
         */
        public Integer getTaskNum() {
            return this.taskNum;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private Long dbId; 
            private String dstDbName; 
            private String dstSchemaName; 
            private Long id; 
            private String name; 
            private Long sourceId; 
            private String sourceName; 
            private String srcDbName; 
            private String srcSchemaName; 
            private String status; 
            private Boolean stopped; 
            private Integer taskDone; 
            private Integer taskNum; 
            private String type; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * dstDbName.
             */
            public Builder dstDbName(String dstDbName) {
                this.dstDbName = dstDbName;
                return this;
            }

            /**
             * dstSchemaName.
             */
            public Builder dstSchemaName(String dstSchemaName) {
                this.dstSchemaName = dstSchemaName;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * sourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * srcDbName.
             */
            public Builder srcDbName(String srcDbName) {
                this.srcDbName = srcDbName;
                return this;
            }

            /**
             * srcSchemaName.
             */
            public Builder srcSchemaName(String srcSchemaName) {
                this.srcSchemaName = srcSchemaName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * stopped.
             */
            public Builder stopped(Boolean stopped) {
                this.stopped = stopped;
                return this;
            }

            /**
             * taskDone.
             */
            public Builder taskDone(Integer taskDone) {
                this.taskDone = taskDone;
                return this;
            }

            /**
             * taskNum.
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ObjectList build() {
                return new ObjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("objectList")
        private java.util.List<ObjectList> objectList;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.objectList = builder.objectList;
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
         * @return objectList
         */
        public java.util.List<ObjectList> getObjectList() {
            return this.objectList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ObjectList> objectList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * objectList.
             */
            public Builder objectList(java.util.List<ObjectList> objectList) {
                this.objectList = objectList;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
