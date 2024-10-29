// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
    @com.aliyun.core.annotation.NameInMap("Addresses")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BrowserAccessStatus")
    private String browserAccessStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < PortRanges> portRanges;

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
    private java.util.List < String > tagIds;

    private CreatePrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.addresses = builder.addresses;
        this.browserAccessStatus = builder.browserAccessStatus;
        this.description = builder.description;
        this.l7ProxyDomainAutomaticPrefix = builder.l7ProxyDomainAutomaticPrefix;
        this.l7ProxyDomainCustom = builder.l7ProxyDomainCustom;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.status = builder.status;
        this.tagIds = builder.tagIds;
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
     * @return addresses
     */
    public java.util.List < String > getAddresses() {
        return this.addresses;
    }

    /**
     * @return browserAccessStatus
     */
    public String getBrowserAccessStatus() {
        return this.browserAccessStatus;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
    public java.util.List < PortRanges> getPortRanges() {
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
    public java.util.List < String > getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<CreatePrivateAccessApplicationRequest, Builder> {
        private java.util.List < String > addresses; 
        private String browserAccessStatus; 
        private String description; 
        private String l7ProxyDomainAutomaticPrefix; 
        private String l7ProxyDomainCustom; 
        private String name; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private String status; 
        private java.util.List < String > tagIds; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivateAccessApplicationRequest request) {
            super(request);
            this.addresses = request.addresses;
            this.browserAccessStatus = request.browserAccessStatus;
            this.description = request.description;
            this.l7ProxyDomainAutomaticPrefix = request.l7ProxyDomainAutomaticPrefix;
            this.l7ProxyDomainCustom = request.l7ProxyDomainCustom;
            this.name = request.name;
            this.portRanges = request.portRanges;
            this.protocol = request.protocol;
            this.status = request.status;
            this.tagIds = request.tagIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder addresses(java.util.List < String > addresses) {
            this.putBodyParameter("Addresses", addresses);
            this.addresses = addresses;
            return this;
        }

        /**
         * BrowserAccessStatus.
         */
        public Builder browserAccessStatus(String browserAccessStatus) {
            this.putBodyParameter("BrowserAccessStatus", browserAccessStatus);
            this.browserAccessStatus = browserAccessStatus;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * L7ProxyDomainAutomaticPrefix.
         */
        public Builder l7ProxyDomainAutomaticPrefix(String l7ProxyDomainAutomaticPrefix) {
            this.putBodyParameter("L7ProxyDomainAutomaticPrefix", l7ProxyDomainAutomaticPrefix);
            this.l7ProxyDomainAutomaticPrefix = l7ProxyDomainAutomaticPrefix;
            return this;
        }

        /**
         * L7ProxyDomainCustom.
         */
        public Builder l7ProxyDomainCustom(String l7ProxyDomainCustom) {
            this.putBodyParameter("L7ProxyDomainCustom", l7ProxyDomainCustom);
            this.l7ProxyDomainCustom = l7ProxyDomainCustom;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.putBodyParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
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
         * TagIds.
         */
        public Builder tagIds(java.util.List < String > tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
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

            /**
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
