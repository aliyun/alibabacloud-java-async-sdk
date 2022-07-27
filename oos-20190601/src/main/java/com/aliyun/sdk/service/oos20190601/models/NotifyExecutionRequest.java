// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotifyExecutionRequest} extends {@link RequestModel}
 *
 * <p>NotifyExecutionRequest</p>
 */
public class NotifyExecutionRequest extends Request {
    @Query
    @NameInMap("ExecutionId")
    @Validation(required = true)
    private String executionId;

    @Query
    @NameInMap("ExecutionStatus")
    private String executionStatus;

    @Query
    @NameInMap("LoopItem")
    private String loopItem;

    @Query
    @NameInMap("NotifyNote")
    private String notifyNote;

    @Query
    @NameInMap("NotifyType")
    @Validation(required = true)
    private String notifyType;

    @Query
    @NameInMap("Parameters")
    private String parameters;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskExecutionId")
    private String taskExecutionId;

    @Query
    @NameInMap("TaskExecutionIds")
    private String taskExecutionIds;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private NotifyExecutionRequest(Builder builder) {
        super(builder);
        this.executionId = builder.executionId;
        this.executionStatus = builder.executionStatus;
        this.loopItem = builder.loopItem;
        this.notifyNote = builder.notifyNote;
        this.notifyType = builder.notifyType;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.taskExecutionId = builder.taskExecutionId;
        this.taskExecutionIds = builder.taskExecutionIds;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyExecutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * @return loopItem
     */
    public String getLoopItem() {
        return this.loopItem;
    }

    /**
     * @return notifyNote
     */
    public String getNotifyNote() {
        return this.notifyNote;
    }

    /**
     * @return notifyType
     */
    public String getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskExecutionId
     */
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    /**
     * @return taskExecutionIds
     */
    public String getTaskExecutionIds() {
        return this.taskExecutionIds;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<NotifyExecutionRequest, Builder> {
        private String executionId; 
        private String executionStatus; 
        private String loopItem; 
        private String notifyNote; 
        private String notifyType; 
        private String parameters; 
        private String regionId; 
        private String taskExecutionId; 
        private String taskExecutionIds; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(NotifyExecutionRequest request) {
            super(request);
            this.executionId = request.executionId;
            this.executionStatus = request.executionStatus;
            this.loopItem = request.loopItem;
            this.notifyNote = request.notifyNote;
            this.notifyType = request.notifyType;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.taskExecutionId = request.taskExecutionId;
            this.taskExecutionIds = request.taskExecutionIds;
            this.taskName = request.taskName;
        } 

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * ExecutionStatus.
         */
        public Builder executionStatus(String executionStatus) {
            this.putQueryParameter("ExecutionStatus", executionStatus);
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * LoopItem.
         */
        public Builder loopItem(String loopItem) {
            this.putQueryParameter("LoopItem", loopItem);
            this.loopItem = loopItem;
            return this;
        }

        /**
         * NotifyNote.
         */
        public Builder notifyNote(String notifyNote) {
            this.putQueryParameter("NotifyNote", notifyNote);
            this.notifyNote = notifyNote;
            return this;
        }

        /**
         * NotifyType.
         */
        public Builder notifyType(String notifyType) {
            this.putQueryParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TaskExecutionId.
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        /**
         * TaskExecutionIds.
         */
        public Builder taskExecutionIds(String taskExecutionIds) {
            this.putQueryParameter("TaskExecutionIds", taskExecutionIds);
            this.taskExecutionIds = taskExecutionIds;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public NotifyExecutionRequest build() {
            return new NotifyExecutionRequest(this);
        } 

    } 

}
