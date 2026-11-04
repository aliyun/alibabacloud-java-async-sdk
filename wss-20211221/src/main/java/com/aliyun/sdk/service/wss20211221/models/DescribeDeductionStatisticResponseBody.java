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
         * <p>The deduction data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
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
             * <p>The Alibaba Cloud UID.</p>
             * 
             * <strong>example:</strong>
             * <p>1568857911493620</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The creation time in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-31 23:59:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The expiration time in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-31 23:59:59</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-xxxxx</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The group resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>CoreHour</p>
             */
            public Builder groupResourceType(String groupResourceType) {
                this.groupResourceType = groupResourceType;
                return this;
            }

            /**
             * <p>Indicates whether LingXiao is excluded.</p>
             */
            public Builder noLx(Boolean noLx) {
                this.noLx = noLx;
                return this;
            }

            /**
             * <p>The source when LingXiao is excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>无凌霄来源示例值</p>
             */
            public Builder noLxSource(String noLxSource) {
                this.noLxSource = noLxSource;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>res-xxxxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The group resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>CoreHour</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The start time in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The used duration.</p>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
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
             * <p>The consumption duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7000</p>
             */
            public Builder consumeSecond(Long consumeSecond) {
                this.consumeSecond = consumeSecond;
                return this;
            }

            /**
             * <p>The deduction date in the YYYY-MM-DD format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01</p>
             */
            public Builder deductionDate(String deductionDate) {
                this.deductionDate = deductionDate;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudDesktop</p>
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
             * <p><strong>The consumption duration, in seconds.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder consumeSecond(Long consumeSecond) {
                this.consumeSecond = consumeSecond;
                return this;
            }

            /**
             * <p><strong>The time period.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p><strong>The resource type.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>CloudDesktop</p>
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
             * <p><strong>The list of available core-hour package resources.</strong></p>
             */
            public Builder availableCorePackages(java.util.List<AvailableCorePackages> availableCorePackages) {
                this.availableCorePackages = availableCorePackages;
                return this;
            }

            /**
             * <p>The deduction details.</p>
             */
            public Builder deductions(java.util.List<Deductions> deductions) {
                this.deductions = deductions;
                return this;
            }

            /**
             * <p><strong>The list of usage records.</strong></p>
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
