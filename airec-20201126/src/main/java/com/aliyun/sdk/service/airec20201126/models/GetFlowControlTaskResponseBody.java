// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFlowControlTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowControlTaskResponseBody</p>
 */
public class GetFlowControlTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private GetFlowControlTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowControlTaskResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public GetFlowControlTaskResponseBody build() {
            return new GetFlowControlTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowControlTaskResponseBody</p>
     */
    public static class SelectionParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("selectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("selectValue")
        private String selectValue;

        @com.aliyun.core.annotation.NameInMap("selectionOperation")
        private String selectionOperation;

        private SelectionParams(Builder builder) {
            this.selectType = builder.selectType;
            this.selectValue = builder.selectValue;
            this.selectionOperation = builder.selectionOperation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectionParams create() {
            return builder().build();
        }

        /**
         * @return selectType
         */
        public String getSelectType() {
            return this.selectType;
        }

        /**
         * @return selectValue
         */
        public String getSelectValue() {
            return this.selectValue;
        }

        /**
         * @return selectionOperation
         */
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

        public static final class Builder {
            private String selectType; 
            private String selectValue; 
            private String selectionOperation; 

            /**
             * <p>The type of the filtering condition for the item selection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>QUERY_PUB_TIME</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>The value of the filtering condition for the item selection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder selectValue(String selectValue) {
                this.selectValue = selectValue;
                return this;
            }

            /**
             * <p>The operation on the filtering condition for the item selection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>OPERATOR_HIGHER</p>
             */
            public Builder selectionOperation(String selectionOperation) {
                this.selectionOperation = selectionOperation;
                return this;
            }

            public SelectionParams build() {
                return new SelectionParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowControlTaskResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private Target(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private Long value; 

            /**
             * <p>EXPOSE_PERCENT: daily exposure percentage. EXPOSE_COUNT: total number of exposures.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPOSE_PERCENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The exposure value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowControlTaskResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("metaType")
        private String metaType;

        @com.aliyun.core.annotation.NameInMap("sceneIds")
        private String sceneIds;

        @com.aliyun.core.annotation.NameInMap("selectionParams")
        private java.util.List < SelectionParams> selectionParams;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        private Meta(Builder builder) {
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.metaType = builder.metaType;
            this.sceneIds = builder.sceneIds;
            this.selectionParams = builder.selectionParams;
            this.startTime = builder.startTime;
            this.target = builder.target;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return metaType
         */
        public String getMetaType() {
            return this.metaType;
        }

        /**
         * @return sceneIds
         */
        public String getSceneIds() {
            return this.sceneIds;
        }

        /**
         * @return selectionParams
         */
        public java.util.List < SelectionParams> getSelectionParams() {
            return this.selectionParams;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String description; 
            private Long endTime; 
            private String metaType; 
            private String sceneIds; 
            private java.util.List < SelectionParams> selectionParams; 
            private Long startTime; 
            private Target target; 
            private String taskName; 

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end time. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1656518399</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The metadata type.</p>
             * 
             * <strong>example:</strong>
             * <p>FlowControlTask</p>
             */
            public Builder metaType(String metaType) {
                this.metaType = metaType;
                return this;
            }

            /**
             * <p>The scene IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>1,2,3</p>
             */
            public Builder sceneIds(String sceneIds) {
                this.sceneIds = sceneIds;
                return this;
            }

            /**
             * <p>The parameters specified for the item selection rule.</p>
             */
            public Builder selectionParams(java.util.List < SelectionParams> selectionParams) {
                this.selectionParams = selectionParams;
                return this;
            }

            /**
             * <p>The start time. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640739600</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The exposure settings.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The task name.</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowControlTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.meta = builder.meta;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Meta meta; 
            private String status; 
            private String taskId; 

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in Coordinated Universal Time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-07T02:24:26.000Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the data source was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-23T06:08:48.000Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The metadata of the task.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The task state. Valid values: DRAFT, READY, RUNNING, ENDED, and AUTO_END. The value AUTO_END is not used.</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1666854602398</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
