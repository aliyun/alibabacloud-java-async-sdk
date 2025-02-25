// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppGroupResponseBody</p>
 */
public class DescribeAppGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeAppGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the application.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAppGroupResponseBody build() {
            return new DescribeAppGroupResponseBody(this);
        } 

    } 

    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeResource")
        private Integer computeResource;

        @com.aliyun.core.annotation.NameInMap("docSize")
        private Integer docSize;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private Quota(Builder builder) {
            this.computeResource = builder.computeResource;
            this.docSize = builder.docSize;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public Integer getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return docSize
         */
        public Integer getDocSize() {
            return this.docSize;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer computeResource; 
            private Integer docSize; 
            private String spec; 

            /**
             * The computing resources. Unit: logical computing unit (LCU).
             */
            public Builder computeResource(Integer computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * The storage capacity. Unit: GB.
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * The specifications. Valid values:
             * <p>
             * 
             * *   opensearch.share.junior: basic.
             * *   opensearch.share.common: shared general-purpose.
             * *   opensearch.share.compute: shared computing.
             * *   opensearch.share.storage: shared storage.
             * *   opensearch.private.common: exclusive general-purpose.
             * *   opensearch.private.compute: exclusive computing.
             * *   opensearch.private.storage: exclusive storage.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("chargingWay")
        private Integer chargingWay;

        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("currentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("engineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("expireOn")
        private String expireOn;

        @com.aliyun.core.annotation.NameInMap("firstRankAlgoDeploymentId")
        private Integer firstRankAlgoDeploymentId;

        @com.aliyun.core.annotation.NameInMap("hasPendingQuotaReviewTask")
        private Integer hasPendingQuotaReviewTask;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("lockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("lockedByExpiration")
        private Integer lockedByExpiration;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pendingSecondRankAlgoDeploymentId")
        private Integer pendingSecondRankAlgoDeploymentId;

        @com.aliyun.core.annotation.NameInMap("processingOrderId")
        private String processingOrderId;

        @com.aliyun.core.annotation.NameInMap("produced")
        private Integer produced;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("quota")
        private Quota quota;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("secondRankAlgoDeploymentId")
        private Integer secondRankAlgoDeploymentId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("switchedTime")
        private Integer switchedTime;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.chargeType = builder.chargeType;
            this.chargingWay = builder.chargingWay;
            this.commodityCode = builder.commodityCode;
            this.created = builder.created;
            this.currentVersion = builder.currentVersion;
            this.description = builder.description;
            this.domain = builder.domain;
            this.engineType = builder.engineType;
            this.expireOn = builder.expireOn;
            this.firstRankAlgoDeploymentId = builder.firstRankAlgoDeploymentId;
            this.hasPendingQuotaReviewTask = builder.hasPendingQuotaReviewTask;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.lockMode = builder.lockMode;
            this.lockedByExpiration = builder.lockedByExpiration;
            this.name = builder.name;
            this.pendingSecondRankAlgoDeploymentId = builder.pendingSecondRankAlgoDeploymentId;
            this.processingOrderId = builder.processingOrderId;
            this.produced = builder.produced;
            this.projectId = builder.projectId;
            this.quota = builder.quota;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondRankAlgoDeploymentId = builder.secondRankAlgoDeploymentId;
            this.status = builder.status;
            this.switchedTime = builder.switchedTime;
            this.tags = builder.tags;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return chargingWay
         */
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return expireOn
         */
        public String getExpireOn() {
            return this.expireOn;
        }

        /**
         * @return firstRankAlgoDeploymentId
         */
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        /**
         * @return hasPendingQuotaReviewTask
         */
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockedByExpiration
         */
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pendingSecondRankAlgoDeploymentId
         */
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        /**
         * @return processingOrderId
         */
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        /**
         * @return produced
         */
        public Integer getProduced() {
            return this.produced;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return secondRankAlgoDeploymentId
         */
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return switchedTime
         */
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String chargeType; 
            private Integer chargingWay; 
            private String commodityCode; 
            private Integer created; 
            private String currentVersion; 
            private String description; 
            private String domain; 
            private String engineType; 
            private String expireOn; 
            private Integer firstRankAlgoDeploymentId; 
            private Integer hasPendingQuotaReviewTask; 
            private String id; 
            private String instanceId; 
            private String lockMode; 
            private Integer lockedByExpiration; 
            private String name; 
            private Integer pendingSecondRankAlgoDeploymentId; 
            private String processingOrderId; 
            private Integer produced; 
            private String projectId; 
            private Quota quota; 
            private String resourceGroupId; 
            private Integer secondRankAlgoDeploymentId; 
            private String status; 
            private Integer switchedTime; 
            private java.util.List < Tags> tags; 
            private String type; 
            private Integer updated; 

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   POSTPAY: pay-as-you-go.
             * *   PREPAY: subscription.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The billable item. Valid values:
             * <p>
             * 
             * *   1: computing resources.
             * *   2: queries per second (QPS).
             */
            public Builder chargingWay(Integer chargingWay) {
                this.chargingWay = chargingWay;
                return this;
            }

            /**
             * The commodity code.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The timestamp when the application was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The ID of the current online version.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The industry of the application.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * engineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expireOn(String expireOn) {
                this.expireOn = expireOn;
                return this;
            }

            /**
             * The ID of the created rough sort expression.
             */
            public Builder firstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
                this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
                return this;
            }

            /**
             * The approval state of the quotas. Valid values:
             * <p>
             * 
             * *   0: The application is in service.
             * *   1: The quotas are being reviewed.
             */
            public Builder hasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
                this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
                return this;
            }

            /**
             * The application ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The lock state. Valid values:
             * <p>
             * 
             * *   Unlock: The instance is unlocked.
             * *   LockByExpiration: The instance is automatically locked after it expires.
             * *   ManualLock: The instance is manually locked.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * Indicates whether the instance is automatically locked after it expires.
             */
            public Builder lockedByExpiration(Integer lockedByExpiration) {
                this.lockedByExpiration = lockedByExpiration;
                return this;
            }

            /**
             * The application name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the fine sort expression that is being created.
             */
            public Builder pendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
                this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
                return this;
            }

            /**
             * The ID of the order that is not complete.
             */
            public Builder processingOrderId(String processingOrderId) {
                this.processingOrderId = processingOrderId;
                return this;
            }

            /**
             * Indicates whether the application is created. Valid values:
             * <p>
             * 
             * *   0: The application is being created.
             * *   1: The application is created.
             */
            public Builder produced(Integer produced) {
                this.produced = produced;
                return this;
            }

            /**
             * The name of the A/B test group.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The information about the quotas of the application.
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the created fine sort expression.
             */
            public Builder secondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
                this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
                return this;
            }

            /**
             * The state of the application. Valid values:
             * <p>
             * 
             * *   producing: The application is being created.
             * *   review_pending: The application is being reviewed.
             * *   config_pending: The application is to be configured.
             * *   normal: The application is in service.
             * *   frozen: The application is frozen.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The timestamp when the current online version was published.
             */
            public Builder switchedTime(Integer switchedTime) {
                this.switchedTime = switchedTime;
                return this;
            }

            /**
             * The application tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the application. Valid values:
             * <p>
             * 
             * *   standard: a High-performance Search Edition application.
             * *
             * *   enhanced: an Industry Algorithm Edition application.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The timestamp when the application was last updated.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
