// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataSourceTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceTasksResponseBody</p>
 */
public class ListDataSourceTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListDataSourceTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceTasksResponseBody create() {
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
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>CC5EC8FA-5C0D-56AF-BEF4-6FCCEABD0511</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The index information.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDataSourceTasksResponseBody build() {
            return new ListDataSourceTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceTasksResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("tagLevel")
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
             * <p>The tag content.</p>
             * 
             * <strong>example:</strong>
             * <p>succeed in handling request</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The tag level.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
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
    /**
     * 
     * {@link ListDataSourceTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceTasksResponseBody</p>
     */
    public static class TaskNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishDate")
        private String finishDate;

        @com.aliyun.core.annotation.NameInMap("index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
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
             * <p>The time when the task was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder finishDate(String finishDate) {
                this.finishDate = finishDate;
                return this;
            }

            /**
             * <p>The ordinal number of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-7pp2ngv4s02_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>onlyPublished</p>
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
    /**
     * 
     * {@link ListDataSourceTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceTasksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extraAttribute")
        private String extraAttribute;

        @com.aliyun.core.annotation.NameInMap("field3")
        private String field3;

        @com.aliyun.core.annotation.NameInMap("fsmId")
        private String fsmId;

        @com.aliyun.core.annotation.NameInMap("groupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("taskNodes")
        private java.util.List < TaskNodes> taskNodes;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("user")
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
             * <p>The additional attributes of the card.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder extraAttribute(String extraAttribute) {
                this.extraAttribute = extraAttribute;
                return this;
            }

            /**
             * <p>The field3 field that was passed when the FSM was created.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder field3(String field3) {
                this.field3 = field3;
                return this;
            }

            /**
             * <p>The ID of the finite state machine (FSM).</p>
             * 
             * <strong>example:</strong>
             * <p>tisplus_opensearch@datasource_flow_fsm@1062017779051424-ha-cn-2r42ostoc01_ecom_table@vpc_hz_domain_1@null@MANUAL-ha-cn-2r42ostoc01_ecom_table@1655974525756@006754</p>
             */
            public Builder fsmId(String fsmId) {
                this.fsmId = fsmId;
                return this;
            }

            /**
             * <p>The change group type.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The card name.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The FSM status.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the progress bar.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The task information.</p>
             */
            public Builder taskNodes(java.util.List < TaskNodes> taskNodes) {
                this.taskNodes = taskNodes;
                return this;
            }

            /**
             * <p>The timestamp of the card.</p>
             * 
             * <strong>example:</strong>
             * <p>1646279473</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The card type.</p>
             * 
             * <strong>example:</strong>
             * <p>search</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user who triggered the generation of the FSM process.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
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
