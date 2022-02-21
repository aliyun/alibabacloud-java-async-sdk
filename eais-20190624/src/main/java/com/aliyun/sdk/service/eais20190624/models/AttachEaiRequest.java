// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEaiRequest} extends {@link RequestModel}
 *
 * <p>AttachEaiRequest</p>
 */
public class AttachEaiRequest extends Request {
    @Query
    @NameInMap("ClientInstanceId")
    @Validation(required = true)
    private String clientInstanceId;

    @Query
    @NameInMap("ElasticAcceleratedInstanceId")
    @Validation(required = true)
    private String elasticAcceleratedInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AttachEaiRequest(Builder builder) {
        super(builder);
        this.clientInstanceId = builder.clientInstanceId;
        this.elasticAcceleratedInstanceId = builder.elasticAcceleratedInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEaiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInstanceId
     */
    public String getClientInstanceId() {
        return this.clientInstanceId;
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

    public static final class Builder extends Request.Builder<AttachEaiRequest, Builder> {
        private String clientInstanceId; 
        private String elasticAcceleratedInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachEaiRequest response) {
            super(response);
            this.clientInstanceId = response.clientInstanceId;
            this.elasticAcceleratedInstanceId = response.elasticAcceleratedInstanceId;
            this.regionId = response.regionId;
        } 

        /**
         * ClientInstanceId.
         */
        public Builder clientInstanceId(String clientInstanceId) {
            this.putQueryParameter("ClientInstanceId", clientInstanceId);
            this.clientInstanceId = clientInstanceId;
            return this;
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
        public AttachEaiRequest build() {
            return new AttachEaiRequest(this);
        } 

    } 

}
