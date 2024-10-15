// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentsResponseBody</p>
 */
public class ListComponentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List < Components> components;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListComponentsResponseBody(Builder builder) {
        this.components = builder.components;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return components
     */
    public java.util.List < Components> getComponents() {
        return this.components;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Components> components; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Components.
         */
        public Builder components(java.util.List < Components> components) {
            this.components = components;
            return this;
        }

        /**
         * <p>本次请求所返回的最大记录条数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>本次请求条件下的数据总量。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListComponentsResponseBody build() {
            return new ListComponentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListComponentsResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List < Attribute > attributes;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Replica")
        private Integer replica;

        private Components(Builder builder) {
            this.applicationName = builder.applicationName;
            this.attributes = builder.attributes;
            this.componentName = builder.componentName;
            this.namespace = builder.namespace;
            this.replica = builder.replica;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return attributes
         */
        public java.util.List < Attribute > getAttributes() {
            return this.attributes;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        public static final class Builder {
            private String applicationName; 
            private java.util.List < Attribute > attributes; 
            private String componentName; 
            private String namespace; 
            private Integer replica; 

            /**
             * <p>应用名称。</p>
             * 
             * <strong>example:</strong>
             * <p>HDFS</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>属性列表。</p>
             */
            public Builder attributes(java.util.List < Attribute > attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>组件名称。</p>
             * 
             * <strong>example:</strong>
             * <p>DataNode</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>命名空间。</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>安装该组件的机器总数。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
