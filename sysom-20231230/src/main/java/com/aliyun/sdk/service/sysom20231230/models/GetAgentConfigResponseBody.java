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
 * {@link GetAgentConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentConfigResponseBody</p>
 */
public class GetAgentConfigResponseBody extends TeaModel {
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

    private GetAgentConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentConfigResponseBody create() {
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

        private Builder(GetAgentConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the error message of the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
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
         * <p>The number of returned records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetAgentConfigResponseBody build() {
            return new GetAgentConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentConfigResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private Integer cluster;

        @com.aliyun.core.annotation.NameInMap("node")
        private Integer node;

        private Resource(Builder builder) {
            this.cluster = builder.cluster;
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public Integer getCluster() {
            return this.cluster;
        }

        /**
         * @return node
         */
        public Integer getNode() {
            return this.node;
        }

        public static final class Builder {
            private Integer cluster; 
            private Integer node; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.cluster = model.cluster;
                this.node = model.node;
            } 

            /**
             * <p>The number of clusters to which the configuration is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cluster(Integer cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The number of nodes to which the configuration is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder node(Integer node) {
                this.node = node;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("configName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("configType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.configId = builder.configId;
            this.configName = builder.configName;
            this.configType = builder.configType;
            this.content = builder.content;
            this.createdAt = builder.createdAt;
            this.resource = builder.resource;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String configId; 
            private String configName; 
            private String configType; 
            private String content; 
            private String createdAt; 
            private Resource resource; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configId = model.configId;
                this.configName = model.configName;
                this.configType = model.configType;
                this.content = model.content;
                this.createdAt = model.createdAt;
                this.resource = model.resource;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The ID of the component configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>4d5ecf02-3d01-11f0-8c90-00163e1029af</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The name of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Configuration-x</p>
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * <p>The type of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>The text of the chat content.</p>
             * 
             * <strong>example:</strong>
             * <p>The specific content of the copilot reply</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-10T17:57:10</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The information about the resources to which the configuration is applied.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-10T17:57:10</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
