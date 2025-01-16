// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link GetEndpointAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetEndpointAttributeRequest</p>
 */
public class GetEndpointAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

    private GetEndpointAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointType = builder.endpointType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEndpointAttributeRequest create() {
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
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    public static final class Builder extends Request.Builder<GetEndpointAttributeRequest, Builder> {
        private String regionId; 
        private String endpointType; 

        private Builder() {
            super();
        } 

        private Builder(GetEndpointAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointType = request.endpointType;
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
         * <p>The type of the endpoint. Valid value:</p>
         * <ul>
         * <li><strong>public</strong>: indicates a public endpoint. (Only public endpoint is supported.)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        @Override
        public GetEndpointAttributeRequest build() {
            return new GetEndpointAttributeRequest(this);
        } 

    } 

}
