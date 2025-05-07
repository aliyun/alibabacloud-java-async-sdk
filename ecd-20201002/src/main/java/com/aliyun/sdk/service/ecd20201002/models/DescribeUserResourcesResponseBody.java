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

    private DescribeUserResourcesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.queryFailedResourceTypes = builder.queryFailedResourceTypes;
        this.rankVersion = builder.rankVersion;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
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

    public static final class Builder {
        private String nextToken; 
        private java.util.List<String> queryFailedResourceTypes; 
        private Long rankVersion; 
        private String requestId; 
        private java.util.List<Resources> resources; 

        private Builder() {
        } 

        private Builder(DescribeUserResourcesResponseBody model) {
            this.nextToken = model.nextToken;
            this.queryFailedResourceTypes = model.queryFailedResourceTypes;
            this.rankVersion = model.rankVersion;
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * QueryFailedResourceTypes.
         */
        public Builder queryFailedResourceTypes(java.util.List<String> queryFailedResourceTypes) {
            this.queryFailedResourceTypes = queryFailedResourceTypes;
            return this;
        }

        /**
         * RankVersion.
         */
        public Builder rankVersion(Long rankVersion) {
            this.rankVersion = rankVersion;
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
         * Resources.
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
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
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * Status.
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
             * OrderInstanceId.
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * PackageCreationTime.
             */
            public Builder packageCreationTime(String packageCreationTime) {
                this.packageCreationTime = packageCreationTime;
                return this;
            }

            /**
             * PackageExpiredTime.
             */
            public Builder packageExpiredTime(String packageExpiredTime) {
                this.packageExpiredTime = packageExpiredTime;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * PackageStatus.
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PackageUsedUpStrategy.
             */
            public Builder packageUsedUpStrategy(String packageUsedUpStrategy) {
                this.packageUsedUpStrategy = packageUsedUpStrategy;
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
             * PostPaidLimitFee.
             */
            public Builder postPaidLimitFee(Float postPaidLimitFee) {
                this.postPaidLimitFee = postPaidLimitFee;
                return this;
            }

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * UsedDuration.
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
             * AllowClientSetting.
             */
            public Builder allowClientSetting(String allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Enforce.
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * ExecutionTime.
             */
            public Builder executionTime(String executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * ResetType.
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * TimerType.
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
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * CurrentAppVersion.
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * Force.
             */
            public Builder force(Boolean force) {
                this.force = force;
                return this;
            }

            /**
             * NewAppVersion.
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * NewDcdVersion.
             */
            public Builder newDcdVersion(String newDcdVersion) {
                this.newDcdVersion = newDcdVersion;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * ReleaseNoteEn.
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * ReleaseNoteJp.
             */
            public Builder releaseNoteJp(String releaseNoteJp) {
                this.releaseNoteJp = releaseNoteJp;
                return this;
            }

            /**
             * Size.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Kb.
             */
            public Builder kb(String kb) {
                this.kb = kb;
                return this;
            }

            /**
             * Title.
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
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * KbListString.
             */
            public Builder kbListString(String kbListString) {
                this.kbListString = kbListString;
                return this;
            }

            /**
             * PackageCount.
             */
            public Builder packageCount(Integer packageCount) {
                this.packageCount = packageCount;
                return this;
            }

            /**
             * Packages.
             */
            public Builder packages(java.util.List<Packages> packages) {
                this.packages = packages;
                return this;
            }

            /**
             * UpdateCatalogUrl.
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
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * ResourceSessionStartTime.
             */
            public Builder resourceSessionStartTime(String resourceSessionStartTime) {
                this.resourceSessionStartTime = resourceSessionStartTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserPrincipalName.
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
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AuthMode.
             */
            public Builder authMode(String authMode) {
                this.authMode = authMode;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryType.
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * CdsName.
             */
            public Builder cdsName(String cdsName) {
                this.cdsName = cdsName;
                return this;
            }

            /**
             * CenterResourceId.
             */
            public Builder centerResourceId(String centerResourceId) {
                this.centerResourceId = centerResourceId;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Clients.
             */
            public Builder clients(java.util.List<Clients> clients) {
                this.clients = clients;
                return this;
            }

            /**
             * ConnectionProperties.
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
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
             * DesktopDurationList.
             */
            public Builder desktopDurationList(java.util.List<DesktopDurationList> desktopDurationList) {
                this.desktopDurationList = desktopDurationList;
                return this;
            }

            /**
             * DesktopTimers.
             */
            public Builder desktopTimers(java.util.List<DesktopTimers> desktopTimers) {
                this.desktopTimers = desktopTimers;
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
             * ExternalDomainId.
             */
            public Builder externalDomainId(String externalDomainId) {
                this.externalDomainId = externalDomainId;
                return this;
            }

            /**
             * ExternalUserId.
             */
            public Builder externalUserId(String externalUserId) {
                this.externalUserId = externalUserId;
                return this;
            }

            /**
             * FotaUpdate.
             */
            public Builder fotaUpdate(FotaUpdate fotaUpdate) {
                this.fotaUpdate = fotaUpdate;
                return this;
            }

            /**
             * GlobalStatus.
             */
            public Builder globalStatus(Boolean globalStatus) {
                this.globalStatus = globalStatus;
                return this;
            }

            /**
             * HasUpgrade.
             */
            public Builder hasUpgrade(Boolean hasUpgrade) {
                this.hasUpgrade = hasUpgrade;
                return this;
            }

            /**
             * HibernationBeta.
             */
            public Builder hibernationBeta(Boolean hibernationBeta) {
                this.hibernationBeta = hibernationBeta;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * LastStartTime.
             */
            public Builder lastStartTime(String lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ManagementStatuses.
             */
            public Builder managementStatuses(java.util.List<String> managementStatuses) {
                this.managementStatuses = managementStatuses;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsDescription.
             */
            public Builder osDescription(String osDescription) {
                this.osDescription = osDescription;
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
             * OsUpdate.
             */
            public Builder osUpdate(OsUpdate osUpdate) {
                this.osUpdate = osUpdate;
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
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * RealDesktopId.
             */
            public Builder realDesktopId(String realDesktopId) {
                this.realDesktopId = realDesktopId;
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
             * RegionLocation.
             */
            public Builder regionLocation(String regionLocation) {
                this.regionLocation = regionLocation;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * ResourceLevel.
             */
            public Builder resourceLevel(String resourceLevel) {
                this.resourceLevel = resourceLevel;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceSessionStatus.
             */
            public Builder resourceSessionStatus(String resourceSessionStatus) {
                this.resourceSessionStatus = resourceSessionStatus;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
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
             * SessionType.
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * Sessions.
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * SubPayType.
             */
            public Builder subPayType(String subPayType) {
                this.subPayType = subPayType;
                return this;
            }

            /**
             * SupportHibernation.
             */
            public Builder supportHibernation(Boolean supportHibernation) {
                this.supportHibernation = supportHibernation;
                return this;
            }

            /**
             * SupportedActions.
             */
            public Builder supportedActions(java.util.List<String> supportedActions) {
                this.supportedActions = supportedActions;
                return this;
            }

            /**
             * ThemeColor.
             */
            public Builder themeColor(String themeColor) {
                this.themeColor = themeColor;
                return this;
            }

            /**
             * UserCustomName.
             */
            public Builder userCustomName(String userCustomName) {
                this.userCustomName = userCustomName;
                return this;
            }

            /**
             * Version.
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
