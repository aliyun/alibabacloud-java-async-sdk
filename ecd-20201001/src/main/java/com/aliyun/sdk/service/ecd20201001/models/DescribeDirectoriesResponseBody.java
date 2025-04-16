// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001.models;

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
 * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirectoriesResponseBody</p>
 */
public class DescribeDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Directories")
    private java.util.List<Directories> directories;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDirectoriesResponseBody(Builder builder) {
        this.directories = builder.directories;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirectoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directories
     */
    public java.util.List<Directories> getDirectories() {
        return this.directories;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Directories> directories; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDirectoriesResponseBody model) {
            this.directories = model.directories;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Directories.
         */
        public Builder directories(java.util.List<Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDirectoriesResponseBody build() {
            return new DescribeDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDirectoriesResponseBody</p>
     */
    public static class ADConnectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ADConnectorAddress")
        private String ADConnectorAddress;

        @com.aliyun.core.annotation.NameInMap("ConnectorStatus")
        private String connectorStatus;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private ADConnectors(Builder builder) {
            this.ADConnectorAddress = builder.ADConnectorAddress;
            this.connectorStatus = builder.connectorStatus;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ADConnectors create() {
            return builder().build();
        }

        /**
         * @return ADConnectorAddress
         */
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        /**
         * @return connectorStatus
         */
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String ADConnectorAddress; 
            private String connectorStatus; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(ADConnectors model) {
                this.ADConnectorAddress = model.ADConnectorAddress;
                this.connectorStatus = model.connectorStatus;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * ADConnectorAddress.
             */
            public Builder ADConnectorAddress(String ADConnectorAddress) {
                this.ADConnectorAddress = ADConnectorAddress;
                return this;
            }

            /**
             * ConnectorStatus.
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ADConnectors build() {
                return new ADConnectors(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDirectoriesResponseBody</p>
     */
    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ADConnectors")
        private java.util.List<ADConnectors> ADConnectors;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CustomSecurityGroupId")
        private String customSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("DnsAddress")
        private java.util.List<String> dnsAddress;

        @com.aliyun.core.annotation.NameInMap("DnsUserName")
        private String dnsUserName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainPassword")
        private String domainPassword;

        @com.aliyun.core.annotation.NameInMap("DomainUserName")
        private String domainUserName;

        @com.aliyun.core.annotation.NameInMap("EnableInternetAccess")
        private Boolean enableInternetAccess;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrustPassword")
        private String trustPassword;

        private Directories(Builder builder) {
            this.ADConnectors = builder.ADConnectors;
            this.creationTime = builder.creationTime;
            this.customSecurityGroupId = builder.customSecurityGroupId;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
            this.dnsAddress = builder.dnsAddress;
            this.dnsUserName = builder.dnsUserName;
            this.domainName = builder.domainName;
            this.domainPassword = builder.domainPassword;
            this.domainUserName = builder.domainUserName;
            this.enableInternetAccess = builder.enableInternetAccess;
            this.name = builder.name;
            this.status = builder.status;
            this.trustPassword = builder.trustPassword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
            return builder().build();
        }

        /**
         * @return ADConnectors
         */
        public java.util.List<ADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return customSecurityGroupId
         */
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return dnsAddress
         */
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

        /**
         * @return dnsUserName
         */
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainPassword
         */
        public String getDomainPassword() {
            return this.domainPassword;
        }

        /**
         * @return domainUserName
         */
        public String getDomainUserName() {
            return this.domainUserName;
        }

        /**
         * @return enableInternetAccess
         */
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trustPassword
         */
        public String getTrustPassword() {
            return this.trustPassword;
        }

        public static final class Builder {
            private java.util.List<ADConnectors> ADConnectors; 
            private String creationTime; 
            private String customSecurityGroupId; 
            private String directoryId; 
            private String directoryType; 
            private java.util.List<String> dnsAddress; 
            private String dnsUserName; 
            private String domainName; 
            private String domainPassword; 
            private String domainUserName; 
            private Boolean enableInternetAccess; 
            private String name; 
            private String status; 
            private String trustPassword; 

            private Builder() {
            } 

            private Builder(Directories model) {
                this.ADConnectors = model.ADConnectors;
                this.creationTime = model.creationTime;
                this.customSecurityGroupId = model.customSecurityGroupId;
                this.directoryId = model.directoryId;
                this.directoryType = model.directoryType;
                this.dnsAddress = model.dnsAddress;
                this.dnsUserName = model.dnsUserName;
                this.domainName = model.domainName;
                this.domainPassword = model.domainPassword;
                this.domainUserName = model.domainUserName;
                this.enableInternetAccess = model.enableInternetAccess;
                this.name = model.name;
                this.status = model.status;
                this.trustPassword = model.trustPassword;
            } 

            /**
             * ADConnectors.
             */
            public Builder ADConnectors(java.util.List<ADConnectors> ADConnectors) {
                this.ADConnectors = ADConnectors;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CustomSecurityGroupId.
             */
            public Builder customSecurityGroupId(String customSecurityGroupId) {
                this.customSecurityGroupId = customSecurityGroupId;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * DirectoryType.
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * DnsAddress.
             */
            public Builder dnsAddress(java.util.List<String> dnsAddress) {
                this.dnsAddress = dnsAddress;
                return this;
            }

            /**
             * DnsUserName.
             */
            public Builder dnsUserName(String dnsUserName) {
                this.dnsUserName = dnsUserName;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainPassword.
             */
            public Builder domainPassword(String domainPassword) {
                this.domainPassword = domainPassword;
                return this;
            }

            /**
             * DomainUserName.
             */
            public Builder domainUserName(String domainUserName) {
                this.domainUserName = domainUserName;
                return this;
            }

            /**
             * EnableInternetAccess.
             */
            public Builder enableInternetAccess(Boolean enableInternetAccess) {
                this.enableInternetAccess = enableInternetAccess;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TrustPassword.
             */
            public Builder trustPassword(String trustPassword) {
                this.trustPassword = trustPassword;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
}
