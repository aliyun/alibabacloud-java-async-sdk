// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFlowControlTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowControlTaskRequest</p>
 */
public class ModifyFlowControlTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metaType")
    private String metaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneIds")
    private String sceneIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selectionParams")
    private java.util.List < SelectionParams> selectionParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("target")
    private Target target;

    private ModifyFlowControlTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.metaType = builder.metaType;
        this.sceneIds = builder.sceneIds;
        this.selectionParams = builder.selectionParams;
        this.startTime = builder.startTime;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowControlTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
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

    public static final class Builder extends Request.Builder<ModifyFlowControlTaskRequest, Builder> {
        private String instanceId; 
        private String taskId; 
        private String taskName; 
        private String description; 
        private Long endTime; 
        private String metaType; 
        private String sceneIds; 
        private java.util.List < SelectionParams> selectionParams; 
        private Long startTime; 
        private Target target; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowControlTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.description = request.description;
            this.endTime = request.endTime;
            this.metaType = request.metaType;
            this.sceneIds = request.sceneIds;
            this.selectionParams = request.selectionParams;
            this.startTime = request.startTime;
            this.target = request.target;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-zvp2tu7dz007</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1667297014460</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The end time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639519200</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of the metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowControlTask</p>
         */
        public Builder metaType(String metaType) {
            this.putBodyParameter("metaType", metaType);
            this.metaType = metaType;
            return this;
        }

        /**
         * <p>The ID of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>all,sy101</p>
         */
        public Builder sceneIds(String sceneIds) {
            this.putBodyParameter("sceneIds", sceneIds);
            this.sceneIds = sceneIds;
            return this;
        }

        /**
         * <p>The parameters specified for the item selection rule.</p>
         */
        public Builder selectionParams(java.util.List < SelectionParams> selectionParams) {
            this.putBodyParameter("selectionParams", selectionParams);
            this.selectionParams = selectionParams;
            return this;
        }

        /**
         * <p>The start time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1638460800</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The settings for item exposure.</p>
         */
        public Builder target(Target target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        @Override
        public ModifyFlowControlTaskRequest build() {
            return new ModifyFlowControlTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyFlowControlTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyFlowControlTaskRequest</p>
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
             * <p>invalidItem</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>The number of filtering conditions for the item selection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
     * {@link ModifyFlowControlTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyFlowControlTaskRequest</p>
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
             * <p>The type of the exposure.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPOSE_PERCENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The number of exposures.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
}
