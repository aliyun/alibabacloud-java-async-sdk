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
     * @return recordTime
     */
    public Long getRecordTime() {
        return this.recordTime;
    }

    public static final class Builder {
        private Double traffic; 
        private Long recordTime; 

        private Builder() {
        } 

        private Builder(TrafficControlTaskTrafficInfoTargetTrafficsDataValue model) {
            this.traffic = model.traffic;
            this.recordTime = model.recordTime;
        } 

        /**
         * <p>The reported traffic for this target within the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder traffic(Double traffic) {
            this.traffic = traffic;
            return this;
        }

        /**
         * <p>The timestamp indicating when the data was reported.</p>
         * 
         * <strong>example:</strong>
         * <p>1760319273</p>
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
