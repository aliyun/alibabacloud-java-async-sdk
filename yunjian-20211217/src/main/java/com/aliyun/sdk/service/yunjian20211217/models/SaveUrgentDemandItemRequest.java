// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link SaveUrgentDemandItemRequest} extends {@link RequestModel}
 *
 * <p>SaveUrgentDemandItemRequest</p>
 */
public class SaveUrgentDemandItemRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effectTime")
    private String effectTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkType")
    private String networkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("payDuration")
    private String payDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("payDurationUnit")
    private String payDurationUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("payType")
    private String payType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planId")
    private Long planId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("urgentDemandEbsRequest")
    private UrgentDemandEbsRequest urgentDemandEbsRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("urgentDemandEcsRequest")
    private UrgentDemandEcsRequest urgentDemandEcsRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zone")
    private String zone;

    private SaveUrgentDemandItemRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.accountId = builder.accountId;
        this.creator = builder.creator;
        this.effectTime = builder.effectTime;
        this.modifier = builder.modifier;
        this.networkType = builder.networkType;
        this.payDuration = builder.payDuration;
        this.payDurationUnit = builder.payDurationUnit;
        this.payType = builder.payType;
        this.planId = builder.planId;
        this.region = builder.region;
        this.urgentDemandEbsRequest = builder.urgentDemandEbsRequest;
        this.urgentDemandEcsRequest = builder.urgentDemandEcsRequest;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveUrgentDemandItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return effectTime
     */
    public String getEffectTime() {
        return this.effectTime;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payDuration
     */
    public String getPayDuration() {
        return this.payDuration;
    }

    /**
     * @return payDurationUnit
     */
    public String getPayDurationUnit() {
        return this.payDurationUnit;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return urgentDemandEbsRequest
     */
    public UrgentDemandEbsRequest getUrgentDemandEbsRequest() {
        return this.urgentDemandEbsRequest;
    }

    /**
     * @return urgentDemandEcsRequest
     */
    public UrgentDemandEcsRequest getUrgentDemandEcsRequest() {
        return this.urgentDemandEcsRequest;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<SaveUrgentDemandItemRequest, Builder> {
        private String yunUserId; 
        private String accountId; 
        private String creator; 
        private String effectTime; 
        private String modifier; 
        private String networkType; 
        private String payDuration; 
        private String payDurationUnit; 
        private String payType; 
        private Long planId; 
        private String region; 
        private UrgentDemandEbsRequest urgentDemandEbsRequest; 
        private UrgentDemandEcsRequest urgentDemandEcsRequest; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(SaveUrgentDemandItemRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.accountId = request.accountId;
            this.creator = request.creator;
            this.effectTime = request.effectTime;
            this.modifier = request.modifier;
            this.networkType = request.networkType;
            this.payDuration = request.payDuration;
            this.payDurationUnit = request.payDurationUnit;
            this.payType = request.payType;
            this.planId = request.planId;
            this.region = request.region;
            this.urgentDemandEbsRequest = request.urgentDemandEbsRequest;
            this.urgentDemandEcsRequest = request.urgentDemandEcsRequest;
            this.zone = request.zone;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111222</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.putBodyParameter("creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * effectTime.
         */
        public Builder effectTime(String effectTime) {
            this.putBodyParameter("effectTime", effectTime);
            this.effectTime = effectTime;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(String modifier) {
            this.putBodyParameter("modifier", modifier);
            this.modifier = modifier;
            return this;
        }

        /**
         * networkType.
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * payDuration.
         */
        public Builder payDuration(String payDuration) {
            this.putBodyParameter("payDuration", payDuration);
            this.payDuration = payDuration;
            return this;
        }

        /**
         * payDurationUnit.
         */
        public Builder payDurationUnit(String payDurationUnit) {
            this.putBodyParameter("payDurationUnit", payDurationUnit);
            this.payDurationUnit = payDurationUnit;
            return this;
        }

        /**
         * payType.
         */
        public Builder payType(String payType) {
            this.putBodyParameter("payType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(Long planId) {
            this.putBodyParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * urgentDemandEbsRequest.
         */
        public Builder urgentDemandEbsRequest(UrgentDemandEbsRequest urgentDemandEbsRequest) {
            this.putBodyParameter("urgentDemandEbsRequest", urgentDemandEbsRequest);
            this.urgentDemandEbsRequest = urgentDemandEbsRequest;
            return this;
        }

        /**
         * urgentDemandEcsRequest.
         */
        public Builder urgentDemandEcsRequest(UrgentDemandEcsRequest urgentDemandEcsRequest) {
            this.putBodyParameter("urgentDemandEcsRequest", urgentDemandEcsRequest);
            this.urgentDemandEcsRequest = urgentDemandEcsRequest;
            return this;
        }

        /**
         * zone.
         */
        public Builder zone(String zone) {
            this.putBodyParameter("zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public SaveUrgentDemandItemRequest build() {
            return new SaveUrgentDemandItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveUrgentDemandItemRequest} extends {@link TeaModel}
     *
     * <p>SaveUrgentDemandItemRequest</p>
     */
    public static class UrgentDemandEbsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("commodityNum")
        private Long commodityNum;

        @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
        private String commodityTypeCode;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private Long performanceLevel;

        private UrgentDemandEbsRequest(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityNum = builder.commodityNum;
            this.commodityTypeCode = builder.commodityTypeCode;
            this.itemId = builder.itemId;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrgentDemandEbsRequest create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityNum
         */
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        /**
         * @return commodityTypeCode
         */
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return performanceLevel
         */
        public Long getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String commodityCode; 
            private Long commodityNum; 
            private String commodityTypeCode; 
            private Long itemId; 
            private Long performanceLevel; 

            private Builder() {
            } 

            private Builder(UrgentDemandEbsRequest model) {
                this.commodityCode = model.commodityCode;
                this.commodityNum = model.commodityNum;
                this.commodityTypeCode = model.commodityTypeCode;
                this.itemId = model.itemId;
                this.performanceLevel = model.performanceLevel;
            } 

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityNum.
             */
            public Builder commodityNum(Long commodityNum) {
                this.commodityNum = commodityNum;
                return this;
            }

            /**
             * commodityTypeCode.
             */
            public Builder commodityTypeCode(String commodityTypeCode) {
                this.commodityTypeCode = commodityTypeCode;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * performanceLevel.
             */
            public Builder performanceLevel(Long performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public UrgentDemandEbsRequest build() {
                return new UrgentDemandEbsRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveUrgentDemandItemRequest} extends {@link TeaModel}
     *
     * <p>SaveUrgentDemandItemRequest</p>
     */
    public static class UrgentDemandEcsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("commodityNum")
        private Long commodityNum;

        @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
        private String commodityTypeCode;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("vCpuCount")
        private Long vCpuCount;

        private UrgentDemandEcsRequest(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityNum = builder.commodityNum;
            this.commodityTypeCode = builder.commodityTypeCode;
            this.itemId = builder.itemId;
            this.vCpuCount = builder.vCpuCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrgentDemandEcsRequest create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityNum
         */
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        /**
         * @return commodityTypeCode
         */
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return vCpuCount
         */
        public Long getVCpuCount() {
            return this.vCpuCount;
        }

        public static final class Builder {
            private String commodityCode; 
            private Long commodityNum; 
            private String commodityTypeCode; 
            private Long itemId; 
            private Long vCpuCount; 

            private Builder() {
            } 

            private Builder(UrgentDemandEcsRequest model) {
                this.commodityCode = model.commodityCode;
                this.commodityNum = model.commodityNum;
                this.commodityTypeCode = model.commodityTypeCode;
                this.itemId = model.itemId;
                this.vCpuCount = model.vCpuCount;
            } 

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityNum.
             */
            public Builder commodityNum(Long commodityNum) {
                this.commodityNum = commodityNum;
                return this;
            }

            /**
             * commodityTypeCode.
             */
            public Builder commodityTypeCode(String commodityTypeCode) {
                this.commodityTypeCode = commodityTypeCode;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * vCpuCount.
             */
            public Builder vCpuCount(Long vCpuCount) {
                this.vCpuCount = vCpuCount;
                return this;
            }

            public UrgentDemandEcsRequest build() {
                return new UrgentDemandEcsRequest(this);
            } 

        } 

    }
}
