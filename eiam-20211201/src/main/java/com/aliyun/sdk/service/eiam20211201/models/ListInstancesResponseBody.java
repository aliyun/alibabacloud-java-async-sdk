// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
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
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 列表条数目
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
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
    public static class Instances extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DefaultEndpoint")
        private DefaultEndpoint defaultEndpoint;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        private Instances(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultEndpoint = builder.defaultEndpoint;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
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

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
