// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachEaiRequest} extends {@link RequestModel}
 *
 * <p>DetachEaiRequest</p>
 */
public class DetachEaiRequest extends Request {
    @Query
    @NameInMap("ElasticAcceleratedInstanceId")
    @Validation(required = true)
    private String elasticAcceleratedInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DetachEaiRequest(Builder builder) {
        super(builder);
        this.elasticAcceleratedInstanceId = builder.elasticAcceleratedInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachEaiRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachEaiRequest, Builder> {
        private String elasticAcceleratedInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachEaiRequest response) {
            super(response);
            this.elasticAcceleratedInstanceId = response.elasticAcceleratedInstanceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DetachEaiRequest build() {
            return new DetachEaiRequest(this);
        } 

    } 

}
