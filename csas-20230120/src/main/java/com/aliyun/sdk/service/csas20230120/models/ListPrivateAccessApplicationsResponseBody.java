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

        /**
         * Applications.
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
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

            /**
             * Begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
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
            this.addresses = builder.addresses;
            this.applicationId = builder.applicationId;
            this.browserAccessStatus = builder.browserAccessStatus;
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
            private String l7ProxyDomainAutomatic; 
            private String l7ProxyDomainCustom; 
            private String name; 
            private java.util.List<String> policyIds; 
            private java.util.List<PortRanges> portRanges; 
            private String protocol; 
            private String status; 
            private java.util.List<String> tagIds; 

            /**
             * Addresses.
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * BrowserAccessStatus.
             */
            public Builder browserAccessStatus(String browserAccessStatus) {
                this.browserAccessStatus = browserAccessStatus;
                return this;
            }

            /**
             * ConnectorIds.
             */
            public Builder connectorIds(java.util.List<String> connectorIds) {
                this.connectorIds = connectorIds;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * L7ProxyDomainAutomatic.
             */
            public Builder l7ProxyDomainAutomatic(String l7ProxyDomainAutomatic) {
                this.l7ProxyDomainAutomatic = l7ProxyDomainAutomatic;
                return this;
            }

            /**
             * L7ProxyDomainCustom.
             */
            public Builder l7ProxyDomainCustom(String l7ProxyDomainCustom) {
                this.l7ProxyDomainCustom = l7ProxyDomainCustom;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * PortRanges.
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TagIds.
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
