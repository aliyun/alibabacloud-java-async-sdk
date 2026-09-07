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
 * {@link ListPrivateAccessApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessApplicationsResponseBody</p>
 */
public class ListPrivateAccessApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListPrivateAccessApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessApplicationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListPrivateAccessApplicationsResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of internal-facing access applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of internal-facing access applications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListPrivateAccessApplicationsResponseBody build() {
            return new ListPrivateAccessApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateAccessApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessApplicationsResponseBody</p>
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
     * {@link ListPrivateAccessApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressGroups")
        private java.util.List<AddressGroup> addressGroups;

        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("AutoGenerated")
        private Integer autoGenerated;

        @com.aliyun.core.annotation.NameInMap("BrowserAccessStatus")
        private String browserAccessStatus;

        @com.aliyun.core.annotation.NameInMap("ConfigMode")
        private String configMode;

        @com.aliyun.core.annotation.NameInMap("ConnectorIds")
        private java.util.List<String> connectorIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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

        private Applications(Builder builder) {
            this.addressGroups = builder.addressGroups;
            this.addresses = builder.addresses;
            this.applicationId = builder.applicationId;
            this.autoGenerated = builder.autoGenerated;
            this.browserAccessStatus = builder.browserAccessStatus;
            this.configMode = builder.configMode;
            this.connectorIds = builder.connectorIds;
            this.createTime = builder.createTime;
            this.description = builder.description;
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

        public static Applications create() {
            return builder().build();
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
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return autoGenerated
         */
        public Integer getAutoGenerated() {
            return this.autoGenerated;
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
            private java.util.List<AddressGroup> addressGroups; 
            private java.util.List<String> addresses; 
            private String applicationId; 
            private Integer autoGenerated; 
            private String browserAccessStatus; 
            private String configMode; 
            private java.util.List<String> connectorIds; 
            private String createTime; 
            private String description; 
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

            private Builder(Applications model) {
                this.addressGroups = model.addressGroups;
                this.addresses = model.addresses;
                this.applicationId = model.applicationId;
                this.autoGenerated = model.autoGenerated;
                this.browserAccessStatus = model.browserAccessStatus;
                this.configMode = model.configMode;
                this.connectorIds = model.connectorIds;
                this.createTime = model.createTime;
                this.description = model.description;
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
             * AddressGroups.
             */
            public Builder addressGroups(java.util.List<AddressGroup> addressGroups) {
                this.addressGroups = addressGroups;
                return this;
            }

            /**
             * <p>The addresses of the internal-facing access application.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The ID of the internal-facing access application.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-e12860ef6c48****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * AutoGenerated.
             */
            public Builder autoGenerated(Integer autoGenerated) {
                this.autoGenerated = autoGenerated;
                return this;
            }

            /**
             * <p>The browser access mode. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Disabled</strong>: disabled.</li>
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
             * ConfigMode.
             */
            public Builder configMode(String configMode) {
                this.configMode = configMode;
                return this;
            }

            /**
             * <p>The connector IDs.</p>
             */
            public Builder connectorIds(java.util.List<String> connectorIds) {
                this.connectorIds = connectorIds;
                return this;
            }

            /**
             * <p>The time when the internal-facing access application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-16 15:03:42</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the internal-facing access application.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条内网访问应用</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The browser access mode parameter: mapped proxy domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>app1-xxx.at.cloudssecsase.com</p>
             */
            public Builder l7ProxyDomainAutomatic(String l7ProxyDomainAutomatic) {
                this.l7ProxyDomainAutomatic = l7ProxyDomainAutomatic;
                return this;
            }

            /**
             * <p>The browser access mode parameter: custom proxy domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>app1.example.com</p>
             */
            public Builder l7ProxyDomainCustom(String l7ProxyDomainCustom) {
                this.l7ProxyDomainCustom = l7ProxyDomainCustom;
                return this;
            }

            /**
             * <p>The name of the internal-facing access application.</p>
             * 
             * <strong>example:</strong>
             * <p>private_access_application_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The IDs of internal-facing access policies.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The port ranges of the internal-facing access application. Multiple port ranges cannot be duplicate or overlapping.</p>
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * <p>The protocol of the internal-facing access application. Valid values:</p>
             * <ul>
             * <li><strong>All</strong>: all protocols.</li>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong>.</li>
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
             * <p>The status of the internal-facing access application. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Disabled</strong>: disabled.</li>
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
             * <p>The IDs of internal-facing access tags.</p>
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
