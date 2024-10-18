// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateRouteRequest</p>
 */
public class UpdateRouteRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationCidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private UpdateRouteRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationCidr = builder.destinationCidr;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRouteRequest create() {
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
     * @return destinationCidr
     */
    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateRouteRequest, Builder> {
        private String regionId; 
        private String destinationCidr; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRouteRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationCidr = request.destinationCidr;
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder destinationCidr(String destinationCidr) {
            this.putBodyParameter("DestinationCidr", destinationCidr);
            this.destinationCidr = destinationCidr;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateRouteRequest build() {
            return new UpdateRouteRequest(this);
        } 

    } 

}
