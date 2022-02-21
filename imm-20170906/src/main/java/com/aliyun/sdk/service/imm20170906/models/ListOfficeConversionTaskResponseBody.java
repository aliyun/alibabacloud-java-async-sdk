// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOfficeConversionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListOfficeConversionTaskResponseBody</p>
 */
public class ListOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    private ListOfficeConversionTaskResponseBody(Builder builder) {
        this.nextMarker = builder.nextMarker;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfficeConversionTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String nextMarker; 
        private String requestId; 
        private java.util.List < Tasks> tasks; 

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
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
         * Tasks.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListOfficeConversionTaskResponseBody build() {
            return new ListOfficeConversionTaskResponseBody(this);
        } 

    } 

    public static class Tasks extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExternalID")
        private String externalID;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("ImageSpec")
        private String imageSpec;

        @NameInMap("NotifyEndpoint")
        private String notifyEndpoint;

        @NameInMap("NotifyTopicName")
        private String notifyTopicName;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("Percent")
        private Integer percent;

        @NameInMap("SrcUri")
        private String srcUri;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TgtType")
        private String tgtType;

        @NameInMap("TgtUri")
        private String tgtUri;

        private Tasks(Builder builder) {
            this.createTime = builder.createTime;
            this.externalID = builder.externalID;
            this.finishTime = builder.finishTime;
            this.imageSpec = builder.imageSpec;
            this.notifyEndpoint = builder.notifyEndpoint;
            this.notifyTopicName = builder.notifyTopicName;
            this.pageCount = builder.pageCount;
            this.percent = builder.percent;
            this.srcUri = builder.srcUri;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.tgtType = builder.tgtType;
            this.tgtUri = builder.tgtUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return externalID
         */
        public String getExternalID() {
            return this.externalID;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return imageSpec
         */
        public String getImageSpec() {
            return this.imageSpec;
        }

        /**
         * @return notifyEndpoint
         */
        public String getNotifyEndpoint() {
            return this.notifyEndpoint;
        }

        /**
         * @return notifyTopicName
         */
        public String getNotifyTopicName() {
            return this.notifyTopicName;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return srcUri
         */
        public String getSrcUri() {
            return this.srcUri;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tgtType
         */
        public String getTgtType() {
            return this.tgtType;
        }

        /**
         * @return tgtUri
         */
        public String getTgtUri() {
            return this.tgtUri;
        }

        public static final class Builder {
            private String createTime; 
            private String externalID; 
            private String finishTime; 
            private String imageSpec; 
            private String notifyEndpoint; 
            private String notifyTopicName; 
            private Integer pageCount; 
            private Integer percent; 
            private String srcUri; 
            private String status; 
            private String taskId; 
            private String tgtType; 
            private String tgtUri; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExternalID.
             */
            public Builder externalID(String externalID) {
                this.externalID = externalID;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * ImageSpec.
             */
            public Builder imageSpec(String imageSpec) {
                this.imageSpec = imageSpec;
                return this;
            }

            /**
             * NotifyEndpoint.
             */
            public Builder notifyEndpoint(String notifyEndpoint) {
                this.notifyEndpoint = notifyEndpoint;
                return this;
            }

            /**
             * NotifyTopicName.
             */
            public Builder notifyTopicName(String notifyTopicName) {
                this.notifyTopicName = notifyTopicName;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * SrcUri.
             */
            public Builder srcUri(String srcUri) {
                this.srcUri = srcUri;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TgtType.
             */
            public Builder tgtType(String tgtType) {
                this.tgtType = tgtType;
                return this;
            }

            /**
             * TgtUri.
             */
            public Builder tgtUri(String tgtUri) {
                this.tgtUri = tgtUri;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
