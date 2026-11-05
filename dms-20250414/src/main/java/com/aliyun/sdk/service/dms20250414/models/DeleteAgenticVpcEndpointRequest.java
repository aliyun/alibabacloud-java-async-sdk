// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAgenticVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgenticVpcEndpointRequest</p>
 */
public class DeleteAgenticVpcEndpointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    private DeleteAgenticVpcEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointId = builder.endpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgenticVpcEndpointRequest create() {
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
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    public static final class Builder extends Request.Builder<DeleteAgenticVpcEndpointRequest, Builder> {
        private String regionId; 
        private String endpointId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgenticVpcEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointId = request.endpointId;
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
         * <p>The ID of the endpoint to be deleted. You can delete the endpoint even if it has associated data sources, but this may interrupt access.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-7xvra4ad6619266ba43d</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        @Override
        public DeleteAgenticVpcEndpointRequest build() {
            return new DeleteAgenticVpcEndpointRequest(this);
        } 

    } 

}
