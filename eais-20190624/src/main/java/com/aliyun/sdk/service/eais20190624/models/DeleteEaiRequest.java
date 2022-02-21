// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEaiRequest} extends {@link RequestModel}
 *
 * <p>DeleteEaiRequest</p>
 */
public class DeleteEaiRequest extends Request {
    @Query
    @NameInMap("ElasticAcceleratedInstanceId")
    @Validation(required = true)
    private String elasticAcceleratedInstanceId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteEaiRequest(Builder builder) {
        super(builder);
        this.elasticAcceleratedInstanceId = builder.elasticAcceleratedInstanceId;
        this.force = builder.force;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEaiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticAcceleratedInstanceId
     */
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
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

    public static final class Builder extends Request.Builder<DeleteEaiRequest, Builder> {
        private String elasticAcceleratedInstanceId; 
        private Boolean force; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEaiRequest response) {
            super(response);
            this.elasticAcceleratedInstanceId = response.elasticAcceleratedInstanceId;
            this.force = response.force;
            this.regionId = response.regionId;
        } 

        /**
         * ElasticAcceleratedInstanceId.
         */
        public Builder elasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
            this.putQueryParameter("ElasticAcceleratedInstanceId", elasticAcceleratedInstanceId);
            this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
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
        public DeleteEaiRequest build() {
            return new DeleteEaiRequest(this);
        } 

    } 

}
