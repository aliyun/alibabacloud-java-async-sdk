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

    @com.aliyun.core.annotation.NameInMap("TotalUsedTimeDecimal")
    private String totalUsedTimeDecimal;

    private DescribePackageDeductionsResponseBody(Builder builder) {
        this.deductions = builder.deductions;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalUsedCoreTime = builder.totalUsedCoreTime;
        this.totalUsedTime = builder.totalUsedTime;
        this.totalUsedTimeDecimal = builder.totalUsedTimeDecimal;
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

    /**
     * @return totalUsedTimeDecimal
     */
    public String getTotalUsedTimeDecimal() {
        return this.totalUsedTimeDecimal;
    }

    public static final class Builder {
        private java.util.List<Deductions> deductions; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private Float totalUsedCoreTime; 
        private Long totalUsedTime; 
        private String totalUsedTimeDecimal; 

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
            this.totalUsedTimeDecimal = model.totalUsedTimeDecimal;
        } 

        /**
         * <p>The list of deduction details.</p>
         */
        public Builder deductions(java.util.List<Deductions> deductions) {
            this.deductions = deductions;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page in the Settings for paging during a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>833C4D2C-09C7-5CE6-8159-06758B964970</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of core-hour package deduction details queried.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total deducted core-hours.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1</p>
         */
        public Builder totalUsedCoreTime(Float totalUsedCoreTime) {
            this.totalUsedCoreTime = totalUsedCoreTime;
            return this;
        }

        /**
         * <p>The total usage duration.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder totalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }

        /**
         * <p>The total usage calculated by using a precision factor, rounded to four decimal places. This field uses the same metering criteria as UsedTimeDecimal in the details.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0000</p>
         */
        public Builder totalUsedTimeDecimal(String totalUsedTimeDecimal) {
            this.totalUsedTimeDecimal = totalUsedTimeDecimal;
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
        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DeductionRequestId")
        private String deductionRequestId;

        @com.aliyun.core.annotation.NameInMap("DeductionType")
        private String deductionType;

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

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StaTime")
        private String staTime;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("UsedCoreTime")
        private Float usedCoreTime;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        @com.aliyun.core.annotation.NameInMap("UsedTimeDecimal")
        private String usedTimeDecimal;

        @com.aliyun.core.annotation.NameInMap("UsedTimeWithScale")
        private Long usedTimeWithScale;

        private Deductions(Builder builder) {
            this.agentType = builder.agentType;
            this.cpu = builder.cpu;
            this.deductionRequestId = builder.deductionRequestId;
            this.deductionType = builder.deductionType;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopType = builder.desktopType;
            this.endTime = builder.endTime;
            this.groupResourceType = builder.groupResourceType;
            this.instanceId = builder.instanceId;
            this.instanceState = builder.instanceState;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.model = builder.model;
            this.osType = builder.osType;
            this.packageId = builder.packageId;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.sessionId = builder.sessionId;
            this.staTime = builder.staTime;
            this.summary = builder.summary;
            this.usedCoreTime = builder.usedCoreTime;
            this.usedTime = builder.usedTime;
            this.usedTimeDecimal = builder.usedTimeDecimal;
            this.usedTimeWithScale = builder.usedTimeWithScale;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deductions create() {
            return builder().build();
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return deductionRequestId
         */
        public String getDeductionRequestId() {
            return this.deductionRequestId;
        }

        /**
         * @return deductionType
         */
        public String getDeductionType() {
            return this.deductionType;
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
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
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
         * @return summary
         */
        public String getSummary() {
            return this.summary;
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
         * @return usedTimeDecimal
         */
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

        /**
         * @return usedTimeWithScale
         */
        public Long getUsedTimeWithScale() {
            return this.usedTimeWithScale;
        }

        public static final class Builder {
            private String agentType; 
            private Integer cpu; 
            private String deductionRequestId; 
            private String deductionType; 
            private String desktopId; 
            private String desktopName; 
            private String desktopType; 
            private String endTime; 
            private String groupResourceType; 
            private String instanceId; 
            private String instanceState; 
            private String instanceType; 
            private Long memory; 
            private String model; 
            private String osType; 
            private String packageId; 
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String sessionId; 
            private String staTime; 
            private String summary; 
            private Float usedCoreTime; 
            private Long usedTime; 
            private String usedTimeDecimal; 
            private Long usedTimeWithScale; 

            private Builder() {
            } 

            private Builder(Deductions model) {
                this.agentType = model.agentType;
                this.cpu = model.cpu;
                this.deductionRequestId = model.deductionRequestId;
                this.deductionType = model.deductionType;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopType = model.desktopType;
                this.endTime = model.endTime;
                this.groupResourceType = model.groupResourceType;
                this.instanceId = model.instanceId;
                this.instanceState = model.instanceState;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
                this.model = model.model;
                this.osType = model.osType;
                this.packageId = model.packageId;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.sessionId = model.sessionId;
                this.staTime = model.staTime;
                this.summary = model.summary;
                this.usedCoreTime = model.usedCoreTime;
                this.usedTime = model.usedTime;
                this.usedTimeDecimal = model.usedTimeDecimal;
                this.usedTimeWithScale = model.usedTimeWithScale;
            } 

            /**
             * <p>The agent type.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenClaw</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-xxxx</p>
             */
            public Builder deductionRequestId(String deductionRequestId) {
                this.deductionRequestId = deductionRequestId;
                return this;
            }

            /**
             * <p>The deduction types.</p>
             * 
             * <strong>example:</strong>
             * <p>KNOWLEDGE_SPACE/CONVESATION</p>
             */
            public Builder deductionType(String deductionType) {
                this.deductionType = deductionType;
                return this;
            }

            /**
             * <p>The Cloud Desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-6wye9optu0kag****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoComputer</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The specifications of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.enterprise_office.4c8g</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The end time of the deduction record in UTC. The format is yyyy-MM-ddTHH:mm:ssZ. For records aggregated by hour, the format can be yyyy-MM-ddTHH:mmZ with seconds omitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-31T03:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The group resource type to which the deduction record belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>GROUP_CORE_PACKAGE</p>
             */
            public Builder groupResourceType(String groupResourceType) {
                this.groupResourceType = groupResourceType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>A specific instance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the core-hour package.</p>
             * 
             * <strong>example:</strong>
             * <p>Deleted</p>
             */
            public Builder instanceState(String instanceState) {
                this.instanceState = instanceState;
                return this;
            }

            /**
             * <p>The instance specifications for the deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>ec.agentbay-pc</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-3.7</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The operating system type of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The ID of the credit package.</p>
             * 
             * <strong>example:</strong>
             * <p>crp-xxx</p>
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * <p>The region ID of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the first resource in the deduction item.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-xxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Desktop</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the session associated with the deduction record.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-123456****</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The start time of the deduction record in UTC. The format is yyyy-MM-ddTHH:mm:ssZ. For records aggregated by hour, the format can be yyyy-MM-ddTHH:mmZ with seconds omitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-31T02:00:00Z</p>
             */
            public Builder staTime(String staTime) {
                this.staTime = staTime;
                return this;
            }

            /**
             * <p>The summary.</p>
             * 
             * <strong>example:</strong>
             * <p>Summary of the AI query</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The number of cores deducted.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder usedCoreTime(Float usedCoreTime) {
                this.usedCoreTime = usedCoreTime;
                return this;
            }

            /**
             * <p>The usage duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            /**
             * <p>The usage calculated from UsedTime by using a precision factor, rounded to four decimal places. This field is returned only for applicable resource types and must be read based on the metering criteria of the corresponding resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0000</p>
             */
            public Builder usedTimeDecimal(String usedTimeDecimal) {
                this.usedTimeDecimal = usedTimeDecimal;
                return this;
            }

            /**
             * <p>The usage that includes the deduction coefficient. In scenarios where deduction is based on duration, the value is measured in seconds and returned as an integer.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
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
