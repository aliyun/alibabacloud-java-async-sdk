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
 * {@link TrafficControlTaskTrafficInfoTaskTrafficsValue} extends {@link TeaModel}
 *
 * <p>TrafficControlTaskTrafficInfoTaskTrafficsValue</p>
 */
public class TrafficControlTaskTrafficInfoTaskTrafficsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Traffic")
    private Double traffic;

    private TrafficControlTaskTrafficInfoTaskTrafficsValue(Builder builder) {
        this.traffic = builder.traffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrafficControlTaskTrafficInfoTaskTrafficsValue create() {
        return builder().build();
    }

    /**
     * @return traffic
     */
    public Double getTraffic() {
        return this.traffic;
    }

    public static final class Builder {
        private Double traffic; 

        /**
         * Traffic.
         */
        public Builder traffic(Double traffic) {
            this.traffic = traffic;
            return this;
        }

        public TrafficControlTaskTrafficInfoTaskTrafficsValue build() {
            return new TrafficControlTaskTrafficInfoTaskTrafficsValue(this);
        } 

    } 

}
