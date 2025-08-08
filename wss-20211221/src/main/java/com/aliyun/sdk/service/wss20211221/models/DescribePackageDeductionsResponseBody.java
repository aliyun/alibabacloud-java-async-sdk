// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePackageDeductionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackageDeductionsResponseBody</p>
 */
public class DescribePackageDeductionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Deductions")
    private java.util.List<Deductions> deductions;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalUsedCoreTime")
    private Float totalUsedCoreTime;

    @com.aliyun.core.annotation.NameInMap("TotalUsedTime")
    private Long totalUsedTime;

    private DescribePackageDeductionsResponseBody(Builder builder) {
        this.deductions = builder.deductions;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalUsedCoreTime = builder.totalUsedCoreTime;
        this.totalUsedTime = builder.totalUsedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageDeductionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deductions
     */
    public java.util.List<Deductions> getDeductions() {
        return this.deductions;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalUsedCoreTime
     */
    public Float getTotalUsedCoreTime() {
        return this.totalUsedCoreTime;
    }

    /**
     * @return totalUsedTime
     */
    public Long getTotalUsedTime() {
        return this.totalUsedTime;
    }

    public static final class Builder {
        private java.util.List<Deductions> deductions; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private Float totalUsedCoreTime; 
        private Long totalUsedTime; 

        private Builder() {
        } 

        private Builder(DescribePackageDeductionsResponseBody model) {
            this.deductions = model.deductions;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalUsedCoreTime = model.totalUsedCoreTime;
            this.totalUsedTime = model.totalUsedTime;
        } 

        /**
         * Deductions.
         */
        public Builder deductions(java.util.List<Deductions> deductions) {
            this.deductions = deductions;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalUsedCoreTime.
         */
        public Builder totalUsedCoreTime(Float totalUsedCoreTime) {
            this.totalUsedCoreTime = totalUsedCoreTime;
            return this;
        }

        /**
         * TotalUsedTime.
         */
        public Builder totalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }

        public DescribePackageDeductionsResponseBody build() {
            return new DescribePackageDeductionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePackageDeductionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePackageDeductionsResponseBody</p>
     */
    public static class Deductions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GroupResourceType")
        private String groupResourceType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceState")
        private String instanceState;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StaTime")
        private String staTime;

        @com.aliyun.core.annotation.NameInMap("UsedCoreTime")
        private Float usedCoreTime;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        @com.aliyun.core.annotation.NameInMap("UsedTimeWithScale")
        private Long usedTimeWithScale;

        private Deductions(Builder builder) {
            this.cpu = builder.cpu;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopType = builder.desktopType;
            this.endTime = builder.endTime;
            this.groupResourceType = builder.groupResourceType;
            this.instanceId = builder.instanceId;
            this.instanceState = builder.instanceState;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.osType = builder.osType;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.sessionId = builder.sessionId;
            this.staTime = builder.staTime;
            this.usedCoreTime = builder.usedCoreTime;
            this.usedTime = builder.usedTime;
            this.usedTimeWithScale = builder.usedTimeWithScale;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deductions create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return groupResourceType
         */
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceState
         */
        public String getInstanceState() {
            return this.instanceState;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return staTime
         */
        public String getStaTime() {
            return this.staTime;
        }

        /**
         * @return usedCoreTime
         */
        public Float getUsedCoreTime() {
            return this.usedCoreTime;
        }

        /**
         * @return usedTime
         */
        public Long getUsedTime() {
            return this.usedTime;
        }

        /**
         * @return usedTimeWithScale
         */
        public Long getUsedTimeWithScale() {
            return this.usedTimeWithScale;
        }

        public static final class Builder {
            private Integer cpu; 
            private String desktopId; 
            private String desktopName; 
            private String desktopType; 
            private String endTime; 
            private String groupResourceType; 
            private String instanceId; 
            private String instanceState; 
            private String instanceType; 
            private Long memory; 
            private String osType; 
            private String regionId; 
            private String resourceType; 
            private String sessionId; 
            private String staTime; 
            private Float usedCoreTime; 
            private Long usedTime; 
            private Long usedTimeWithScale; 

            private Builder() {
            } 

            private Builder(Deductions model) {
                this.cpu = model.cpu;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopType = model.desktopType;
                this.endTime = model.endTime;
                this.groupResourceType = model.groupResourceType;
                this.instanceId = model.instanceId;
                this.instanceState = model.instanceState;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
                this.osType = model.osType;
                this.regionId = model.regionId;
                this.resourceType = model.resourceType;
                this.sessionId = model.sessionId;
                this.staTime = model.staTime;
                this.usedCoreTime = model.usedCoreTime;
                this.usedTime = model.usedTime;
                this.usedTimeWithScale = model.usedTimeWithScale;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * DesktopType.
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GroupResourceType.
             */
            public Builder groupResourceType(String groupResourceType) {
                this.groupResourceType = groupResourceType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceState.
             */
            public Builder instanceState(String instanceState) {
                this.instanceState = instanceState;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * StaTime.
             */
            public Builder staTime(String staTime) {
                this.staTime = staTime;
                return this;
            }

            /**
             * UsedCoreTime.
             */
            public Builder usedCoreTime(Float usedCoreTime) {
                this.usedCoreTime = usedCoreTime;
                return this;
            }

            /**
             * UsedTime.
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            /**
             * UsedTimeWithScale.
             */
            public Builder usedTimeWithScale(Long usedTimeWithScale) {
                this.usedTimeWithScale = usedTimeWithScale;
                return this;
            }

            public Deductions build() {
                return new Deductions(this);
            } 

        } 

    }
}
