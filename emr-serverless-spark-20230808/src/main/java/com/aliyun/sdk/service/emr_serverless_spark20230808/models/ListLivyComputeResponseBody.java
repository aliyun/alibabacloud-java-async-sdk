// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListLivyComputeResponseBody} extends {@link TeaModel}
 *
 * <p>ListLivyComputeResponseBody</p>
 */
public class ListLivyComputeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListLivyComputeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLivyComputeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLivyComputeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. A value of 1000000 indicates that the request is successful. For other values, see the message parameter for error details.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLivyComputeResponseBody build() {
            return new ListLivyComputeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLivyComputeResponseBody} extends {@link TeaModel}
     *
     * <p>ListLivyComputeResponseBody</p>
     */
    public static class LivyComputes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeId")
        private String computeId;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("endpointInner")
        private String endpointInner;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private LivyComputes(Builder builder) {
            this.computeId = builder.computeId;
            this.createdBy = builder.createdBy;
            this.endpoint = builder.endpoint;
            this.endpointInner = builder.endpointInner;
            this.gmtCreate = builder.gmtCreate;
            this.name = builder.name;
            this.queueName = builder.queueName;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivyComputes create() {
            return builder().build();
        }

        /**
         * @return computeId
         */
        public String getComputeId() {
            return this.computeId;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return endpointInner
         */
        public String getEndpointInner() {
            return this.endpointInner;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String computeId; 
            private String createdBy; 
            private String endpoint; 
            private String endpointInner; 
            private Long gmtCreate; 
            private String name; 
            private String queueName; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(LivyComputes model) {
                this.computeId = model.computeId;
                this.createdBy = model.createdBy;
                this.endpoint = model.endpoint;
                this.endpointInner = model.endpointInner;
                this.gmtCreate = model.gmtCreate;
                this.name = model.name;
                this.queueName = model.queueName;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the Livy Gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>lc-xxxxxxxxxxxx</p>
             */
            public Builder computeId(String computeId) {
                this.computeId = computeId;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-livy-gateway-cn-hangzhou.data.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-livy-gateway-cn-hangzhou-internal.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
             */
            public Builder endpointInner(String endpointInner) {
                this.endpointInner = endpointInner;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456094000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>root_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The time when the resource was started.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456094000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The running status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LivyComputes build() {
                return new LivyComputes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLivyComputeResponseBody} extends {@link TeaModel}
     *
     * <p>ListLivyComputeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("livyComputes")
        private java.util.List<LivyComputes> livyComputes;

        private Data(Builder builder) {
            this.livyComputes = builder.livyComputes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return livyComputes
         */
        public java.util.List<LivyComputes> getLivyComputes() {
            return this.livyComputes;
        }

        public static final class Builder {
            private java.util.List<LivyComputes> livyComputes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.livyComputes = model.livyComputes;
            } 

            /**
             * <p>A list of Livy Gateways.</p>
             */
            public Builder livyComputes(java.util.List<LivyComputes> livyComputes) {
                this.livyComputes = livyComputes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
