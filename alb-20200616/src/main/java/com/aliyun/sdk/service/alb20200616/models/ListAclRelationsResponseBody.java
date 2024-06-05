// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclRelationsResponseBody</p>
 */
public class ListAclRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclRelations")
    private java.util.List < AclRelations> aclRelations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAclRelationsResponseBody(Builder builder) {
        this.aclRelations = builder.aclRelations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclRelations
     */
    public java.util.List < AclRelations> getAclRelations() {
        return this.aclRelations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AclRelations> aclRelations; 
        private String requestId; 

        /**
         * The ACLs and the associated listeners.
         */
        public Builder aclRelations(java.util.List < AclRelations> aclRelations) {
            this.aclRelations = aclRelations;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAclRelationsResponseBody build() {
            return new ListAclRelationsResponseBody(this);
        } 

    } 

    public static class RelatedListeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RelatedListeners(Builder builder) {
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.loadBalancerId = builder.loadBalancerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedListeners create() {
            return builder().build();
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String listenerId; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private String loadBalancerId; 
            private String status; 

            /**
             * The listener ID.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The listener port.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The listener protocol.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * The ID of the Server Load Balancer (SLB) instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The association status between the ACL and the listener. Valid values:
             * <p>
             * 
             * *   **Associating**
             * *   **Associated**
             * *   **Dissociating**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RelatedListeners build() {
                return new RelatedListeners(this);
            } 

        } 

    }
    public static class AclRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("RelatedListeners")
        private java.util.List < RelatedListeners> relatedListeners;

        private AclRelations(Builder builder) {
            this.aclId = builder.aclId;
            this.relatedListeners = builder.relatedListeners;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclRelations create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return relatedListeners
         */
        public java.util.List < RelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
        }

        public static final class Builder {
            private String aclId; 
            private java.util.List < RelatedListeners> relatedListeners; 

            /**
             * ACL ID
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * The listeners that are associated with the ACL.
             */
            public Builder relatedListeners(java.util.List < RelatedListeners> relatedListeners) {
                this.relatedListeners = relatedListeners;
                return this;
            }

            public AclRelations build() {
                return new AclRelations(this);
            } 

        } 

    }
}
