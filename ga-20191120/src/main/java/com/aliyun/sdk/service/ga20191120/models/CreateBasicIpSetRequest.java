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
 * {@link CreateBasicIpSetRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicIpSetRequest</p>
 */
public class CreateBasicIpSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accelerateRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspType")
    private String ispType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateBasicIpSetRequest(Builder builder) {
        super(builder);
        this.accelerateRegionId = builder.accelerateRegionId;
        this.acceleratorId = builder.acceleratorId;
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.ispType = builder.ispType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicIpSetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ispType
     */
    public String getIspType() {
        return this.ispType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicIpSetRequest, Builder> {
        private String accelerateRegionId; 
        private String acceleratorId; 
        private Long bandwidth; 
        private String clientToken; 
        private String ispType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicIpSetRequest request) {
            super(request);
            this.accelerateRegionId = request.accelerateRegionId;
            this.acceleratorId = request.acceleratorId;
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.ispType = request.ispType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the acceleration region.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/261190.html">ListAvailableBusiRegions</a> operation to query the most recent acceleration region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.putQueryParameter("AccelerateRegionId", accelerateRegionId);
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * <p>The ID of the basic GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4qz****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The bandwidth that you want to allocate to the acceleration region. Unit: <strong>Mbit/s</strong>.</p>
         * <p>You must allocate at least 2 Mbit/s of bandwidth to the acceleration region.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
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
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): BGP (Multi-ISP) lines.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines.</li>
         * </ul>
         * <p>Valid values if you are allowed to use single-ISP bandwidth:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong></li>
         * <li><strong>ChinaUnicom</strong></li>
         * <li><strong>ChinaMobile</strong></li>
         * <li><strong>ChinaTelecom_L2</strong></li>
         * <li><strong>ChinaUnicom_L2</strong></li>
         * <li><strong>ChinaMobile_L2</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the bandwidth metering method of the GA instance is <strong>pay-by-data-transfer</strong>, this parameter is required.</p>
         * </li>
         * <li><p>If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.</p>
         * </li>
         * <li><p>The supported single-ISP type varies based on the acceleration region.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder ispType(String ispType) {
            this.putQueryParameter("IspType", ispType);
            this.ispType = ispType;
            return this;
        }

        /**
         * <p>The region ID of the basic GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
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
        public CreateBasicIpSetRequest build() {
            return new CreateBasicIpSetRequest(this);
        } 

    } 

}
