// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostsForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostsForUserGroupResponseBody</p>
 */
public class ListHostsForUserGroupResponseBody extends TeaModel {
    @NameInMap("Hosts")
    private java.util.List < Hosts> hosts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListHostsForUserGroupResponseBody(Builder builder) {
        this.hosts = builder.hosts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostsForUserGroupResponseBody create() {
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
         * The ID of the user group for which you want to query hosts.
         * <p>
         * 
         * >  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.
         */
        public Builder hosts(java.util.List < Hosts> hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * The hosts returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The public endpoint of the host. The value is a domain name or an IP address.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostsForUserGroupResponseBody build() {
            return new ListHostsForUserGroupResponseBody(this);
        } 

    } 

    public static class Hosts extends TeaModel {
        @NameInMap("ActiveAddressType")
        private String activeAddressType;

        @NameInMap("Comment")
        private String comment;

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

        private Hosts(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.hostId = builder.hostId;
            this.hostName = builder.hostName;
            this.hostPrivateAddress = builder.hostPrivateAddress;
            this.hostPublicAddress = builder.hostPublicAddress;
            this.OSType = builder.OSType;
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

        public static final class Builder {
            private String activeAddressType; 
            private String comment; 
            private String hostId; 
            private String hostName; 
            private String hostPrivateAddress; 
            private String hostPublicAddress; 
            private String OSType; 

            /**
             * All Bastionhost API requests must include common request parameters. For more information about common request parameters, see [Common parameters](~~148139~~).
             * <p>
             * 
             * For more information about sample requests, see the "Examples" section of this topic.
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * ListHostsForUserGroup
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * WB662865
             */
            public Builder hostPrivateAddress(String hostPrivateAddress) {
                this.hostPrivateAddress = hostPrivateAddress;
                return this;
            }

            /**
             * Queries the hosts that a specified user group is authorized or not authorized to manage.
             */
            public Builder hostPublicAddress(String hostPublicAddress) {
                this.hostPublicAddress = hostPublicAddress;
                return this;
            }

            /**
             * ListHostsForUserGroup
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
}
