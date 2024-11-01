// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The relations between the specified ACL and the listeners.</p>
         */
        public Builder aclRelations(java.util.List < AclRelations> aclRelations) {
            this.aclRelations = aclRelations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAclRelationsResponseBody build() {
            return new ListAclRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAclRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclRelationsResponseBody</p>
     */
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
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1bpn0kn908w4nbw****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The listener protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The ID of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1b6c719dfa08ex****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The association status between the ACL and the listener.</p>
             * <ul>
             * <li><strong>Associating</strong></li>
             * <li><strong>Associated</strong></li>
             * <li><strong>Dissociating</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Associated</p>
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
    /**
     * 
     * {@link ListAclRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclRelationsResponseBody</p>
     */
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
             * <p>ACL ID</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-hp34s2h0xx1ht4nwo****</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The listeners that are associated with the ACL.</p>
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
