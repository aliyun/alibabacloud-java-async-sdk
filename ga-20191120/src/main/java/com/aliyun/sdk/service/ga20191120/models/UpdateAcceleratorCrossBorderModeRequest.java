// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorCrossBorderModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAcceleratorCrossBorderModeRequest</p>
 */
public class UpdateAcceleratorCrossBorderModeRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CrossBorderMode")
    @Validation(required = true)
    private String crossBorderMode;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAcceleratorCrossBorderModeRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.crossBorderMode = builder.crossBorderMode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAcceleratorCrossBorderModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return crossBorderMode
     */
    public String getCrossBorderMode() {
        return this.crossBorderMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAcceleratorCrossBorderModeRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String crossBorderMode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAcceleratorCrossBorderModeRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.crossBorderMode = request.crossBorderMode;
            this.regionId = request.regionId;
        } 

        /**
         * The GA instance ID.
         * <p>
         * 
         * > The bandwidth metering method of the GA instance must be pay-by-data-transfer.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The type of transmission network of the GA instance. Valid values:
         * <p>
         * 
         * *   **bgpPro**: BGP (Multi-ISP) Pro. BGP (Multi-ISP) Pro lines are used for cross-border acceleration. You do not need to complete real-name verification.
         * *   **private**: cross-border Express Connect circuit. Cross-border Express Connect circuits provide better acceleration performance but require real-name verification.
         */
        public Builder crossBorderMode(String crossBorderMode) {
            this.putQueryParameter("CrossBorderMode", crossBorderMode);
            this.crossBorderMode = crossBorderMode;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAcceleratorCrossBorderModeRequest build() {
            return new UpdateAcceleratorCrossBorderModeRequest(this);
        } 

    } 

}
