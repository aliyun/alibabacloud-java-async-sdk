// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListSecurityPolicyRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityPolicyRelationsResponseBody</p>
 */
public class ListSecurityPolicyRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecrityPolicyRelations")
    private java.util.List<SecrityPolicyRelations> secrityPolicyRelations;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SecrityPolicyRelations> getSecrityPolicyRelations() {
        return this.secrityPolicyRelations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SecrityPolicyRelations> secrityPolicyRelations; 

        private Builder() {
        } 

        private Builder(ListSecurityPolicyRelationsResponseBody model) {
            this.requestId = model.requestId;
            this.secrityPolicyRelations = model.secrityPolicyRelations;
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

        /**
         * <p>The security policies and the listeners that are associated with the security policies.</p>
         */
        public Builder secrityPolicyRelations(java.util.List<SecrityPolicyRelations> secrityPolicyRelations) {
            this.secrityPolicyRelations = secrityPolicyRelations;
            return this;
        }

        public ListSecurityPolicyRelationsResponseBody build() {
            return new ListSecurityPolicyRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityPolicyRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityPolicyRelationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RelatedListeners model) {
                this.listenerId = model.listenerId;
                this.listenerPort = model.listenerPort;
                this.listenerProtocol = model.listenerProtocol;
                this.loadBalancerId = model.loadBalancerId;
            } 

            /**
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-0bfuc****</p>
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
            public Builder listenerPort(Long listenerPort) {
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
             * <p>The Server Load Balancer (SLB) instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1o94dp5i6ea****</p>
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
    /**
     * 
     * {@link ListSecurityPolicyRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityPolicyRelationsResponseBody</p>
     */
    public static class SecrityPolicyRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelatedListeners")
        private java.util.List<RelatedListeners> relatedListeners;

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
        public java.util.List<RelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public static final class Builder {
            private java.util.List<RelatedListeners> relatedListeners; 
            private String securityPolicyId; 

            private Builder() {
            } 

            private Builder(SecrityPolicyRelations model) {
                this.relatedListeners = model.relatedListeners;
                this.securityPolicyId = model.securityPolicyId;
            } 

            /**
             * <p>The listeners that are associated with the security policy.</p>
             */
            public Builder relatedListeners(java.util.List<RelatedListeners> relatedListeners) {
                this.relatedListeners = relatedListeners;
                return this;
            }

            /**
             * <p>The security policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>scp-bp1bpn0kn9****</p>
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
