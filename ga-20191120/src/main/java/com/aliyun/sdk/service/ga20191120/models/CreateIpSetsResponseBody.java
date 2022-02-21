// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpSetsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpSetsResponseBody</p>
 */
public class CreateIpSetsResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("IpSets")
    private java.util.List < IpSets> ipSets;

    @NameInMap("RequestId")
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
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * IpSets.
         */
        public Builder ipSets(java.util.List < IpSets> ipSets) {
            this.ipSets = ipSets;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AccelerateRegionId")
        private String accelerateRegionId;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("IpSetId")
        private String ipSetId;

        private IpSets(Builder builder) {
            this.accelerateRegionId = builder.accelerateRegionId;
            this.bandwidth = builder.bandwidth;
            this.ipSetId = builder.ipSetId;
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

        public static final class Builder {
            private String accelerateRegionId; 
            private Integer bandwidth; 
            private String ipSetId; 

            /**
             * AccelerateRegionId.
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * IpSetId.
             */
            public Builder ipSetId(String ipSetId) {
                this.ipSetId = ipSetId;
                return this;
            }

            public IpSets build() {
                return new IpSets(this);
            } 

        } 

    }
}
