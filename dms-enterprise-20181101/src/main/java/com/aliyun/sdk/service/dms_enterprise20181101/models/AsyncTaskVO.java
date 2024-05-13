// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsyncTaskVO} extends {@link TeaModel}
 *
 * <p>AsyncTaskVO</p>
 */
public class AsyncTaskVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private Integer taskType;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private AsyncTaskVO(Builder builder) {
        this.datasetId = builder.datasetId;
        this.id = builder.id;
        this.remark = builder.remark;
        this.taskName = builder.taskName;
        this.taskStatus = builder.taskStatus;
        this.taskType = builder.taskType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncTaskVO create() {
        return builder().build();
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String datasetId; 
        private Long id; 
        private String remark; 
        private String taskName; 
        private Integer taskStatus; 
        private Integer taskType; 
        private Long userId; 

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public AsyncTaskVO build() {
            return new AsyncTaskVO(this);
        } 

    } 

}
