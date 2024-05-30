// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MobileDetectRequest} extends {@link RequestModel}
 *
 * <p>MobileDetectRequest</p>
 */
public class MobileDetectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobiles")
    private String mobiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    private MobileDetectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mobiles = builder.mobiles;
        this.paramType = builder.paramType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobileDetectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return mobiles
     */
    public String getMobiles() {
        return this.mobiles;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    public static final class Builder extends Request.Builder<MobileDetectRequest, Builder> {
        private String regionId; 
        private String mobiles; 
        private String paramType; 

        private Builder() {
            super();
        } 

        private Builder(MobileDetectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mobiles = request.mobiles;
            this.paramType = request.paramType;
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
         * Mobiles.
         */
        public Builder mobiles(String mobiles) {
            this.putQueryParameter("Mobiles", mobiles);
            this.mobiles = mobiles;
            return this;
        }

        /**
         * ParamType.
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        @Override
        public MobileDetectRequest build() {
            return new MobileDetectRequest(this);
        } 

    } 

}
