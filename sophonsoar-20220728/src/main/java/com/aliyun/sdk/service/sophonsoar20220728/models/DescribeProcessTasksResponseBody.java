// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessTasksResponseBody</p>
 */
public class DescribeProcessTasksResponseBody extends TeaModel {
    @NameInMap("Page")
    private Page page;

    @NameInMap("ProcessTasks")
    private java.util.List < ProcessTasks> processTasks;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeProcessTasksResponseBody(Builder builder) {
        this.page = builder.page;
        this.processTasks = builder.processTasks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return processTasks
     */
    public java.util.List < ProcessTasks> getProcessTasks() {
        return this.processTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Page page; 
        private java.util.List < ProcessTasks> processTasks; 
        private String requestId; 

        /**
         * The pagination information.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * The handling tasks.
         */
        public Builder processTasks(java.util.List < ProcessTasks> processTasks) {
            this.processTasks = processTasks;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessTasksResponseBody build() {
            return new DescribeProcessTasksResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class ProcessTasks extends TeaModel {
        @NameInMap("Creator")
        private String creator;

        @NameInMap("EntityName")
        private String entityName;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("GmtCreateMillis")
        private Long gmtCreateMillis;

        @NameInMap("GmtModifiedMillis")
        private Long gmtModifiedMillis;

        @NameInMap("InputParams")
        private String inputParams;

        @NameInMap("ProcessStrategyUuid")
        private String processStrategyUuid;

        @NameInMap("ProcessTime")
        private Long processTime;

        @NameInMap("RemoveTime")
        private Long removeTime;

        @NameInMap("SceneCode")
        private String sceneCode;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("Source")
        private String source;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        @NameInMap("YunCode")
        private String yunCode;

        @NameInMap("errCode")
        private String errCode;

        @NameInMap("errMsg")
        private String errMsg;

        @NameInMap("errTip")
        private String errTip;

        private ProcessTasks(Builder builder) {
            this.creator = builder.creator;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.gmtCreateMillis = builder.gmtCreateMillis;
            this.gmtModifiedMillis = builder.gmtModifiedMillis;
            this.inputParams = builder.inputParams;
            this.processStrategyUuid = builder.processStrategyUuid;
            this.processTime = builder.processTime;
            this.removeTime = builder.removeTime;
            this.sceneCode = builder.sceneCode;
            this.sceneName = builder.sceneName;
            this.scope = builder.scope;
            this.source = builder.source;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.yunCode = builder.yunCode;
            this.errCode = builder.errCode;
            this.errMsg = builder.errMsg;
            this.errTip = builder.errTip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessTasks create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return gmtCreateMillis
         */
        public Long getGmtCreateMillis() {
            return this.gmtCreateMillis;
        }

        /**
         * @return gmtModifiedMillis
         */
        public Long getGmtModifiedMillis() {
            return this.gmtModifiedMillis;
        }

        /**
         * @return inputParams
         */
        public String getInputParams() {
            return this.inputParams;
        }

        /**
         * @return processStrategyUuid
         */
        public String getProcessStrategyUuid() {
            return this.processStrategyUuid;
        }

        /**
         * @return processTime
         */
        public Long getProcessTime() {
            return this.processTime;
        }

        /**
         * @return removeTime
         */
        public Long getRemoveTime() {
            return this.removeTime;
        }

        /**
         * @return sceneCode
         */
        public String getSceneCode() {
            return this.sceneCode;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return yunCode
         */
        public String getYunCode() {
            return this.yunCode;
        }

        /**
         * @return errCode
         */
        public String getErrCode() {
            return this.errCode;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errTip
         */
        public String getErrTip() {
            return this.errTip;
        }

        public static final class Builder {
            private String creator; 
            private String entityName; 
            private String entityType; 
            private Long gmtCreateMillis; 
            private Long gmtModifiedMillis; 
            private String inputParams; 
            private String processStrategyUuid; 
            private Long processTime; 
            private Long removeTime; 
            private String sceneCode; 
            private String sceneName; 
            private String scope; 
            private String source; 
            private String taskId; 
            private Integer taskStatus; 
            private String yunCode; 
            private String errCode; 
            private String errMsg; 
            private String errTip; 

            /**
             * The ID of the Alibaba Cloud account that is used to submit the handling task.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The name of the handling entity.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * The type of the handling entity.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The creation time of the handling task. The value is a 13-digit timestamp.
             */
            public Builder gmtCreateMillis(Long gmtCreateMillis) {
                this.gmtCreateMillis = gmtCreateMillis;
                return this;
            }

            /**
             * The modification time of the handling task. The value is a 13-digit timestamp.
             */
            public Builder gmtModifiedMillis(Long gmtModifiedMillis) {
                this.gmtModifiedMillis = gmtModifiedMillis;
                return this;
            }

            /**
             * The input parameter of the handling task.
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * The ID of the associated policy.
             */
            public Builder processStrategyUuid(String processStrategyUuid) {
                this.processStrategyUuid = processStrategyUuid;
                return this;
            }

            /**
             * The delivery time of the handling task. The value is a 13-digit timestamp.
             */
            public Builder processTime(Long processTime) {
                this.processTime = processTime;
                return this;
            }

            /**
             * The unblocking time of the handling task. The value is a 13-digit timestamp.
             */
            public Builder removeTime(Long removeTime) {
                this.removeTime = removeTime;
                return this;
            }

            /**
             * The scenario code of the handling task.
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * The scenario name of the handling task.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is specified in the handling task.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The submission source of the handling task.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The unique identifier of the handling task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The status of the handling task.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The code of the cloud service that is associated with the handling task.
             */
            public Builder yunCode(String yunCode) {
                this.yunCode = yunCode;
                return this;
            }

            /**
             * errCode.
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * errMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * errTip.
             */
            public Builder errTip(String errTip) {
                this.errTip = errTip;
                return this;
            }

            public ProcessTasks build() {
                return new ProcessTasks(this);
            } 

        } 

    }
}
