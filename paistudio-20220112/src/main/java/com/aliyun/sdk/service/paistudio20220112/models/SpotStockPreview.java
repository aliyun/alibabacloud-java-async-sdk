// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("SpotDiscount")
    private Float spotDiscount;

    @com.aliyun.core.annotation.NameInMap("StockStatus")
    private String stockStatus;

    private SpotStockPreview(Builder builder) {
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
        private String instanceType; 
        private Float spotDiscount; 
        private String stockStatus; 

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * SpotDiscount.
         */
        public Builder spotDiscount(Float spotDiscount) {
            this.spotDiscount = spotDiscount;
            return this;
        }

        /**
         * StockStatus.
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
