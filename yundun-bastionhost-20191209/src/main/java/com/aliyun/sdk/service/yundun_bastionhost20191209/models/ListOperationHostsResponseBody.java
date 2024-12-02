// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOperationHostsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationHostsResponseBody</p>
 */
public class ListOperationHostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hosts")
    private java.util.List < Hosts> hosts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOperationHostsResponseBody(Builder builder) {
        this.hosts = builder.hosts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationHostsResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Hosts> hosts; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The hosts returned.</p>
         */
        public Builder hosts(java.util.List < Hosts> hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F6C075F-FC86-476E-943B-097BD4E12948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of hosts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationHostsResponseBody build() {
            return new ListOperationHostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationHostsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationHostsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceState")
        private String sourceInstanceState;

        private Hosts(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
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
            private String hostId; 
            private String hostName; 
            private String hostPrivateAddress; 
            private String hostPublicAddress; 
            private String OSType; 
            private String source; 
            private String sourceInstanceId; 
            private String sourceInstanceState; 

            /**
             * <p>The address type of the host. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong></li>
             * <li><strong>Private</strong></li>
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
             * <p>The remarks of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The host name.</p>
             * 
             * <strong>example:</strong>
             * <p>host1</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The private IP address of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder hostPrivateAddress(String hostPrivateAddress) {
                this.hostPrivateAddress = hostPrivateAddress;
                return this;
            }

            /**
             * <p>The public IP address of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>10.158.XX.XX</p>
             */
            public Builder hostPublicAddress(String hostPublicAddress) {
                this.hostPublicAddress = hostPublicAddress;
                return this;
            }

            /**
             * <p>The host OS.</p>
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

            /**
             * <p>The host type. Valid values:</p>
             * <ul>
             * <li><strong>Local</strong>: on-premises host.</li>
             * <li><strong>Ecs</strong>: Elastic Compute Service (ECS) instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Local</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ECS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp19ienyt0yax748****</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The host status. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>Release</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
