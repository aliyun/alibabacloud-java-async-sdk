// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpSetsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpSetsResponseBody</p>
 */
public class CreateIpSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("IpSets")
    private java.util.List < IpSets> ipSets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpSetsResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.ipSets = builder.ipSets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return ipSets
     */
    public java.util.List < IpSets> getIpSets() {
        return this.ipSets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String acceleratorId; 
        private java.util.List < IpSets> ipSets; 
        private String requestId; 

        /**
         * The GA instance ID.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The details about the acceleration regions.
         */
        public Builder ipSets(java.util.List < IpSets> ipSets) {
            this.ipSets = ipSets;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpSetsResponseBody build() {
            return new CreateIpSetsResponseBody(this);
        } 

    } 

    public static class IpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateRegionId")
        private String accelerateRegionId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("IpSetId")
        private String ipSetId;

        @com.aliyun.core.annotation.NameInMap("IspType")
        private String ispType;

        private IpSets(Builder builder) {
            this.accelerateRegionId = builder.accelerateRegionId;
            this.bandwidth = builder.bandwidth;
            this.ipSetId = builder.ipSetId;
            this.ispType = builder.ispType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSets create() {
            return builder().build();
        }

        /**
         * @return accelerateRegionId
         */
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return ipSetId
         */
        public String getIpSetId() {
            return this.ipSetId;
        }

        /**
         * @return ispType
         */
        public String getIspType() {
            return this.ispType;
        }

        public static final class Builder {
            private String accelerateRegionId; 
            private Integer bandwidth; 
            private String ipSetId; 
            private String ispType; 

            /**
             * The acceleration region ID.
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * The bandwidth allocated to the acceleration region. Unit: **Mbit/s**.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The acceleration region ID.
             */
            public Builder ipSetId(String ipSetId) {
                this.ipSetId = ipSetId;
                return this;
            }

            /**
             * The line type of the EIP in the acceleration region.
             */
            public Builder ispType(String ispType) {
                this.ispType = ispType;
                return this;
            }

            public IpSets build() {
                return new IpSets(this);
            } 

        } 

    }
}
