// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityPolicyRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityPolicyRelationsResponseBody</p>
 */
public class ListSecurityPolicyRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecrityPolicyRelations")
    private java.util.List < SecrityPolicyRelations> secrityPolicyRelations;

    private ListSecurityPolicyRelationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secrityPolicyRelations = builder.secrityPolicyRelations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityPolicyRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secrityPolicyRelations
     */
    public java.util.List < SecrityPolicyRelations> getSecrityPolicyRelations() {
        return this.secrityPolicyRelations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecrityPolicyRelations> secrityPolicyRelations; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The security policies and the listeners that are associated with the security policies.
         */
        public Builder secrityPolicyRelations(java.util.List < SecrityPolicyRelations> secrityPolicyRelations) {
            this.secrityPolicyRelations = secrityPolicyRelations;
            return this;
        }

        public ListSecurityPolicyRelationsResponseBody build() {
            return new ListSecurityPolicyRelationsResponseBody(this);
        } 

    } 

    public static class RelatedListeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Long listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        private RelatedListeners(Builder builder) {
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.loadBalancerId = builder.loadBalancerId;
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
        public Long getListenerPort() {
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

        public static final class Builder {
            private String listenerId; 
            private Long listenerPort; 
            private String listenerProtocol; 
            private String loadBalancerId; 

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
            public Builder listenerPort(Long listenerPort) {
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
             * The Server Load Balancer (SLB) instance ID.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public RelatedListeners build() {
                return new RelatedListeners(this);
            } 

        } 

    }
    public static class SecrityPolicyRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelatedListeners")
        private java.util.List < RelatedListeners> relatedListeners;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        private SecrityPolicyRelations(Builder builder) {
            this.relatedListeners = builder.relatedListeners;
            this.securityPolicyId = builder.securityPolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecrityPolicyRelations create() {
            return builder().build();
        }

        /**
         * @return relatedListeners
         */
        public java.util.List < RelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public static final class Builder {
            private java.util.List < RelatedListeners> relatedListeners; 
            private String securityPolicyId; 

            /**
             * The listeners that are associated with the security policy.
             */
            public Builder relatedListeners(java.util.List < RelatedListeners> relatedListeners) {
                this.relatedListeners = relatedListeners;
                return this;
            }

            /**
             * The security policy ID.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            public SecrityPolicyRelations build() {
                return new SecrityPolicyRelations(this);
            } 

        } 

    }
}
