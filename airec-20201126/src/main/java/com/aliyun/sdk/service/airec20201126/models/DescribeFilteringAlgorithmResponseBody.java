// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFilteringAlgorithmResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFilteringAlgorithmResponseBody</p>
 */
public class DescribeFilteringAlgorithmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeFilteringAlgorithmResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilteringAlgorithmResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>The metadata of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>7585C2B2-0D61-4C96-AC5D-B960BFEDD4A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeFilteringAlgorithmResponseBody build() {
            return new DescribeFilteringAlgorithmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilteringAlgorithmResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilteringAlgorithmResponseBody</p>
     */
    public static class ExtInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("itemSeparator")
        private String itemSeparator;

        @com.aliyun.core.annotation.NameInMap("kvSeparator")
        private String kvSeparator;

        private ExtInfo(Builder builder) {
            this.itemSeparator = builder.itemSeparator;
            this.kvSeparator = builder.kvSeparator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtInfo create() {
            return builder().build();
        }

        /**
         * @return itemSeparator
         */
        public String getItemSeparator() {
            return this.itemSeparator;
        }

        /**
         * @return kvSeparator
         */
        public String getKvSeparator() {
            return this.kvSeparator;
        }

        public static final class Builder {
            private String itemSeparator; 
            private String kvSeparator; 

            /**
             * <p>The description of the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>,</p>
             */
            public Builder itemSeparator(String itemSeparator) {
                this.itemSeparator = itemSeparator;
                return this;
            }

            /**
             * <p>The fluctuation threshold for the size of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>:</p>
             */
            public Builder kvSeparator(String kvSeparator) {
                this.kvSeparator = kvSeparator;
                return this;
            }

            public ExtInfo build() {
                return new ExtInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFilteringAlgorithmResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilteringAlgorithmResponseBody</p>
     */
    public static class Threshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexLossThreshold")
        private Integer indexLossThreshold;

        @com.aliyun.core.annotation.NameInMap("indexSizeThreshold")
        private Integer indexSizeThreshold;

        @com.aliyun.core.annotation.NameInMap("sourceDataRecordThreshold")
        private Integer sourceDataRecordThreshold;

        @com.aliyun.core.annotation.NameInMap("sourceDataSizeThreshold")
        private Integer sourceDataSizeThreshold;

        private Threshold(Builder builder) {
            this.indexLossThreshold = builder.indexLossThreshold;
            this.indexSizeThreshold = builder.indexSizeThreshold;
            this.sourceDataRecordThreshold = builder.sourceDataRecordThreshold;
            this.sourceDataSizeThreshold = builder.sourceDataSizeThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Threshold create() {
            return builder().build();
        }

        /**
         * @return indexLossThreshold
         */
        public Integer getIndexLossThreshold() {
            return this.indexLossThreshold;
        }

        /**
         * @return indexSizeThreshold
         */
        public Integer getIndexSizeThreshold() {
            return this.indexSizeThreshold;
        }

        /**
         * @return sourceDataRecordThreshold
         */
        public Integer getSourceDataRecordThreshold() {
            return this.sourceDataRecordThreshold;
        }

        /**
         * @return sourceDataSizeThreshold
         */
        public Integer getSourceDataSizeThreshold() {
            return this.sourceDataSizeThreshold;
        }

        public static final class Builder {
            private Integer indexLossThreshold; 
            private Integer indexSizeThreshold; 
            private Integer sourceDataRecordThreshold; 
            private Integer sourceDataSizeThreshold; 

            /**
             * <p>The ID of the specified instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder indexLossThreshold(Integer indexLossThreshold) {
                this.indexLossThreshold = indexLossThreshold;
                return this;
            }

            /**
             * <p>Queries specific configuration information about a filtering table based on the ID of the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder indexSizeThreshold(Integer indexSizeThreshold) {
                this.indexSizeThreshold = indexSizeThreshold;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceDataRecordThreshold(Integer sourceDataRecordThreshold) {
                this.sourceDataRecordThreshold = sourceDataRecordThreshold;
                return this;
            }

            /**
             * <p>The name of the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceDataSizeThreshold(Integer sourceDataSizeThreshold) {
                this.sourceDataSizeThreshold = sourceDataSizeThreshold;
                return this;
            }

            public Threshold build() {
                return new Threshold(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFilteringAlgorithmResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilteringAlgorithmResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithmName")
        private String algorithmName;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("cronEnabled")
        private Boolean cronEnabled;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("extInfo")
        private ExtInfo extInfo;

        @com.aliyun.core.annotation.NameInMap("metaType")
        private String metaType;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Threshold threshold;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Meta(Builder builder) {
            this.algorithmName = builder.algorithmName;
            this.category = builder.category;
            this.clusterId = builder.clusterId;
            this.cron = builder.cron;
            this.cronEnabled = builder.cronEnabled;
            this.description = builder.description;
            this.extInfo = builder.extInfo;
            this.metaType = builder.metaType;
            this.projectName = builder.projectName;
            this.tableName = builder.tableName;
            this.taskId = builder.taskId;
            this.threshold = builder.threshold;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return algorithmName
         */
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return cronEnabled
         */
        public Boolean getCronEnabled() {
            return this.cronEnabled;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extInfo
         */
        public ExtInfo getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return metaType
         */
        public String getMetaType() {
            return this.metaType;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return threshold
         */
        public Threshold getThreshold() {
            return this.threshold;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String algorithmName; 
            private String category; 
            private String clusterId; 
            private String cron; 
            private Boolean cronEnabled; 
            private String description; 
            private ExtInfo extInfo; 
            private String metaType; 
            private String projectName; 
            private String tableName; 
            private String taskId; 
            private Threshold threshold; 
            private String type; 

            /**
             * <p>The time when the filtering table was created.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * <p>Indicates whether the scheduled task is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1_2</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>N/A</p>
             * 
             * <strong>example:</strong>
             * <p>244</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The information about the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li><ul>
             * <li>24 7 0</li>
             * </ul>
             * </li>
             * </ul>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The ID of the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder cronEnabled(Boolean cronEnabled) {
                this.cronEnabled = cronEnabled;
                return this;
            }

            /**
             * <p>The time when the filtering table was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             */
            public Builder extInfo(ExtInfo extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>The information about the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>metaType</p>
             */
            public Builder metaType(String metaType) {
                this.metaType = metaType;
                return this;
            }

            /**
             * <p>The status of the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The ID of the specified filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The CRON expression of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>taskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The ID of the filtering table.</p>
             */
            public Builder threshold(Threshold threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The metadata of the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFilteringAlgorithmResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilteringAlgorithmResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithmId")
        private String algorithmId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.algorithmId = builder.algorithmId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.meta = builder.meta;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return algorithmId
         */
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String algorithmId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Meta meta; 
            private String status; 

            /**
             * <p>The fluctuation threshold for the size of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder algorithmId(String algorithmId) {
                this.algorithmId = algorithmId;
                return this;
            }

            /**
             * <p>The category of the filtering table.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-07T02:24:26.000Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-07T02:24:26.000Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The time when the filtering table was modified.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>N/A</p>
             * 
             * <strong>example:</strong>
             * <p>The threshold for the loss of the index data.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
