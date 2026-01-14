// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link CreateIpSetsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpSetsResponseBody</p>
 */
public class CreateIpSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("IpSets")
    private java.util.List<IpSets> ipSets;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<IpSets> getIpSets() {
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
        private java.util.List<IpSets> ipSets; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIpSetsResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.ipSets = model.ipSets;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The GA instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1yeeq8yfoyszmq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The details about the acceleration regions.</p>
         */
        public Builder ipSets(java.util.List<IpSets> ipSets) {
            this.ipSets = ipSets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1F4B6A4A-C89E-489E-BAF1-52777EE148EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpSetsResponseBody build() {
            return new CreateIpSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateIpSetsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateIpSetsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IpSets model) {
                this.accelerateRegionId = model.accelerateRegionId;
                this.bandwidth = model.bandwidth;
                this.ipSetId = model.ipSetId;
                this.ispType = model.ispType;
            } 

            /**
             * <p>The acceleration region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * <p>The bandwidth allocated to the acceleration region. Unit: <strong>Mbit/s</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The acceleration region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ips-bp11r5jb8ogp122xl****</p>
             */
            public Builder ipSetId(String ipSetId) {
                this.ipSetId = ipSetId;
                return this;
            }

            /**
             * <p>The line type of the EIP in the acceleration region.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
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
