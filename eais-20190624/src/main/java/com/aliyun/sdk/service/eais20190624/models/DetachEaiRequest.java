// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachEaiRequest} extends {@link RequestModel}
 *
 * <p>DetachEaiRequest</p>
 */
public class DetachEaiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticAcceleratedInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticAcceleratedInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DetachEaiRequest request) {
            super(request);
            this.elasticAcceleratedInstanceId = request.elasticAcceleratedInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eais-sz8t15a7gt7z7j7i****</p>
         */
        public Builder elasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
            this.putQueryParameter("ElasticAcceleratedInstanceId", elasticAcceleratedInstanceId);
            this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
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
