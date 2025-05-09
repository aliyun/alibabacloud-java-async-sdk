// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeProcessTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessTasksResponseBody</p>
 */
public class DescribeProcessTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("ProcessTasks")
    private java.util.List<ProcessTasks> processTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ProcessTasks> getProcessTasks() {
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
        private java.util.List<ProcessTasks> processTasks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeProcessTasksResponseBody model) {
            this.page = model.page;
            this.processTasks = model.processTasks;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The handling tasks.</p>
         */
        public Builder processTasks(java.util.List<ProcessTasks> processTasks) {
            this.processTasks = processTasks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7698CFB-4E1C-5840-8EC9-691B86729E94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessTasksResponseBody build() {
            return new DescribeProcessTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProcessTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessTasksResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
    /**
     * 
     * {@link DescribeProcessTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessTasksResponseBody</p>
     */
    public static class ProcessTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("EntityUuid")
        private String entityUuid;

        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private String errCode;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrTip")
        private String errTip;

        @com.aliyun.core.annotation.NameInMap("EventUuid")
        private String eventUuid;

        @com.aliyun.core.annotation.NameInMap("GmtCreateMillis")
        private Long gmtCreateMillis;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedMillis")
        private Long gmtModifiedMillis;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private String inputParams;

        @com.aliyun.core.annotation.NameInMap("ProcessStrategyUuid")
        private String processStrategyUuid;

        @com.aliyun.core.annotation.NameInMap("ProcessTime")
        private Long processTime;

        @com.aliyun.core.annotation.NameInMap("RemoveTime")
        private Long removeTime;

        @com.aliyun.core.annotation.NameInMap("ReqUuid")
        private String reqUuid;

        @com.aliyun.core.annotation.NameInMap("SceneCode")
        private String sceneCode;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        @com.aliyun.core.annotation.NameInMap("YunCode")
        private String yunCode;

        private ProcessTasks(Builder builder) {
            this.creator = builder.creator;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.entityUuid = builder.entityUuid;
            this.errCode = builder.errCode;
            this.errMsg = builder.errMsg;
            this.errTip = builder.errTip;
            this.eventUuid = builder.eventUuid;
            this.gmtCreateMillis = builder.gmtCreateMillis;
            this.gmtModifiedMillis = builder.gmtModifiedMillis;
            this.inputParams = builder.inputParams;
            this.processStrategyUuid = builder.processStrategyUuid;
            this.processTime = builder.processTime;
            this.removeTime = builder.removeTime;
            this.reqUuid = builder.reqUuid;
            this.sceneCode = builder.sceneCode;
            this.sceneName = builder.sceneName;
            this.scope = builder.scope;
            this.source = builder.source;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.triggerSource = builder.triggerSource;
            this.yunCode = builder.yunCode;
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
         * @return entityUuid
         */
        public String getEntityUuid() {
            return this.entityUuid;
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

        /**
         * @return eventUuid
         */
        public String getEventUuid() {
            return this.eventUuid;
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
         * @return reqUuid
         */
        public String getReqUuid() {
            return this.reqUuid;
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
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /**
         * @return yunCode
         */
        public String getYunCode() {
            return this.yunCode;
        }

        public static final class Builder {
            private String creator; 
            private String entityName; 
            private String entityType; 
            private String entityUuid; 
            private String errCode; 
            private String errMsg; 
            private String errTip; 
            private String eventUuid; 
            private Long gmtCreateMillis; 
            private Long gmtModifiedMillis; 
            private String inputParams; 
            private String processStrategyUuid; 
            private Long processTime; 
            private Long removeTime; 
            private String reqUuid; 
            private String sceneCode; 
            private String sceneName; 
            private String scope; 
            private String source; 
            private String taskId; 
            private Integer taskStatus; 
            private String triggerSource; 
            private String yunCode; 

            private Builder() {
            } 

            private Builder(ProcessTasks model) {
                this.creator = model.creator;
                this.entityName = model.entityName;
                this.entityType = model.entityType;
                this.entityUuid = model.entityUuid;
                this.errCode = model.errCode;
                this.errMsg = model.errMsg;
                this.errTip = model.errTip;
                this.eventUuid = model.eventUuid;
                this.gmtCreateMillis = model.gmtCreateMillis;
                this.gmtModifiedMillis = model.gmtModifiedMillis;
                this.inputParams = model.inputParams;
                this.processStrategyUuid = model.processStrategyUuid;
                this.processTime = model.processTime;
                this.removeTime = model.removeTime;
                this.reqUuid = model.reqUuid;
                this.sceneCode = model.sceneCode;
                this.sceneName = model.sceneName;
                this.scope = model.scope;
                this.source = model.source;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.triggerSource = model.triggerSource;
                this.yunCode = model.yunCode;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account that is used to submit the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxx355</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The name of the handling entity.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.x</p>
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * <p>The type of the handling entity.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * EntityUuid.
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            /**
             * <p>The error code returned if the call failed.</p>
             * 
             * <strong>example:</strong>
             * <p>sts_openapi.Info.DefenseSceneNotSupported</p>
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>The error message returned if the call failed.</p>
             * 
             * <strong>example:</strong>
             * <p>ParamError : The parameters of your request are invalid</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The error tip returned if the call failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Verify that the input parameters of the components are correct</p>
             */
            public Builder errTip(String errTip) {
                this.errTip = errTip;
                return this;
            }

            /**
             * EventUuid.
             */
            public Builder eventUuid(String eventUuid) {
                this.eventUuid = eventUuid;
                return this;
            }

            /**
             * <p>The creation time of the handling task. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700031183572</p>
             */
            public Builder gmtCreateMillis(Long gmtCreateMillis) {
                this.gmtCreateMillis = gmtCreateMillis;
                return this;
            }

            /**
             * <p>The modification time of the handling task. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700031183572</p>
             */
            public Builder gmtModifiedMillis(Long gmtModifiedMillis) {
                this.gmtModifiedMillis = gmtModifiedMillis;
                return this;
            }

            /**
             * <p>The input parameter of the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;groupuuid&quot;:&quot;c6a9b1df-f4ac-4078-bef4-99xxxxxx&quot;}</p>
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * <p>The ID of the associated policy.</p>
             * 
             * <strong>example:</strong>
             * <p>92af3c79-1754-4646-9366-9ddbd1e45536_xxxx</p>
             */
            public Builder processStrategyUuid(String processStrategyUuid) {
                this.processStrategyUuid = processStrategyUuid;
                return this;
            }

            /**
             * <p>The delivery time of the handling task. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700031183572</p>
             */
            public Builder processTime(Long processTime) {
                this.processTime = processTime;
                return this;
            }

            /**
             * <p>The unblocking time of the handling task. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700031183572</p>
             */
            public Builder removeTime(Long removeTime) {
                this.removeTime = removeTime;
                return this;
            }

            /**
             * ReqUuid.
             */
            public Builder reqUuid(String reqUuid) {
                this.reqUuid = reqUuid;
                return this;
            }

            /**
             * <p>The scenario code of the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>event_xxx_whole_process</p>
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * <p>The scenario name of the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_whole_process</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is specified in the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxx234</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The submission source of the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The unique identifier of the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>150xxxxxxxxx95066</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The status of the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TriggerSource.
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            /**
             * <p>The code of the cloud service that is associated with the handling task.</p>
             * 
             * <strong>example:</strong>
             * <p>WAF</p>
             */
            public Builder yunCode(String yunCode) {
                this.yunCode = yunCode;
                return this;
            }

            public ProcessTasks build() {
                return new ProcessTasks(this);
            } 

        } 

    }
}
