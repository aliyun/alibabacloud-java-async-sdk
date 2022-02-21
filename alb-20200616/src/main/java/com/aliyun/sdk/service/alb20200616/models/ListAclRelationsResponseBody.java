// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclRelationsResponseBody</p>
 */
public class ListAclRelationsResponseBody extends TeaModel {
    @NameInMap("AclRelations")
    private java.util.List < AclRelations> aclRelations;

    @NameInMap("RequestId")
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
         * 访问控制列表
         */
        public Builder aclRelations(java.util.List < AclRelations> aclRelations) {
            this.aclRelations = aclRelations;
            return this;
        }

        /**
         * 请求id
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
        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Status")
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
             * 监听ID
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * 监听端口
             */
            public Builder listenerPort(Integer listenerPort) {
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
             * 实例ID
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * 关联状态
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
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("RelatedListeners")
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
             * 访问控制策略id
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * 关联的监听
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
