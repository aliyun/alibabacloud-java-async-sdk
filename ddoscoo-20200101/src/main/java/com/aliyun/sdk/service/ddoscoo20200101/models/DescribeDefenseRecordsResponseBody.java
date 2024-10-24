// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDefenseRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRecordsResponseBody</p>
 */
public class DescribeDefenseRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefenseRecords")
    private java.util.List < DefenseRecords> defenseRecords;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>An array that consists of details of the log of an advanced mitigation session.</p>
         */
        public Builder defenseRecords(java.util.List < DefenseRecords> defenseRecords) {
            this.defenseRecords = defenseRecords;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of advanced mitigation sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseRecordsResponseBody build() {
            return new DescribeDefenseRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseRecordsResponseBody</p>
     */
    public static class DefenseRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackPeak")
        private Long attackPeak;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Integer eventCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The peak attack traffic. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>6584186000</p>
             */
            public Builder attackPeak(Long attackPeak) {
                this.attackPeak = attackPeak;
                return this;
            }

            /**
             * <p>The end time of the advanced mitigation session. This value is a UNIX timestamp. Units: miliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583683200000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder eventCount(Integer eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-mp91j1ao****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The start time of the advanced mitigation session. This value is a UNIX timestamp. Units: miliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1582992000000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the advanced mitigation session. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The advanced mitigation session is being used.</li>
             * <li><strong>1</strong>: The advanced mitigation session is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
