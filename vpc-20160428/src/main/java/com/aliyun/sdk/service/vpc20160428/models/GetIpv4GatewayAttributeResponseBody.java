// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpv4GatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpv4GatewayAttributeResponseBody</p>
 */
public class GetIpv4GatewayAttributeResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Enabled")
    private Boolean enabled;

    @NameInMap("Ipv4GatewayDescription")
    private String ipv4GatewayDescription;

    @NameInMap("Ipv4GatewayId")
    private String ipv4GatewayId;

    @NameInMap("Ipv4GatewayName")
    private String ipv4GatewayName;

    @NameInMap("Ipv4GatewayRouteTableId")
    private String ipv4GatewayRouteTableId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("VpcId")
    private String vpcId;

    private GetIpv4GatewayAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.enabled = builder.enabled;
        this.ipv4GatewayDescription = builder.ipv4GatewayDescription;
        this.ipv4GatewayId = builder.ipv4GatewayId;
        this.ipv4GatewayName = builder.ipv4GatewayName;
        this.ipv4GatewayRouteTableId = builder.ipv4GatewayRouteTableId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpv4GatewayAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return ipv4GatewayDescription
     */
    public String getIpv4GatewayDescription() {
        return this.ipv4GatewayDescription;
    }

    /**
     * @return ipv4GatewayId
     */
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    /**
     * @return ipv4GatewayName
     */
    public String getIpv4GatewayName() {
        return this.ipv4GatewayName;
    }

    /**
     * @return ipv4GatewayRouteTableId
     */
    public String getIpv4GatewayRouteTableId() {
        return this.ipv4GatewayRouteTableId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String createTime; 
        private Boolean enabled; 
        private String ipv4GatewayDescription; 
        private String ipv4GatewayId; 
        private String ipv4GatewayName; 
        private String ipv4GatewayRouteTableId; 
        private String requestId; 
        private String status; 
        private String vpcId; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Ipv4GatewayDescription.
         */
        public Builder ipv4GatewayDescription(String ipv4GatewayDescription) {
            this.ipv4GatewayDescription = ipv4GatewayDescription;
            return this;
        }

        /**
         * Ipv4GatewayId.
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * Ipv4GatewayName.
         */
        public Builder ipv4GatewayName(String ipv4GatewayName) {
            this.ipv4GatewayName = ipv4GatewayName;
            return this;
        }

        /**
         * Ipv4GatewayRouteTableId.
         */
        public Builder ipv4GatewayRouteTableId(String ipv4GatewayRouteTableId) {
            this.ipv4GatewayRouteTableId = ipv4GatewayRouteTableId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public GetIpv4GatewayAttributeResponseBody build() {
            return new GetIpv4GatewayAttributeResponseBody(this);
        } 

    } 

}
