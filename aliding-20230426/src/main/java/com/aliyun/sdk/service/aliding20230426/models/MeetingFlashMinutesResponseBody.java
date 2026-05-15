// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link MeetingFlashMinutesResponseBody} extends {@link TeaModel}
 *
 * <p>MeetingFlashMinutesResponseBody</p>
 */
public class MeetingFlashMinutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("basicInfo")
    private BasicInfo basicInfo;

    @com.aliyun.core.annotation.NameInMap("flashMinutesUrl")
    private String flashMinutesUrl;

    @com.aliyun.core.annotation.NameInMap("fullSummary")
    private String fullSummary;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("todos")
    private Todos todos;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private MeetingFlashMinutesResponseBody(Builder builder) {
        this.basicInfo = builder.basicInfo;
        this.flashMinutesUrl = builder.flashMinutesUrl;
        this.fullSummary = builder.fullSummary;
        this.requestId = builder.requestId;
        this.todos = builder.todos;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MeetingFlashMinutesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basicInfo
     */
    public BasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    /**
     * @return flashMinutesUrl
     */
    public String getFlashMinutesUrl() {
        return this.flashMinutesUrl;
    }

    /**
     * @return fullSummary
     */
    public String getFullSummary() {
        return this.fullSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return todos
     */
    public Todos getTodos() {
        return this.todos;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private BasicInfo basicInfo; 
        private String flashMinutesUrl; 
        private String fullSummary; 
        private String requestId; 
        private Todos todos; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(MeetingFlashMinutesResponseBody model) {
            this.basicInfo = model.basicInfo;
            this.flashMinutesUrl = model.flashMinutesUrl;
            this.fullSummary = model.fullSummary;
            this.requestId = model.requestId;
            this.todos = model.todos;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * basicInfo.
         */
        public Builder basicInfo(BasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }

        /**
         * flashMinutesUrl.
         */
        public Builder flashMinutesUrl(String flashMinutesUrl) {
            this.flashMinutesUrl = flashMinutesUrl;
            return this;
        }

        /**
         * fullSummary.
         */
        public Builder fullSummary(String fullSummary) {
            this.fullSummary = fullSummary;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * todos.
         */
        public Builder todos(Todos todos) {
            this.todos = todos;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public MeetingFlashMinutesResponseBody build() {
            return new MeetingFlashMinutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MeetingFlashMinutesResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesResponseBody</p>
     */
    public static class BasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("taskCreator")
        private String taskCreator;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private BasicInfo(Builder builder) {
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.taskCreator = builder.taskCreator;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicInfo create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskCreator
         */
        public String getTaskCreator() {
            return this.taskCreator;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long duration; 
            private Long endTime; 
            private Long startTime; 
            private String taskCreator; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(BasicInfo model) {
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.taskCreator = model.taskCreator;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * taskCreator.
             */
            public Builder taskCreator(String taskCreator) {
                this.taskCreator = taskCreator;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public BasicInfo build() {
                return new BasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link MeetingFlashMinutesResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesResponseBody</p>
     */
    public static class ExecutorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("nick")
        private String nick;

        @com.aliyun.core.annotation.NameInMap("unionId")
        private String unionId;

        private ExecutorList(Builder builder) {
            this.avatar = builder.avatar;
            this.nick = builder.nick;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutorList create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String avatar; 
            private String nick; 
            private String unionId; 

            private Builder() {
            } 

            private Builder(ExecutorList model) {
                this.avatar = model.avatar;
                this.nick = model.nick;
                this.unionId = model.unionId;
            } 

            /**
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * nick.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * unionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public ExecutorList build() {
                return new ExecutorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link MeetingFlashMinutesResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesResponseBody</p>
     */
    public static class DingtalkTodoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("creatorUnionId")
        private String creatorUnionId;

        @com.aliyun.core.annotation.NameInMap("deadline")
        private String deadline;

        @com.aliyun.core.annotation.NameInMap("dingtalkTodoId")
        private String dingtalkTodoId;

        @com.aliyun.core.annotation.NameInMap("executorList")
        private java.util.List<ExecutorList> executorList;

        @com.aliyun.core.annotation.NameInMap("isDone")
        private Boolean isDone;

        @com.aliyun.core.annotation.NameInMap("minutesTodoId")
        private String minutesTodoId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private DingtalkTodoList(Builder builder) {
            this.createdTime = builder.createdTime;
            this.creatorUnionId = builder.creatorUnionId;
            this.deadline = builder.deadline;
            this.dingtalkTodoId = builder.dingtalkTodoId;
            this.executorList = builder.executorList;
            this.isDone = builder.isDone;
            this.minutesTodoId = builder.minutesTodoId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingtalkTodoList create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creatorUnionId
         */
        public String getCreatorUnionId() {
            return this.creatorUnionId;
        }

        /**
         * @return deadline
         */
        public String getDeadline() {
            return this.deadline;
        }

        /**
         * @return dingtalkTodoId
         */
        public String getDingtalkTodoId() {
            return this.dingtalkTodoId;
        }

        /**
         * @return executorList
         */
        public java.util.List<ExecutorList> getExecutorList() {
            return this.executorList;
        }

        /**
         * @return isDone
         */
        public Boolean getIsDone() {
            return this.isDone;
        }

        /**
         * @return minutesTodoId
         */
        public String getMinutesTodoId() {
            return this.minutesTodoId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long createdTime; 
            private String creatorUnionId; 
            private String deadline; 
            private String dingtalkTodoId; 
            private java.util.List<ExecutorList> executorList; 
            private Boolean isDone; 
            private String minutesTodoId; 
            private String title; 

            private Builder() {
            } 

            private Builder(DingtalkTodoList model) {
                this.createdTime = model.createdTime;
                this.creatorUnionId = model.creatorUnionId;
                this.deadline = model.deadline;
                this.dingtalkTodoId = model.dingtalkTodoId;
                this.executorList = model.executorList;
                this.isDone = model.isDone;
                this.minutesTodoId = model.minutesTodoId;
                this.title = model.title;
            } 

            /**
             * createdTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * creatorUnionId.
             */
            public Builder creatorUnionId(String creatorUnionId) {
                this.creatorUnionId = creatorUnionId;
                return this;
            }

            /**
             * deadline.
             */
            public Builder deadline(String deadline) {
                this.deadline = deadline;
                return this;
            }

            /**
             * dingtalkTodoId.
             */
            public Builder dingtalkTodoId(String dingtalkTodoId) {
                this.dingtalkTodoId = dingtalkTodoId;
                return this;
            }

            /**
             * executorList.
             */
            public Builder executorList(java.util.List<ExecutorList> executorList) {
                this.executorList = executorList;
                return this;
            }

            /**
             * isDone.
             */
            public Builder isDone(Boolean isDone) {
                this.isDone = isDone;
                return this;
            }

            /**
             * minutesTodoId.
             */
            public Builder minutesTodoId(String minutesTodoId) {
                this.minutesTodoId = minutesTodoId;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public DingtalkTodoList build() {
                return new DingtalkTodoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link MeetingFlashMinutesResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesResponseBody</p>
     */
    public static class Todos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("dingtalkTodoList")
        private java.util.List<DingtalkTodoList> dingtalkTodoList;

        private Todos(Builder builder) {
            this.actions = builder.actions;
            this.dingtalkTodoList = builder.dingtalkTodoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Todos create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return dingtalkTodoList
         */
        public java.util.List<DingtalkTodoList> getDingtalkTodoList() {
            return this.dingtalkTodoList;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private java.util.List<DingtalkTodoList> dingtalkTodoList; 

            private Builder() {
            } 

            private Builder(Todos model) {
                this.actions = model.actions;
                this.dingtalkTodoList = model.dingtalkTodoList;
            } 

            /**
             * actions.
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * dingtalkTodoList.
             */
            public Builder dingtalkTodoList(java.util.List<DingtalkTodoList> dingtalkTodoList) {
                this.dingtalkTodoList = dingtalkTodoList;
                return this;
            }

            public Todos build() {
                return new Todos(this);
            } 

        } 

    }
}
