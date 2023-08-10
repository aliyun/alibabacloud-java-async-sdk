// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppGroupsResponseBody</p>
 */
public class ListAppGroupsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListAppGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppGroupsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer totalCount; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about each application.
         * <p>
         * 
         * For more information, see [AppGroup](~~170000~~).
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAppGroupsResponseBody build() {
            return new ListAppGroupsResponseBody(this);
        } 

    } 

    public static class Quota extends TeaModel {
        @NameInMap("computeResource")
        private Integer computeResource;

        @NameInMap("docSize")
        private Integer docSize;

        @NameInMap("spec")
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
             * The computing resources. Unit: logical computing units (LCUs).
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
             * The specifications of the application. Valid values:
             * <p>
             * 
             * *   opensearch.share.junior: basic
             * *   opensearch.share.common: shared general-purpose
             * *   opensearch.share.compute: shared computing
             * *   opensearch.share.storage: shared storage
             * *   opensearch.private.common: exclusive general-purpose
             * *   opensearch.private.compute: exclusive computing
             * *   opensearch.private.storage: exclusive storage
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
        @NameInMap("key")
        private String key;

        @NameInMap("value")
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
        @NameInMap("chargeType")
        private String chargeType;

        @NameInMap("chargingWay")
        private Integer chargingWay;

        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("created")
        private Integer created;

        @NameInMap("currentVersion")
        private String currentVersion;

        @NameInMap("description")
        private String description;

        @NameInMap("domain")
        private String domain;

        @NameInMap("expireOn")
        private String expireOn;

        @NameInMap("firstRankAlgoDeploymentId")
        private Integer firstRankAlgoDeploymentId;

        @NameInMap("hasPendingQuotaReviewTask")
        private Integer hasPendingQuotaReviewTask;

        @NameInMap("id")
        private String id;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("lockMode")
        private String lockMode;

        @NameInMap("lockedByExpiration")
        private Integer lockedByExpiration;

        @NameInMap("name")
        private String name;

        @NameInMap("pendingSecondRankAlgoDeploymentId")
        private Integer pendingSecondRankAlgoDeploymentId;

        @NameInMap("processingOrderId")
        private String processingOrderId;

        @NameInMap("produced")
        private Integer produced;

        @NameInMap("projectId")
        private String projectId;

        @NameInMap("quota")
        private Quota quota;

        @NameInMap("secondRankAlgoDeploymentId")
        private Integer secondRankAlgoDeploymentId;

        @NameInMap("status")
        private String status;

        @NameInMap("switchedTime")
        private Integer switchedTime;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("type")
        private String type;

        @NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.chargeType = builder.chargeType;
            this.chargingWay = builder.chargingWay;
            this.commodityCode = builder.commodityCode;
            this.created = builder.created;
            this.currentVersion = builder.currentVersion;
            this.description = builder.description;
            this.domain = builder.domain;
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
            private java.util.List < Tags> tags; 
            private String type; 
            private Integer updated; 

            /**
             * The billing method of the application. Valid values:
             * <p>
             * 
             * *   POSTPAY: pay-as-you-go
             * *   PREPAY: subscription
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The billing model. Valid values:
             * <p>
             * 
             * *   1: computing resources
             * *   2: queries per second (QPS)
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
             * domain
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * The approval status of the quotas. Valid values:
             * <p>
             * 
             * *   0: The quotas are approved.
             * *   1: The quotas are being approved.
             */
            public Builder hasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
                this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
                return this;
            }

            /**
             * The ID of the application.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The lock mode of the instance. Valid values:
             * <p>
             * 
             * *   Unlock: The instance is not locked.
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
             * The name of the application.
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
             * The ID of the order that is not complete for the instance. For example, an order is one that is initiated to create the instance or change the quotas or billing method.
             */
            public Builder processingOrderId(String processingOrderId) {
                this.processingOrderId = processingOrderId;
                return this;
            }

            /**
             * Indicates whether the order is complete. Valid values:
             * <p>
             * 
             * *   0: The order is in progress.
             * *   1: The order is complete.
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
             * <p>
             * 
             * For more information, see [Quota](https://www.alibabacloud.com/help/doc-detail/170001.htm).
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
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
             * The status of the application. Valid values:
             * <p>
             * 
             * *   producing
             * *   review_pending
             * *   config_pending
             * *   normal
             * *   frozen
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
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the application. Valid values:
             * <p>
             * 
             * *   standard: a standard application.
             * *   advance: an advanced application which is of an old application type. New applications cannot be of this type.
             * *   enhanced: an advanced application which is of a new application type.
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
