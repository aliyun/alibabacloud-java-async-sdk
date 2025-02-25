// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceAppGroupCommodityCodeResponseBody} extends {@link TeaModel}
 *
 * <p>ReplaceAppGroupCommodityCodeResponseBody</p>
 */
public class ReplaceAppGroupCommodityCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ReplaceAppGroupCommodityCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceAppGroupCommodityCodeResponseBody create() {
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
         * The returned result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ReplaceAppGroupCommodityCodeResponseBody build() {
            return new ReplaceAppGroupCommodityCodeResponseBody(this);
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
             * The number of computing resources configured.
             */
            public Builder computeResource(Integer computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * The storage capacity.
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * The specifications configured.
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

        @com.aliyun.core.annotation.NameInMap("secondRankAlgoDeploymentId")
        private Integer secondRankAlgoDeploymentId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("switchedTime")
        private Integer switchedTime;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List < String > versions;

        private Result(Builder builder) {
            this.chargeType = builder.chargeType;
            this.chargingWay = builder.chargingWay;
            this.commodityCode = builder.commodityCode;
            this.created = builder.created;
            this.currentVersion = builder.currentVersion;
            this.description = builder.description;
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
            this.secondRankAlgoDeploymentId = builder.secondRankAlgoDeploymentId;
            this.status = builder.status;
            this.switchedTime = builder.switchedTime;
            this.type = builder.type;
            this.updated = builder.updated;
            this.versions = builder.versions;
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

        /**
         * @return versions
         */
        public java.util.List < String > getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String chargeType; 
            private Integer chargingWay; 
            private String commodityCode; 
            private Integer created; 
            private String currentVersion; 
            private String description; 
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
            private Integer secondRankAlgoDeploymentId; 
            private String status; 
            private Integer switchedTime; 
            private String type; 
            private Integer updated; 
            private java.util.List < String > versions; 

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
             * The billing type. Valid values:
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
             * The code of the commodity.
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
             * The expiration time.
             */
            public Builder expireOn(String expireOn) {
                this.expireOn = expireOn;
                return this;
            }

            /**
             * The ID of the rough sort expression.
             */
            public Builder firstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
                this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
                return this;
            }

            /**
             * The approval state of the quotas. Valid values:
             * <p>
             * 
             * *   0: The approval status is normal.
             * *   1: The quotas are being approved.
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
             * Indicates whether the instance is automatically locked after it expires. Valid values:
             * <p>
             * 
             * *   0: The instance is not automatically locked after it expires.
             * *   1: The instance is automatically locked after it expires.
             */
            public Builder lockedByExpiration(Integer lockedByExpiration) {
                this.lockedByExpiration = lockedByExpiration;
                return this;
            }

            /**
             * The name of the order.
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
             * The ID of the order that is in progress.
             */
            public Builder processingOrderId(String processingOrderId) {
                this.processingOrderId = processingOrderId;
                return this;
            }

            /**
             * Indicates whether the order is produced.
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
             * The configuration information.
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * The ID of the fine sort expression.
             */
            public Builder secondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
                this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
                return this;
            }

            /**
             * The status of the application.
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
             * The type of the application.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The timestamp when the application was updated.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            /**
             * The versions.
             */
            public Builder versions(java.util.List < String > versions) {
                this.versions = versions;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
