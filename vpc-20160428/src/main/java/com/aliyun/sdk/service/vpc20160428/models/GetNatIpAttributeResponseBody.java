// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link GetNatIpAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatIpAttributeResponseBody</p>
 */
public class GetNatIpAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NatIp")
    private String natIp;

    @com.aliyun.core.annotation.NameInMap("NatIpCidr")
    private String natIpCidr;

    @com.aliyun.core.annotation.NameInMap("NatIpDescription")
    private String natIpDescription;

    @com.aliyun.core.annotation.NameInMap("NatIpId")
    private String natIpId;

    @com.aliyun.core.annotation.NameInMap("NatIpName")
    private String natIpName;

    @com.aliyun.core.annotation.NameInMap("NatIpStatus")
    private String natIpStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNatIpAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.natGatewayId = builder.natGatewayId;
        this.natIp = builder.natIp;
        this.natIpCidr = builder.natIpCidr;
        this.natIpDescription = builder.natIpDescription;
        this.natIpId = builder.natIpId;
        this.natIpName = builder.natIpName;
        this.natIpStatus = builder.natIpStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNatIpAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpCidr
     */
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    /**
     * @return natIpDescription
     */
    public String getNatIpDescription() {
        return this.natIpDescription;
    }

    /**
     * @return natIpId
     */
    public String getNatIpId() {
        return this.natIpId;
    }

    /**
     * @return natIpName
     */
    public String getNatIpName() {
        return this.natIpName;
    }

    /**
     * @return natIpStatus
     */
    public String getNatIpStatus() {
        return this.natIpStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String creationTime; 
        private String natGatewayId; 
        private String natIp; 
        private String natIpCidr; 
        private String natIpDescription; 
        private String natIpId; 
        private String natIpName; 
        private String natIpStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNatIpAttributeResponseBody model) {
            this.creationTime = model.creationTime;
            this.natGatewayId = model.natGatewayId;
            this.natIp = model.natIp;
            this.natIpCidr = model.natIpCidr;
            this.natIpDescription = model.natIpDescription;
            this.natIpId = model.natIpId;
            this.natIpName = model.natIpName;
            this.natIpStatus = model.natIpStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The creation time of the queried NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-16T16:47Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The ID of the VPC NAT gateway instance to which the queried NAT IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8v16wgvtq26vh59****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The queried NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.34</p>
         */
        public Builder natIp(String natIp) {
            this.natIp = natIp;
            return this;
        }

        /**
         * <p>The address range where the queried NAT IP address is located.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder natIpCidr(String natIpCidr) {
            this.natIpCidr = natIpCidr;
            return this;
        }

        /**
         * <p>Description of the queried NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder natIpDescription(String natIpDescription) {
            this.natIpDescription = natIpDescription;
            return this;
        }

        /**
         * <p>The ID of the queried NAT IP address instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatip-gw8y7q3cpk3fggs87****</p>
         */
        public Builder natIpId(String natIpId) {
            this.natIpId = natIpId;
            return this;
        }

        /**
         * <p>Name of the queried NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder natIpName(String natIpName) {
            this.natIpName = natIpName;
            return this;
        }

        /**
         * <p>The status of the queried NAT IP address. Values:</p>
         * <ul>
         * <li><strong>Available</strong>: Available.</li>
         * <li><strong>Deleting</strong>: Deleting.</li>
         * <li><strong>Creating</strong>: Creating.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder natIpStatus(String natIpStatus) {
            this.natIpStatus = natIpStatus;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9D55DB90-0D57-46AB-841D-1D4238514AC6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNatIpAttributeResponseBody build() {
            return new GetNatIpAttributeResponseBody(this);
        } 

    } 

}
