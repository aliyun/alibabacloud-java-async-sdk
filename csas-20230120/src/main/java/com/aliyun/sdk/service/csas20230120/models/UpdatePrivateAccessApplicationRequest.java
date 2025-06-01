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
 * {@link UpdatePrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateAccessApplicationRequest</p>
 */
public class UpdatePrivateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<String> addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("L7ProxyDomainPrivate")
    @Deprecated
    private String l7ProxyDomainPrivate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortRanges")
    private java.util.List<PortRanges> portRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    private UpdatePrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.addresses = builder.addresses;
        this.applicationId = builder.applicationId;
        this.description = builder.description;
        this.l7Config = builder.l7Config;
        this.l7ProxyDomainAutomaticPrefix = builder.l7ProxyDomainAutomaticPrefix;
        this.l7ProxyDomainCustom = builder.l7ProxyDomainCustom;
        this.l7ProxyDomainPrivate = builder.l7ProxyDomainPrivate;
        this.modifyType = builder.modifyType;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.status = builder.status;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateAccessApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return l7ProxyDomainPrivate
     */
    public String getL7ProxyDomainPrivate() {
        return this.l7ProxyDomainPrivate;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
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

    public static final class Builder extends Request.Builder<UpdatePrivateAccessApplicationRequest, Builder> {
        private java.util.List<String> addresses; 
        private String applicationId; 
        private String description; 
        private PAL7Config l7Config; 
        private String l7ProxyDomainAutomaticPrefix; 
        private String l7ProxyDomainCustom; 
        private String l7ProxyDomainPrivate; 
        private String modifyType; 
        private java.util.List<PortRanges> portRanges; 
        private String protocol; 
        private String status; 
        private java.util.List<String> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivateAccessApplicationRequest request) {
            super(request);
            this.addresses = request.addresses;
            this.applicationId = request.applicationId;
            this.description = request.description;
            this.l7Config = request.l7Config;
            this.l7ProxyDomainAutomaticPrefix = request.l7ProxyDomainAutomaticPrefix;
            this.l7ProxyDomainCustom = request.l7ProxyDomainCustom;
            this.l7ProxyDomainPrivate = request.l7ProxyDomainPrivate;
            this.modifyType = request.modifyType;
            this.portRanges = request.portRanges;
            this.protocol = request.protocol;
            this.status = request.status;
            this.tagIds = request.tagIds;
        } 

        /**
         * <p>The addresses of the office applications. You can enter up to 1,000 addresses of office applications.</p>
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.putBodyParameter("Addresses", addresses);
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The ID of the office application. You can obtain the value by calling the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: queries office applications.</li>
         * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an office application.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The description of the office application. The value must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The browser access mode parameter. The parameter specifies the configurations of Layer 7 applications.</p>
         */
        public Builder l7Config(PAL7Config l7Config) {
            String l7ConfigShrink = shrink(l7Config, "L7Config", "json");
            this.putBodyParameter("L7Config", l7ConfigShrink);
            this.l7Config = l7Config;
            return this;
        }

        /**
         * <p>The browser access mode parameter. The parameter specifies the prefix of the domain name that the proxy gateway uses. The prefix must be 3 to 20 characters in length, and can contain lowercase letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>app1-xxx</p>
         */
        public Builder l7ProxyDomainAutomaticPrefix(String l7ProxyDomainAutomaticPrefix) {
            this.putBodyParameter("L7ProxyDomainAutomaticPrefix", l7ProxyDomainAutomaticPrefix);
            this.l7ProxyDomainAutomaticPrefix = l7ProxyDomainAutomaticPrefix;
            return this;
        }

        /**
         * <p>The browser access mode parameter. The parameter specifies the custom domain name of the proxy gateway.</p>
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
         * <p>浏览器访问模式参数：私有代理域名。</p>
         * 
         * <strong>example:</strong>
         * <p>app1.example.com</p>
         */
        public Builder l7ProxyDomainPrivate(String l7ProxyDomainPrivate) {
            this.putBodyParameter("L7ProxyDomainPrivate", l7ProxyDomainPrivate);
            this.l7ProxyDomainPrivate = l7ProxyDomainPrivate;
            return this;
        }

        /**
         * <p>The modification type of the office application. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: uses the values of the <strong>Addresses</strong>, <strong>PortRanges</strong>, and <strong>TagIds</strong> parameters to overwrite the original addresses, port ranges, and tag IDs. This is the default value.</li>
         * <li><strong>Append</strong>: adds the values of the <strong>Addresses</strong>, <strong>PortRanges</strong>, and <strong>TagIds</strong> parameters respectively to the original addresses, port ranges, and tag IDs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The port ranges of the office applications. You can enter up to 65,535 port ranges. Multiple port ranges cannot be duplicated or overlapped.</p>
         */
        public Builder portRanges(java.util.List<PortRanges> portRanges) {
            this.putBodyParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * <p>The protocol that is used by the office application. Valid values:</p>
         * <ul>
         * <li><strong>All</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
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
         * <p>The status of the office application. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
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
         * <p>The IDs of the tags for the office applications. You can add up to six custom tags to an office application.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public UpdatePrivateAccessApplicationRequest build() {
            return new UpdatePrivateAccessApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrivateAccessApplicationRequest} extends {@link TeaModel}
     *
     * <p>UpdatePrivateAccessApplicationRequest</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
        @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
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
             * <p>The start port. The start port must be less than or equal to the end port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The end port. The end port must be greater than or equal to the start port.</p>
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
