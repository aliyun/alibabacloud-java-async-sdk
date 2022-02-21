// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitDtsRdsInstanceRequest} extends {@link RequestModel}
 *
 * <p>InitDtsRdsInstanceRequest</p>
 */
public class InitDtsRdsInstanceRequest extends Request {
    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("EndpointCenId")
    private String endpointCenId;

    @Query
    @NameInMap("EndpointInstanceId")
    private String endpointInstanceId;

    @Query
    @NameInMap("EndpointInstanceType")
    private String endpointInstanceType;

    @Query
    @NameInMap("EndpointRegion")
    private String endpointRegion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private InitDtsRdsInstanceRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.endpointCenId = builder.endpointCenId;
        this.endpointInstanceId = builder.endpointInstanceId;
        this.endpointInstanceType = builder.endpointInstanceType;
        this.endpointRegion = builder.endpointRegion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitDtsRdsInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return endpointCenId
     */
    public String getEndpointCenId() {
        return this.endpointCenId;
    }

    /**
     * @return endpointInstanceId
     */
    public String getEndpointInstanceId() {
        return this.endpointInstanceId;
    }

    /**
     * @return endpointInstanceType
     */
    public String getEndpointInstanceType() {
        return this.endpointInstanceType;
    }

    /**
     * @return endpointRegion
     */
    public String getEndpointRegion() {
        return this.endpointRegion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InitDtsRdsInstanceRequest, Builder> {
        private String dtsInstanceId; 
        private String endpointCenId; 
        private String endpointInstanceId; 
        private String endpointInstanceType; 
        private String endpointRegion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InitDtsRdsInstanceRequest response) {
            super(response);
            this.dtsInstanceId = response.dtsInstanceId;
            this.endpointCenId = response.endpointCenId;
            this.endpointInstanceId = response.endpointInstanceId;
            this.endpointInstanceType = response.endpointInstanceType;
            this.endpointRegion = response.endpointRegion;
            this.regionId = response.regionId;
        } 

        /**
         * DtsInstanceId.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * EndpointCenId.
         */
        public Builder endpointCenId(String endpointCenId) {
            this.putQueryParameter("EndpointCenId", endpointCenId);
            this.endpointCenId = endpointCenId;
            return this;
        }

        /**
         * EndpointInstanceId.
         */
        public Builder endpointInstanceId(String endpointInstanceId) {
            this.putQueryParameter("EndpointInstanceId", endpointInstanceId);
            this.endpointInstanceId = endpointInstanceId;
            return this;
        }

        /**
         * EndpointInstanceType.
         */
        public Builder endpointInstanceType(String endpointInstanceType) {
            this.putQueryParameter("EndpointInstanceType", endpointInstanceType);
            this.endpointInstanceType = endpointInstanceType;
            return this;
        }

        /**
         * EndpointRegion.
         */
        public Builder endpointRegion(String endpointRegion) {
            this.putQueryParameter("EndpointRegion", endpointRegion);
            this.endpointRegion = endpointRegion;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InitDtsRdsInstanceRequest build() {
            return new InitDtsRdsInstanceRequest(this);
        } 

    } 

}
