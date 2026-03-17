// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagTrafficTopNResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagTrafficTopNResponseBody</p>
 */
public class DescribeSagTrafficTopNResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficTopN")
    private java.util.List<TrafficTopN> trafficTopN;

    private DescribeSagTrafficTopNResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficTopN = builder.trafficTopN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagTrafficTopNResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficTopN
     */
    public java.util.List<TrafficTopN> getTrafficTopN() {
        return this.trafficTopN;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TrafficTopN> trafficTopN; 

        private Builder() {
        } 

        private Builder(DescribeSagTrafficTopNResponseBody model) {
            this.requestId = model.requestId;
            this.trafficTopN = model.trafficTopN;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AFF7E5A6-6897-4FDC-A5A8-1978B5B3E545</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the data transfer rate of the SAG instance.</p>
         */
        public Builder trafficTopN(java.util.List<TrafficTopN> trafficTopN) {
            this.trafficTopN = trafficTopN;
            return this;
        }

        public DescribeSagTrafficTopNResponseBody build() {
            return new DescribeSagTrafficTopNResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagTrafficTopNResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagTrafficTopNResponseBody</p>
     */
    public static class TrafficTopN extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TrafficRate")
        private String trafficRate;

        private TrafficTopN(Builder builder) {
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.trafficRate = builder.trafficRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficTopN create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return trafficRate
         */
        public String getTrafficRate() {
            return this.trafficRate;
        }

        public static final class Builder {
            private String instanceId; 
            private String name; 
            private String regionId; 
            private String trafficRate; 

            private Builder() {
            } 

            private Builder(TrafficTopN model) {
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.regionId = model.regionId;
                this.trafficRate = model.trafficRate;
            } 

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-whfn****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region where the SAG instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The data transfer rate of the SAG instance. Unit: bit/s</p>
             * 
             * <strong>example:</strong>
             * <p>3866.6666666666665</p>
             */
            public Builder trafficRate(String trafficRate) {
                this.trafficRate = trafficRate;
                return this;
            }

            public TrafficTopN build() {
                return new TrafficTopN(this);
            } 

        } 

    }
}
