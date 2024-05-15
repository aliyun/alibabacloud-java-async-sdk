// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEnableFwSwitchRequest} extends {@link RequestModel}
 *
 * <p>PutEnableFwSwitchRequest</p>
 */
public class PutEnableFwSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpaddrList")
    private java.util.List < String > ipaddrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List < String > regionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypeList")
    private java.util.List < String > resourceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    private PutEnableFwSwitchRequest(Builder builder) {
        super(builder);
        this.ipaddrList = builder.ipaddrList;
        this.lang = builder.lang;
        this.regionList = builder.regionList;
        this.resourceTypeList = builder.resourceTypeList;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEnableFwSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipaddrList
     */
    public java.util.List < String > getIpaddrList() {
        return this.ipaddrList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionList
     */
    public java.util.List < String > getRegionList() {
        return this.regionList;
    }

    /**
     * @return resourceTypeList
     */
    public java.util.List < String > getResourceTypeList() {
        return this.resourceTypeList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<PutEnableFwSwitchRequest, Builder> {
        private java.util.List < String > ipaddrList; 
        private String lang; 
        private java.util.List < String > regionList; 
        private java.util.List < String > resourceTypeList; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(PutEnableFwSwitchRequest request) {
            super(request);
            this.ipaddrList = request.ipaddrList;
            this.lang = request.lang;
            this.regionList = request.regionList;
            this.resourceTypeList = request.resourceTypeList;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The IP addresses.
         * <p>
         * 
         * > You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.
         */
        public Builder ipaddrList(java.util.List < String > ipaddrList) {
            this.putQueryParameter("IpaddrList", ipaddrList);
            this.ipaddrList = ipaddrList;
            return this;
        }

        /**
         * The language of the content within the response.
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The regions.
         * <p>
         * 
         * > You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.
         */
        public Builder regionList(java.util.List < String > regionList) {
            this.putQueryParameter("RegionList", regionList);
            this.regionList = regionList;
            return this;
        }

        /**
         * The types of the assets.
         * <p>
         * 
         * Valid values:
         * 
         * *   BastionHostIP: the egress IP address of a bastion host
         * *   BastionHostIngressIP: the ingress IP address of a bastion host
         * *   EcsEIP: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance
         * *   EcsPublicIP: the public IP address of an ECS instance
         * *   EIP: the EIP
         * *   EniEIP: the EIP of an elastic network interface (ENI)
         * *   NatEIP: the EIP of a NAT gateway
         * *   SlbEIP: the EIP of a Server Load Balancer (SLB) instance
         * *   SlbPublicIP: the public IP address of an SLB instance
         * *   NatPublicIP: the public IP address of a NAT gateway
         * *   HAVIP: the high-availability virtual IP address (HAVIP)
         * 
         * > You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.
         */
        public Builder resourceTypeList(java.util.List < String > resourceTypeList) {
            this.putQueryParameter("ResourceTypeList", resourceTypeList);
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public PutEnableFwSwitchRequest build() {
            return new PutEnableFwSwitchRequest(this);
        } 

    } 

}
