// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScdnDDoSInfoRequest} extends {@link RequestModel}
 *
 * <p>SetScdnDDoSInfoRequest</p>
 */
public class SetScdnDDoSInfoRequest extends Request {
    @Query
    @NameInMap("ElasticBandwidth")
    @Validation(required = true)
    private Integer elasticBandwidth;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetScdnDDoSInfoRequest(Builder builder) {
        super(builder);
        this.elasticBandwidth = builder.elasticBandwidth;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetScdnDDoSInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticBandwidth
     */
    public Integer getElasticBandwidth() {
        return this.elasticBandwidth;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetScdnDDoSInfoRequest, Builder> {
        private Integer elasticBandwidth; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetScdnDDoSInfoRequest response) {
            super(response);
            this.elasticBandwidth = response.elasticBandwidth;
            this.ownerId = response.ownerId;
        } 

        /**
         * ElasticBandwidth.
         */
        public Builder elasticBandwidth(Integer elasticBandwidth) {
            this.putQueryParameter("ElasticBandwidth", elasticBandwidth);
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetScdnDDoSInfoRequest build() {
            return new SetScdnDDoSInfoRequest(this);
        } 

    } 

}
