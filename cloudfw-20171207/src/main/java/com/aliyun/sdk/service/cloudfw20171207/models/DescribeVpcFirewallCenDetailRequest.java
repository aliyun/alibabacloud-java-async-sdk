// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallCenDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallCenDetailRequest</p>
 */
public class DescribeVpcFirewallCenDetailRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NetworkInstanceId")
    private String networkInstanceId;

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    private DescribeVpcFirewallCenDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.networkInstanceId = builder.networkInstanceId;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallCenDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return networkInstanceId
     */
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallCenDetailRequest, Builder> {
        private String lang; 
        private String networkInstanceId; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallCenDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.networkInstanceId = request.networkInstanceId;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the VPC for which the VPC firewall is created.
         */
        public Builder networkInstanceId(String networkInstanceId) {
            this.putQueryParameter("NetworkInstanceId", networkInstanceId);
            this.networkInstanceId = networkInstanceId;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         * <p>
         * 
         * > You can call the [DescribeVpcFirewallCenList](~~345777~~) operation to query the instance IDs of VPC firewalls.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DescribeVpcFirewallCenDetailRequest build() {
            return new DescribeVpcFirewallCenDetailRequest(this);
        } 

    } 

}
