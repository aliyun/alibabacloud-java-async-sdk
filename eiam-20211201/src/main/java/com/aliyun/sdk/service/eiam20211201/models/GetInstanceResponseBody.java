// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Instance")
    private Instance instance;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        /**
         * Instance.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class DefaultEndpoint extends TeaModel {
        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Status")
        private String status;

        private DefaultEndpoint(Builder builder) {
            this.endpoint = builder.endpoint;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultEndpoint create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String endpoint; 
            private String status; 

            /**
             * 用户portal和应用开发集成的端点地址
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * 实例域名状态，Unresolved(未解析)、Resolved(已解析)
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DefaultEndpoint build() {
                return new DefaultEndpoint(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DefaultEndpoint")
        private DefaultEndpoint defaultEndpoint;

        @NameInMap("Description")
        private String description;

        @NameInMap("EgressAddresses")
        private java.util.List < String > egressAddresses;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        private Instance(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultEndpoint = builder.defaultEndpoint;
            this.description = builder.description;
            this.egressAddresses = builder.egressAddresses;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultEndpoint
         */
        public DefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressAddresses
         */
        public java.util.List < String > getEgressAddresses() {
            return this.egressAddresses;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private DefaultEndpoint defaultEndpoint; 
            private String description; 
            private java.util.List < String > egressAddresses; 
            private String instanceId; 
            private String status; 

            /**
             * 实例的创建时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 实例默认域名,用户portal和应用开发集成的端点地址
             */
            public Builder defaultEndpoint(DefaultEndpoint defaultEndpoint) {
                this.defaultEndpoint = defaultEndpoint;
                return this;
            }

            /**
             * 实例描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IDaaS实例出口公网地址段
             */
            public Builder egressAddresses(java.util.List < String > egressAddresses) {
                this.egressAddresses = egressAddresses;
                return this;
            }

            /**
             * 实例id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 实例状态，Pending(初始状态)、Creating(创建中)、Running(运行中)、Disabled(禁用)、CreateFailed(创建失败)
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
