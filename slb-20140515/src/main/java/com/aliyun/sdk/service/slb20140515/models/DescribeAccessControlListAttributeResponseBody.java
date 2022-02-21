// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessControlListAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessControlListAttributeResponseBody</p>
 */
public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    @NameInMap("AclEntrys")
    private AclEntrys aclEntrys;

    @NameInMap("AclId")
    private String aclId;

    @NameInMap("AclName")
    private String aclName;

    @NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @NameInMap("RelatedListeners")
    private RelatedListeners relatedListeners;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeAccessControlListAttributeResponseBody(Builder builder) {
        this.aclEntrys = builder.aclEntrys;
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.addressIPVersion = builder.addressIPVersion;
        this.relatedListeners = builder.relatedListeners;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessControlListAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclEntrys
     */
    public AclEntrys getAclEntrys() {
        return this.aclEntrys;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return aclName
     */
    public String getAclName() {
        return this.aclName;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return relatedListeners
     */
    public RelatedListeners getRelatedListeners() {
        return this.relatedListeners;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private AclEntrys aclEntrys; 
        private String aclId; 
        private String aclName; 
        private String addressIPVersion; 
        private RelatedListeners relatedListeners; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * AclEntrys.
         */
        public Builder aclEntrys(AclEntrys aclEntrys) {
            this.aclEntrys = aclEntrys;
            return this;
        }

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * AclName.
         */
        public Builder aclName(String aclName) {
            this.aclName = aclName;
            return this;
        }

        /**
         * AddressIPVersion.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * RelatedListeners.
         */
        public Builder relatedListeners(RelatedListeners relatedListeners) {
            this.relatedListeners = relatedListeners;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public DescribeAccessControlListAttributeResponseBody build() {
            return new DescribeAccessControlListAttributeResponseBody(this);
        } 

    } 

    public static class AclEntry extends TeaModel {
        @NameInMap("AclEntryComment")
        private String aclEntryComment;

        @NameInMap("AclEntryIP")
        private String aclEntryIP;

        private AclEntry(Builder builder) {
            this.aclEntryComment = builder.aclEntryComment;
            this.aclEntryIP = builder.aclEntryIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntry create() {
            return builder().build();
        }

        /**
         * @return aclEntryComment
         */
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

        /**
         * @return aclEntryIP
         */
        public String getAclEntryIP() {
            return this.aclEntryIP;
        }

        public static final class Builder {
            private String aclEntryComment; 
            private String aclEntryIP; 

            /**
             * AclEntryComment.
             */
            public Builder aclEntryComment(String aclEntryComment) {
                this.aclEntryComment = aclEntryComment;
                return this;
            }

            /**
             * AclEntryIP.
             */
            public Builder aclEntryIP(String aclEntryIP) {
                this.aclEntryIP = aclEntryIP;
                return this;
            }

            public AclEntry build() {
                return new AclEntry(this);
            } 

        } 

    }
    public static class AclEntrys extends TeaModel {
        @NameInMap("AclEntry")
        private java.util.List < AclEntry> aclEntry;

        private AclEntrys(Builder builder) {
            this.aclEntry = builder.aclEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntrys create() {
            return builder().build();
        }

        /**
         * @return aclEntry
         */
        public java.util.List < AclEntry> getAclEntry() {
            return this.aclEntry;
        }

        public static final class Builder {
            private java.util.List < AclEntry> aclEntry; 

            /**
             * AclEntry.
             */
            public Builder aclEntry(java.util.List < AclEntry> aclEntry) {
                this.aclEntry = aclEntry;
                return this;
            }

            public AclEntrys build() {
                return new AclEntrys(this);
            } 

        } 

    }
    public static class RelatedListener extends TeaModel {
        @NameInMap("AclType")
        private String aclType;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Protocol")
        private String protocol;

        private RelatedListener(Builder builder) {
            this.aclType = builder.aclType;
            this.listenerPort = builder.listenerPort;
            this.loadBalancerId = builder.loadBalancerId;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedListener create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String aclType; 
            private Integer listenerPort; 
            private String loadBalancerId; 
            private String protocol; 

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public RelatedListener build() {
                return new RelatedListener(this);
            } 

        } 

    }
    public static class RelatedListeners extends TeaModel {
        @NameInMap("RelatedListener")
        private java.util.List < RelatedListener> relatedListener;

        private RelatedListeners(Builder builder) {
            this.relatedListener = builder.relatedListener;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedListeners create() {
            return builder().build();
        }

        /**
         * @return relatedListener
         */
        public java.util.List < RelatedListener> getRelatedListener() {
            return this.relatedListener;
        }

        public static final class Builder {
            private java.util.List < RelatedListener> relatedListener; 

            /**
             * RelatedListener.
             */
            public Builder relatedListener(java.util.List < RelatedListener> relatedListener) {
                this.relatedListener = relatedListener;
                return this;
            }

            public RelatedListeners build() {
                return new RelatedListeners(this);
            } 

        } 

    }
}
