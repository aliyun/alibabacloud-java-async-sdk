// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScheduleWorker} extends {@link TeaModel}
 *
 * <p>ScheduleWorker</p>
 */
public class ScheduleWorker extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ScheduleWorkerId")
    private String scheduleWorkerId;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("WorkerContact")
    private String workerContact;

    @NameInMap("WorkerId")
    private String workerId;

    @NameInMap("WorkerName")
    private String workerName;

    private ScheduleWorker(Builder builder) {
        this.createTime = builder.createTime;
        this.scheduleWorkerId = builder.scheduleWorkerId;
        this.updateTime = builder.updateTime;
        this.workerContact = builder.workerContact;
        this.workerId = builder.workerId;
        this.workerName = builder.workerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduleWorker create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return scheduleWorkerId
     */
    public String getScheduleWorkerId() {
        return this.scheduleWorkerId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return workerContact
     */
    public String getWorkerContact() {
        return this.workerContact;
    }

    /**
     * @return workerId
     */
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * @return workerName
     */
    public String getWorkerName() {
        return this.workerName;
    }

    public static final class Builder {
        private String createTime; 
        private String scheduleWorkerId; 
        private String updateTime; 
        private String workerContact; 
        private String workerId; 
        private String workerName; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ScheduleWorkerId.
         */
        public Builder scheduleWorkerId(String scheduleWorkerId) {
            this.scheduleWorkerId = scheduleWorkerId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * WorkerContact.
         */
        public Builder workerContact(String workerContact) {
            this.workerContact = workerContact;
            return this;
        }

        /**
         * WorkerId.
         */
        public Builder workerId(String workerId) {
            this.workerId = workerId;
            return this;
        }

        /**
         * WorkerName.
         */
        public Builder workerName(String workerName) {
            this.workerName = workerName;
            return this;
        }

        public ScheduleWorker build() {
            return new ScheduleWorker(this);
        } 

    } 

}
