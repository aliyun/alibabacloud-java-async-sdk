// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Instances> getInstances() {
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
        private java.util.List<Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The information of instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class DefaultEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>example-xxx.aliyunidaas.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The status of the endpoint. Valid values:</p>
             * <ul>
             * <li>resolved</li>
             * <li>unresolved</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>resolved</p>
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
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultEndpoint")
        private DefaultEndpoint defaultEndpoint;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The time when the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1550115455000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The default endpoint of the instance.</p>
             */
            public Builder defaultEndpoint(DefaultEndpoint defaultEndpoint) {
                this.defaultEndpoint = defaultEndpoint;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_eypq6ljgyeuwmlw672sulxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>creating</li>
             * <li>running</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
