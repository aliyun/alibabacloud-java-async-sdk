// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListSampleConsistencyJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSampleConsistencyJobsResponseBody</p>
 */
public class ListSampleConsistencyJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SampleConsistencyJobs")
    private java.util.List<SampleConsistencyJobs> sampleConsistencyJobs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSampleConsistencyJobsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sampleConsistencyJobs = builder.sampleConsistencyJobs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSampleConsistencyJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sampleConsistencyJobs
     */
    public java.util.List<SampleConsistencyJobs> getSampleConsistencyJobs() {
        return this.sampleConsistencyJobs;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SampleConsistencyJobs> sampleConsistencyJobs; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSampleConsistencyJobsResponseBody model) {
            this.requestId = model.requestId;
            this.sampleConsistencyJobs = model.sampleConsistencyJobs;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SampleConsistencyJobs.
         */
        public Builder sampleConsistencyJobs(java.util.List<SampleConsistencyJobs> sampleConsistencyJobs) {
            this.sampleConsistencyJobs = sampleConsistencyJobs;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSampleConsistencyJobsResponseBody build() {
            return new ListSampleConsistencyJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSampleConsistencyJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSampleConsistencyJobsResponseBody</p>
     */
    public static class SampleConsistencyJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("EasModelServiceName")
        private String easModelServiceName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FeatureSaveResourceId")
        private String featureSaveResourceId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ItemIdField")
        private String itemIdField;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private String logs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PartitionField")
        private String partitionField;

        @com.aliyun.core.annotation.NameInMap("PartitionFieldFormat")
        private String partitionFieldFormat;

        @com.aliyun.core.annotation.NameInMap("RequestIdField")
        private String requestIdField;

        @com.aliyun.core.annotation.NameInMap("SampleConsistencyJobId")
        private String sampleConsistencyJobId;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private String sampleRate;

        @com.aliyun.core.annotation.NameInMap("SampleTableName")
        private String sampleTableName;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserIdField")
        private String userIdField;

        private SampleConsistencyJobs(Builder builder) {
            this.config = builder.config;
            this.duration = builder.duration;
            this.easModelServiceName = builder.easModelServiceName;
            this.endTime = builder.endTime;
            this.featureSaveResourceId = builder.featureSaveResourceId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.itemIdField = builder.itemIdField;
            this.logs = builder.logs;
            this.name = builder.name;
            this.partitionField = builder.partitionField;
            this.partitionFieldFormat = builder.partitionFieldFormat;
            this.requestIdField = builder.requestIdField;
            this.sampleConsistencyJobId = builder.sampleConsistencyJobId;
            this.sampleRate = builder.sampleRate;
            this.sampleTableName = builder.sampleTableName;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.userIdField = builder.userIdField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SampleConsistencyJobs create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return easModelServiceName
         */
        public String getEasModelServiceName() {
            return this.easModelServiceName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return featureSaveResourceId
         */
        public String getFeatureSaveResourceId() {
            return this.featureSaveResourceId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return itemIdField
         */
        public String getItemIdField() {
            return this.itemIdField;
        }

        /**
         * @return logs
         */
        public String getLogs() {
            return this.logs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionField
         */
        public String getPartitionField() {
            return this.partitionField;
        }

        /**
         * @return partitionFieldFormat
         */
        public String getPartitionFieldFormat() {
            return this.partitionFieldFormat;
        }

        /**
         * @return requestIdField
         */
        public String getRequestIdField() {
            return this.requestIdField;
        }

        /**
         * @return sampleConsistencyJobId
         */
        public String getSampleConsistencyJobId() {
            return this.sampleConsistencyJobId;
        }

        /**
         * @return sampleRate
         */
        public String getSampleRate() {
            return this.sampleRate;
        }

        /**
         * @return sampleTableName
         */
        public String getSampleTableName() {
            return this.sampleTableName;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userIdField
         */
        public String getUserIdField() {
            return this.userIdField;
        }

        public static final class Builder {
            private String config; 
            private String duration; 
            private String easModelServiceName; 
            private Long endTime; 
            private String featureSaveResourceId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String itemIdField; 
            private String logs; 
            private String name; 
            private String partitionField; 
            private String partitionFieldFormat; 
            private String requestIdField; 
            private String sampleConsistencyJobId; 
            private String sampleRate; 
            private String sampleTableName; 
            private String sceneId; 
            private String sceneName; 
            private Long startTime; 
            private String status; 
            private String userIdField; 

            private Builder() {
            } 

            private Builder(SampleConsistencyJobs model) {
                this.config = model.config;
                this.duration = model.duration;
                this.easModelServiceName = model.easModelServiceName;
                this.endTime = model.endTime;
                this.featureSaveResourceId = model.featureSaveResourceId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.itemIdField = model.itemIdField;
                this.logs = model.logs;
                this.name = model.name;
                this.partitionField = model.partitionField;
                this.partitionFieldFormat = model.partitionFieldFormat;
                this.requestIdField = model.requestIdField;
                this.sampleConsistencyJobId = model.sampleConsistencyJobId;
                this.sampleRate = model.sampleRate;
                this.sampleTableName = model.sampleTableName;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.userIdField = model.userIdField;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EasModelServiceName.
             */
            public Builder easModelServiceName(String easModelServiceName) {
                this.easModelServiceName = easModelServiceName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FeatureSaveResourceId.
             */
            public Builder featureSaveResourceId(String featureSaveResourceId) {
                this.featureSaveResourceId = featureSaveResourceId;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ItemIdField.
             */
            public Builder itemIdField(String itemIdField) {
                this.itemIdField = itemIdField;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(String logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PartitionField.
             */
            public Builder partitionField(String partitionField) {
                this.partitionField = partitionField;
                return this;
            }

            /**
             * PartitionFieldFormat.
             */
            public Builder partitionFieldFormat(String partitionFieldFormat) {
                this.partitionFieldFormat = partitionFieldFormat;
                return this;
            }

            /**
             * RequestIdField.
             */
            public Builder requestIdField(String requestIdField) {
                this.requestIdField = requestIdField;
                return this;
            }

            /**
             * SampleConsistencyJobId.
             */
            public Builder sampleConsistencyJobId(String sampleConsistencyJobId) {
                this.sampleConsistencyJobId = sampleConsistencyJobId;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(String sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * SampleTableName.
             */
            public Builder sampleTableName(String sampleTableName) {
                this.sampleTableName = sampleTableName;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
             * UserIdField.
             */
            public Builder userIdField(String userIdField) {
                this.userIdField = userIdField;
                return this;
            }

            public SampleConsistencyJobs build() {
                return new SampleConsistencyJobs(this);
            } 

        } 

    }
}
