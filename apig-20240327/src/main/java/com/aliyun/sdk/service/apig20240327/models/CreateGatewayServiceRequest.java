// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayServiceRequest</p>
 */
public class CreateGatewayServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayServiceConfigs")
    private java.util.List < GatewayServiceConfigs> gatewayServiceConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    private CreateGatewayServiceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayServiceConfigs = builder.gatewayServiceConfigs;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayServiceConfigs
     */
    public java.util.List < GatewayServiceConfigs> getGatewayServiceConfigs() {
        return this.gatewayServiceConfigs;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateGatewayServiceRequest, Builder> {
        private String gatewayId; 
        private java.util.List < GatewayServiceConfigs> gatewayServiceConfigs; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayServiceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayServiceConfigs = request.gatewayServiceConfigs;
            this.sourceType = request.sourceType;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * gatewayServiceConfigs.
         */
        public Builder gatewayServiceConfigs(java.util.List < GatewayServiceConfigs> gatewayServiceConfigs) {
            this.putBodyParameter("gatewayServiceConfigs", gatewayServiceConfigs);
            this.gatewayServiceConfigs = gatewayServiceConfigs;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateGatewayServiceRequest build() {
            return new CreateGatewayServiceRequest(this);
        } 

    } 

    public static class GatewayServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addresses")
        private java.util.List < String > addresses;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("qualifier")
        private String qualifier;

        private GatewayServiceConfigs(Builder builder) {
            this.addresses = builder.addresses;
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.port = builder.port;
            this.qualifier = builder.qualifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return addresses
         */
        public java.util.List < String > getAddresses() {
            return this.addresses;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        public static final class Builder {
            private java.util.List < String > addresses; 
            private String groupName; 
            private String name; 
            private String namespace; 
            private Integer port; 
            private String qualifier; 

            /**
             * addresses.
             */
            public Builder addresses(java.util.List < String > addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * qualifier.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            public GatewayServiceConfigs build() {
                return new GatewayServiceConfigs(this);
            } 

        } 

    }
}
