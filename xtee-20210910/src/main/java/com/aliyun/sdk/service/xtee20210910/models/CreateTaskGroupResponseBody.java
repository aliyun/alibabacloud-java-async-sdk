// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CreateTaskGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTaskGroupResponseBody</p>
 */
public class CreateTaskGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private CreateTaskGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskGroupResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(CreateTaskGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
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
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CreateTaskGroupResponseBody build() {
            return new CreateTaskGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTaskGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTaskGroupResponseBody</p>
     */
    public static class SubTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checker")
        private String checker;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileRows")
        private String fileRows;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IsCharge")
        private String isCharge;

        @com.aliyun.core.annotation.NameInMap("ModelScene")
        private String modelScene;

        @com.aliyun.core.annotation.NameInMap("SampleId")
        private String sampleId;

        @com.aliyun.core.annotation.NameInMap("SampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SubTaskId")
        private Long subTaskId;

        @com.aliyun.core.annotation.NameInMap("Tab")
        private String tab;

        @com.aliyun.core.annotation.NameInMap("TaskGroupId")
        private String taskGroupId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private SubTaskList(Builder builder) {
            this.checker = builder.checker;
            this.fileName = builder.fileName;
            this.fileRows = builder.fileRows;
            this.finishTime = builder.finishTime;
            this.groupName = builder.groupName;
            this.isCharge = builder.isCharge;
            this.modelScene = builder.modelScene;
            this.sampleId = builder.sampleId;
            this.sampleName = builder.sampleName;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.subTaskId = builder.subTaskId;
            this.tab = builder.tab;
            this.taskGroupId = builder.taskGroupId;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTaskList create() {
            return builder().build();
        }

        /**
         * @return checker
         */
        public String getChecker() {
            return this.checker;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileRows
         */
        public String getFileRows() {
            return this.fileRows;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return isCharge
         */
        public String getIsCharge() {
            return this.isCharge;
        }

        /**
         * @return modelScene
         */
        public String getModelScene() {
            return this.modelScene;
        }

        /**
         * @return sampleId
         */
        public String getSampleId() {
            return this.sampleId;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return subTaskId
         */
        public Long getSubTaskId() {
            return this.subTaskId;
        }

        /**
         * @return tab
         */
        public String getTab() {
            return this.tab;
        }

        /**
         * @return taskGroupId
         */
        public String getTaskGroupId() {
            return this.taskGroupId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String checker; 
            private String fileName; 
            private String fileRows; 
            private String finishTime; 
            private String groupName; 
            private String isCharge; 
            private String modelScene; 
            private String sampleId; 
            private String sampleName; 
            private String serviceCode; 
            private String serviceName; 
            private Long subTaskId; 
            private String tab; 
            private String taskGroupId; 
            private String taskName; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(SubTaskList model) {
                this.checker = model.checker;
                this.fileName = model.fileName;
                this.fileRows = model.fileRows;
                this.finishTime = model.finishTime;
                this.groupName = model.groupName;
                this.isCharge = model.isCharge;
                this.modelScene = model.modelScene;
                this.sampleId = model.sampleId;
                this.sampleName = model.sampleName;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.subTaskId = model.subTaskId;
                this.tab = model.tab;
                this.taskGroupId = model.taskGroupId;
                this.taskName = model.taskName;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * Checker.
             */
            public Builder checker(String checker) {
                this.checker = checker;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileRows.
             */
            public Builder fileRows(String fileRows) {
                this.fileRows = fileRows;
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
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IsCharge.
             */
            public Builder isCharge(String isCharge) {
                this.isCharge = isCharge;
                return this;
            }

            /**
             * ModelScene.
             */
            public Builder modelScene(String modelScene) {
                this.modelScene = modelScene;
                return this;
            }

            /**
             * SampleId.
             */
            public Builder sampleId(String sampleId) {
                this.sampleId = sampleId;
                return this;
            }

            /**
             * SampleName.
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SubTaskId.
             */
            public Builder subTaskId(Long subTaskId) {
                this.subTaskId = subTaskId;
                return this;
            }

            /**
             * Tab.
             */
            public Builder tab(String tab) {
                this.tab = tab;
                return this;
            }

            /**
             * TaskGroupId.
             */
            public Builder taskGroupId(String taskGroupId) {
                this.taskGroupId = taskGroupId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public SubTaskList build() {
                return new SubTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTaskGroupResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private Integer creatorUserId;

        @com.aliyun.core.annotation.NameInMap("GroupStatus")
        private String groupStatus;

        @com.aliyun.core.annotation.NameInMap("SampleNames")
        private java.util.List<String> sampleNames;

        @com.aliyun.core.annotation.NameInMap("SubTaskCount")
        private Integer subTaskCount;

        @com.aliyun.core.annotation.NameInMap("SubTaskList")
        private java.util.List<SubTaskList> subTaskList;

        @com.aliyun.core.annotation.NameInMap("Tab")
        private String tab;

        @com.aliyun.core.annotation.NameInMap("TaskGroupId")
        private Integer taskGroupId;

        @com.aliyun.core.annotation.NameInMap("TaskGroupName")
        private String taskGroupName;

        private ResultObject(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorUserId = builder.creatorUserId;
            this.groupStatus = builder.groupStatus;
            this.sampleNames = builder.sampleNames;
            this.subTaskCount = builder.subTaskCount;
            this.subTaskList = builder.subTaskList;
            this.tab = builder.tab;
            this.taskGroupId = builder.taskGroupId;
            this.taskGroupName = builder.taskGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorUserId
         */
        public Integer getCreatorUserId() {
            return this.creatorUserId;
        }

        /**
         * @return groupStatus
         */
        public String getGroupStatus() {
            return this.groupStatus;
        }

        /**
         * @return sampleNames
         */
        public java.util.List<String> getSampleNames() {
            return this.sampleNames;
        }

        /**
         * @return subTaskCount
         */
        public Integer getSubTaskCount() {
            return this.subTaskCount;
        }

        /**
         * @return subTaskList
         */
        public java.util.List<SubTaskList> getSubTaskList() {
            return this.subTaskList;
        }

        /**
         * @return tab
         */
        public String getTab() {
            return this.tab;
        }

        /**
         * @return taskGroupId
         */
        public Integer getTaskGroupId() {
            return this.taskGroupId;
        }

        /**
         * @return taskGroupName
         */
        public String getTaskGroupName() {
            return this.taskGroupName;
        }

        public static final class Builder {
            private Long createTime; 
            private Integer creatorUserId; 
            private String groupStatus; 
            private java.util.List<String> sampleNames; 
            private Integer subTaskCount; 
            private java.util.List<SubTaskList> subTaskList; 
            private String tab; 
            private Integer taskGroupId; 
            private String taskGroupName; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.createTime = model.createTime;
                this.creatorUserId = model.creatorUserId;
                this.groupStatus = model.groupStatus;
                this.sampleNames = model.sampleNames;
                this.subTaskCount = model.subTaskCount;
                this.subTaskList = model.subTaskList;
                this.tab = model.tab;
                this.taskGroupId = model.taskGroupId;
                this.taskGroupName = model.taskGroupName;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorUserId.
             */
            public Builder creatorUserId(Integer creatorUserId) {
                this.creatorUserId = creatorUserId;
                return this;
            }

            /**
             * GroupStatus.
             */
            public Builder groupStatus(String groupStatus) {
                this.groupStatus = groupStatus;
                return this;
            }

            /**
             * SampleNames.
             */
            public Builder sampleNames(java.util.List<String> sampleNames) {
                this.sampleNames = sampleNames;
                return this;
            }

            /**
             * SubTaskCount.
             */
            public Builder subTaskCount(Integer subTaskCount) {
                this.subTaskCount = subTaskCount;
                return this;
            }

            /**
             * SubTaskList.
             */
            public Builder subTaskList(java.util.List<SubTaskList> subTaskList) {
                this.subTaskList = subTaskList;
                return this;
            }

            /**
             * Tab.
             */
            public Builder tab(String tab) {
                this.tab = tab;
                return this;
            }

            /**
             * TaskGroupId.
             */
            public Builder taskGroupId(Integer taskGroupId) {
                this.taskGroupId = taskGroupId;
                return this;
            }

            /**
             * TaskGroupName.
             */
            public Builder taskGroupName(String taskGroupName) {
                this.taskGroupName = taskGroupName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
