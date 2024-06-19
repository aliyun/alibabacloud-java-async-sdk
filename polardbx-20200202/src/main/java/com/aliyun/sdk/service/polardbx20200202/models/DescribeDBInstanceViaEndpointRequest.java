// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceViaEndpointRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceViaEndpointRequest</p>
 */
public class DescribeDBInstanceViaEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeDBInstanceViaEndpointRequest(Builder builder) {
        super(builder);
        this.endpoint = builder.endpoint;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceViaEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceViaEndpointRequest, Builder> {
        private String endpoint; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceViaEndpointRequest request) {
            super(request);
            this.endpoint = request.endpoint;
            this.regionId = request.regionId;
        } 

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
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
        public DescribeDBInstanceViaEndpointRequest build() {
            return new DescribeDBInstanceViaEndpointRequest(this);
        } 

    } 

}
