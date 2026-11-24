// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreatePrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivateAccessApplicationRequest</p>
 */
public class CreatePrivateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressGroups")
    private java.util.List<AddressGroup> addressGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<String> addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BrowserAccessStatus")
    private String browserAccessStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigMode")
    private String configMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckConfig")
    private HealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckMode")
    private String healthCheckMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("L7Config")
    private PAL7Config l7Config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("L7ProxyDomainAutomaticPrefix")
    private String l7ProxyDomainAutomaticPrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("L7ProxyDomainCustom")
    private String l7ProxyDomainCustom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortRanges")
    private java.util.List<PortRanges> portRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnauthorizedAccessConfig")
    private PAApplicationUnauthorizedAccessConfig unauthorizedAccessConfig;

    private CreatePrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.addressGroups = builder.addressGroups;
        this.addresses = builder.addresses;
        this.browserAccessStatus = builder.browserAccessStatus;
        this.configMode = builder.configMode;
        this.description = builder.description;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.healthCheckMode = builder.healthCheckMode;
        this.l7Config = builder.l7Config;
        this.l7ProxyDomainAutomaticPrefix = builder.l7ProxyDomainAutomaticPrefix;
        this.l7ProxyDomainCustom = builder.l7ProxyDomainCustom;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.status = builder.status;
        this.tagIds = builder.tagIds;
        this.unauthorizedAccessConfig = builder.unauthorizedAccessConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateAccessApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressGroups
     */
    public java.util.List<AddressGroup> getAddressGroups() {
        return this.addressGroups;
    }

    /**
     * @return addresses
     */
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    /**
     * @return browserAccessStatus
     */
    public String getBrowserAccessStatus() {
        return this.browserAccessStatus;
    }

    /**
     * @return configMode
     */
    public String getConfigMode() {
        return this.configMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return healthCheckConfig
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @return healthCheckMode
     */
    public String getHealthCheckMode() {
        return this.healthCheckMode;
    }

    /**
     * @return l7Config
     */
    public PAL7Config getL7Config() {
        return this.l7Config;
    }

    /**
     * @return l7ProxyDomainAutomaticPrefix
     */
    public String getL7ProxyDomainAutomaticPrefix() {
        return this.l7ProxyDomainAutomaticPrefix;
    }

    /**
     * @return l7ProxyDomainCustom
     */
    public String getL7ProxyDomainCustom() {
        return this.l7ProxyDomainCustom;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return portRanges
     */
    public java.util.List<PortRanges> getPortRanges() {
        return this.portRanges;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagIds
     */
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    /**
     * @return unauthorizedAccessConfig
     */
    public PAApplicationUnauthorizedAccessConfig getUnauthorizedAccessConfig() {
        return this.unauthorizedAccessConfig;
    }

    public static final class Builder extends Request.Builder<CreatePrivateAccessApplicationRequest, Builder> {
        private java.util.List<AddressGroup> addressGroups; 
        private java.util.List<String> addresses; 
        private String browserAccessStatus; 
        private String configMode; 
        private String description; 
        private HealthCheckConfig healthCheckConfig; 
        private String healthCheckMode; 
        private PAL7Config l7Config; 
        private String l7ProxyDomainAutomaticPrefix; 
        private String l7ProxyDomainCustom; 
        private String name; 
        private java.util.List<PortRanges> portRanges; 
        private String protocol; 
        private String status; 
        private java.util.List<String> tagIds; 
        private PAApplicationUnauthorizedAccessConfig unauthorizedAccessConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivateAccessApplicationRequest request) {
            super(request);
            this.addressGroups = request.addressGroups;
            this.addresses = request.addresses;
            this.browserAccessStatus = request.browserAccessStatus;
            this.configMode = request.configMode;
            this.description = request.description;
            this.healthCheckConfig = request.healthCheckConfig;
            this.healthCheckMode = request.healthCheckMode;
            this.l7Config = request.l7Config;
            this.l7ProxyDomainAutomaticPrefix = request.l7ProxyDomainAutomaticPrefix;
            this.l7ProxyDomainCustom = request.l7ProxyDomainCustom;
            this.name = request.name;
            this.portRanges = request.portRanges;
            this.protocol = request.protocol;
            this.status = request.status;
            this.tagIds = request.tagIds;
            this.unauthorizedAccessConfig = request.unauthorizedAccessConfig;
        } 

        /**
         * <p>The application address groups. This parameter is required when ConfigMode is set to Precise, and cannot be specified when ConfigMode is an empty string.</p>
         */
        public Builder addressGroups(java.util.List<AddressGroup> addressGroups) {
            this.putBodyParameter("AddressGroups", addressGroups);
            this.addressGroups = addressGroups;
            return this;
        }

        /**
         * <p>The collection of private access application addresses. You can enter up to 1,000 private access application addresses.</p>
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.putBodyParameter("Addresses", addresses);
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The browser access status of the private access application. After you enable this feature, you can access private access applications in clientless mode. Default value: <strong>Disabled</strong>. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder browserAccessStatus(String browserAccessStatus) {
            this.putBodyParameter("BrowserAccessStatus", browserAccessStatus);
            this.browserAccessStatus = browserAccessStatus;
            return this;
        }

        /**
         * <p>The configuration mode. Valid values:</p>
         * <ul>
         * <li>Empty string: default mode.</li>
         * <li>Precise: precise mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Precise</p>
         */
        public Builder configMode(String configMode) {
            this.putBodyParameter("ConfigMode", configMode);
            this.configMode = configMode;
            return this;
        }

        /**
         * <p>The description of the private access application. The description must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a private access application</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The health check configuration. This parameter is required when HealthCheckMode is set to Continuous, and cannot be specified when HealthCheckMode is set to OnAccess.</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            String healthCheckConfigShrink = shrink(healthCheckConfig, "HealthCheckConfig", "json");
            this.putBodyParameter("HealthCheckConfig", healthCheckConfigShrink);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>The health check mode. Valid values:</p>
         * <ul>
         * <li>OnAccess: checks upon access without proactive probing.</li>
         * <li>Continuous: performs continuous checks and proactive probing based on the configurations in HealthCheckConfig.
         * If this parameter is not specified, the default value is OnAccess. When the application addresses include wildcard domain names or CIDR blocks, or when the number of application addresses exceeds 10, only OnAccess is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OnAccess</p>
         */
        public Builder healthCheckMode(String healthCheckMode) {
            this.putBodyParameter("HealthCheckMode", healthCheckMode);
            this.healthCheckMode = healthCheckMode;
            return this;
        }

        /**
         * <p>The application configuration in browser access mode.</p>
         */
        public Builder l7Config(PAL7Config l7Config) {
            String l7ConfigShrink = shrink(l7Config, "L7Config", "json");
            this.putBodyParameter("L7Config", l7ConfigShrink);
            this.l7Config = l7Config;
            return this;
        }

        /**
         * <p>The prefix of the mapped proxy domain name in browser access mode. The prefix must be 3 to 20 characters in length, and can contain lowercase letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>app-sample</p>
         */
        public Builder l7ProxyDomainAutomaticPrefix(String l7ProxyDomainAutomaticPrefix) {
            this.putBodyParameter("L7ProxyDomainAutomaticPrefix", l7ProxyDomainAutomaticPrefix);
            this.l7ProxyDomainAutomaticPrefix = l7ProxyDomainAutomaticPrefix;
            return this;
        }

        /**
         * <p>The custom proxy domain name in browser access mode. The value must be a valid domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>app1.example.com</p>
         */
        public Builder l7ProxyDomainCustom(String l7ProxyDomainCustom) {
            this.putBodyParameter("L7ProxyDomainCustom", l7ProxyDomainCustom);
            this.l7ProxyDomainCustom = l7ProxyDomainCustom;
            return this;
        }

        /**
         * <p>The name of the private access application. The name must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_application_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The collection of port ranges for the private access application. You can enter up to 65,535 port ranges. Multiple port ranges cannot be duplicate or overlap.</p>
         */
        public Builder portRanges(java.util.List<PortRanges> portRanges) {
            this.putBodyParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * <p>The protocol of the private access application. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: all protocols.</li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The status of the private access application. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The collection of private access tag IDs. You can associate up to six custom private access tags with a single private access application.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * <p>The configuration for unauthorized application access requests.</p>
         */
        public Builder unauthorizedAccessConfig(PAApplicationUnauthorizedAccessConfig unauthorizedAccessConfig) {
            String unauthorizedAccessConfigShrink = shrink(unauthorizedAccessConfig, "UnauthorizedAccessConfig", "json");
            this.putBodyParameter("UnauthorizedAccessConfig", unauthorizedAccessConfigShrink);
            this.unauthorizedAccessConfig = unauthorizedAccessConfig;
            return this;
        }

        @Override
        public CreatePrivateAccessApplicationRequest build() {
            return new CreatePrivateAccessApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrivateAccessApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreatePrivateAccessApplicationRequest</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
        private Integer end;

        private PortRanges(Builder builder) {
            this.begin = builder.begin;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        public static final class Builder {
            private Integer begin; 
            private Integer end; 

            private Builder() {
            } 

            private Builder(PortRanges model) {
                this.begin = model.begin;
                this.end = model.end;
            } 

            /**
             * <p>The start port. The value must be less than or equal to the end port.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The end port. The value must be greater than or equal to the start port.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

        } 

    }
}
