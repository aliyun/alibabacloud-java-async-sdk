// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link TrafficControlTaskTrafficInfoTargetTrafficsDataValue} extends {@link TeaModel}
 *
 * <p>TrafficControlTaskTrafficInfoTargetTrafficsDataValue</p>
 */
public class TrafficControlTaskTrafficInfoTargetTrafficsDataValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Traffic")
    private Double traffic;

    @com.aliyun.core.annotation.NameInMap("RecorfTime")
    private Long recorfTime;

    private TrafficControlTaskTrafficInfoTargetTrafficsDataValue(Builder builder) {
        this.traffic = builder.traffic;
        this.recorfTime = builder.recorfTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrafficControlTaskTrafficInfoTargetTrafficsDataValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return traffic
     */
    public Double getTraffic() {
        return this.traffic;
    }

    /**
     * @return recorfTime
     */
    public Long getRecorfTime() {
        return this.recorfTime;
    }

    public static final class Builder {
        private Double traffic; 
        private Long recorfTime; 

        private Builder() {
        } 

        private Builder(TrafficControlTaskTrafficInfoTargetTrafficsDataValue model) {
            this.traffic = model.traffic;
            this.recorfTime = model.recorfTime;
        } 

        /**
         * Traffic.
         */
        public Builder traffic(Double traffic) {
            this.traffic = traffic;
            return this;
        }

        /**
         * RecorfTime.
         */
        public Builder recorfTime(Long recorfTime) {
            this.recorfTime = recorfTime;
            return this;
        }

        public TrafficControlTaskTrafficInfoTargetTrafficsDataValue build() {
            return new TrafficControlTaskTrafficInfoTargetTrafficsDataValue(this);
        } 

    } 

}
