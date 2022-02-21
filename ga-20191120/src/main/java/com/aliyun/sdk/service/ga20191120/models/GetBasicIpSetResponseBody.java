// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicIpSetResponseBody</p>
 */
public class GetBasicIpSetResponseBody extends TeaModel {
    @NameInMap("AccelerateRegionId")
    private String accelerateRegionId;

    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("IpAddress")
    private String ipAddress;

    @NameInMap("IpSetId")
    private String ipSetId;

    @NameInMap("IpVersion")
    private String ipVersion;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private GetBasicIpSetResponseBody(Builder builder) {
        this.accelerateRegionId = builder.accelerateRegionId;
        this.acceleratorId = builder.acceleratorId;
        this.bandwidth = builder.bandwidth;
        this.ipAddress = builder.ipAddress;
        this.ipSetId = builder.ipSetId;
        this.ipVersion = builder.ipVersion;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicIpSetResponseBody create() {
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
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
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
        private String ipAddress; 
        private String ipSetId; 
        private String ipVersion; 
        private String requestId; 
        private String state; 

        /**
         * 加速地域Id
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * 全球加速实例Id
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * 加速地域带宽
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * 加速接入点IP地址
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * 加速接入点id
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * 加速接入点地址类型
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 加速接入点状态
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetBasicIpSetResponseBody build() {
            return new GetBasicIpSetResponseBody(this);
        } 

    } 

}
