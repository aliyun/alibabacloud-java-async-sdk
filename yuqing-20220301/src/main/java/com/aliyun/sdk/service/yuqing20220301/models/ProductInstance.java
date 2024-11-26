// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ProductInstance} extends {@link TeaModel}
 *
 * <p>ProductInstance</p>
 */
public class ProductInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.NameInMap("buyerName")
    private String buyerName;

    @com.aliyun.core.annotation.NameInMap("buyerUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyerUid;

    @com.aliyun.core.annotation.NameInMap("channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("end")
    private Long end;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("orderNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderNo;

    @com.aliyun.core.annotation.NameInMap("productCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("productSpecCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productSpecCode;

    @com.aliyun.core.annotation.NameInMap("start")
    private Long start;

    @com.aliyun.core.annotation.NameInMap("tenantName")
    private String tenantName;

    @com.aliyun.core.annotation.NameInMap("tenantUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantUid;

    private ProductInstance(Builder builder) {
        this.appCode = builder.appCode;
        this.buyerName = builder.buyerName;
        this.buyerUid = builder.buyerUid;
        this.channel = builder.channel;
        this.config = builder.config;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.orderNo = builder.orderNo;
        this.productCode = builder.productCode;
        this.productSpecCode = builder.productSpecCode;
        this.start = builder.start;
        this.tenantName = builder.tenantName;
        this.tenantUid = builder.tenantUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductInstance create() {
        return builder().build();
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return this.buyerName;
    }

    /**
     * @return buyerUid
     */
    public String getBuyerUid() {
        return this.buyerUid;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderNo
     */
    public String getOrderNo() {
        return this.orderNo;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productSpecCode
     */
    public String getProductSpecCode() {
        return this.productSpecCode;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    /**
     * @return tenantUid
     */
    public String getTenantUid() {
        return this.tenantUid;
    }

    public static final class Builder {
        private String appCode; 
        private String buyerName; 
        private String buyerUid; 
        private String channel; 
        private String config; 
        private Long end; 
        private String instanceId; 
        private String orderNo; 
        private String productCode; 
        private String productSpecCode; 
        private Long start; 
        private String tenantName; 
        private String tenantUid; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EUWYEEQ</p>
         */
        public Builder appCode(String appCode) {
            this.appCode = appCode;
            return this;
        }

        /**
         * buyerName.
         */
        public Builder buyerName(String buyerName) {
            this.buyerName = buyerName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ID2343231321</p>
         */
        public Builder buyerUid(String buyerUid) {
            this.buyerUid = buyerUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * end.
         */
        public Builder end(Long end) {
            this.end = end;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ID3928389103844</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>D23938474923u42</p>
         */
        public Builder orderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C394884</p>
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C847573</p>
         */
        public Builder productSpecCode(String productSpecCode) {
            this.productSpecCode = productSpecCode;
            return this;
        }

        /**
         * start.
         */
        public Builder start(Long start) {
            this.start = start;
            return this;
        }

        /**
         * tenantName.
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UID284747383</p>
         */
        public Builder tenantUid(String tenantUid) {
            this.tenantUid = tenantUid;
            return this;
        }

        public ProductInstance build() {
            return new ProductInstance(this);
        } 

    } 

}
