// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowControlTaskResponseBody</p>
 */
public class ListFlowControlTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListFlowControlTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListFlowControlTaskResponseBody build() {
            return new ListFlowControlTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskResponseBody</p>
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
             * selectType.
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * selectValue.
             */
            public Builder selectValue(String selectValue) {
                this.selectValue = selectValue;
                return this;
            }

            /**
             * selectionOperation.
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
     * {@link ListFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskResponseBody</p>
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
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
     * {@link ListFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskResponseBody</p>
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
             * description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * metaType.
             */
            public Builder metaType(String metaType) {
                this.metaType = metaType;
                return this;
            }

            /**
             * sceneIds.
             */
            public Builder sceneIds(String sceneIds) {
                this.sceneIds = sceneIds;
                return this;
            }

            /**
             * selectionParams.
             */
            public Builder selectionParams(java.util.List < SelectionParams> selectionParams) {
                this.selectionParams = selectionParams;
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
             * target.
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * taskName.
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
     * {@link ListFlowControlTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.taskId = builder.taskId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.meta = builder.meta;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
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

        public static final class Builder {
            private String taskId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Meta meta; 
            private String status; 

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
