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
 * {@link DescribeDeductionStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeductionStatisticResponseBody</p>
 */
public class DescribeDeductionStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDeductionStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeductionStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDeductionStatisticResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeductionStatisticResponseBody build() {
            return new DescribeDeductionStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeductionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductionStatisticResponseBody</p>
     */
    public static class AvailableCorePackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupResourceType")
        private String groupResourceType;

        @com.aliyun.core.annotation.NameInMap("NoLx")
        private Boolean noLx;

        @com.aliyun.core.annotation.NameInMap("NoLxSource")
        private String noLxSource;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        private AvailableCorePackages(Builder builder) {
            this.aliUid = builder.aliUid;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.expiredTime = builder.expiredTime;
            this.groupId = builder.groupId;
            this.groupResourceType = builder.groupResourceType;
            this.noLx = builder.noLx;
            this.noLxSource = builder.noLxSource;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalTime = builder.totalTime;
            this.usedTime = builder.usedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableCorePackages create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupResourceType
         */
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        /**
         * @return noLx
         */
        public Boolean getNoLx() {
            return this.noLx;
        }

        /**
         * @return noLxSource
         */
        public String getNoLxSource() {
            return this.noLxSource;
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
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return usedTime
         */
        public Long getUsedTime() {
            return this.usedTime;
        }

        public static final class Builder {
            private Long aliUid; 
            private String createTime; 
            private String endTime; 
            private String expiredTime; 
            private String groupId; 
            private String groupResourceType; 
            private Boolean noLx; 
            private String noLxSource; 
            private String resourceId; 
            private String resourceType; 
            private String startTime; 
            private String status; 
            private Long totalTime; 
            private Long usedTime; 

            private Builder() {
            } 

            private Builder(AvailableCorePackages model) {
                this.aliUid = model.aliUid;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.expiredTime = model.expiredTime;
                this.groupId = model.groupId;
                this.groupResourceType = model.groupResourceType;
                this.noLx = model.noLx;
                this.noLxSource = model.noLxSource;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalTime = model.totalTime;
                this.usedTime = model.usedTime;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
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
             * NoLx.
             */
            public Builder noLx(Boolean noLx) {
                this.noLx = noLx;
                return this;
            }

            /**
             * NoLxSource.
             */
            public Builder noLxSource(String noLxSource) {
                this.noLxSource = noLxSource;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
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
             * TotalTime.
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * UsedTime.
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            public AvailableCorePackages build() {
                return new AvailableCorePackages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeductionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductionStatisticResponseBody</p>
     */
    public static class Deductions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeSecond")
        private Long consumeSecond;

        @com.aliyun.core.annotation.NameInMap("DeductionDate")
        private String deductionDate;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Deductions(Builder builder) {
            this.consumeSecond = builder.consumeSecond;
            this.deductionDate = builder.deductionDate;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deductions create() {
            return builder().build();
        }

        /**
         * @return consumeSecond
         */
        public Long getConsumeSecond() {
            return this.consumeSecond;
        }

        /**
         * @return deductionDate
         */
        public String getDeductionDate() {
            return this.deductionDate;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long consumeSecond; 
            private String deductionDate; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Deductions model) {
                this.consumeSecond = model.consumeSecond;
                this.deductionDate = model.deductionDate;
                this.resourceType = model.resourceType;
            } 

            /**
             * ConsumeSecond.
             */
            public Builder consumeSecond(Long consumeSecond) {
                this.consumeSecond = consumeSecond;
                return this;
            }

            /**
             * DeductionDate.
             */
            public Builder deductionDate(String deductionDate) {
                this.deductionDate = deductionDate;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Deductions build() {
                return new Deductions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeductionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductionStatisticResponseBody</p>
     */
    public static class Usages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeSecond")
        private Long consumeSecond;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Usages(Builder builder) {
            this.consumeSecond = builder.consumeSecond;
            this.period = builder.period;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usages create() {
            return builder().build();
        }

        /**
         * @return consumeSecond
         */
        public Long getConsumeSecond() {
            return this.consumeSecond;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long consumeSecond; 
            private String period; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Usages model) {
                this.consumeSecond = model.consumeSecond;
                this.period = model.period;
                this.resourceType = model.resourceType;
            } 

            /**
             * ConsumeSecond.
             */
            public Builder consumeSecond(Long consumeSecond) {
                this.consumeSecond = consumeSecond;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Usages build() {
                return new Usages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeductionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductionStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCorePackages")
        private java.util.List<AvailableCorePackages> availableCorePackages;

        @com.aliyun.core.annotation.NameInMap("Deductions")
        private java.util.List<Deductions> deductions;

        @com.aliyun.core.annotation.NameInMap("Usages")
        private java.util.List<Usages> usages;

        private Data(Builder builder) {
            this.availableCorePackages = builder.availableCorePackages;
            this.deductions = builder.deductions;
            this.usages = builder.usages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableCorePackages
         */
        public java.util.List<AvailableCorePackages> getAvailableCorePackages() {
            return this.availableCorePackages;
        }

        /**
         * @return deductions
         */
        public java.util.List<Deductions> getDeductions() {
            return this.deductions;
        }

        /**
         * @return usages
         */
        public java.util.List<Usages> getUsages() {
            return this.usages;
        }

        public static final class Builder {
            private java.util.List<AvailableCorePackages> availableCorePackages; 
            private java.util.List<Deductions> deductions; 
            private java.util.List<Usages> usages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.availableCorePackages = model.availableCorePackages;
                this.deductions = model.deductions;
                this.usages = model.usages;
            } 

            /**
             * AvailableCorePackages.
             */
            public Builder availableCorePackages(java.util.List<AvailableCorePackages> availableCorePackages) {
                this.availableCorePackages = availableCorePackages;
                return this;
            }

            /**
             * Deductions.
             */
            public Builder deductions(java.util.List<Deductions> deductions) {
                this.deductions = deductions;
                return this;
            }

            /**
             * Usages.
             */
            public Builder usages(java.util.List<Usages> usages) {
                this.usages = usages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
