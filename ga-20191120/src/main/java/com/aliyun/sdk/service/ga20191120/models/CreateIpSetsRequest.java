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
 * {@link CreateIpSetsRequest} extends {@link RequestModel}
 *
 * <p>CreateIpSetsRequest</p>
 */
public class CreateIpSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AccelerateRegion> accelerateRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateIpSetsRequest(Builder builder) {
        super(builder);
        this.accelerateRegion = builder.accelerateRegion;
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpSetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateRegion
     */
    public java.util.List<AccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateIpSetsRequest, Builder> {
        private java.util.List<AccelerateRegion> accelerateRegion; 
        private String acceleratorId; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpSetsRequest request) {
            super(request);
            this.accelerateRegion = request.accelerateRegion;
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The information about the acceleration regions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder accelerateRegion(java.util.List<AccelerateRegion> accelerateRegion) {
            this.putQueryParameter("AccelerateRegion", accelerateRegion);
            this.accelerateRegion = accelerateRegion;
            return this;
        }

        /**
         * <p>The GA instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1yeeq8yfoyszmqy****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1F4B6A4A-C89E-489E-BAF1-52777EE148EF</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateIpSetsRequest build() {
            return new CreateIpSetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIpSetsRequest} extends {@link TeaModel}
     *
     * <p>CreateIpSetsRequest</p>
     */
    public static class AccelerateRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateRegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accelerateRegionId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IspType")
        private String ispType;

        private AccelerateRegion(Builder builder) {
            this.accelerateRegionId = builder.accelerateRegionId;
            this.bandwidth = builder.bandwidth;
            this.ipVersion = builder.ipVersion;
            this.ispType = builder.ispType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccelerateRegion create() {
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
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
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
            private String ipVersion; 
            private String ispType; 

            private Builder() {
            } 

            private Builder(AccelerateRegion model) {
                this.accelerateRegionId = model.accelerateRegionId;
                this.bandwidth = model.bandwidth;
                this.ipVersion = model.ipVersion;
                this.ispType = model.ispType;
            } 

            /**
             * <p>The ID of the acceleration region.</p>
             * <p>The number of regions that you can add varies based on the specification of the GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Overview</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote</p>
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * <p>The bandwidth that you want to allocate to the acceleration region. Unit: <strong>Mbit/s</strong>.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is required.</li>
             * <li>You must allocate at least 2 Mbit/s of bandwidth to each acceleration region.</li>
             * <li>The total bandwidth of all acceleration regions cannot exceed the bandwidth limit of your basic bandwidth plan.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The IP version used to connect to the GA instance. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong> (default)</li>
             * <li><strong>IPv6</strong></li>
             * <li><strong>DUAL_STACK</strong>: IPv4 and IPv6</li>
             * </ul>
             * <blockquote>
             * <p>Only pay-as-you-go standard GA instances support DUAL_STACK.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>IPv6</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
             * <ul>
             * <li><strong>BGP</strong>: BGP (Multi-ISP) lines.</li>
             * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is required only if the bandwidth metering method of the GA instance is <strong>pay-by-data transfer</strong>.</li>
             * <li>Different acceleration regions support different line types of EIPs.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder ispType(String ispType) {
                this.ispType = ispType;
                return this;
            }

            public AccelerateRegion build() {
                return new AccelerateRegion(this);
            } 

        } 

    }
}
