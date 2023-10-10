// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlbRequest} extends {@link RequestModel}
 *
 * <p>ListSlbRequest</p>
 */
public class ListSlbRequest extends Request {
    @Query
    @NameInMap("AddressType")
    private String addressType;

    @Query
    @NameInMap("SlbType")
    private String slbType;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private ListSlbRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.slbType = builder.slbType;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return slbType
     */
    public String getSlbType() {
        return this.slbType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListSlbRequest, Builder> {
        private String addressType; 
        private String slbType; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListSlbRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.slbType = request.slbType;
            this.vpcId = request.vpcId;
        } 

        /**
         * The type of the IP addresses. Valid values:
         * <p>
         * 
         * *   Internet: Users can connect to the SLB instance over the Internet.
         * *   Intranet: Users can connect to the SLB instance over the internal network.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * The type of the SLB instance. Valid values:
         * <p>
         * 
         * *   clb: Classic Load Balancer (CLB)
         * *   alb: Application Load Balancer (ALB)
         */
        public Builder slbType(String slbType) {
            this.putQueryParameter("SlbType", slbType);
            this.slbType = slbType;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC).
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListSlbRequest build() {
            return new ListSlbRequest(this);
        } 

    } 

}
