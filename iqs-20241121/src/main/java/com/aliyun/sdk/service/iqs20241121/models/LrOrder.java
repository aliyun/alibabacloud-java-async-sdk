// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link LrOrder} extends {@link TeaModel}
 *
 * <p>LrOrder</p>
 */
public class LrOrder extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountCredentials")
    private java.util.List<AccountCredentialDTO> accountCredentials;

    @com.aliyun.core.annotation.NameInMap("aliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("commodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("commodityId")
    private String commodityId;

    @com.aliyun.core.annotation.NameInMap("commoditySpec")
    private String commoditySpec;

    @com.aliyun.core.annotation.NameInMap("customerName")
    private String customerName;

    @com.aliyun.core.annotation.NameInMap("eventTime")
    private String eventTime;

    @com.aliyun.core.annotation.NameInMap("expirationTime")
    private String expirationTime;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("orderCategory")
    private String orderCategory;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("qps")
    private Integer qps;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private LrOrder(Builder builder) {
        this.accountCredentials = builder.accountCredentials;
        this.aliUid = builder.aliUid;
        this.commodityCode = builder.commodityCode;
        this.commodityId = builder.commodityId;
        this.commoditySpec = builder.commoditySpec;
        this.customerName = builder.customerName;
        this.eventTime = builder.eventTime;
        this.expirationTime = builder.expirationTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.instanceId = builder.instanceId;
        this.orderCategory = builder.orderCategory;
        this.orderId = builder.orderId;
        this.qps = builder.qps;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LrOrder create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountCredentials
     */
    public java.util.List<AccountCredentialDTO> getAccountCredentials() {
        return this.accountCredentials;
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return commodityId
     */
    public String getCommodityId() {
        return this.commodityId;
    }

    /**
     * @return commoditySpec
     */
    public String getCommoditySpec() {
        return this.commoditySpec;
    }

    /**
     * @return customerName
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * @return eventTime
     */
    public String getEventTime() {
        return this.eventTime;
    }

    /**
     * @return expirationTime
     */
    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderCategory
     */
    public String getOrderCategory() {
        return this.orderCategory;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return qps
     */
    public Integer getQps() {
        return this.qps;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<AccountCredentialDTO> accountCredentials; 
        private String aliUid; 
        private String commodityCode; 
        private String commodityId; 
        private String commoditySpec; 
        private String customerName; 
        private String eventTime; 
        private String expirationTime; 
        private String gmtCreate; 
        private String gmtModified; 
        private String instanceId; 
        private String orderCategory; 
        private Long orderId; 
        private Integer qps; 
        private String status; 

        private Builder() {
        } 

        private Builder(LrOrder model) {
            this.accountCredentials = model.accountCredentials;
            this.aliUid = model.aliUid;
            this.commodityCode = model.commodityCode;
            this.commodityId = model.commodityId;
            this.commoditySpec = model.commoditySpec;
            this.customerName = model.customerName;
            this.eventTime = model.eventTime;
            this.expirationTime = model.expirationTime;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.instanceId = model.instanceId;
            this.orderCategory = model.orderCategory;
            this.orderId = model.orderId;
            this.qps = model.qps;
            this.status = model.status;
        } 

        /**
         * accountCredentials.
         */
        public Builder accountCredentials(java.util.List<AccountCredentialDTO> accountCredentials) {
            this.accountCredentials = accountCredentials;
            return this;
        }

        /**
         * aliUid.
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
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
         * commodityId.
         */
        public Builder commodityId(String commodityId) {
            this.commodityId = commodityId;
            return this;
        }

        /**
         * commoditySpec.
         */
        public Builder commoditySpec(String commoditySpec) {
            this.commoditySpec = commoditySpec;
            return this;
        }

        /**
         * customerName.
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        /**
         * eventTime.
         */
        public Builder eventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * expirationTime.
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * orderCategory.
         */
        public Builder orderCategory(String orderCategory) {
            this.orderCategory = orderCategory;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * qps.
         */
        public Builder qps(Integer qps) {
            this.qps = qps;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public LrOrder build() {
            return new LrOrder(this);
        } 

    } 

}
