// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link ListHiveTableLineagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHiveTableLineagesResponseBody</p>
 */
public class ListHiveTableLineagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHiveTableLineagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHiveTableLineagesResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 

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

        public ListHiveTableLineagesResponseBody build() {
            return new ListHiveTableLineagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHiveTableLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHiveTableLineagesResponseBody</p>
     */
    public static class DownstreamLineages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("QueryText")
        private String queryText;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private DownstreamLineages(Builder builder) {
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.databaseName = builder.databaseName;
            this.engine = builder.engine;
            this.jobId = builder.jobId;
            this.modifiedTime = builder.modifiedTime;
            this.queryText = builder.queryText;
            this.source = builder.source;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownstreamLineages create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return queryText
         */
        public String getQueryText() {
            return this.queryText;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String clusterId; 
            private String createTime; 
            private String databaseName; 
            private String engine; 
            private String jobId; 
            private String modifiedTime; 
            private String queryText; 
            private String source; 
            private String tableName; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * QueryText.
             */
            public Builder queryText(String queryText) {
                this.queryText = queryText;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public DownstreamLineages build() {
                return new DownstreamLineages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHiveTableLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHiveTableLineagesResponseBody</p>
     */
    public static class UpstreamLineages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("QueryText")
        private String queryText;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private UpstreamLineages(Builder builder) {
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.databaseName = builder.databaseName;
            this.engine = builder.engine;
            this.jobId = builder.jobId;
            this.modifiedTime = builder.modifiedTime;
            this.queryText = builder.queryText;
            this.source = builder.source;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpstreamLineages create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return queryText
         */
        public String getQueryText() {
            return this.queryText;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String clusterId; 
            private String createTime; 
            private String databaseName; 
            private String engine; 
            private String jobId; 
            private String modifiedTime; 
            private String queryText; 
            private String source; 
            private String tableName; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * QueryText.
             */
            public Builder queryText(String queryText) {
                this.queryText = queryText;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public UpstreamLineages build() {
                return new UpstreamLineages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHiveTableLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHiveTableLineagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownstreamLineages")
        private java.util.List<DownstreamLineages> downstreamLineages;

        @com.aliyun.core.annotation.NameInMap("DownstreamNumber")
        private Integer downstreamNumber;

        @com.aliyun.core.annotation.NameInMap("UpstreamLineages")
        private java.util.List<UpstreamLineages> upstreamLineages;

        @com.aliyun.core.annotation.NameInMap("UpstreamNumber")
        private Integer upstreamNumber;

        private Data(Builder builder) {
            this.downstreamLineages = builder.downstreamLineages;
            this.downstreamNumber = builder.downstreamNumber;
            this.upstreamLineages = builder.upstreamLineages;
            this.upstreamNumber = builder.upstreamNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return downstreamLineages
         */
        public java.util.List<DownstreamLineages> getDownstreamLineages() {
            return this.downstreamLineages;
        }

        /**
         * @return downstreamNumber
         */
        public Integer getDownstreamNumber() {
            return this.downstreamNumber;
        }

        /**
         * @return upstreamLineages
         */
        public java.util.List<UpstreamLineages> getUpstreamLineages() {
            return this.upstreamLineages;
        }

        /**
         * @return upstreamNumber
         */
        public Integer getUpstreamNumber() {
            return this.upstreamNumber;
        }

        public static final class Builder {
            private java.util.List<DownstreamLineages> downstreamLineages; 
            private Integer downstreamNumber; 
            private java.util.List<UpstreamLineages> upstreamLineages; 
            private Integer upstreamNumber; 

            /**
             * DownstreamLineages.
             */
            public Builder downstreamLineages(java.util.List<DownstreamLineages> downstreamLineages) {
                this.downstreamLineages = downstreamLineages;
                return this;
            }

            /**
             * DownstreamNumber.
             */
            public Builder downstreamNumber(Integer downstreamNumber) {
                this.downstreamNumber = downstreamNumber;
                return this;
            }

            /**
             * UpstreamLineages.
             */
            public Builder upstreamLineages(java.util.List<UpstreamLineages> upstreamLineages) {
                this.upstreamLineages = upstreamLineages;
                return this;
            }

            /**
             * UpstreamNumber.
             */
            public Builder upstreamNumber(Integer upstreamNumber) {
                this.upstreamNumber = upstreamNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
