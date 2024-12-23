// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link SpotBidPrice} extends {@link TeaModel}
 *
 * <p>SpotBidPrice</p>
 */
public class SpotBidPrice extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BidPrice")
    private Double bidPrice;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    private SpotBidPrice(Builder builder) {
        this.bidPrice = builder.bidPrice;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotBidPrice create() {
        return builder().build();
    }

    /**
     * @return bidPrice
     */
    public Double getBidPrice() {
        return this.bidPrice;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder {
        private Double bidPrice; 
        private String instanceType; 

        /**
         * <p>实例的每小时最高出价。支持最大3位小数，参数SpotStrategy=SpotWithPriceLimit时，该参数生效。</p>
         * 
         * <strong>example:</strong>
         * <p>1000.0</p>
         */
        public Builder bidPrice(Double bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        /**
         * <p>实例类型。</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g7.2xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public SpotBidPrice build() {
            return new SpotBidPrice(this);
        } 

    } 

}
