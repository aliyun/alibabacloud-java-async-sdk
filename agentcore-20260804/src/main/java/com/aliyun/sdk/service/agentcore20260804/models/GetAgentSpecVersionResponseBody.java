// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetAgentSpecVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentSpecVersionResponseBody</p>
 */
public class GetAgentSpecVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAgentSpecVersionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSpecVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAgentSpecVersionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentSpecVersionResponseBody build() {
            return new GetAgentSpecVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentSpecVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentSpecVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizTags")
        private String bizTags;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resource")
        private java.util.Map<String, DataResourceValue> resource;

        private Data(Builder builder) {
            this.bizTags = builder.bizTags;
            this.content = builder.content;
            this.description = builder.description;
            this.name = builder.name;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizTags
         */
        public String getBizTags() {
            return this.bizTags;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resource
         */
        public java.util.Map<String, DataResourceValue> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String bizTags; 
            private String content; 
            private String description; 
            private String name; 
            private java.util.Map<String, DataResourceValue> resource; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizTags = model.bizTags;
                this.content = model.content;
                this.description = model.description;
                this.name = model.name;
                this.resource = model.resource;
            } 

            /**
             * <p>The business tags.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample property value</p>
             */
            public Builder bizTags(String bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * <p>The content.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>A sample description that explains the purpose of the resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>agentspec-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource file mapping.</p>
             */
            public Builder resource(java.util.Map<String, DataResourceValue> resource) {
                this.resource = resource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
