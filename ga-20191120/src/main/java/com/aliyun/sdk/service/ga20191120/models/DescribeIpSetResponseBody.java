// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpSetResponseBody</p>
 */
public class DescribeIpSetResponseBody extends TeaModel {
    @NameInMap("AccelerateRegionId")
    private String accelerateRegionId;

    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("IpAddressList")
    private java.util.List < String > ipAddressList;

    @NameInMap("IpSetId")
    private String ipSetId;

    @NameInMap("IpVersion")
    private String ipVersion;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private DescribeIpSetResponseBody(Builder builder) {
        this.accelerateRegionId = builder.accelerateRegionId;
        this.acceleratorId = builder.acceleratorId;
        this.bandwidth = builder.bandwidth;
        this.ipAddressList = builder.ipAddressList;
        this.ipSetId = builder.ipSetId;
        this.ipVersion = builder.ipVersion;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateRegionId
     */
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return ipAddressList
     */
    public java.util.List < String > getIpAddressList() {
        return this.ipAddressList;
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String accelerateRegionId; 
        private String acceleratorId; 
        private Integer bandwidth; 
        private java.util.List < String > ipAddressList; 
        private String ipSetId; 
        private String ipVersion; 
        private String requestId; 
        private String state; 

        /**
         * AccelerateRegionId.
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
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
         * IpAddressList.
         */
        public Builder ipAddressList(java.util.List < String > ipAddressList) {
            this.ipAddressList = ipAddressList;
            return this;
        }

        /**
         * IpSetId.
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DescribeIpSetResponseBody build() {
            return new DescribeIpSetResponseBody(this);
        } 

    } 

}
