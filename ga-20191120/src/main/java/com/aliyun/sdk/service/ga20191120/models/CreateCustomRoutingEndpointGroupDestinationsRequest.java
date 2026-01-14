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
 * {@link CreateCustomRoutingEndpointGroupDestinationsRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomRoutingEndpointGroupDestinationsRequest</p>
 */
public class CreateCustomRoutingEndpointGroupDestinationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationConfigurations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DestinationConfigurations> destinationConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateCustomRoutingEndpointGroupDestinationsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationConfigurations = builder.destinationConfigurations;
        this.dryRun = builder.dryRun;
        this.endpointGroupId = builder.endpointGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoutingEndpointGroupDestinationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return destinationConfigurations
     */
    public java.util.List<DestinationConfigurations> getDestinationConfigurations() {
        return this.destinationConfigurations;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateCustomRoutingEndpointGroupDestinationsRequest, Builder> {
        private String clientToken; 
        private java.util.List<DestinationConfigurations> destinationConfigurations; 
        private Boolean dryRun; 
        private String endpointGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomRoutingEndpointGroupDestinationsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationConfigurations = request.destinationConfigurations;
            this.dryRun = request.dryRun;
            this.endpointGroupId = request.endpointGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
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
         * <p>The mapping configuration of the endpoint group.</p>
         * <p>You need to specify the backend service ports and protocols for the endpoint group. The ports are mapped to listener ports.</p>
         * <p>You can specify up to 20 mappings in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder destinationConfigurations(java.util.List<DestinationConfigurations> destinationConfigurations) {
            this.putQueryParameter("DestinationConfigurations", destinationConfigurations);
            this.destinationConfigurations = destinationConfigurations;
            return this;
        }

        /**
         * <p>The endpoint group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The mappings of the endpoint group.</p>
         * <p>You need to specify the backend service ports and protocols for the endpoint group. The ports are mapped to listener ports.</p>
         * <p>You can specify up to 20 mappings in each call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
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
        public CreateCustomRoutingEndpointGroupDestinationsRequest build() {
            return new CreateCustomRoutingEndpointGroupDestinationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomRoutingEndpointGroupDestinationsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointGroupDestinationsRequest</p>
     */
    public static class DestinationConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> protocols;

        @com.aliyun.core.annotation.NameInMap("ToPort")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer toPort;

        private DestinationConfigurations(Builder builder) {
            this.fromPort = builder.fromPort;
            this.protocols = builder.protocols;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationConfigurations create() {
            return builder().build();
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return protocols
         */
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        /**
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private Integer fromPort; 
            private java.util.List<String> protocols; 
            private Integer toPort; 

            private Builder() {
            } 

            private Builder(DestinationConfigurations model) {
                this.fromPort = model.fromPort;
                this.protocols = model.protocols;
                this.toPort = model.toPort;
            } 

            /**
             * <p>The last port of the backend service port range.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be equal to or smaller than the value of <strong>ToPort</strong>.</p>
             * <p>You can specify up to 20 last ports in each call.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The backend service protocol of the endpoint group. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * <li><strong>TCP+UDP: the TCP and UDP protocols.</strong></li>
             * </ul>
             * <p>You can specify up to four backend service protocols for each endpoint group mapping.</p>
             * <p>This parameter is required.</p>
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The response parameters.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public DestinationConfigurations build() {
                return new DestinationConfigurations(this);
            } 

        } 

    }
}
