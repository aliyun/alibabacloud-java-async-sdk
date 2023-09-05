// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorCrossBorderStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAcceleratorCrossBorderStatusRequest</p>
 */
public class UpdateAcceleratorCrossBorderStatusRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CrossBorderStatus")
    @Validation(required = true)
    private Boolean crossBorderStatus;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAcceleratorCrossBorderStatusRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.crossBorderStatus = builder.crossBorderStatus;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAcceleratorCrossBorderStatusRequest create() {
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
     * @return crossBorderStatus
     */
    public Boolean getCrossBorderStatus() {
        return this.crossBorderStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAcceleratorCrossBorderStatusRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private Boolean crossBorderStatus; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAcceleratorCrossBorderStatusRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.crossBorderStatus = request.crossBorderStatus;
            this.regionId = request.regionId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CrossBorderStatus.
         */
        public Builder crossBorderStatus(Boolean crossBorderStatus) {
            this.putQueryParameter("CrossBorderStatus", crossBorderStatus);
            this.crossBorderStatus = crossBorderStatus;
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
        public UpdateAcceleratorCrossBorderStatusRequest build() {
            return new UpdateAcceleratorCrossBorderStatusRequest(this);
        } 

    } 

}
