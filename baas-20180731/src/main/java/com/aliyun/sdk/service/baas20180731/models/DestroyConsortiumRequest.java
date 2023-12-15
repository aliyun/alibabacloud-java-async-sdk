// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DestroyConsortiumRequest} extends {@link RequestModel}
 *
 * <p>DestroyConsortiumRequest</p>
 */
public class DestroyConsortiumRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    private DestroyConsortiumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumId = builder.consortiumId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DestroyConsortiumRequest create() {
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
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public static final class Builder extends Request.Builder<DestroyConsortiumRequest, Builder> {
        private String regionId; 
        private String consortiumId; 

        private Builder() {
            super();
        } 

        private Builder(DestroyConsortiumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consortiumId = request.consortiumId;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        @Override
        public DestroyConsortiumRequest build() {
            return new DestroyConsortiumRequest(this);
        } 

    } 

}
