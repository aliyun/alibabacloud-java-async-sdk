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
 * {@link SpotStockInternalInfo} extends {@link TeaModel}
 *
 * <p>SpotStockInternalInfo</p>
 */
public class SpotStockInternalInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("availableQuantity")
    private Integer availableQuantity;

    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("hpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.NameInMap("totalQuantity")
    private Integer totalQuantity;

    private SpotStockInternalInfo(Builder builder) {
        this.availableQuantity = builder.availableQuantity;
        this.clusterId = builder.clusterId;
        this.hpnZone = builder.hpnZone;
        this.totalQuantity = builder.totalQuantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotStockInternalInfo create() {
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
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return totalQuantity
     */
    public Integer getTotalQuantity() {
        return this.totalQuantity;
    }

    public static final class Builder {
        private Integer availableQuantity; 
        private String clusterId; 
        private String hpnZone; 
        private Integer totalQuantity; 

        private Builder() {
        } 

        private Builder(SpotStockInternalInfo model) {
            this.availableQuantity = model.availableQuantity;
            this.clusterId = model.clusterId;
            this.hpnZone = model.hpnZone;
            this.totalQuantity = model.totalQuantity;
        } 

        /**
         * <p>The number of available Spot Instances.</p>
         */
        public Builder availableQuantity(Integer availableQuantity) {
            this.availableQuantity = availableQuantity;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the high-performance network (HPN) zone.</p>
         */
        public Builder hpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * <p>The total number of Spot Instances.</p>
         */
        public Builder totalQuantity(Integer totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }

        public SpotStockInternalInfo build() {
            return new SpotStockInternalInfo(this);
        } 

    } 

}
