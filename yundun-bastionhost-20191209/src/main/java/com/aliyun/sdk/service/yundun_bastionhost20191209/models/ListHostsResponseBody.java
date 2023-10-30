// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostsResponseBody</p>
 */
public class ListHostsResponseBody extends TeaModel {
    @NameInMap("Hosts")
    private java.util.List < Hosts> hosts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListHostsResponseBody(Builder builder) {
        this.hosts = builder.hosts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return hosts
     */
    public java.util.List < Hosts> getHosts() {
        return this.hosts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Hosts> hosts; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array that consists of the hosts returned.
         */
        public Builder hosts(java.util.List < Hosts> hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of hosts returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostsResponseBody build() {
            return new ListHostsResponseBody(this);
        } 

    } 

    public static class Hosts extends TeaModel {
        @NameInMap("ActiveAddressType")
        private String activeAddressType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("HostAccountCount")
        private Integer hostAccountCount;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("HostPrivateAddress")
        private String hostPrivateAddress;

        @NameInMap("HostPublicAddress")
        private String hostPublicAddress;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @NameInMap("SourceInstanceState")
        private String sourceInstanceState;

        private Hosts(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.hostAccountCount = builder.hostAccountCount;
            this.hostId = builder.hostId;
            this.hostName = builder.hostName;
            this.hostPrivateAddress = builder.hostPrivateAddress;
            this.hostPublicAddress = builder.hostPublicAddress;
            this.OSType = builder.OSType;
            this.source = builder.source;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceState = builder.sourceInstanceState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hosts create() {
            return builder().build();
        }

        /**
         * @return activeAddressType
         */
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return hostAccountCount
         */
        public Integer getHostAccountCount() {
            return this.hostAccountCount;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return hostPrivateAddress
         */
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        /**
         * @return hostPublicAddress
         */
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceInstanceState
         */
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

        public static final class Builder {
            private String activeAddressType; 
            private String comment; 
            private Integer hostAccountCount; 
            private String hostId; 
            private String hostName; 
            private String hostPrivateAddress; 
            private String hostPublicAddress; 
            private String OSType; 
            private String source; 
            private String sourceInstanceId; 
            private String sourceInstanceState; 

            /**
             * The address type of the host. Valid values:
             * <p>
             * 
             * *   **Public**: a public address
             * *   **Private**: a private address
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * The description of the host.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The number of host accounts.
             */
            public Builder hostAccountCount(Integer hostAccountCount) {
                this.hostAccountCount = hostAccountCount;
                return this;
            }

            /**
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The name of the host.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The private address of the host. The value is a domain name or an IP address.
             */
            public Builder hostPrivateAddress(String hostPrivateAddress) {
                this.hostPrivateAddress = hostPrivateAddress;
                return this;
            }

            /**
             * The public address of the host. The value is a domain name or an IP address.
             */
            public Builder hostPublicAddress(String hostPublicAddress) {
                this.hostPublicAddress = hostPublicAddress;
                return this;
            }

            /**
             * The operating system of the host. Valid values:
             * <p>
             * 
             * *   **Linux**
             * *   **Windows**
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * The source of the host. Valid values:
             * <p>
             * 
             * *   **Local**: a host in a data center
             * *   **Ecs**: an ECS instance
             * *   **Rds**: a host in an ApsaraDB MyBase dedicated cluster
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The ID of the ECS instance or the host in an ApsaraDB MyBase dedicated cluster.
             * <p>
             * 
             * > No value is returned for this parameter if the **Source** parameter is set to **Local**.
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * The status of the host. Valid values:
             * <p>
             * 
             * *   **Normal**: normal
             * *   **Release**: released
             */
            public Builder sourceInstanceState(String sourceInstanceState) {
                this.sourceInstanceState = sourceInstanceState;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
}
