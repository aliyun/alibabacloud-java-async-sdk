// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayerRequest} extends {@link RequestModel}
 *
 * <p>GetLayerRequest</p>
 */
public class GetLayerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LayerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetLayerRequest(Builder builder) {
        super(builder);
        this.layerId = builder.layerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLayerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetLayerRequest, Builder> {
        private String layerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLayerRequest request) {
            super(request);
            this.layerId = request.layerId;
            this.regionId = request.regionId;
        } 

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.putPathParameter("LayerId", layerId);
            this.layerId = layerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetLayerRequest build() {
            return new GetLayerRequest(this);
        } 

    } 

}
