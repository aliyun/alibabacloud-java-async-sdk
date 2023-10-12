// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScheduleWorkerResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduleWorkerResponseBody</p>
 */
public class GetScheduleWorkerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScheduleWorker")
    private ScheduleWorker scheduleWorker;

    private GetScheduleWorkerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scheduleWorker = builder.scheduleWorker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduleWorkerResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleWorker
     */
    public ScheduleWorker getScheduleWorker() {
        return this.scheduleWorker;
    }

    public static final class Builder {
        private String requestId; 
        private ScheduleWorker scheduleWorker; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScheduleWorker.
         */
        public Builder scheduleWorker(ScheduleWorker scheduleWorker) {
            this.scheduleWorker = scheduleWorker;
            return this;
        }

        public GetScheduleWorkerResponseBody build() {
            return new GetScheduleWorkerResponseBody(this);
        } 

    } 

    public static class ScheduleWorker extends TeaModel {
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
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder scheduleWorkerId(String scheduleWorkerId) {
                this.scheduleWorkerId = scheduleWorkerId;
                return this;
            }

            /**
             * 更新时间
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
             * 值班人员工号
             */
            public Builder workerId(String workerId) {
                this.workerId = workerId;
                return this;
            }

            /**
             * 值班人员姓名
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
}
