// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link AssociateAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AssociateAnycastEipAddressRequest</p>
 */
public class AssociateAnycastEipAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnycastId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String anycastId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociationMode")
    private String associationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindInstanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PopLocations")
    private java.util.List<PopLocations> popLocations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    private AssociateAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.associationMode = builder.associationMode;
        this.bindInstanceId = builder.bindInstanceId;
        this.bindInstanceRegionId = builder.bindInstanceRegionId;
        this.bindInstanceType = builder.bindInstanceType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.popLocations = builder.popLocations;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAnycastEipAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return associationMode
     */
    public String getAssociationMode() {
        return this.associationMode;
    }

    /**
     * @return bindInstanceId
     */
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    /**
     * @return bindInstanceRegionId
     */
    public String getBindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }

    /**
     * @return bindInstanceType
     */
    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return popLocations
     */
    public java.util.List<PopLocations> getPopLocations() {
        return this.popLocations;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<AssociateAnycastEipAddressRequest, Builder> {
        private String anycastId; 
        private String associationMode; 
        private String bindInstanceId; 
        private String bindInstanceRegionId; 
        private String bindInstanceType; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<PopLocations> popLocations; 
        private String privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(AssociateAnycastEipAddressRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.associationMode = request.associationMode;
            this.bindInstanceId = request.bindInstanceId;
            this.bindInstanceRegionId = request.bindInstanceRegionId;
            this.bindInstanceType = request.bindInstanceType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.popLocations = request.popLocations;
            this.privateIpAddress = request.privateIpAddress;
        } 

        /**
         * <p>The ID of the Anycast EIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aeip-bp1ix34fralt4ykf3****</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>The association mode. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong>: the default mode. In this mode, the endpoint to be associated serves as the default origin server.</li>
         * <li><strong>Normal</strong>: the standard mode. In this mode, the endpoint to be associated serves as a standard origin server.</li>
         * </ul>
         * <blockquote>
         * <p>You can associate endpoints in multiple regions with an Anycast EIP. However, only one endpoint can serve as the default origin server. Others serve as standard origin servers. If you do not specify or add an access point, requests are forwarded to the default origin server.\</p>
         * </blockquote>
         * <ul>
         * <li>If this is your first time to associate an Anycast EIP with an endpoint, set the value to <strong>Default</strong>.</li>
         * <li>If not, you can also set the value to <strong>Default</strong>, which specifies a new default origin server. In this case, the previous origin server functions as a standard origin server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder associationMode(String associationMode) {
            this.putQueryParameter("AssociationMode", associationMode);
            this.associationMode = associationMode;
            return this;
        }

        /**
         * <p>The ID of the endpoint with which you want to associate the Anycast EIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-d7oxbixhxv1uupnon****</p>
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region where the endpoint is deployed.</p>
         * <p>You can associate Anycast EIPs only with endpoints in specific regions. You can call the <a href="https://help.aliyun.com/document_detail/171939.html">DescribeAnycastServerRegions</a> operation to query the region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>us-west-1</p>
         */
        public Builder bindInstanceRegionId(String bindInstanceRegionId) {
            this.putQueryParameter("BindInstanceRegionId", bindInstanceRegionId);
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }

        /**
         * <p>The type of endpoint with which you want to associate the Anycast EIP. Valid values:</p>
         * <ul>
         * <li><strong>SlbInstance</strong>: internal-facing Server Load Balancer (SLB) instance that is deployed in a virtual private cloud (VPC)</li>
         * <li><strong>NetworkInterface</strong>: elastic network interface (ENI)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SlbInstance</p>
         */
        public Builder bindInstanceType(String bindInstanceType) {
            this.putQueryParameter("BindInstanceType", bindInstanceType);
            this.bindInstanceType = bindInstanceType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The information about the access points in associated access areas when you associate an Anycast EIP with an endpoint.</p>
         * <p>If this is your first time to associate an Anycast EIP with an endpoint, ignore this parameter. The system automatically associates all access areas.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/171938.html">DescribeAnycastPopLocations</a> operation to query information about access points in supported access areas.</p>
         */
        public Builder popLocations(java.util.List<PopLocations> popLocations) {
            this.putQueryParameter("PopLocations", popLocations);
            this.popLocations = popLocations;
            return this;
        }

        /**
         * <p>The secondary private IP address of the ENI with which you want to associate the Anycast EIP.</p>
         * <p>This parameter is valid only when you set <strong>BindInstanceType</strong> to <strong>NetworkInterface</strong>. If you do not set this parameter, the primary private IP address of the ENI is used.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public AssociateAnycastEipAddressRequest build() {
            return new AssociateAnycastEipAddressRequest(this);
        } 

    } 

    /**
     * 
     * {@link AssociateAnycastEipAddressRequest} extends {@link TeaModel}
     *
     * <p>AssociateAnycastEipAddressRequest</p>
     */
    public static class PopLocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PopLocation")
        private String popLocation;

        private PopLocations(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocations create() {
            return builder().build();
        }

        /**
         * @return popLocation
         */
        public String getPopLocation() {
            return this.popLocation;
        }

        public static final class Builder {
            private String popLocation; 

            private Builder() {
            } 

            private Builder(PopLocations model) {
                this.popLocation = model.popLocation;
            } 

            /**
             * <p>The information about the access points in associated access areas when you associate an Anycast EIP with an endpoint.</p>
             * <p>If this is your first time to associate an Anycast EIP with an endpoint, ignore this parameter. The system automatically associates all access areas.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/171938.html">DescribeAnycastPopLocations</a> operation to query information about access points in supported access areas.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1-pop</p>
             */
            public Builder popLocation(String popLocation) {
                this.popLocation = popLocation;
                return this;
            }

            public PopLocations build() {
                return new PopLocations(this);
            } 

        } 

    }
}
