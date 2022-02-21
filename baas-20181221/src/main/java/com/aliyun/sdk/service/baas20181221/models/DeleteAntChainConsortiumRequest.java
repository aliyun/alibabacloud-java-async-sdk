// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainConsortiumRequest} extends {@link RequestModel}
 *
 * <p>DeleteAntChainConsortiumRequest</p>
 */
public class DeleteAntChainConsortiumRequest extends Request {
    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteAntChainConsortiumRequest(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAntChainConsortiumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAntChainConsortiumRequest, Builder> {
        private String consortiumId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAntChainConsortiumRequest response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.regionId = response.regionId;
        } 

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
        public DeleteAntChainConsortiumRequest build() {
            return new DeleteAntChainConsortiumRequest(this);
        } 

    } 

}
