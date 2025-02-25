// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteResourceShareRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceShareRequest</p>
 */
public class DeleteResourceShareRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceShareId;

    private DeleteResourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceShareId = builder.resourceShareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceShareRequest create() {
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
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public static final class Builder extends Request.Builder<DeleteResourceShareRequest, Builder> {
        private String regionId; 
        private String resourceShareId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceShareId = request.resourceShareId;
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
         * <p>The ID of the resource share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-qSkW1HBY****</p>
         */
        public Builder resourceShareId(String resourceShareId) {
            this.putQueryParameter("ResourceShareId", resourceShareId);
            this.resourceShareId = resourceShareId;
            return this;
        }

        @Override
        public DeleteResourceShareRequest build() {
            return new DeleteResourceShareRequest(this);
        } 

    } 

}
