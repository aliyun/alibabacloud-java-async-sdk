// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRequest</p>
 */
public class CreateGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayEdition")
    private String gatewayEdition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("logConfig")
    private LogConfig logConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkAccessConfig")
    private NetworkAccessConfig networkAccessConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("spec")
    private String spec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zoneConfig")
    private ZoneConfig zoneConfig;

    private CreateGatewayRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.gatewayEdition = builder.gatewayEdition;
        this.gatewayType = builder.gatewayType;
        this.logConfig = builder.logConfig;
        this.name = builder.name;
        this.networkAccessConfig = builder.networkAccessConfig;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
        this.zoneConfig = builder.zoneConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return gatewayEdition
     */
    public String getGatewayEdition() {
        return this.gatewayEdition;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return logConfig
     */
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkAccessConfig
     */
    public NetworkAccessConfig getNetworkAccessConfig() {
        return this.networkAccessConfig;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneConfig
     */
    public ZoneConfig getZoneConfig() {
        return this.zoneConfig;
    }

    public static final class Builder extends Request.Builder<CreateGatewayRequest, Builder> {
        private String chargeType; 
        private String gatewayEdition; 
        private String gatewayType; 
        private LogConfig logConfig; 
        private String name; 
        private NetworkAccessConfig networkAccessConfig; 
        private String resourceGroupId; 
        private String spec; 
        private java.util.List<Tag> tag; 
        private String vpcId; 
        private ZoneConfig zoneConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.gatewayEdition = request.gatewayEdition;
            this.gatewayType = request.gatewayType;
            this.logConfig = request.logConfig;
            this.name = request.name;
            this.networkAccessConfig = request.networkAccessConfig;
            this.resourceGroupId = request.resourceGroupId;
            this.spec = request.spec;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
            this.zoneConfig = request.zoneConfig;
        } 

        /**
         * <p>The logging configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("chargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * gatewayEdition.
         */
        public Builder gatewayEdition(String gatewayEdition) {
            this.putBodyParameter("gatewayEdition", gatewayEdition);
            this.gatewayEdition = gatewayEdition;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * logConfig.
         */
        public Builder logConfig(LogConfig logConfig) {
            this.putBodyParameter("logConfig", logConfig);
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ceshi</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The gateway edition.</p>
         */
        public Builder networkAccessConfig(NetworkAccessConfig networkAccessConfig) {
            this.putBodyParameter("networkAccessConfig", networkAccessConfig);
            this.networkAccessConfig = networkAccessConfig;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>apigw.dev.x2</p>
         */
        public Builder spec(String spec) {
            this.putBodyParameter("spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-zm0x16tomfiat1mk9f6rs</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The status message.</p>
         */
        public Builder zoneConfig(ZoneConfig zoneConfig) {
            this.putBodyParameter("zoneConfig", zoneConfig);
            this.zoneConfig = zoneConfig;
            return this;
        }

        @Override
        public CreateGatewayRequest build() {
            return new CreateGatewayRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayRequest</p>
     */
    public static class Sls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private Sls(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sls create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(Sls model) {
                this.enable = model.enable;
            } 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public Sls build() {
                return new Sls(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayRequest</p>
     */
    public static class LogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sls")
        private Sls sls;

        private LogConfig(Builder builder) {
            this.sls = builder.sls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return sls
         */
        public Sls getSls() {
            return this.sls;
        }

        public static final class Builder {
            private Sls sls; 

            private Builder() {
            } 

            private Builder(LogConfig model) {
                this.sls = model.sls;
            } 

            /**
             * sls.
             */
            public Builder sls(Sls sls) {
                this.sls = sls;
                return this;
            }

            public LogConfig build() {
                return new LogConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayRequest</p>
     */
    public static class NetworkAccessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private NetworkAccessConfig(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAccessConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(NetworkAccessConfig model) {
                this.type = model.type;
            } 

            /**
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NetworkAccessConfig build() {
                return new NetworkAccessConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayRequest</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * vSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayRequest</p>
     */
    public static class ZoneConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("selectOption")
        private String selectOption;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("zones")
        private java.util.List<Zones> zones;

        private ZoneConfig(Builder builder) {
            this.selectOption = builder.selectOption;
            this.vSwitchId = builder.vSwitchId;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneConfig create() {
            return builder().build();
        }

        /**
         * @return selectOption
         */
        public String getSelectOption() {
            return this.selectOption;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zones
         */
        public java.util.List<Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String selectOption; 
            private String vSwitchId; 
            private java.util.List<Zones> zones; 

            private Builder() {
            } 

            private Builder(ZoneConfig model) {
                this.selectOption = model.selectOption;
                this.vSwitchId = model.vSwitchId;
                this.zones = model.zones;
            } 

            /**
             * <p>The response payload.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder selectOption(String selectOption) {
                this.selectOption = selectOption;
                return this;
            }

            /**
             * vSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * zones.
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public ZoneConfig build() {
                return new ZoneConfig(this);
            } 

        } 

    }
}
