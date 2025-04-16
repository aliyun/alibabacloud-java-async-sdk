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
 * {@link SpotPriceItem} extends {@link TeaModel}
 *
 * <p>SpotPriceItem</p>
 */
public class SpotPriceItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("SpotDiscount")
    private Float spotDiscount;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private SpotPriceItem(Builder builder) {
        this.instanceType = builder.instanceType;
        this.spotDiscount = builder.spotDiscount;
        this.timestamp = builder.timestamp;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotPriceItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String instanceType; 
        private Float spotDiscount; 
        private String timestamp; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(SpotPriceItem model) {
            this.instanceType = model.instanceType;
            this.spotDiscount = model.spotDiscount;
            this.timestamp = model.timestamp;
            this.zoneId = model.zoneId;
        } 

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
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public SpotPriceItem build() {
            return new SpotPriceItem(this);
        } 

    } 

}
