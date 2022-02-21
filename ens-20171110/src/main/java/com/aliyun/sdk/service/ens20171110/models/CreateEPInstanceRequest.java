// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEPInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateEPInstanceRequest</p>
 */
public class CreateEPInstanceRequest extends Request {
    @Query
    @NameInMap("EPNInstanceName")
    @Validation(required = true)
    private String EPNInstanceName;

    @Query
    @NameInMap("EPNInstanceType")
    @Validation(required = true)
    private String EPNInstanceType;

    @Query
    @NameInMap("InternetChargeType")
    @Validation(required = true)
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    @Validation(required = true)
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("NetworkingModel")
    @Validation(required = true)
    private String networkingModel;

    private CreateEPInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceName = builder.EPNInstanceName;
        this.EPNInstanceType = builder.EPNInstanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.networkingModel = builder.networkingModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEPInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceName
     */
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    /**
     * @return EPNInstanceType
     */
    public String getEPNInstanceType() {
        return this.EPNInstanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return networkingModel
     */
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public static final class Builder extends Request.Builder<CreateEPInstanceRequest, Builder> {
        private String EPNInstanceName; 
        private String EPNInstanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthOut; 
        private String networkingModel; 

        private Builder() {
            super();
        } 

        private Builder(CreateEPInstanceRequest response) {
            super(response);
            this.EPNInstanceName = response.EPNInstanceName;
            this.EPNInstanceType = response.EPNInstanceType;
            this.internetChargeType = response.internetChargeType;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.networkingModel = response.networkingModel;
        } 

        /**
         * EPNInstanceName.
         */
        public Builder EPNInstanceName(String EPNInstanceName) {
            this.putQueryParameter("EPNInstanceName", EPNInstanceName);
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }

        /**
         * EPNInstanceType.
         */
        public Builder EPNInstanceType(String EPNInstanceType) {
            this.putQueryParameter("EPNInstanceType", EPNInstanceType);
            this.EPNInstanceType = EPNInstanceType;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * InternetMaxBandwidthOut.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * NetworkingModel.
         */
        public Builder networkingModel(String networkingModel) {
            this.putQueryParameter("NetworkingModel", networkingModel);
            this.networkingModel = networkingModel;
            return this;
        }

        @Override
        public CreateEPInstanceRequest build() {
            return new CreateEPInstanceRequest(this);
        } 

    } 

}
