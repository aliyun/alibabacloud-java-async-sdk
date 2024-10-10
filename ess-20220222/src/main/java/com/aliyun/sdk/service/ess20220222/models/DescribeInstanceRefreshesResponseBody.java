// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRefreshesResponseBody</p>
 */
public class DescribeInstanceRefreshesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRefreshTasks")
    private java.util.List < InstanceRefreshTasks> instanceRefreshTasks;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceRefreshesResponseBody(Builder builder) {
        this.instanceRefreshTasks = builder.instanceRefreshTasks;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRefreshesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceRefreshTasks
     */
    public java.util.List < InstanceRefreshTasks> getInstanceRefreshTasks() {
        return this.instanceRefreshTasks;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < InstanceRefreshTasks> instanceRefreshTasks; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceRefreshTasks.
         */
        public Builder instanceRefreshTasks(java.util.List < InstanceRefreshTasks> instanceRefreshTasks) {
            this.instanceRefreshTasks = instanceRefreshTasks;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceRefreshesResponseBody build() {
            return new DescribeInstanceRefreshesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
     */
    public static class DesiredConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        private DesiredConfiguration(Builder builder) {
            this.imageId = builder.imageId;
            this.scalingConfigurationId = builder.scalingConfigurationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesiredConfiguration create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return scalingConfigurationId
         */
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public static final class Builder {
            private String imageId; 
            private String scalingConfigurationId; 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ScalingConfigurationId.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            public DesiredConfiguration build() {
                return new DesiredConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
     */
    public static class InstanceRefreshTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredConfiguration")
        private DesiredConfiguration desiredConfiguration;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FinishedUpdateCapacity")
        private Integer finishedUpdateCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceRefreshTaskId")
        private String instanceRefreshTaskId;

        @com.aliyun.core.annotation.NameInMap("MaxHealthyPercentage")
        private Integer maxHealthyPercentage;

        @com.aliyun.core.annotation.NameInMap("MinHealthyPercentage")
        private Integer minHealthyPercentage;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalNeedUpdateCapacity")
        private Integer totalNeedUpdateCapacity;

        private InstanceRefreshTasks(Builder builder) {
            this.desiredConfiguration = builder.desiredConfiguration;
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.finishedUpdateCapacity = builder.finishedUpdateCapacity;
            this.instanceRefreshTaskId = builder.instanceRefreshTaskId;
            this.maxHealthyPercentage = builder.maxHealthyPercentage;
            this.minHealthyPercentage = builder.minHealthyPercentage;
            this.regionId = builder.regionId;
            this.scalingGroupId = builder.scalingGroupId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalNeedUpdateCapacity = builder.totalNeedUpdateCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRefreshTasks create() {
            return builder().build();
        }

        /**
         * @return desiredConfiguration
         */
        public DesiredConfiguration getDesiredConfiguration() {
            return this.desiredConfiguration;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return finishedUpdateCapacity
         */
        public Integer getFinishedUpdateCapacity() {
            return this.finishedUpdateCapacity;
        }

        /**
         * @return instanceRefreshTaskId
         */
        public String getInstanceRefreshTaskId() {
            return this.instanceRefreshTaskId;
        }

        /**
         * @return maxHealthyPercentage
         */
        public Integer getMaxHealthyPercentage() {
            return this.maxHealthyPercentage;
        }

        /**
         * @return minHealthyPercentage
         */
        public Integer getMinHealthyPercentage() {
            return this.minHealthyPercentage;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
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
         * @return totalNeedUpdateCapacity
         */
        public Integer getTotalNeedUpdateCapacity() {
            return this.totalNeedUpdateCapacity;
        }

        public static final class Builder {
            private DesiredConfiguration desiredConfiguration; 
            private String detail; 
            private String endTime; 
            private Integer finishedUpdateCapacity; 
            private String instanceRefreshTaskId; 
            private Integer maxHealthyPercentage; 
            private Integer minHealthyPercentage; 
            private String regionId; 
            private String scalingGroupId; 
            private String startTime; 
            private String status; 
            private Integer totalNeedUpdateCapacity; 

            /**
             * DesiredConfiguration.
             */
            public Builder desiredConfiguration(DesiredConfiguration desiredConfiguration) {
                this.desiredConfiguration = desiredConfiguration;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
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
             * FinishedUpdateCapacity.
             */
            public Builder finishedUpdateCapacity(Integer finishedUpdateCapacity) {
                this.finishedUpdateCapacity = finishedUpdateCapacity;
                return this;
            }

            /**
             * InstanceRefreshTaskId.
             */
            public Builder instanceRefreshTaskId(String instanceRefreshTaskId) {
                this.instanceRefreshTaskId = instanceRefreshTaskId;
                return this;
            }

            /**
             * MaxHealthyPercentage.
             */
            public Builder maxHealthyPercentage(Integer maxHealthyPercentage) {
                this.maxHealthyPercentage = maxHealthyPercentage;
                return this;
            }

            /**
             * MinHealthyPercentage.
             */
            public Builder minHealthyPercentage(Integer minHealthyPercentage) {
                this.minHealthyPercentage = minHealthyPercentage;
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
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
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
             * TotalNeedUpdateCapacity.
             */
            public Builder totalNeedUpdateCapacity(Integer totalNeedUpdateCapacity) {
                this.totalNeedUpdateCapacity = totalNeedUpdateCapacity;
                return this;
            }

            public InstanceRefreshTasks build() {
                return new InstanceRefreshTasks(this);
            } 

        } 

    }
}
