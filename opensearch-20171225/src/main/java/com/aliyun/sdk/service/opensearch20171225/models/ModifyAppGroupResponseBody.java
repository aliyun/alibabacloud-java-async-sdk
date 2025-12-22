// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ModifyAppGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAppGroupResponseBody</p>
 */
public class ModifyAppGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyAppGroupResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Response parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ModifyAppGroupResponseBody build() {
            return new ModifyAppGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAppGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyAppGroupResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Quota model) {
                this.computeResource = model.computeResource;
                this.docSize = model.docSize;
                this.spec = model.spec;
            } 

            /**
             * <p>The computing resources. Unit: logical computing unit (LCU).</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder computeResource(Integer computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * <p>The storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * <p>The specifications. Valid values:</p>
             * <ul>
             * <li>opensearch.share.junior: basic.</li>
             * <li>opensearch.share.common: shared general-purpose.</li>
             * <li>opensearch.share.compute: shared computing.</li>
             * <li>opensearch.share.storage: shared storage.</li>
             * <li>opensearch.private.common: exclusive general-purpose.</li>
             * <li>opensearch.private.compute: exclusive computing.</li>
             * <li>opensearch.private.storage: exclusive storage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>opensearch.share.common</p>
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
    /**
     * 
     * {@link ModifyAppGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyAppGroupResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("hasPendingQuotaReviewTask")
        private Integer hasPendingQuotaReviewTask;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("lockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("produced")
        private Integer produced;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("quota")
        private Quota quota;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("switchedTime")
        private Integer switchedTime;

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
            this.hasPendingQuotaReviewTask = builder.hasPendingQuotaReviewTask;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.lockMode = builder.lockMode;
            this.name = builder.name;
            this.produced = builder.produced;
            this.projectId = builder.projectId;
            this.quota = builder.quota;
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String engineType; 
            private String expireOn; 
            private Integer hasPendingQuotaReviewTask; 
            private String id; 
            private String instanceId; 
            private String lockMode; 
            private String name; 
            private Integer produced; 
            private String projectId; 
            private Quota quota; 
            private String resourceGroupId; 
            private String status; 
            private Integer switchedTime; 
            private String type; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.chargeType = model.chargeType;
                this.chargingWay = model.chargingWay;
                this.commodityCode = model.commodityCode;
                this.created = model.created;
                this.currentVersion = model.currentVersion;
                this.description = model.description;
                this.domain = model.domain;
                this.engineType = model.engineType;
                this.expireOn = model.expireOn;
                this.hasPendingQuotaReviewTask = model.hasPendingQuotaReviewTask;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.lockMode = model.lockMode;
                this.name = model.name;
                this.produced = model.produced;
                this.projectId = model.projectId;
                this.quota = model.quota;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.switchedTime = model.switchedTime;
                this.type = model.type;
                this.updated = model.updated;
            } 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>POSTPAY: pay-as-you-go.</li>
             * <li>PREPAY: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The billable item. Valid values:</p>
             * <ul>
             * <li>1: computing resources.</li>
             * <li>2: QPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chargingWay(Integer chargingWay) {
                this.chargingWay = chargingWay;
                return this;
            }

            /**
             * <p>The code of the commodity.</p>
             * 
             * <strong>example:</strong>
             * <p>opensearch</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The timestamp when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1590139524</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The ID of the current online version.</p>
             * 
             * <strong>example:</strong>
             * <p>100302903</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the industry. Valid values:</p>
             * <ul>
             * <li>GENERAL: general.</li>
             * <li>ECOMMERCE: e-commerce.</li>
             * <li>IT_CONTENT: IT content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GENERAL</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>ha3</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The time when the application expired.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expireOn(String expireOn) {
                this.expireOn = expireOn;
                return this;
            }

            /**
             * <p>The approval status of the quotas. Valid values:</p>
             * <ul>
             * <li>0: normal.</li>
             * <li>1: being approved.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
                this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100302881</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10030288</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The lock status. Valid values:</p>
             * <ul>
             * <li>Unlock: The instance is unlocked.</li>
             * <li>LockByExpiration: The instance is automatically locked after it expires.</li>
             * <li>ManualLock: The instance is manually locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>lsh_test_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the order is complete. Valid values:</p>
             * <ul>
             * <li>0: The order is in progress.</li>
             * <li>1: The order is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder produced(Integer produced) {
                this.produced = produced;
                return this;
            }

            /**
             * <p>The name of the A/B test group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The information about the quotas of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmoiyerh6nzly</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The state of the application. Valid values:</p>
             * <ul>
             * <li>producing: being produced.</li>
             * <li>review_pending: being approved.</li>
             * <li>config_pending: to be configured.</li>
             * <li>normal: normal.</li>
             * <li>frozen: frozen.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The timestamp when the current online version was published.</p>
             * 
             * <strong>example:</strong>
             * <p>1590486386</p>
             */
            public Builder switchedTime(Integer switchedTime) {
                this.switchedTime = switchedTime;
                return this;
            }

            /**
             * <p>The type of the application. Valid values:</p>
             * <ul>
             * <li>standard: a standard edition application.</li>
             * <li>advance: an advanced edition application of an old version. New versions are not supported for this edition.</li>
             * <li>enhanced: an advanced edition application of a new version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enhanced</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The timestamp when the application was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1590978265</p>
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
