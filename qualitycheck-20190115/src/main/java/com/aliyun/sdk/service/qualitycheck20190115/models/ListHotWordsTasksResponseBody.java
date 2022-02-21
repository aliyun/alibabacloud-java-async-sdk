// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotWordsTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotWordsTasksResponseBody</p>
 */
public class ListHotWordsTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListHotWordsTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotWordsTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer count; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public ListHotWordsTasksResponseBody build() {
            return new ListHotWordsTasksResponseBody(this);
        } 

    } 

    public static class DialogueParam extends TeaModel {
        @NameInMap("DataSetIds")
        private String dataSetIds;

        @NameInMap("DialogueId")
        private Long dialogueId;

        @NameInMap("EndIndex")
        private Integer endIndex;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Role")
        private Integer role;

        @NameInMap("SourceType")
        private Integer sourceType;

        @NameInMap("StartIndex")
        private Integer startIndex;

        @NameInMap("StartTime")
        private String startTime;

        private DialogueParam(Builder builder) {
            this.dataSetIds = builder.dataSetIds;
            this.dialogueId = builder.dialogueId;
            this.endIndex = builder.endIndex;
            this.endTime = builder.endTime;
            this.role = builder.role;
            this.sourceType = builder.sourceType;
            this.startIndex = builder.startIndex;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueParam create() {
            return builder().build();
        }

        /**
         * @return dataSetIds
         */
        public String getDataSetIds() {
            return this.dataSetIds;
        }

        /**
         * @return dialogueId
         */
        public Long getDialogueId() {
            return this.dialogueId;
        }

        /**
         * @return endIndex
         */
        public Integer getEndIndex() {
            return this.endIndex;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        /**
         * @return sourceType
         */
        public Integer getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startIndex
         */
        public Integer getStartIndex() {
            return this.startIndex;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String dataSetIds; 
            private Long dialogueId; 
            private Integer endIndex; 
            private String endTime; 
            private Integer role; 
            private Integer sourceType; 
            private Integer startIndex; 
            private String startTime; 

            /**
             * DataSetIds.
             */
            public Builder dataSetIds(String dataSetIds) {
                this.dataSetIds = dataSetIds;
                return this;
            }

            /**
             * DialogueId.
             */
            public Builder dialogueId(Long dialogueId) {
                this.dialogueId = dialogueId;
                return this;
            }

            /**
             * EndIndex.
             */
            public Builder endIndex(Integer endIndex) {
                this.endIndex = endIndex;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(Integer sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StartIndex.
             */
            public Builder startIndex(Integer startIndex) {
                this.startIndex = startIndex;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public DialogueParam build() {
                return new DialogueParam(this);
            } 

        } 

    }
    public static class WordsParam extends TeaModel {
        @NameInMap("Excludes")
        private String excludes;

        @NameInMap("ExtraConfigId")
        private Long extraConfigId;

        @NameInMap("Includes")
        private String includes;

        private WordsParam(Builder builder) {
            this.excludes = builder.excludes;
            this.extraConfigId = builder.extraConfigId;
            this.includes = builder.includes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordsParam create() {
            return builder().build();
        }

        /**
         * @return excludes
         */
        public String getExcludes() {
            return this.excludes;
        }

        /**
         * @return extraConfigId
         */
        public Long getExtraConfigId() {
            return this.extraConfigId;
        }

        /**
         * @return includes
         */
        public String getIncludes() {
            return this.includes;
        }

        public static final class Builder {
            private String excludes; 
            private Long extraConfigId; 
            private String includes; 

            /**
             * Excludes.
             */
            public Builder excludes(String excludes) {
                this.excludes = excludes;
                return this;
            }

            /**
             * ExtraConfigId.
             */
            public Builder extraConfigId(Long extraConfigId) {
                this.extraConfigId = extraConfigId;
                return this;
            }

            /**
             * Includes.
             */
            public Builder includes(String includes) {
                this.includes = includes;
                return this;
            }

            public WordsParam build() {
                return new WordsParam(this);
            } 

        } 

    }
    public static class HotWordsTaskPo extends TeaModel {
        @NameInMap("DialogueParam")
        private DialogueParam dialogueParam;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceStatus")
        private Integer instanceStatus;

        @NameInMap("LastExecutionTime")
        private String lastExecutionTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskConfigId")
        private Long taskConfigId;

        @NameInMap("TimeInterval")
        private Integer timeInterval;

        @NameInMap("TimeUnit")
        private Integer timeUnit;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("WordsParam")
        private WordsParam wordsParam;

        private HotWordsTaskPo(Builder builder) {
            this.dialogueParam = builder.dialogueParam;
            this.endTime = builder.endTime;
            this.instanceStatus = builder.instanceStatus;
            this.lastExecutionTime = builder.lastExecutionTime;
            this.message = builder.message;
            this.name = builder.name;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskConfigId = builder.taskConfigId;
            this.timeInterval = builder.timeInterval;
            this.timeUnit = builder.timeUnit;
            this.type = builder.type;
            this.wordsParam = builder.wordsParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotWordsTaskPo create() {
            return builder().build();
        }

        /**
         * @return dialogueParam
         */
        public DialogueParam getDialogueParam() {
            return this.dialogueParam;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceStatus
         */
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return lastExecutionTime
         */
        public String getLastExecutionTime() {
            return this.lastExecutionTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskConfigId
         */
        public Long getTaskConfigId() {
            return this.taskConfigId;
        }

        /**
         * @return timeInterval
         */
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        /**
         * @return timeUnit
         */
        public Integer getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return wordsParam
         */
        public WordsParam getWordsParam() {
            return this.wordsParam;
        }

        public static final class Builder {
            private DialogueParam dialogueParam; 
            private String endTime; 
            private Integer instanceStatus; 
            private String lastExecutionTime; 
            private String message; 
            private String name; 
            private String startTime; 
            private Integer status; 
            private Long taskConfigId; 
            private Integer timeInterval; 
            private Integer timeUnit; 
            private Integer type; 
            private WordsParam wordsParam; 

            /**
             * DialogueParam.
             */
            public Builder dialogueParam(DialogueParam dialogueParam) {
                this.dialogueParam = dialogueParam;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(Integer instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * LastExecutionTime.
             */
            public Builder lastExecutionTime(String lastExecutionTime) {
                this.lastExecutionTime = lastExecutionTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskConfigId.
             */
            public Builder taskConfigId(Long taskConfigId) {
                this.taskConfigId = taskConfigId;
                return this;
            }

            /**
             * TimeInterval.
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * TimeUnit.
             */
            public Builder timeUnit(Integer timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * WordsParam.
             */
            public Builder wordsParam(WordsParam wordsParam) {
                this.wordsParam = wordsParam;
                return this;
            }

            public HotWordsTaskPo build() {
                return new HotWordsTaskPo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("HotWordsTaskPo")
        private java.util.List < HotWordsTaskPo> hotWordsTaskPo;

        private Data(Builder builder) {
            this.hotWordsTaskPo = builder.hotWordsTaskPo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hotWordsTaskPo
         */
        public java.util.List < HotWordsTaskPo> getHotWordsTaskPo() {
            return this.hotWordsTaskPo;
        }

        public static final class Builder {
            private java.util.List < HotWordsTaskPo> hotWordsTaskPo; 

            /**
             * HotWordsTaskPo.
             */
            public Builder hotWordsTaskPo(java.util.List < HotWordsTaskPo> hotWordsTaskPo) {
                this.hotWordsTaskPo = hotWordsTaskPo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
