// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetUmodelDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetUmodelDataResponseBody</p>
 */
public class GetUmodelDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errors")
    private java.util.List<Errors> errors;

    @com.aliyun.core.annotation.NameInMap("links")
    private java.util.List<?> links;

    @com.aliyun.core.annotation.NameInMap("nodes")
    private java.util.List<?> nodes;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalLinksCount")
    private Integer totalLinksCount;

    @com.aliyun.core.annotation.NameInMap("totalNodesCount")
    private Integer totalNodesCount;

    private GetUmodelDataResponseBody(Builder builder) {
        this.errors = builder.errors;
        this.links = builder.links;
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
        this.totalLinksCount = builder.totalLinksCount;
        this.totalNodesCount = builder.totalNodesCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUmodelDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errors
     */
    public java.util.List<Errors> getErrors() {
        return this.errors;
    }

    /**
     * @return links
     */
    public java.util.List<?> getLinks() {
        return this.links;
    }

    /**
     * @return nodes
     */
    public java.util.List<?> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalLinksCount
     */
    public Integer getTotalLinksCount() {
        return this.totalLinksCount;
    }

    /**
     * @return totalNodesCount
     */
    public Integer getTotalNodesCount() {
        return this.totalNodesCount;
    }

    public static final class Builder {
        private java.util.List<Errors> errors; 
        private java.util.List<?> links; 
        private java.util.List<?> nodes; 
        private String requestId; 
        private Integer totalLinksCount; 
        private Integer totalNodesCount; 

        private Builder() {
        } 

        private Builder(GetUmodelDataResponseBody model) {
            this.errors = model.errors;
            this.links = model.links;
            this.nodes = model.nodes;
            this.requestId = model.requestId;
            this.totalLinksCount = model.totalLinksCount;
            this.totalNodesCount = model.totalNodesCount;
        } 

        /**
         * errors.
         */
        public Builder errors(java.util.List<Errors> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * links.
         */
        public Builder links(java.util.List<?> links) {
            this.links = links;
            return this;
        }

        /**
         * nodes.
         */
        public Builder nodes(java.util.List<?> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalLinksCount.
         */
        public Builder totalLinksCount(Integer totalLinksCount) {
            this.totalLinksCount = totalLinksCount;
            return this;
        }

        /**
         * totalNodesCount.
         */
        public Builder totalNodesCount(Integer totalNodesCount) {
            this.totalNodesCount = totalNodesCount;
            return this;
        }

        public GetUmodelDataResponseBody build() {
            return new GetUmodelDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUmodelDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetUmodelDataResponseBody</p>
     */
    public static class Errors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Errors(Builder builder) {
            this.message = builder.message;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Errors create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String message; 
            private String type; 

            private Builder() {
            } 

            private Builder(Errors model) {
                this.message = model.message;
                this.type = model.type;
            } 

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Errors build() {
                return new Errors(this);
            } 

        } 

    }
}
