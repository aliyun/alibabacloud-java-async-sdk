// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterTasksResponseBody</p>
 */
public class ListClusterTasksResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListClusterTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterTasksResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the index.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListClusterTasksResponseBody build() {
            return new ListClusterTasksResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("msg")
        private String msg;

        @NameInMap("tagLevel")
        private String tagLevel;

        private Tags(Builder builder) {
            this.msg = builder.msg;
            this.tagLevel = builder.tagLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return tagLevel
         */
        public String getTagLevel() {
            return this.tagLevel;
        }

        public static final class Builder {
            private String msg; 
            private String tagLevel; 

            /**
             * The content of the tag.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The level of the tag.
             */
            public Builder tagLevel(String tagLevel) {
                this.tagLevel = tagLevel;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class TaskNodes extends TeaModel {
        @NameInMap("finishDate")
        private String finishDate;

        @NameInMap("index")
        private Long index;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        private TaskNodes(Builder builder) {
            this.finishDate = builder.finishDate;
            this.index = builder.index;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskNodes create() {
            return builder().build();
        }

        /**
         * @return finishDate
         */
        public String getFinishDate() {
            return this.finishDate;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String finishDate; 
            private Long index; 
            private String name; 
            private String status; 

            /**
             * The date when the task was completed.
             */
            public Builder finishDate(String finishDate) {
                this.finishDate = finishDate;
                return this;
            }

            /**
             * The sequence number of the task.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the task.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TaskNodes build() {
                return new TaskNodes(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("extraAttribute")
        private String extraAttribute;

        @NameInMap("field3")
        private String field3;

        @NameInMap("fsmId")
        private String fsmId;

        @NameInMap("groupType")
        private String groupType;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("taskNodes")
        private java.util.List < TaskNodes> taskNodes;

        @NameInMap("time")
        private String time;

        @NameInMap("type")
        private String type;

        @NameInMap("user")
        private String user;

        private Result(Builder builder) {
            this.extraAttribute = builder.extraAttribute;
            this.field3 = builder.field3;
            this.fsmId = builder.fsmId;
            this.groupType = builder.groupType;
            this.name = builder.name;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskNodes = builder.taskNodes;
            this.time = builder.time;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return extraAttribute
         */
        public String getExtraAttribute() {
            return this.extraAttribute;
        }

        /**
         * @return field3
         */
        public String getField3() {
            return this.field3;
        }

        /**
         * @return fsmId
         */
        public String getFsmId() {
            return this.fsmId;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskNodes
         */
        public java.util.List < TaskNodes> getTaskNodes() {
            return this.taskNodes;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String extraAttribute; 
            private String field3; 
            private String fsmId; 
            private String groupType; 
            private String name; 
            private String status; 
            private java.util.List < Tags> tags; 
            private java.util.List < TaskNodes> taskNodes; 
            private String time; 
            private String type; 
            private String user; 

            /**
             * The additional attributes of the card.
             */
            public Builder extraAttribute(String extraAttribute) {
                this.extraAttribute = extraAttribute;
                return this;
            }

            /**
             * The field3 field that is passed through when you create a state machine.
             */
            public Builder field3(String field3) {
                this.field3 = field3;
                return this;
            }

            /**
             * fsmId
             */
            public Builder fsmId(String fsmId) {
                this.fsmId = fsmId;
                return this;
            }

            /**
             * Indicates whether the change is a data source task change or a cluster task change.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The task name on the card.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The overall status of FSM.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The status tag of the progress bar chart.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The information about the task.
             */
            public Builder taskNodes(java.util.List < TaskNodes> taskNodes) {
                this.taskNodes = taskNodes;
                return this;
            }

            /**
             * The timestamp of the task on the card.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The type of the task on the card.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The user who triggered the FSM process.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
