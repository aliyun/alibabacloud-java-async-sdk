// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicIpSetRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicIpSetRequest</p>
 */
public class CreateBasicIpSetRequest extends Request {
    @Query
    @NameInMap("AccelerateRegionId")
    @Validation(required = true)
    private String accelerateRegionId;

    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("IspType")
    private String ispType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * The ID of the acceleration region.
         * <p>
         * 
         * You can call the [ListAvailableBusiRegions](~~261190~~) operation to query the most recent acceleration region list.
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.putQueryParameter("AccelerateRegionId", accelerateRegionId);
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The bandwidth that you want to allocate to the acceleration region. Unit: **Mbit/s**.
         * <p>
         * 
         * You must allocate at least 2 Mbit/s of bandwidth to the acceleration region.
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The line type of the elastic IP address (EIP) in the acceleration region. Valid values:
         * <p>
         * 
         * *   **BGP** (default): BGP (Multi-ISP) lines.
         * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines.
         * 
         * Valid values if you are allowed to use single-ISP bandwidth:
         * 
         * *   **ChinaTelecom**
         * *   **ChinaUnicom**
         * *   **ChinaMobile**
         * *   **ChinaTelecom_L2**
         * *   **ChinaUnicom_L2**
         * *   **ChinaMobile_L2**
         * 
         * > 
         * 
         * *   If the bandwidth metering method of the GA instance is **pay-by-data-transfer**, this parameter is required.
         * 
         * *   If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.
         * 
         * *   The supported single-ISP type varies based on the acceleration region.
         */
        public Builder ispType(String ispType) {
            this.putQueryParameter("IspType", ispType);
            this.ispType = ispType;
            return this;
        }

        /**
         * The region ID of the basic GA instance. Set the value to **cn-hangzhou**.
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
