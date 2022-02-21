// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityPolicyRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityPolicyRelationsResponseBody</p>
 */
public class ListSecurityPolicyRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecrityPolicyRelations")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 安全策略关联关系
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
        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("ListenerPort")
        private Long listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @NameInMap("LoadBalancerId")
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
             * 监听id
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * 监听端口
             */
            public Builder listenerPort(Long listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * 监听协议
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * 实例id
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
        @NameInMap("RelatedListeners")
        private java.util.List < RelatedListeners> relatedListeners;

        @NameInMap("SecurityPolicyId")
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
             * 关联的监听列表
             */
            public Builder relatedListeners(java.util.List < RelatedListeners> relatedListeners) {
                this.relatedListeners = relatedListeners;
                return this;
            }

            /**
             * 安全策略id
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
