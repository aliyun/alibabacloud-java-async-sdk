// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link DeleteElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteElasticNetworkInterfaceResponseBody</p>
 */
public class DeleteElasticNetworkInterfaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteElasticNetworkInterfaceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteElasticNetworkInterfaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteElasticNetworkInterfaceResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BDBCC783-84CA-5733-8EEA-645C88B9009C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteElasticNetworkInterfaceResponseBody build() {
            return new DeleteElasticNetworkInterfaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteElasticNetworkInterfaceResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
        private String elasticNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private Content(Builder builder) {
            this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return elasticNetworkInterfaceId
         */
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String elasticNetworkInterfaceId; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.elasticNetworkInterfaceId = model.elasticNetworkInterfaceId;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>Lingjun Elastic Network Interface ID</p>
             * 
             * <strong>example:</strong>
             * <p>leni-1234****</p>
             */
            public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
                this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
                return this;
            }

            /**
             * <p>Lingjun Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-lbj3aej****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
