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
 * {@link GetNatIpCidrAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatIpCidrAttributeResponseBody</p>
 */
public class GetNatIpCidrAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NatIpCidr")
    private String natIpCidr;

    @com.aliyun.core.annotation.NameInMap("NatIpCidrDescription")
    private String natIpCidrDescription;

    @com.aliyun.core.annotation.NameInMap("NatIpCidrId")
    private String natIpCidrId;

    @com.aliyun.core.annotation.NameInMap("NatIpCidrName")
    private String natIpCidrName;

    @com.aliyun.core.annotation.NameInMap("NatIpCidrStatus")
    private String natIpCidrStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNatIpCidrAttributeResponseBody(Builder builder) {
        this.natGatewayId = builder.natGatewayId;
        this.natIpCidr = builder.natIpCidr;
        this.natIpCidrDescription = builder.natIpCidrDescription;
        this.natIpCidrId = builder.natIpCidrId;
        this.natIpCidrName = builder.natIpCidrName;
        this.natIpCidrStatus = builder.natIpCidrStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNatIpCidrAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natIpCidr
     */
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    /**
     * @return natIpCidrDescription
     */
    public String getNatIpCidrDescription() {
        return this.natIpCidrDescription;
    }

    /**
     * @return natIpCidrId
     */
    public String getNatIpCidrId() {
        return this.natIpCidrId;
    }

    /**
     * @return natIpCidrName
     */
    public String getNatIpCidrName() {
        return this.natIpCidrName;
    }

    /**
     * @return natIpCidrStatus
     */
    public String getNatIpCidrStatus() {
        return this.natIpCidrStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String natGatewayId; 
        private String natIpCidr; 
        private String natIpCidrDescription; 
        private String natIpCidrId; 
        private String natIpCidrName; 
        private String natIpCidrStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNatIpCidrAttributeResponseBody model) {
            this.natGatewayId = model.natGatewayId;
            this.natIpCidr = model.natIpCidr;
            this.natIpCidrDescription = model.natIpCidrDescription;
            this.natIpCidrId = model.natIpCidrId;
            this.natIpCidrName = model.natIpCidrName;
            this.natIpCidrStatus = model.natIpCidrStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the VPC NAT gateway instance to which the queried NAT IP address range belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8v16wgvtq26vh59****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The queried NAT IP address range.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        public Builder natIpCidr(String natIpCidr) {
            this.natIpCidr = natIpCidr;
            return this;
        }

        /**
         * <p>Description of the queried NAT IP address range.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder natIpCidrDescription(String natIpCidrDescription) {
            this.natIpCidrDescription = natIpCidrDescription;
            return this;
        }

        /**
         * <p>The instance ID of the queried NAT IP address range.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatcidr-gw8lhqtvdn4qnea****</p>
         */
        public Builder natIpCidrId(String natIpCidrId) {
            this.natIpCidrId = natIpCidrId;
            return this;
        }

        /**
         * <p>The name of the queried NAT IP address range.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder natIpCidrName(String natIpCidrName) {
            this.natIpCidrName = natIpCidrName;
            return this;
        }

        /**
         * <p>The status of the queried NAT IP address segment. Values:</p>
         * <ul>
         * <li>Available: Available status.</li>
         * <li>Deleting: In the process of being deleted.</li>
         * <li>Creating: In the process of being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder natIpCidrStatus(String natIpCidrStatus) {
            this.natIpCidrStatus = natIpCidrStatus;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9AD97A0-5338-43F8-8A80-5E274CCBA11B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNatIpCidrAttributeResponseBody build() {
            return new GetNatIpCidrAttributeResponseBody(this);
        } 

    } 

}
