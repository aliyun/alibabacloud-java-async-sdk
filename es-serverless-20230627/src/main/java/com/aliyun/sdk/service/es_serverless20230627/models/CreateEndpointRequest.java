// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link CreateEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateEndpointRequest</p>
 */
public class CreateEndpointRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endpointZones")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EndpointZones> endpointZones;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateEndpointRequest(Builder builder) {
        super(builder);
        this.endpointZones = builder.endpointZones;
        this.name = builder.name;
        this.vpcId = builder.vpcId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointZones
     */
    public java.util.List<EndpointZones> getEndpointZones() {
        return this.endpointZones;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateEndpointRequest, Builder> {
        private java.util.List<EndpointZones> endpointZones; 
        private String name; 
        private String vpcId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateEndpointRequest request) {
            super(request);
            this.endpointZones = request.endpointZones;
            this.name = request.name;
            this.vpcId = request.vpcId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endpointZones(java.util.List<EndpointZones> endpointZones) {
            this.putBodyParameter("endpointZones", endpointZones);
            this.endpointZones = endpointZones;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf664nyle5khp5***</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateEndpointRequest build() {
            return new CreateEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateEndpointRequest</p>
     */
    public static class EndpointZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private EndpointZones(Builder builder) {
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointZones create() {
            return builder().build();
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswitchId; 
            private String zoneId; 

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public EndpointZones build() {
                return new EndpointZones(this);
            } 

        } 

    }
}
