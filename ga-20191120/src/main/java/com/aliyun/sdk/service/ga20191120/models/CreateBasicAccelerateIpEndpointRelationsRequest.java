// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link CreateBasicAccelerateIpEndpointRelationsRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicAccelerateIpEndpointRelationsRequest</p>
 */
public class CreateBasicAccelerateIpEndpointRelationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateIpEndpointRelations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AccelerateIpEndpointRelations> accelerateIpEndpointRelations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateBasicAccelerateIpEndpointRelationsRequest(Builder builder) {
        super(builder);
        this.accelerateIpEndpointRelations = builder.accelerateIpEndpointRelations;
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicAccelerateIpEndpointRelationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateIpEndpointRelations
     */
    public java.util.List<AccelerateIpEndpointRelations> getAccelerateIpEndpointRelations() {
        return this.accelerateIpEndpointRelations;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicAccelerateIpEndpointRelationsRequest, Builder> {
        private java.util.List<AccelerateIpEndpointRelations> accelerateIpEndpointRelations; 
        private String acceleratorId; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicAccelerateIpEndpointRelationsRequest request) {
            super(request);
            this.accelerateIpEndpointRelations = request.accelerateIpEndpointRelations;
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>A list of accelerated IP addresses and the endpoints with which the accelerated IP addresses are associated.</p>
         * <p>This parameter is required.</p>
         */
        public Builder accelerateIpEndpointRelations(java.util.List<AccelerateIpEndpointRelations> accelerateIpEndpointRelations) {
            this.putQueryParameter("AccelerateIpEndpointRelations", accelerateIpEndpointRelations);
            this.accelerateIpEndpointRelations = accelerateIpEndpointRelations;
            return this;
        }

        /**
         * <p>The ID of the basic GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4qz****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateBasicAccelerateIpEndpointRelationsRequest build() {
            return new CreateBasicAccelerateIpEndpointRelationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBasicAccelerateIpEndpointRelationsRequest} extends {@link TeaModel}
     *
     * <p>CreateBasicAccelerateIpEndpointRelationsRequest</p>
     */
    public static class AccelerateIpEndpointRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
        private String accelerateIpId;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        private AccelerateIpEndpointRelations(Builder builder) {
            this.accelerateIpId = builder.accelerateIpId;
            this.endpointId = builder.endpointId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccelerateIpEndpointRelations create() {
            return builder().build();
        }

        /**
         * @return accelerateIpId
         */
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        public static final class Builder {
            private String accelerateIpId; 
            private String endpointId; 

            private Builder() {
            } 

            private Builder(AccelerateIpEndpointRelations model) {
                this.accelerateIpId = model.accelerateIpId;
                this.endpointId = model.endpointId;
            } 

            /**
             * <p>The IDs of the accelerated IP addresses.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/2253393.html">ListBasicAccelerateIps</a> operation to query the IDs of the accelerated IP addresses.</p>
             * <p>You can specify up to 20 IP address IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>gaip-bp1****</p>
             */
            public Builder accelerateIpId(String accelerateIpId) {
                this.accelerateIpId = accelerateIpId;
                return this;
            }

            /**
             * <p>The IDs of the endpoints.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/2253406.html">ListBasicEndpoints</a> to query the IDs of the endpoints.</p>
             * <p>You can specify up to 20 endpoint IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp14sz7ftcwwjgrdm****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            public AccelerateIpEndpointRelations build() {
                return new AccelerateIpEndpointRelations(this);
            } 

        } 

    }
}
