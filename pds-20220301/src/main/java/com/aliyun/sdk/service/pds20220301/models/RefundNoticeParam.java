// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link RefundNoticeParam} extends {@link TeaModel}
 *
 * <p>RefundNoticeParam</p>
 */
public class RefundNoticeParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliuid")
    private Long aliuid;

    @com.aliyun.core.annotation.NameInMap("aliyunProduceCode")
    private String aliyunProduceCode;

    @com.aliyun.core.annotation.NameInMap("commodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("newExpireTime")
    private Object newExpireTime;

    @com.aliyun.core.annotation.NameInMap("orderIds")
    private java.util.List<Long> orderIds;

    @com.aliyun.core.annotation.NameInMap("refundParamMap")
    private java.util.Map<String, String> refundParamMap;

    @com.aliyun.core.annotation.NameInMap("refundType")
    private String refundType;

    private RefundNoticeParam(Builder builder) {
        this.aliuid = builder.aliuid;
        this.aliyunProduceCode = builder.aliyunProduceCode;
        this.commodityCode = builder.commodityCode;
        this.instanceId = builder.instanceId;
        this.newExpireTime = builder.newExpireTime;
        this.orderIds = builder.orderIds;
        this.refundParamMap = builder.refundParamMap;
        this.refundType = builder.refundType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundNoticeParam create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliuid
     */
    public Long getAliuid() {
        return this.aliuid;
    }

    /**
     * @return aliyunProduceCode
     */
    public String getAliyunProduceCode() {
        return this.aliyunProduceCode;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return newExpireTime
     */
    public Object getNewExpireTime() {
        return this.newExpireTime;
    }

    /**
     * @return orderIds
     */
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return refundParamMap
     */
    public java.util.Map<String, String> getRefundParamMap() {
        return this.refundParamMap;
    }

    /**
     * @return refundType
     */
    public String getRefundType() {
        return this.refundType;
    }

    public static final class Builder {
        private Long aliuid; 
        private String aliyunProduceCode; 
        private String commodityCode; 
        private String instanceId; 
        private Object newExpireTime; 
        private java.util.List<Long> orderIds; 
        private java.util.Map<String, String> refundParamMap; 
        private String refundType; 

        private Builder() {
        } 

        private Builder(RefundNoticeParam model) {
            this.aliuid = model.aliuid;
            this.aliyunProduceCode = model.aliyunProduceCode;
            this.commodityCode = model.commodityCode;
            this.instanceId = model.instanceId;
            this.newExpireTime = model.newExpireTime;
            this.orderIds = model.orderIds;
            this.refundParamMap = model.refundParamMap;
            this.refundType = model.refundType;
        } 

        /**
         * aliuid.
         */
        public Builder aliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }

        /**
         * aliyunProduceCode.
         */
        public Builder aliyunProduceCode(String aliyunProduceCode) {
            this.aliyunProduceCode = aliyunProduceCode;
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
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * newExpireTime.
         */
        public Builder newExpireTime(Object newExpireTime) {
            this.newExpireTime = newExpireTime;
            return this;
        }

        /**
         * orderIds.
         */
        public Builder orderIds(java.util.List<Long> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * refundParamMap.
         */
        public Builder refundParamMap(java.util.Map<String, String> refundParamMap) {
            this.refundParamMap = refundParamMap;
            return this;
        }

        /**
         * refundType.
         */
        public Builder refundType(String refundType) {
            this.refundType = refundType;
            return this;
        }

        public RefundNoticeParam build() {
            return new RefundNoticeParam(this);
        } 

    } 

}
