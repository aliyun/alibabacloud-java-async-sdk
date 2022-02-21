// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAppGroupResponseBody</p>
 */
public class ModifyAppGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private ModifyAppGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppGroupResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ModifyAppGroupResponseBody build() {
            return new ModifyAppGroupResponseBody(this);
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
             * computeResource.
             */
            public Builder computeResource(Integer computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * docSize.
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * spec.
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
            private String type; 
            private Integer updated; 

            /**
             * chargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * chargingWay.
             */
            public Builder chargingWay(Integer chargingWay) {
                this.chargingWay = chargingWay;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * currentVersion.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * expireOn.
             */
            public Builder expireOn(String expireOn) {
                this.expireOn = expireOn;
                return this;
            }

            /**
             * firstRankAlgoDeploymentId.
             */
            public Builder firstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
                this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
                return this;
            }

            /**
             * hasPendingQuotaReviewTask.
             */
            public Builder hasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
                this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * lockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * lockedByExpiration.
             */
            public Builder lockedByExpiration(Integer lockedByExpiration) {
                this.lockedByExpiration = lockedByExpiration;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * pendingSecondRankAlgoDeploymentId.
             */
            public Builder pendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
                this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
                return this;
            }

            /**
             * processingOrderId.
             */
            public Builder processingOrderId(String processingOrderId) {
                this.processingOrderId = processingOrderId;
                return this;
            }

            /**
             * produced.
             */
            public Builder produced(Integer produced) {
                this.produced = produced;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * quota.
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * secondRankAlgoDeploymentId.
             */
            public Builder secondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
                this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * switchedTime.
             */
            public Builder switchedTime(Integer switchedTime) {
                this.switchedTime = switchedTime;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * updated.
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
