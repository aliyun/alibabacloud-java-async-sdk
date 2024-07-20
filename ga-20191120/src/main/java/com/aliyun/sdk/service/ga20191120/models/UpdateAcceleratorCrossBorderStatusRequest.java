// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorCrossBorderStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAcceleratorCrossBorderStatusRequest</p>
 */
public class UpdateAcceleratorCrossBorderStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossBorderStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean crossBorderStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * The ID of the GA instance.
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
         * Specifies whether to enable the cross-border acceleration feature for the GA instance. Valid values:
         * <p>
         * 
         * - **true**
         * - **false**
         */
        public Builder crossBorderStatus(Boolean crossBorderStatus) {
            this.putQueryParameter("CrossBorderStatus", crossBorderStatus);
            this.crossBorderStatus = crossBorderStatus;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to cn-hangzhou.
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
