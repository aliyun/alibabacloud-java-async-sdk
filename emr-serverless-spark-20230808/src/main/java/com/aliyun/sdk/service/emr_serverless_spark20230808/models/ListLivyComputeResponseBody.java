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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
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
             * computeId.
             */
            public Builder computeId(String computeId) {
                this.computeId = computeId;
                return this;
            }

            /**
             * createdBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * endpointInner.
             */
            public Builder endpointInner(String endpointInner) {
                this.endpointInner = endpointInner;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * queueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
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
             * livyComputes.
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
