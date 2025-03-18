// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListHostsForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostsForUserGroupResponseBody</p>
 */
public class ListHostsForUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hosts")
    private java.util.List<Hosts> hosts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hosts
     */
    public java.util.List<Hosts> getHosts() {
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
        private java.util.List<Hosts> hosts; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListHostsForUserGroupResponseBody model) {
            this.hosts = model.hosts;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The hosts returned.</p>
         */
        public Builder hosts(java.util.List<Hosts> hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of hosts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostsForUserGroupResponseBody build() {
            return new ListHostsForUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostsForUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostsForUserGroupResponseBody</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
        private String activeAddressType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HostPrivateAddress")
        private String hostPrivateAddress;

        @com.aliyun.core.annotation.NameInMap("HostPublicAddress")
        private String hostPublicAddress;

        @com.aliyun.core.annotation.NameInMap("OSType")
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

            private Builder() {
            } 

            private Builder(Hosts model) {
                this.activeAddressType = model.activeAddressType;
                this.comment = model.comment;
                this.hostId = model.hostId;
                this.hostName = model.hostName;
                this.hostPrivateAddress = model.hostPrivateAddress;
                this.hostPublicAddress = model.hostPublicAddress;
                this.OSType = model.OSType;
            } 

            /**
             * <p>The address type of the host. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: public endpoint</li>
             * <li><strong>Private</strong>: internal endpoint</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * <p>The description of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The name of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>host1</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The internal endpoint of the host. The value is a domain name or an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder hostPrivateAddress(String hostPrivateAddress) {
                this.hostPrivateAddress = hostPrivateAddress;
                return this;
            }

            /**
             * <p>The public endpoint of the host. The value is a domain name or an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.158.XX.XX</p>
             */
            public Builder hostPublicAddress(String hostPublicAddress) {
                this.hostPublicAddress = hostPublicAddress;
                return this;
            }

            /**
             * <p>The operating system of the host. Valid values:</p>
             * <ul>
             * <li><strong>Linux</strong></li>
             * <li><strong>Windows</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
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
