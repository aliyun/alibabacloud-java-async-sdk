// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link DescribeCorePackageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCorePackageListResponseBody</p>
 */
public class DescribeCorePackageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CorePackageInfo")
    private CorePackageInfo corePackageInfo;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeCorePackageListResponseBody(Builder builder) {
        this.code = builder.code;
        this.corePackageInfo = builder.corePackageInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCorePackageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return corePackageInfo
     */
    public CorePackageInfo getCorePackageInfo() {
        return this.corePackageInfo;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private CorePackageInfo corePackageInfo; 
        private String message; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeCorePackageListResponseBody model) {
            this.code = model.code;
            this.corePackageInfo = model.corePackageInfo;
            this.message = model.message;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CorePackageInfo.
         */
        public Builder corePackageInfo(CorePackageInfo corePackageInfo) {
            this.corePackageInfo = corePackageInfo;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeCorePackageListResponseBody build() {
            return new DescribeCorePackageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCorePackageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCorePackageListResponseBody</p>
     */
    public static class RemainingPeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodEndTime")
        private String periodEndTime;

        @com.aliyun.core.annotation.NameInMap("PeriodStartTime")
        private String periodStartTime;

        @com.aliyun.core.annotation.NameInMap("RemainingCoreHours")
        private Float remainingCoreHours;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalCoreHours")
        private Float totalCoreHours;

        @com.aliyun.core.annotation.NameInMap("UsedCoreHours")
        private Float usedCoreHours;

        private RemainingPeriods(Builder builder) {
            this.periodEndTime = builder.periodEndTime;
            this.periodStartTime = builder.periodStartTime;
            this.remainingCoreHours = builder.remainingCoreHours;
            this.status = builder.status;
            this.totalCoreHours = builder.totalCoreHours;
            this.usedCoreHours = builder.usedCoreHours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemainingPeriods create() {
            return builder().build();
        }

        /**
         * @return periodEndTime
         */
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        /**
         * @return periodStartTime
         */
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        /**
         * @return remainingCoreHours
         */
        public Float getRemainingCoreHours() {
            return this.remainingCoreHours;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCoreHours
         */
        public Float getTotalCoreHours() {
            return this.totalCoreHours;
        }

        /**
         * @return usedCoreHours
         */
        public Float getUsedCoreHours() {
            return this.usedCoreHours;
        }

        public static final class Builder {
            private String periodEndTime; 
            private String periodStartTime; 
            private Float remainingCoreHours; 
            private String status; 
            private Float totalCoreHours; 
            private Float usedCoreHours; 

            private Builder() {
            } 

            private Builder(RemainingPeriods model) {
                this.periodEndTime = model.periodEndTime;
                this.periodStartTime = model.periodStartTime;
                this.remainingCoreHours = model.remainingCoreHours;
                this.status = model.status;
                this.totalCoreHours = model.totalCoreHours;
                this.usedCoreHours = model.usedCoreHours;
            } 

            /**
             * PeriodEndTime.
             */
            public Builder periodEndTime(String periodEndTime) {
                this.periodEndTime = periodEndTime;
                return this;
            }

            /**
             * PeriodStartTime.
             */
            public Builder periodStartTime(String periodStartTime) {
                this.periodStartTime = periodStartTime;
                return this;
            }

            /**
             * RemainingCoreHours.
             */
            public Builder remainingCoreHours(Float remainingCoreHours) {
                this.remainingCoreHours = remainingCoreHours;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCoreHours.
             */
            public Builder totalCoreHours(Float totalCoreHours) {
                this.totalCoreHours = totalCoreHours;
                return this;
            }

            /**
             * UsedCoreHours.
             */
            public Builder usedCoreHours(Float usedCoreHours) {
                this.usedCoreHours = usedCoreHours;
                return this;
            }

            public RemainingPeriods build() {
                return new RemainingPeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCorePackageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCorePackageListResponseBody</p>
     */
    public static class CorePackageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedCoreHours")
        private Float assignedCoreHours;

        @com.aliyun.core.annotation.NameInMap("DeductionInstanceList")
        private java.util.List<?> deductionInstanceList;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PeriodEndTime")
        private String periodEndTime;

        @com.aliyun.core.annotation.NameInMap("PeriodStartTime")
        private String periodStartTime;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RemainingCoreHours")
        private Float remainingCoreHours;

        @com.aliyun.core.annotation.NameInMap("RemainingPeriods")
        private java.util.List<RemainingPeriods> remainingPeriods;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalCoreHours")
        private Float totalCoreHours;

        @com.aliyun.core.annotation.NameInMap("UnassignedCoreHours")
        private Float unassignedCoreHours;

        @com.aliyun.core.annotation.NameInMap("UsedCoreHours")
        private Float usedCoreHours;

        private CorePackageList(Builder builder) {
            this.assignedCoreHours = builder.assignedCoreHours;
            this.deductionInstanceList = builder.deductionInstanceList;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.periodEndTime = builder.periodEndTime;
            this.periodStartTime = builder.periodStartTime;
            this.productType = builder.productType;
            this.remainingCoreHours = builder.remainingCoreHours;
            this.remainingPeriods = builder.remainingPeriods;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalCoreHours = builder.totalCoreHours;
            this.unassignedCoreHours = builder.unassignedCoreHours;
            this.usedCoreHours = builder.usedCoreHours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorePackageList create() {
            return builder().build();
        }

        /**
         * @return assignedCoreHours
         */
        public Float getAssignedCoreHours() {
            return this.assignedCoreHours;
        }

        /**
         * @return deductionInstanceList
         */
        public java.util.List<?> getDeductionInstanceList() {
            return this.deductionInstanceList;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return periodEndTime
         */
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        /**
         * @return periodStartTime
         */
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return remainingCoreHours
         */
        public Float getRemainingCoreHours() {
            return this.remainingCoreHours;
        }

        /**
         * @return remainingPeriods
         */
        public java.util.List<RemainingPeriods> getRemainingPeriods() {
            return this.remainingPeriods;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCoreHours
         */
        public Float getTotalCoreHours() {
            return this.totalCoreHours;
        }

        /**
         * @return unassignedCoreHours
         */
        public Float getUnassignedCoreHours() {
            return this.unassignedCoreHours;
        }

        /**
         * @return usedCoreHours
         */
        public Float getUsedCoreHours() {
            return this.usedCoreHours;
        }

        public static final class Builder {
            private Float assignedCoreHours; 
            private java.util.List<?> deductionInstanceList; 
            private String expireTime; 
            private String instanceId; 
            private String periodEndTime; 
            private String periodStartTime; 
            private String productType; 
            private Float remainingCoreHours; 
            private java.util.List<RemainingPeriods> remainingPeriods; 
            private String startTime; 
            private String status; 
            private Float totalCoreHours; 
            private Float unassignedCoreHours; 
            private Float usedCoreHours; 

            private Builder() {
            } 

            private Builder(CorePackageList model) {
                this.assignedCoreHours = model.assignedCoreHours;
                this.deductionInstanceList = model.deductionInstanceList;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.periodEndTime = model.periodEndTime;
                this.periodStartTime = model.periodStartTime;
                this.productType = model.productType;
                this.remainingCoreHours = model.remainingCoreHours;
                this.remainingPeriods = model.remainingPeriods;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalCoreHours = model.totalCoreHours;
                this.unassignedCoreHours = model.unassignedCoreHours;
                this.usedCoreHours = model.usedCoreHours;
            } 

            /**
             * AssignedCoreHours.
             */
            public Builder assignedCoreHours(Float assignedCoreHours) {
                this.assignedCoreHours = assignedCoreHours;
                return this;
            }

            /**
             * DeductionInstanceList.
             */
            public Builder deductionInstanceList(java.util.List<?> deductionInstanceList) {
                this.deductionInstanceList = deductionInstanceList;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
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
             * PeriodEndTime.
             */
            public Builder periodEndTime(String periodEndTime) {
                this.periodEndTime = periodEndTime;
                return this;
            }

            /**
             * PeriodStartTime.
             */
            public Builder periodStartTime(String periodStartTime) {
                this.periodStartTime = periodStartTime;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RemainingCoreHours.
             */
            public Builder remainingCoreHours(Float remainingCoreHours) {
                this.remainingCoreHours = remainingCoreHours;
                return this;
            }

            /**
             * RemainingPeriods.
             */
            public Builder remainingPeriods(java.util.List<RemainingPeriods> remainingPeriods) {
                this.remainingPeriods = remainingPeriods;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCoreHours.
             */
            public Builder totalCoreHours(Float totalCoreHours) {
                this.totalCoreHours = totalCoreHours;
                return this;
            }

            /**
             * UnassignedCoreHours.
             */
            public Builder unassignedCoreHours(Float unassignedCoreHours) {
                this.unassignedCoreHours = unassignedCoreHours;
                return this;
            }

            /**
             * UsedCoreHours.
             */
            public Builder usedCoreHours(Float usedCoreHours) {
                this.usedCoreHours = usedCoreHours;
                return this;
            }

            public CorePackageList build() {
                return new CorePackageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCorePackageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCorePackageListResponseBody</p>
     */
    public static class CorePackageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorePackageList")
        private java.util.List<CorePackageList> corePackageList;

        @com.aliyun.core.annotation.NameInMap("SummaryRemainingCoreHours")
        private Float summaryRemainingCoreHours;

        private CorePackageInfo(Builder builder) {
            this.corePackageList = builder.corePackageList;
            this.summaryRemainingCoreHours = builder.summaryRemainingCoreHours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorePackageInfo create() {
            return builder().build();
        }

        /**
         * @return corePackageList
         */
        public java.util.List<CorePackageList> getCorePackageList() {
            return this.corePackageList;
        }

        /**
         * @return summaryRemainingCoreHours
         */
        public Float getSummaryRemainingCoreHours() {
            return this.summaryRemainingCoreHours;
        }

        public static final class Builder {
            private java.util.List<CorePackageList> corePackageList; 
            private Float summaryRemainingCoreHours; 

            private Builder() {
            } 

            private Builder(CorePackageInfo model) {
                this.corePackageList = model.corePackageList;
                this.summaryRemainingCoreHours = model.summaryRemainingCoreHours;
            } 

            /**
             * CorePackageList.
             */
            public Builder corePackageList(java.util.List<CorePackageList> corePackageList) {
                this.corePackageList = corePackageList;
                return this;
            }

            /**
             * SummaryRemainingCoreHours.
             */
            public Builder summaryRemainingCoreHours(Float summaryRemainingCoreHours) {
                this.summaryRemainingCoreHours = summaryRemainingCoreHours;
                return this;
            }

            public CorePackageInfo build() {
                return new CorePackageInfo(this);
            } 

        } 

    }
}
