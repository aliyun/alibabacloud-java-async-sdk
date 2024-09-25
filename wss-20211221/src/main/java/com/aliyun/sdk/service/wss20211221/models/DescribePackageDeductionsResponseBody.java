// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackageDeductionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackageDeductionsResponseBody</p>
 */
public class DescribePackageDeductionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Deductions")
    private java.util.List < Deductions> deductions;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePackageDeductionsResponseBody(Builder builder) {
        this.deductions = builder.deductions;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageDeductionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deductions
     */
    public java.util.List < Deductions> getDeductions() {
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

    public static final class Builder {
        private java.util.List < Deductions> deductions; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Deductions.
         */
        public Builder deductions(java.util.List < Deductions> deductions) {
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

        public DescribePackageDeductionsResponseBody build() {
            return new DescribePackageDeductionsResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("InstanceState")
        private String instanceState;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StaTime")
        private String staTime;

        @com.aliyun.core.annotation.NameInMap("UsedCoreTime")
        private Float usedCoreTime;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        private Deductions(Builder builder) {
            this.cpu = builder.cpu;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopType = builder.desktopType;
            this.endTime = builder.endTime;
            this.instanceState = builder.instanceState;
            this.memory = builder.memory;
            this.osType = builder.osType;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.staTime = builder.staTime;
            this.usedCoreTime = builder.usedCoreTime;
            this.usedTime = builder.usedTime;
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
         * @return instanceState
         */
        public String getInstanceState() {
            return this.instanceState;
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

        public static final class Builder {
            private Integer cpu; 
            private String desktopId; 
            private String desktopName; 
            private String desktopType; 
            private String endTime; 
            private String instanceState; 
            private Long memory; 
            private String osType; 
            private String regionId; 
            private String resourceType; 
            private String staTime; 
            private Float usedCoreTime; 
            private Long usedTime; 

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
             * InstanceState.
             */
            public Builder instanceState(String instanceState) {
                this.instanceState = instanceState;
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

            public Deductions build() {
                return new Deductions(this);
            } 

        } 

    }
}
