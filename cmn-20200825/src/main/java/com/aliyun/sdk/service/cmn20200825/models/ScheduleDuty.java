// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScheduleDuty} extends {@link TeaModel}
 *
 * <p>ScheduleDuty</p>
 */
public class ScheduleDuty extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EndDate")
    private String endDate;

    @NameInMap("ScheduleDutyId")
    private String scheduleDutyId;

    @NameInMap("ScheduleTypeIds")
    private java.util.List < String > scheduleTypeIds;

    @NameInMap("StartDate")
    private String startDate;

    @NameInMap("TypeWorkerList")
    private java.util.List < TypeWorkerList> typeWorkerList;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("WorkDate")
    private String workDate;

    @NameInMap("WorkType")
    private String workType;

    @NameInMap("WorkerId")
    private String workerId;

    @NameInMap("WorkerName")
    private String workerName;

    private ScheduleDuty(Builder builder) {
        this.createTime = builder.createTime;
        this.endDate = builder.endDate;
        this.scheduleDutyId = builder.scheduleDutyId;
        this.scheduleTypeIds = builder.scheduleTypeIds;
        this.startDate = builder.startDate;
        this.typeWorkerList = builder.typeWorkerList;
        this.updateTime = builder.updateTime;
        this.workDate = builder.workDate;
        this.workType = builder.workType;
        this.workerId = builder.workerId;
        this.workerName = builder.workerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduleDuty create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return scheduleDutyId
     */
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

    /**
     * @return scheduleTypeIds
     */
    public java.util.List < String > getScheduleTypeIds() {
        return this.scheduleTypeIds;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return typeWorkerList
     */
    public java.util.List < TypeWorkerList> getTypeWorkerList() {
        return this.typeWorkerList;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return workDate
     */
    public String getWorkDate() {
        return this.workDate;
    }

    /**
     * @return workType
     */
    public String getWorkType() {
        return this.workType;
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
        private String endDate; 
        private String scheduleDutyId; 
        private java.util.List < String > scheduleTypeIds; 
        private String startDate; 
        private java.util.List < TypeWorkerList> typeWorkerList; 
        private String updateTime; 
        private String workDate; 
        private String workType; 
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
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * ScheduleDutyId.
         */
        public Builder scheduleDutyId(String scheduleDutyId) {
            this.scheduleDutyId = scheduleDutyId;
            return this;
        }

        /**
         * ScheduleTypeIds.
         */
        public Builder scheduleTypeIds(java.util.List < String > scheduleTypeIds) {
            this.scheduleTypeIds = scheduleTypeIds;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * TypeWorkerList.
         */
        public Builder typeWorkerList(java.util.List < TypeWorkerList> typeWorkerList) {
            this.typeWorkerList = typeWorkerList;
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
         * WorkDate.
         */
        public Builder workDate(String workDate) {
            this.workDate = workDate;
            return this;
        }

        /**
         * WorkType.
         */
        public Builder workType(String workType) {
            this.workType = workType;
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

        public ScheduleDuty build() {
            return new ScheduleDuty(this);
        } 

    } 

    public static class TypeWorkerList extends TeaModel {
        @NameInMap("ScheduleTypeId")
        private String scheduleTypeId;

        @NameInMap("ScheduleWorkerName")
        private java.util.List < String > scheduleWorkerName;

        private TypeWorkerList(Builder builder) {
            this.scheduleTypeId = builder.scheduleTypeId;
            this.scheduleWorkerName = builder.scheduleWorkerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeWorkerList create() {
            return builder().build();
        }

        /**
         * @return scheduleTypeId
         */
        public String getScheduleTypeId() {
            return this.scheduleTypeId;
        }

        /**
         * @return scheduleWorkerName
         */
        public java.util.List < String > getScheduleWorkerName() {
            return this.scheduleWorkerName;
        }

        public static final class Builder {
            private String scheduleTypeId; 
            private java.util.List < String > scheduleWorkerName; 

            /**
             * ScheduleTypeId.
             */
            public Builder scheduleTypeId(String scheduleTypeId) {
                this.scheduleTypeId = scheduleTypeId;
                return this;
            }

            /**
             * ScheduleWorkerName.
             */
            public Builder scheduleWorkerName(java.util.List < String > scheduleWorkerName) {
                this.scheduleWorkerName = scheduleWorkerName;
                return this;
            }

            public TypeWorkerList build() {
                return new TypeWorkerList(this);
            } 

        } 

    }
}
