// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link SpotStockPreview} extends {@link TeaModel}
 *
 * <p>SpotStockPreview</p>
 */
public class SpotStockPreview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableQuantity")
    private Integer availableQuantity;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("SpotDiscount")
    private Float spotDiscount;

    @com.aliyun.core.annotation.NameInMap("StockStatus")
    private String stockStatus;

    private SpotStockPreview(Builder builder) {
        this.availableQuantity = builder.availableQuantity;
        this.clusterId = builder.clusterId;
        this.instanceType = builder.instanceType;
        this.spotDiscount = builder.spotDiscount;
        this.stockStatus = builder.stockStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotStockPreview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableQuantity
     */
    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return spotDiscount
     */
    public Float getSpotDiscount() {
        return this.spotDiscount;
    }

    /**
     * @return stockStatus
     */
    public String getStockStatus() {
        return this.stockStatus;
    }

    public static final class Builder {
        private Integer availableQuantity; 
        private String clusterId; 
        private String instanceType; 
        private Float spotDiscount; 
        private String stockStatus; 

        private Builder() {
        } 

        private Builder(SpotStockPreview model) {
            this.availableQuantity = model.availableQuantity;
            this.clusterId = model.clusterId;
            this.instanceType = model.instanceType;
            this.spotDiscount = model.spotDiscount;
            this.stockStatus = model.stockStatus;
        } 

        /**
         * <p>The available quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder availableQuantity(Integer availableQuantity) {
            this.availableQuantity = availableQuantity;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The spot instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ml.gu8xf.8xlarge-gu108</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The current spot instance discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        public Builder spotDiscount(Float spotDiscount) {
            this.spotDiscount = spotDiscount;
            return this;
        }

        /**
         * <p>The spot instance inventory status.</p>
         * 
         * <strong>example:</strong>
         * <p>WithStock</p>
         */
        public Builder stockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
            return this;
        }

        public SpotStockPreview build() {
            return new SpotStockPreview(this);
        } 

    } 

}
