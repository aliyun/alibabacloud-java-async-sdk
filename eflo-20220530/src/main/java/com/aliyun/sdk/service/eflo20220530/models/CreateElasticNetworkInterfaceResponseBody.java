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
 * {@link CreateElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateElasticNetworkInterfaceResponseBody</p>
 */
public class CreateElasticNetworkInterfaceResponseBody extends TeaModel {
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

    private CreateElasticNetworkInterfaceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticNetworkInterfaceResponseBody create() {
        return builder().build();
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

        /**
         * AccessDeniedDetail.
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
         * <p>The response data.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateElasticNetworkInterfaceResponseBody build() {
            return new CreateElasticNetworkInterfaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateElasticNetworkInterfaceResponseBody</p>
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

            /**
             * <p>Lingjun Elastic Network Interface ID.</p>
             * 
             * <strong>example:</strong>
             * <p>leni-1fejojjo****</p>
             */
            public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
                this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
                return this;
            }

            /**
             * <p>The ID of the Lingjun node.</p>
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
