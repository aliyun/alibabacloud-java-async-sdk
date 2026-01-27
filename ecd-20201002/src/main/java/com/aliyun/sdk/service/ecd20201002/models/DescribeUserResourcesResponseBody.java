// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserResourcesResponseBody</p>
 */
public class DescribeUserResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QueryFailedResourceTypes")
    private java.util.List<String> queryFailedResourceTypes;

    @com.aliyun.core.annotation.NameInMap("RankVersion")
    private Long rankVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeUserResourcesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.queryFailedResourceTypes = builder.queryFailedResourceTypes;
        this.rankVersion = builder.rankVersion;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return queryFailedResourceTypes
     */
    public java.util.List<String> getQueryFailedResourceTypes() {
        return this.queryFailedResourceTypes;
    }

    /**
     * @return rankVersion
     */
    public Long getRankVersion() {
        return this.rankVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> queryFailedResourceTypes; 
        private Long rankVersion; 
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeUserResourcesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.queryFailedResourceTypes = model.queryFailedResourceTypes;
            this.rankVersion = model.rankVersion;
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>返回最大数量。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource types that failed to be queried.</p>
         */
        public Builder queryFailedResourceTypes(java.util.List<String> queryFailedResourceTypes) {
            this.queryFailedResourceTypes = queryFailedResourceTypes;
            return this;
        }

        /**
         * <p>The version number of the ranking data.</p>
         * 
         * <strong>example:</strong>
         * <p>1732869815062</p>
         */
        public Builder rankVersion(Long rankVersion) {
            this.rankVersion = rankVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>总数。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUserResourcesResponseBody build() {
            return new DescribeUserResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Clients(Builder builder) {
            this.clientType = builder.clientType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clientType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Clients model) {
                this.clientType = model.clientType;
                this.status = model.status;
            } 

            /**
             * <p>The client type.</p>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>OFF</li>
             * <li>ON</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class DesktopDurationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
        private String orderInstanceId;

        @com.aliyun.core.annotation.NameInMap("PackageCreationTime")
        private String packageCreationTime;

        @com.aliyun.core.annotation.NameInMap("PackageExpiredTime")
        private String packageExpiredTime;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("PackageStatus")
        private String packageStatus;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageUsedUpStrategy")
        private String packageUsedUpStrategy;

        @com.aliyun.core.annotation.NameInMap("PeriodEndTime")
        private String periodEndTime;

        @com.aliyun.core.annotation.NameInMap("PeriodStartTime")
        private String periodStartTime;

        @com.aliyun.core.annotation.NameInMap("PostPaidLimitFee")
        private Float postPaidLimitFee;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("UsedDuration")
        private Long usedDuration;

        private DesktopDurationList(Builder builder) {
            this.orderInstanceId = builder.orderInstanceId;
            this.packageCreationTime = builder.packageCreationTime;
            this.packageExpiredTime = builder.packageExpiredTime;
            this.packageId = builder.packageId;
            this.packageStatus = builder.packageStatus;
            this.packageType = builder.packageType;
            this.packageUsedUpStrategy = builder.packageUsedUpStrategy;
            this.periodEndTime = builder.periodEndTime;
            this.periodStartTime = builder.periodStartTime;
            this.postPaidLimitFee = builder.postPaidLimitFee;
            this.totalDuration = builder.totalDuration;
            this.usedDuration = builder.usedDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopDurationList create() {
            return builder().build();
        }

        /**
         * @return orderInstanceId
         */
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        /**
         * @return packageCreationTime
         */
        public String getPackageCreationTime() {
            return this.packageCreationTime;
        }

        /**
         * @return packageExpiredTime
         */
        public String getPackageExpiredTime() {
            return this.packageExpiredTime;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return packageStatus
         */
        public String getPackageStatus() {
            return this.packageStatus;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageUsedUpStrategy
         */
        public String getPackageUsedUpStrategy() {
            return this.packageUsedUpStrategy;
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
         * @return postPaidLimitFee
         */
        public Float getPostPaidLimitFee() {
            return this.postPaidLimitFee;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return usedDuration
         */
        public Long getUsedDuration() {
            return this.usedDuration;
        }

        public static final class Builder {
            private String orderInstanceId; 
            private String packageCreationTime; 
            private String packageExpiredTime; 
            private String packageId; 
            private String packageStatus; 
            private String packageType; 
            private String packageUsedUpStrategy; 
            private String periodEndTime; 
            private String periodStartTime; 
            private Float postPaidLimitFee; 
            private Long totalDuration; 
            private Long usedDuration; 

            private Builder() {
            } 

            private Builder(DesktopDurationList model) {
                this.orderInstanceId = model.orderInstanceId;
                this.packageCreationTime = model.packageCreationTime;
                this.packageExpiredTime = model.packageExpiredTime;
                this.packageId = model.packageId;
                this.packageStatus = model.packageStatus;
                this.packageType = model.packageType;
                this.packageUsedUpStrategy = model.packageUsedUpStrategy;
                this.periodEndTime = model.periodEndTime;
                this.periodStartTime = model.periodStartTime;
                this.postPaidLimitFee = model.postPaidLimitFee;
                this.totalDuration = model.totalDuration;
                this.usedDuration = model.usedDuration;
            } 

            /**
             * <p>The ID of the instance order.</p>
             * 
             * <strong>example:</strong>
             * <p>mdp-0bxls4qpi6bl6****</p>
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * <p>The time when the package was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-17T07:01Z</p>
             */
            public Builder packageCreationTime(String packageCreationTime) {
                this.packageCreationTime = packageCreationTime;
                return this;
            }

            /**
             * <p>The expiration time of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-17T15:59Z</p>
             */
            public Builder packageExpiredTime(String packageExpiredTime) {
                this.packageExpiredTime = packageExpiredTime;
                return this;
            }

            /**
             * <p>The package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mdp-0bxls4qpi6bl6****</p>
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * <p>The package status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * <p>The package type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>FREE_PACKAGE: a free package.</li>
             * <li>NORMAL_PACKAGE: a paid package (120-hour computing plan).</li>
             * <li>POSTPAID_PACKAGE: a pay-as-you-go package (200-hour computing plan).</li>
             * <li>Duration: an hourly package.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL_PACKAGE</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The policy for the cloud computer status once the monthly package quota is exhausted.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Shutdown: The cloud computer enters the Stopped or Hibernated state.</li>
             * <li>PostPaid: The cloud computer continues providing services that are billed on the pay-as-you-go basis.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder packageUsedUpStrategy(String packageUsedUpStrategy) {
                this.packageUsedUpStrategy = packageUsedUpStrategy;
                return this;
            }

            /**
             * <p>The package&quot;s effective end time for the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-17T15:59Z</p>
             */
            public Builder periodEndTime(String periodEndTime) {
                this.periodEndTime = periodEndTime;
                return this;
            }

            /**
             * <p>The package&quot;s effective start time for the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-17T07:01Z</p>
             */
            public Builder periodStartTime(String periodStartTime) {
                this.periodStartTime = periodStartTime;
                return this;
            }

            /**
             * <p>The maximum fee for the package in the second phase.</p>
             * <blockquote>
             * <p> This parameter is returned if you set ResourceType to <code>POSTPAID_PACKAG</code> or <code>FREE_PACKAGE</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>199</p>
             */
            public Builder postPaidLimitFee(Float postPaidLimitFee) {
                this.postPaidLimitFee = postPaidLimitFee;
                return this;
            }

            /**
             * <p>The total duration.</p>
             * 
             * <strong>example:</strong>
             * <p>432000</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>The subscription duration consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>16850</p>
             */
            public Builder usedDuration(Long usedDuration) {
                this.usedDuration = usedDuration;
                return this;
            }

            public DesktopDurationList build() {
                return new DesktopDurationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class DesktopTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowClientSetting")
        private String allowClientSetting;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("ExecutionTime")
        private String executionTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private DesktopTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.executionTime = builder.executionTime;
            this.interval = builder.interval;
            this.operationType = builder.operationType;
            this.resetType = builder.resetType;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTimers create() {
            return builder().build();
        }

        /**
         * @return allowClientSetting
         */
        public String getAllowClientSetting() {
            return this.allowClientSetting;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return executionTime
         */
        public String getExecutionTime() {
            return this.executionTime;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private String allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private String executionTime; 
            private Integer interval; 
            private String operationType; 
            private String resetType; 
            private String timerType; 

            private Builder() {
            } 

            private Builder(DesktopTimers model) {
                this.allowClientSetting = model.allowClientSetting;
                this.cronExpression = model.cronExpression;
                this.enforce = model.enforce;
                this.executionTime = model.executionTime;
                this.interval = model.interval;
                this.operationType = model.operationType;
                this.resetType = model.resetType;
                this.timerType = model.timerType;
            } 

            /**
             * <p>Indicates whether to allow end users to configure scheduled tasks on clients.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowClientSetting(String allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The cron expression specified in the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 30 13 ? * 1-7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Indicates whether to forcibly execute the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The time when the scheduled task is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-21T11:37Z</p>
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * <p>The interval at which the scheduled task is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The type of the scheduled action.</p>
             * 
             * <strong>example:</strong>
             * <p>Hibernate</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The reset option.</p>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_SYSTEM</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>TimerBoot</p>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public DesktopTimers build() {
                return new DesktopTimers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class FotaUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @com.aliyun.core.annotation.NameInMap("Force")
        private Boolean force;

        @com.aliyun.core.annotation.NameInMap("NewAppVersion")
        private String newAppVersion;

        @com.aliyun.core.annotation.NameInMap("NewDcdVersion")
        private String newDcdVersion;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteJp")
        private String releaseNoteJp;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        private FotaUpdate(Builder builder) {
            this.channel = builder.channel;
            this.currentAppVersion = builder.currentAppVersion;
            this.force = builder.force;
            this.newAppVersion = builder.newAppVersion;
            this.newDcdVersion = builder.newDcdVersion;
            this.project = builder.project;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.releaseNoteJp = builder.releaseNoteJp;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FotaUpdate create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return currentAppVersion
         */
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        /**
         * @return force
         */
        public Boolean getForce() {
            return this.force;
        }

        /**
         * @return newAppVersion
         */
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        /**
         * @return newDcdVersion
         */
        public String getNewDcdVersion() {
            return this.newDcdVersion;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseNoteEn
         */
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        /**
         * @return releaseNoteJp
         */
        public String getReleaseNoteJp() {
            return this.releaseNoteJp;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String channel; 
            private String currentAppVersion; 
            private Boolean force; 
            private String newAppVersion; 
            private String newDcdVersion; 
            private String project; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private String releaseNoteJp; 
            private String size; 

            private Builder() {
            } 

            private Builder(FotaUpdate model) {
                this.channel = model.channel;
                this.currentAppVersion = model.currentAppVersion;
                this.force = model.force;
                this.newAppVersion = model.newAppVersion;
                this.newDcdVersion = model.newDcdVersion;
                this.project = model.project;
                this.releaseNote = model.releaseNote;
                this.releaseNoteEn = model.releaseNoteEn;
                this.releaseNoteJp = model.releaseNoteJp;
                this.size = model.size;
            } 

            /**
             * <p>The channel.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The current version number of the cloud computer&quot;s image.</p>
             * 
             * <strong>example:</strong>
             * <p>2.7.0-R-20250122.154826</p>
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * <p>Specifies whether to implement a forced update.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder force(Boolean force) {
                this.force = force;
                return this;
            }

            /**
             * <p>The target version number of the cloud computer&quot;s image.</p>
             * 
             * <strong>example:</strong>
             * <p>2.7.0-R-20250125.154826</p>
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * <p>The latest version available for updating the component disk.</p>
             * 
             * <strong>example:</strong>
             * <p>2.6.9-R-20250123.153415</p>
             */
            public Builder newDcdVersion(String newDcdVersion) {
                this.newDcdVersion = newDcdVersion;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>wuying-asp_single_session_desktop_win_x64</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The version description of the cloud computer&quot;s image.</p>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The English release note for the new image version.</p>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * <p>The Japanese release note for the new image version.</p>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder releaseNoteJp(String releaseNoteJp) {
                this.releaseNoteJp = releaseNoteJp;
                return this;
            }

            /**
             * <p>The size of the update package for the cloud computer image. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>474981930</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public FotaUpdate build() {
                return new FotaUpdate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Kb")
        private String kb;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Packages(Builder builder) {
            this.description = builder.description;
            this.kb = builder.kb;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return kb
         */
        public String getKb() {
            return this.kb;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String kb; 
            private String title; 

            private Builder() {
            } 

            private Builder(Packages model) {
                this.description = model.description;
                this.kb = model.kb;
                this.title = model.title;
            } 

            /**
             * <p>The patch description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The patch number.</p>
             * 
             * <strong>example:</strong>
             * <p>KB2267***</p>
             */
            public Builder kb(String kb) {
                this.kb = kb;
                return this;
            }

            /**
             * <p>The patch title.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class OsUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("KbListString")
        private String kbListString;

        @com.aliyun.core.annotation.NameInMap("PackageCount")
        private Integer packageCount;

        @com.aliyun.core.annotation.NameInMap("Packages")
        private java.util.List<Packages> packages;

        @com.aliyun.core.annotation.NameInMap("UpdateCatalogUrl")
        private String updateCatalogUrl;

        private OsUpdate(Builder builder) {
            this.checkId = builder.checkId;
            this.kbListString = builder.kbListString;
            this.packageCount = builder.packageCount;
            this.packages = builder.packages;
            this.updateCatalogUrl = builder.updateCatalogUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsUpdate create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return kbListString
         */
        public String getKbListString() {
            return this.kbListString;
        }

        /**
         * @return packageCount
         */
        public Integer getPackageCount() {
            return this.packageCount;
        }

        /**
         * @return packages
         */
        public java.util.List<Packages> getPackages() {
            return this.packages;
        }

        /**
         * @return updateCatalogUrl
         */
        public String getUpdateCatalogUrl() {
            return this.updateCatalogUrl;
        }

        public static final class Builder {
            private String checkId; 
            private String kbListString; 
            private Integer packageCount; 
            private java.util.List<Packages> packages; 
            private String updateCatalogUrl; 

            private Builder() {
            } 

            private Builder(OsUpdate model) {
                this.checkId = model.checkId;
                this.kbListString = model.kbListString;
                this.packageCount = model.packageCount;
                this.packages = model.packages;
                this.updateCatalogUrl = model.updateCatalogUrl;
            } 

            /**
             * <p>The ID of the check task.</p>
             * 
             * <strong>example:</strong>
             * <p>wua-1740652957251743***</p>
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The patch numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>KB2267***</p>
             */
            public Builder kbListString(String kbListString) {
                this.kbListString = kbListString;
                return this;
            }

            /**
             * <p>The number of packets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder packageCount(Integer packageCount) {
                this.packageCount = packageCount;
                return this;
            }

            /**
             * <p>The patch packages.</p>
             */
            public Builder packages(java.util.List<Packages> packages) {
                this.packages = packages;
                return this;
            }

            /**
             * <p>The update categorization URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://catalog.update.microsoft.com/home.aspx">https://catalog.update.microsoft.com/home.aspx</a></p>
             */
            public Builder updateCatalogUrl(String updateCatalogUrl) {
                this.updateCatalogUrl = updateCatalogUrl;
                return this;
            }

            public OsUpdate build() {
                return new OsUpdate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("ResourceSessionStartTime")
        private String resourceSessionStartTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private Sessions(Builder builder) {
            this.nickName = builder.nickName;
            this.resourceSessionStartTime = builder.resourceSessionStartTime;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return resourceSessionStartTime
         */
        public String getResourceSessionStartTime() {
            return this.resourceSessionStartTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String nickName; 
            private String resourceSessionStartTime; 
            private String userId; 
            private String userPrincipalName; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.nickName = model.nickName;
                this.resourceSessionStartTime = model.resourceSessionStartTime;
                this.userId = model.userId;
                this.userPrincipalName = model.userPrincipalName;
            } 

            /**
             * <p>用户的昵称。</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The timestamp when the resource session was established.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-22T11:03:36Z</p>
             */
            public Builder resourceSessionStartTime(String resourceSessionStartTime) {
                this.resourceSessionStartTime = resourceSessionStartTime;
                return this;
            }

            /**
             * <p>The username used to log on to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The User Principal Name (UPN) of the resource-bound user (if applicable). This parameter is returned only when you query the current user&quot;s sessions.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:benchmark_test@test.shenzhen">benchmark_test@test.shenzhen</a></p>
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AuthMode")
        private String authMode;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("CdsName")
        private String cdsName;

        @com.aliyun.core.annotation.NameInMap("CenterResourceId")
        private String centerResourceId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Clients")
        private java.util.List<Clients> clients;

        @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
        private String connectionProperties;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DesktopDurationList")
        private java.util.List<DesktopDurationList> desktopDurationList;

        @com.aliyun.core.annotation.NameInMap("DesktopTimers")
        private java.util.List<DesktopTimers> desktopTimers;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ExternalDomainId")
        private String externalDomainId;

        @com.aliyun.core.annotation.NameInMap("ExternalUserId")
        private String externalUserId;

        @com.aliyun.core.annotation.NameInMap("FotaUpdate")
        private FotaUpdate fotaUpdate;

        @com.aliyun.core.annotation.NameInMap("GlobalStatus")
        private Boolean globalStatus;

        @com.aliyun.core.annotation.NameInMap("HasUpgrade")
        private Boolean hasUpgrade;

        @com.aliyun.core.annotation.NameInMap("HibernationBeta")
        private Boolean hibernationBeta;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("LastStartTime")
        private String lastStartTime;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ManagementStatuses")
        private java.util.List<String> managementStatuses;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private String orderStatus;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsDescription")
        private String osDescription;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OsUpdate")
        private OsUpdate osUpdate;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("RealDesktopId")
        private String realDesktopId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionLocation")
        private String regionLocation;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceLevel")
        private String resourceLevel;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceSessionStatus")
        private String resourceSessionStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List<Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("SubPayType")
        private String subPayType;

        @com.aliyun.core.annotation.NameInMap("SupportHibernation")
        private Boolean supportHibernation;

        @com.aliyun.core.annotation.NameInMap("SupportedActions")
        private java.util.List<String> supportedActions;

        @com.aliyun.core.annotation.NameInMap("ThemeColor")
        private String themeColor;

        @com.aliyun.core.annotation.NameInMap("UserCustomName")
        private String userCustomName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Resources(Builder builder) {
            this.accessType = builder.accessType;
            this.aliUid = builder.aliUid;
            this.appId = builder.appId;
            this.authMode = builder.authMode;
            this.categoryId = builder.categoryId;
            this.categoryType = builder.categoryType;
            this.cdsName = builder.cdsName;
            this.centerResourceId = builder.centerResourceId;
            this.chargeType = builder.chargeType;
            this.clients = builder.clients;
            this.connectionProperties = builder.connectionProperties;
            this.createTime = builder.createTime;
            this.desktopDurationList = builder.desktopDurationList;
            this.desktopTimers = builder.desktopTimers;
            this.expiredTime = builder.expiredTime;
            this.externalDomainId = builder.externalDomainId;
            this.externalUserId = builder.externalUserId;
            this.fotaUpdate = builder.fotaUpdate;
            this.globalStatus = builder.globalStatus;
            this.hasUpgrade = builder.hasUpgrade;
            this.hibernationBeta = builder.hibernationBeta;
            this.icon = builder.icon;
            this.lastStartTime = builder.lastStartTime;
            this.localName = builder.localName;
            this.managementStatuses = builder.managementStatuses;
            this.officeSiteId = builder.officeSiteId;
            this.orderStatus = builder.orderStatus;
            this.os = builder.os;
            this.osDescription = builder.osDescription;
            this.osType = builder.osType;
            this.osUpdate = builder.osUpdate;
            this.productType = builder.productType;
            this.protocolType = builder.protocolType;
            this.realDesktopId = builder.realDesktopId;
            this.regionId = builder.regionId;
            this.regionLocation = builder.regionLocation;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.resourceLevel = builder.resourceLevel;
            this.resourceName = builder.resourceName;
            this.resourceSessionStatus = builder.resourceSessionStatus;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.sessionType = builder.sessionType;
            this.sessions = builder.sessions;
            this.subPayType = builder.subPayType;
            this.supportHibernation = builder.supportHibernation;
            this.supportedActions = builder.supportedActions;
            this.themeColor = builder.themeColor;
            this.userCustomName = builder.userCustomName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return authMode
         */
        public String getAuthMode() {
            return this.authMode;
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return cdsName
         */
        public String getCdsName() {
            return this.cdsName;
        }

        /**
         * @return centerResourceId
         */
        public String getCenterResourceId() {
            return this.centerResourceId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clients
         */
        public java.util.List<Clients> getClients() {
            return this.clients;
        }

        /**
         * @return connectionProperties
         */
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return desktopDurationList
         */
        public java.util.List<DesktopDurationList> getDesktopDurationList() {
            return this.desktopDurationList;
        }

        /**
         * @return desktopTimers
         */
        public java.util.List<DesktopTimers> getDesktopTimers() {
            return this.desktopTimers;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return externalDomainId
         */
        public String getExternalDomainId() {
            return this.externalDomainId;
        }

        /**
         * @return externalUserId
         */
        public String getExternalUserId() {
            return this.externalUserId;
        }

        /**
         * @return fotaUpdate
         */
        public FotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        /**
         * @return globalStatus
         */
        public Boolean getGlobalStatus() {
            return this.globalStatus;
        }

        /**
         * @return hasUpgrade
         */
        public Boolean getHasUpgrade() {
            return this.hasUpgrade;
        }

        /**
         * @return hibernationBeta
         */
        public Boolean getHibernationBeta() {
            return this.hibernationBeta;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return lastStartTime
         */
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return managementStatuses
         */
        public java.util.List<String> getManagementStatuses() {
            return this.managementStatuses;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osDescription
         */
        public String getOsDescription() {
            return this.osDescription;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return osUpdate
         */
        public OsUpdate getOsUpdate() {
            return this.osUpdate;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return realDesktopId
         */
        public String getRealDesktopId() {
            return this.realDesktopId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionLocation
         */
        public String getRegionLocation() {
            return this.regionLocation;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceLevel
         */
        public String getResourceLevel() {
            return this.resourceLevel;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceSessionStatus
         */
        public String getResourceSessionStatus() {
            return this.resourceSessionStatus;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return sessions
         */
        public java.util.List<Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return subPayType
         */
        public String getSubPayType() {
            return this.subPayType;
        }

        /**
         * @return supportHibernation
         */
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
        }

        /**
         * @return supportedActions
         */
        public java.util.List<String> getSupportedActions() {
            return this.supportedActions;
        }

        /**
         * @return themeColor
         */
        public String getThemeColor() {
            return this.themeColor;
        }

        /**
         * @return userCustomName
         */
        public String getUserCustomName() {
            return this.userCustomName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String accessType; 
            private Long aliUid; 
            private String appId; 
            private String authMode; 
            private Integer categoryId; 
            private Integer categoryType; 
            private String cdsName; 
            private String centerResourceId; 
            private String chargeType; 
            private java.util.List<Clients> clients; 
            private String connectionProperties; 
            private String createTime; 
            private java.util.List<DesktopDurationList> desktopDurationList; 
            private java.util.List<DesktopTimers> desktopTimers; 
            private String expiredTime; 
            private String externalDomainId; 
            private String externalUserId; 
            private FotaUpdate fotaUpdate; 
            private Boolean globalStatus; 
            private Boolean hasUpgrade; 
            private Boolean hibernationBeta; 
            private String icon; 
            private String lastStartTime; 
            private String localName; 
            private java.util.List<String> managementStatuses; 
            private String officeSiteId; 
            private String orderStatus; 
            private String os; 
            private String osDescription; 
            private String osType; 
            private OsUpdate osUpdate; 
            private String productType; 
            private String protocolType; 
            private String realDesktopId; 
            private String regionId; 
            private String regionLocation; 
            private String resourceGroupId; 
            private String resourceId; 
            private String resourceLevel; 
            private String resourceName; 
            private String resourceSessionStatus; 
            private String resourceStatus; 
            private String resourceType; 
            private String sessionType; 
            private java.util.List<Sessions> sessions; 
            private String subPayType; 
            private Boolean supportHibernation; 
            private java.util.List<String> supportedActions; 
            private String themeColor; 
            private String userCustomName; 
            private String version; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.accessType = model.accessType;
                this.aliUid = model.aliUid;
                this.appId = model.appId;
                this.authMode = model.authMode;
                this.categoryId = model.categoryId;
                this.categoryType = model.categoryType;
                this.cdsName = model.cdsName;
                this.centerResourceId = model.centerResourceId;
                this.chargeType = model.chargeType;
                this.clients = model.clients;
                this.connectionProperties = model.connectionProperties;
                this.createTime = model.createTime;
                this.desktopDurationList = model.desktopDurationList;
                this.desktopTimers = model.desktopTimers;
                this.expiredTime = model.expiredTime;
                this.externalDomainId = model.externalDomainId;
                this.externalUserId = model.externalUserId;
                this.fotaUpdate = model.fotaUpdate;
                this.globalStatus = model.globalStatus;
                this.hasUpgrade = model.hasUpgrade;
                this.hibernationBeta = model.hibernationBeta;
                this.icon = model.icon;
                this.lastStartTime = model.lastStartTime;
                this.localName = model.localName;
                this.managementStatuses = model.managementStatuses;
                this.officeSiteId = model.officeSiteId;
                this.orderStatus = model.orderStatus;
                this.os = model.os;
                this.osDescription = model.osDescription;
                this.osType = model.osType;
                this.osUpdate = model.osUpdate;
                this.productType = model.productType;
                this.protocolType = model.protocolType;
                this.realDesktopId = model.realDesktopId;
                this.regionId = model.regionId;
                this.regionLocation = model.regionLocation;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceId = model.resourceId;
                this.resourceLevel = model.resourceLevel;
                this.resourceName = model.resourceName;
                this.resourceSessionStatus = model.resourceSessionStatus;
                this.resourceStatus = model.resourceStatus;
                this.resourceType = model.resourceType;
                this.sessionType = model.sessionType;
                this.sessions = model.sessions;
                this.subPayType = model.subPayType;
                this.supportHibernation = model.supportHibernation;
                this.supportedActions = model.supportedActions;
                this.themeColor = model.themeColor;
                this.userCustomName = model.userCustomName;
                this.version = model.version;
            } 

            /**
             * <p>The access type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>INTERNET: access over the Internet.</li>
             * <li>VPC: access over an enterprise VPC.</li>
             * <li>ANY: access over the Internet or an enterprise VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>194101959****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The app ID. This parameter is for apps only.</p>
             * 
             * <strong>example:</strong>
             * <p>app-0001</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The authorization mode of the cloud app.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>App: authorizes access to apps.</li>
             * <li>AppInstanceGroup: authorizes access to delivery groups.</li>
             * <li>Session: authorizes access to sessions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>App</p>
             */
            public Builder authMode(String authMode) {
                this.authMode = authMode;
                return this;
            }

            /**
             * <p>The level-2 resource category. This parameter is for apps only.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The level-1 resource category. This parameter is for apps only.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>The drive name. This parameter is for enterprise drives only.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai+cds-695277****</p>
             */
            public Builder cdsName(String cdsName) {
                this.cdsName = cdsName;
                return this;
            }

            /**
             * <p>The ID of the centralized resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecds-0****</p>
             */
            public Builder centerResourceId(String centerResourceId) {
                this.centerResourceId = centerResourceId;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Postpaid (default): pay-as-you-go.</li>
             * <li>PrePaid: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The client types supported by resources.</p>
             */
            public Builder clients(java.util.List<Clients> clients) {
                this.clients = clients;
                return this;
            }

            /**
             * <p>The connection attributes in JSON format. The client does not need to process the attributes; they are directly passed to the resource management center when the app resource is created.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;authMode&quot;:&quot;App&quot;}</p>
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-11T07:12:12Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cloud computer plans.</p>
             */
            public Builder desktopDurationList(java.util.List<DesktopDurationList> desktopDurationList) {
                this.desktopDurationList = desktopDurationList;
                return this;
            }

            /**
             * <p>The scheduled tasks for cloud computers.</p>
             */
            public Builder desktopTimers(java.util.List<DesktopTimers> desktopTimers) {
                this.desktopTimers = desktopTimers;
                return this;
            }

            /**
             * <p>The expiration time of the subscription resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-22T16:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The ID of the external domain. This parameter is for enterprise drives only.</p>
             * 
             * <strong>example:</strong>
             * <p>stg114510</p>
             */
            public Builder externalDomainId(String externalDomainId) {
                this.externalDomainId = externalDomainId;
                return this;
            }

            /**
             * <p>The ID of the external user. This parameter is for enterprise drives only.</p>
             * 
             * <strong>example:</strong>
             * <p>test001</p>
             */
            public Builder externalUserId(String externalUserId) {
                this.externalUserId = externalUserId;
                return this;
            }

            /**
             * <p>The update info of the cloud computer.</p>
             */
            public Builder fotaUpdate(FotaUpdate fotaUpdate) {
                this.fotaUpdate = fotaUpdate;
                return this;
            }

            /**
             * <p>Indicates whether cross-region access is supported. This parameter is for enterprise drives only.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder globalStatus(Boolean globalStatus) {
                this.globalStatus = globalStatus;
                return this;
            }

            /**
             * <p>Indicates whether an update exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasUpgrade(Boolean hasUpgrade) {
                this.hasUpgrade = hasUpgrade;
                return this;
            }

            /**
             * <p>Indicates whether this is a beta version of the hibernation feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hibernationBeta(Boolean hibernationBeta) {
                this.hibernationBeta = hibernationBeta;
                return this;
            }

            /**
             * <p>The resource icon. This parameter is for apps only.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/icon.png">http://example.com/icon.png</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The time when the resource was last started.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-24T03:12:04Z</p>
             */
            public Builder lastStartTime(String lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * <p>The region name.</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The management status.</p>
             */
            public Builder managementStatuses(java.util.List<String> managementStatuses) {
                this.managementStatuses = managementStatuses;
                return this;
            }

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai+dir-3367****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The order status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Ceased: Your account has an overdue payment.</li>
             * <li>Released: The order is closed.</li>
             * <li>Expired: The subscription resource has expired.</li>
             * <li>Normal: The order is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>The OS platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2022</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The description of the OS platform.</p>
             */
            public Builder osDescription(String osDescription) {
                this.osDescription = osDescription;
                return this;
            }

            /**
             * <p>The OS type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Linux</li>
             * <li>Windows</li>
             * <li>Android</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The update info of the OS.</p>
             */
            public Builder osUpdate(OsUpdate osUpdate) {
                this.osUpdate = osUpdate;
                return this;
            }

            /**
             * <p>The service type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>CloudDesktop: regular cloud computers or cloud computer shares.</li>
             * <li>CloudApp: App Streaming</li>
             * <li>CloudBrowser: Cloud Browser.</li>
             * <li>AndroidCloud: Cloud Phone.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AndroidCloud</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>HDX</li>
             * <li>ASP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The real ID of the cloud computer (from a share). This parameter is returned only when the cloud computer share has ongoing sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-0001</p>
             */
            public Builder realDesktopId(String realDesktopId) {
                this.realDesktopId = realDesktopId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The geographical location.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Mainland: regions in the Chinese mainland.</li>
             * <li>Overseas: regions outside the Chinese mainland, including China (Hong Kong).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Mainland</p>
             */
            public Builder regionLocation(String regionLocation) {
                this.regionLocation = regionLocation;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-0****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-d19tya8zi4****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource level.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Center: a centralized resource.</li>
             * <li>Region: a unit resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Center</p>
             */
            public Builder resourceLevel(String resourceLevel) {
                this.resourceLevel = resourceLevel;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>testName01</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The session status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Unknown</li>
             * <li>Connected</li>
             * <li>Disconnected</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder resourceSessionStatus(String resourceSessionStatus) {
                this.resourceSessionStatus = resourceSessionStatus;
                return this;
            }

            /**
             * <p>The resource status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Unknown: The resource status is unknown.</li>
             * <li>Stopped: The resource is stopped.</li>
             * <li>Failed: The resource failed to be created.</li>
             * <li>Starting: The resource is being started.</li>
             * <li>Rebuilding: The resource is changing.</li>
             * <li>Running: The resource is running.</li>
             * <li>Stopping: The resource is being stopped.</li>
             * <li>FotaUpdating: The image is being updated.</li>
             * <li>Pending: The resource is still being prepared.</li>
             * <li>Deleting: The resource is being deleted.</li>
             * <li>Unavailable: The resource is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>App: cloud apps including App Streaming, Cloud Phone, and Cloud Browser.</li>
             * <li>Desktop: cloud computers.</li>
             * <li>DesktopGroup: cloud computer shares.</li>
             * <li>CloudDrive: enterprise drives.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Desktop</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The session type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SINGLE_SESSION</li>
             * <li>MULTIPLE_SESSION</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SINGLE_SESSION</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The sessions established between users and resources.</p>
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The sub-billing method.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>monthPackage: monthly subscription.</li>
             * <li>PrePaid: hourly plans.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder subPayType(String subPayType) {
                this.subPayType = subPayType;
                return this;
            }

            /**
             * <p>Indicates whether hibernation is supported.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportHibernation(Boolean supportHibernation) {
                this.supportHibernation = supportHibernation;
                return this;
            }

            /**
             * <p>The supported actions. This parameter is returned only for cloud computers or phones.</p>
             */
            public Builder supportedActions(java.util.List<String> supportedActions) {
                this.supportedActions = supportedActions;
                return this;
            }

            /**
             * <p>The theme color of the resource. This parameter is for apps only.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFFFFF</p>
             */
            public Builder themeColor(String themeColor) {
                this.themeColor = themeColor;
                return this;
            }

            /**
             * <p>The custom name of the resource.</p>
             */
            public Builder userCustomName(String userCustomName) {
                this.userCustomName = userCustomName;
                return this;
            }

            /**
             * <p>The resource version. This parameter is for apps only.</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
