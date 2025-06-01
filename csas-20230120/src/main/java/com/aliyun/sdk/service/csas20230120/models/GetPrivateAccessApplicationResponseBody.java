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
 * {@link GetPrivateAccessApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrivateAccessApplicationResponseBody</p>
 */
public class GetPrivateAccessApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Application")
    private Application application;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPrivateAccessApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrivateAccessApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Application application; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPrivateAccessApplicationResponseBody model) {
            this.application = model.application;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The office application.</p>
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3ACC5EDC-2B7D-5032-8C58-D7615D66C1D4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrivateAccessApplicationResponseBody build() {
            return new GetPrivateAccessApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPrivateAccessApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrivateAccessApplicationResponseBody</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
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
             * <p>The start port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The end port.</p>
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
    /**
     * 
     * {@link GetPrivateAccessApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrivateAccessApplicationResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("BrowserAccessStatus")
        private String browserAccessStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectorIds")
        private java.util.List<String> connectorIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("L7Config")
        private PAL7Config l7Config;

        @com.aliyun.core.annotation.NameInMap("L7ProxyDomainAutomatic")
        private String l7ProxyDomainAutomatic;

        @com.aliyun.core.annotation.NameInMap("L7ProxyDomainCustom")
        private String l7ProxyDomainCustom;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("PortRanges")
        private java.util.List<PortRanges> portRanges;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TagIds")
        private java.util.List<String> tagIds;

        private Application(Builder builder) {
            this.addresses = builder.addresses;
            this.applicationId = builder.applicationId;
            this.browserAccessStatus = builder.browserAccessStatus;
            this.connectorIds = builder.connectorIds;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.l7Config = builder.l7Config;
            this.l7ProxyDomainAutomatic = builder.l7ProxyDomainAutomatic;
            this.l7ProxyDomainCustom = builder.l7ProxyDomainCustom;
            this.name = builder.name;
            this.policyIds = builder.policyIds;
            this.portRanges = builder.portRanges;
            this.protocol = builder.protocol;
            this.status = builder.status;
            this.tagIds = builder.tagIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
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
         * @return browserAccessStatus
         */
        public String getBrowserAccessStatus() {
            return this.browserAccessStatus;
        }

        /**
         * @return connectorIds
         */
        public java.util.List<String> getConnectorIds() {
            return this.connectorIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return l7ProxyDomainAutomatic
         */
        public String getL7ProxyDomainAutomatic() {
            return this.l7ProxyDomainAutomatic;
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
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
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

        public static final class Builder {
            private java.util.List<String> addresses; 
            private String applicationId; 
            private String browserAccessStatus; 
            private java.util.List<String> connectorIds; 
            private String createTime; 
            private String description; 
            private PAL7Config l7Config; 
            private String l7ProxyDomainAutomatic; 
            private String l7ProxyDomainCustom; 
            private String name; 
            private java.util.List<String> policyIds; 
            private java.util.List<PortRanges> portRanges; 
            private String protocol; 
            private String status; 
            private java.util.List<String> tagIds; 

            private Builder() {
            } 

            private Builder(Application model) {
                this.addresses = model.addresses;
                this.applicationId = model.applicationId;
                this.browserAccessStatus = model.browserAccessStatus;
                this.connectorIds = model.connectorIds;
                this.createTime = model.createTime;
                this.description = model.description;
                this.l7Config = model.l7Config;
                this.l7ProxyDomainAutomatic = model.l7ProxyDomainAutomatic;
                this.l7ProxyDomainCustom = model.l7ProxyDomainCustom;
                this.name = model.name;
                this.policyIds = model.policyIds;
                this.portRanges = model.portRanges;
                this.protocol = model.protocol;
                this.status = model.status;
                this.tagIds = model.tagIds;
            } 

            /**
             * <p>The addresses of the office applications.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The ID of the office application.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-e12860ef6c48****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The browser access mode. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong></li>
             * <li><strong>Disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder browserAccessStatus(String browserAccessStatus) {
                this.browserAccessStatus = browserAccessStatus;
                return this;
            }

            /**
             * <p>The IDs of connectors.</p>
             */
            public Builder connectorIds(java.util.List<String> connectorIds) {
                this.connectorIds = connectorIds;
                return this;
            }

            /**
             * <p>The creation time of the office application.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-30 16:50:32</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the office application.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The browser access mode parameter. The parameter indicates the configurations of Layer 7 applications.</p>
             */
            public Builder l7Config(PAL7Config l7Config) {
                this.l7Config = l7Config;
                return this;
            }

            /**
             * <p>The browser access mode parameter. The parameter indicates the domain name that the proxy gateway uses.</p>
             * 
             * <strong>example:</strong>
             * <p>app.example.com</p>
             */
            public Builder l7ProxyDomainAutomatic(String l7ProxyDomainAutomatic) {
                this.l7ProxyDomainAutomatic = l7ProxyDomainAutomatic;
                return this;
            }

            /**
             * <p>The browser access mode parameter. The parameter indicates the custom domain name of the proxy gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>app.example.com</p>
             */
            public Builder l7ProxyDomainCustom(String l7ProxyDomainCustom) {
                this.l7ProxyDomainCustom = l7ProxyDomainCustom;
                return this;
            }

            /**
             * <p>The name of the office application.</p>
             * 
             * <strong>example:</strong>
             * <p>private_access_application_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The IDs of the private access policies.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The port ranges of the office applications. Multiple port ranges cannot be duplicated or overlapped.</p>
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
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
                this.status = status;
                return this;
            }

            /**
             * <p>The IDs of the tags for the office applications.</p>
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
