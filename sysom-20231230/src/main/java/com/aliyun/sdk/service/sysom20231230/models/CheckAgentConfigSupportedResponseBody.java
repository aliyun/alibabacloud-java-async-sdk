// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CheckAgentConfigSupportedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAgentConfigSupportedResponseBody</p>
 */
public class CheckAgentConfigSupportedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private CheckAgentConfigSupportedResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAgentConfigSupportedResponseBody create() {
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
    public java.util.List<Data> getData() {
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

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(CheckAgentConfigSupportedResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li>If the value is <code>Success</code>, the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. If the authorization failed, check the <code>message</code> field for the detailed fault message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success  Fail</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If the value of <code>code</code> is <code>Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the error message of the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>server error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public CheckAgentConfigSupportedResponseBody build() {
            return new CheckAgentConfigSupportedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckAgentConfigSupportedResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAgentConfigSupportedResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        private Data(Builder builder) {
            this.cluster = builder.cluster;
            this.instance = builder.instance;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String cluster; 
            private String instance; 
            private String reason; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cluster = model.cluster;
                this.instance = model.instance;
                this.reason = model.reason;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a36a284e-fc8a-4c8a-abad-03d441e6ebcf</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The ECS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9d00ut2ska3mlyhn6j</p>
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>The reason why the instance is not supported for management. This field is not empty when the success field is false.</p>
             * 
             * <strong>example:</strong>
             * <p>instance not found in ecs</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
