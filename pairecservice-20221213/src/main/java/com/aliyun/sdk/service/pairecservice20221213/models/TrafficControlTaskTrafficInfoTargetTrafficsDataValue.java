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

    @com.aliyun.core.annotation.NameInMap("RecordTime")
    private Long recordTime;

    private TrafficControlTaskTrafficInfoTargetTrafficsDataValue(Builder builder) {
        this.traffic = builder.traffic;
        this.recordTime = builder.recordTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrafficControlTaskTrafficInfoTargetTrafficsDataValue create() {
        return builder().build();
    }

    /**
     * @return traffic
     */
    public Double getTraffic() {
        return this.traffic;
    }

    /**
     * @return recordTime
     */
    public Long getRecordTime() {
        return this.recordTime;
    }

    public static final class Builder {
        private Double traffic; 
        private Long recordTime; 

        /**
         * Traffic.
         */
        public Builder traffic(Double traffic) {
            this.traffic = traffic;
            return this;
        }

        /**
         * RecordTime.
         */
        public Builder recordTime(Long recordTime) {
            this.recordTime = recordTime;
            return this;
        }

        public TrafficControlTaskTrafficInfoTargetTrafficsDataValue build() {
            return new TrafficControlTaskTrafficInfoTargetTrafficsDataValue(this);
        } 

    } 

}
