// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRecordsResponseBody</p>
 */
public class DescribeDefenseRecordsResponseBody extends TeaModel {
    @NameInMap("DefenseRecords")
    private java.util.List < DefenseRecords> defenseRecords;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseRecordsResponseBody(Builder builder) {
        this.defenseRecords = builder.defenseRecords;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return defenseRecords
     */
    public java.util.List < DefenseRecords> getDefenseRecords() {
        return this.defenseRecords;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DefenseRecords> defenseRecords; 
        private String requestId; 
        private Long totalCount; 

        /**
         * An array that consists of details of the log of an advanced mitigation session.
         */
        public Builder defenseRecords(java.util.List < DefenseRecords> defenseRecords) {
            this.defenseRecords = defenseRecords;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of advanced mitigation sessions.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseRecordsResponseBody build() {
            return new DescribeDefenseRecordsResponseBody(this);
        } 

    } 

    public static class DefenseRecords extends TeaModel {
        @NameInMap("AttackPeak")
        private Long attackPeak;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EventCount")
        private Integer eventCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        private DefenseRecords(Builder builder) {
            this.attackPeak = builder.attackPeak;
            this.endTime = builder.endTime;
            this.eventCount = builder.eventCount;
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefenseRecords create() {
            return builder().build();
        }

        /**
         * @return attackPeak
         */
        public Long getAttackPeak() {
            return this.attackPeak;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventCount
         */
        public Integer getEventCount() {
            return this.eventCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long attackPeak; 
            private Long endTime; 
            private Integer eventCount; 
            private String instanceId; 
            private Long startTime; 
            private Integer status; 

            /**
             * The peak attack traffic. Unit: bit/s.
             */
            public Builder attackPeak(Long attackPeak) {
                this.attackPeak = attackPeak;
                return this;
            }

            /**
             * The end time of the advanced mitigation session. This value is a UNIX timestamp. Units: miliseconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The number of attacks.
             */
            public Builder eventCount(Integer eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The start time of the advanced mitigation session. This value is a UNIX timestamp. Units: miliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the advanced mitigation session. Valid values:
             * <p>
             * 
             * *   **0**: The advanced mitigation session is being used.
             * *   **1**: The advanced mitigation session is used.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DefenseRecords build() {
                return new DefenseRecords(this);
            } 

        } 

    }
}
