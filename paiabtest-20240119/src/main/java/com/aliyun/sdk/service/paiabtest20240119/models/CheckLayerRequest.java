// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckLayerRequest} extends {@link RequestModel}
 *
 * <p>CheckLayerRequest</p>
 */
public class CheckLayerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LayerId")
    private String layerId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamNames")
    private String paramNames;

    private CheckLayerRequest(Builder builder) {
        super(builder);
        this.layerId = builder.layerId;
        this.regionId = builder.regionId;
        this.paramNames = builder.paramNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckLayerRequest create() {
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

    /**
     * @return paramNames
     */
    public String getParamNames() {
        return this.paramNames;
    }

    public static final class Builder extends Request.Builder<CheckLayerRequest, Builder> {
        private String layerId; 
        private String regionId; 
        private String paramNames; 

        private Builder() {
            super();
        } 

        private Builder(CheckLayerRequest request) {
            super(request);
            this.layerId = request.layerId;
            this.regionId = request.regionId;
            this.paramNames = request.paramNames;
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

        /**
         * ParamNames.
         */
        public Builder paramNames(String paramNames) {
            this.putQueryParameter("ParamNames", paramNames);
            this.paramNames = paramNames;
            return this;
        }

        @Override
        public CheckLayerRequest build() {
            return new CheckLayerRequest(this);
        } 

    } 

}
