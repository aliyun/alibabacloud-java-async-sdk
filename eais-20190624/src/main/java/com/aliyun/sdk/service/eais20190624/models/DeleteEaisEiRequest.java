// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEaisEiRequest} extends {@link RequestModel}
 *
 * <p>DeleteEaisEiRequest</p>
 */
public class DeleteEaisEiRequest extends Request {
    @Query
    @NameInMap("EiInstanceId")
    @Validation(required = true)
    private String eiInstanceId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteEaisEiRequest(Builder builder) {
        super(builder);
        this.eiInstanceId = builder.eiInstanceId;
        this.force = builder.force;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEaisEiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eiInstanceId
     */
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteEaisEiRequest, Builder> {
        private String eiInstanceId; 
        private Boolean force; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEaisEiRequest request) {
            super(request);
            this.eiInstanceId = request.eiInstanceId;
            this.force = request.force;
            this.regionId = request.regionId;
        } 

        /**
         * EiInstanceId.
         */
        public Builder eiInstanceId(String eiInstanceId) {
            this.putQueryParameter("EiInstanceId", eiInstanceId);
            this.eiInstanceId = eiInstanceId;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
        public DeleteEaisEiRequest build() {
            return new DeleteEaisEiRequest(this);
        } 

    } 

}
