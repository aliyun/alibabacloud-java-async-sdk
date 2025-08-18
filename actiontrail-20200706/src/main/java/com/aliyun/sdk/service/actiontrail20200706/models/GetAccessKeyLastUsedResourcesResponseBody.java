// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetAccessKeyLastUsedResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedResourcesResponseBody</p>
 */
public class GetAccessKeyLastUsedResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Resources> resources;

    private GetAccessKeyLastUsedResourcesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<Resources> resources; 

        private Builder() {
        } 

        private Builder(GetAccessKeyLastUsedResourcesResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of returned resources.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        public GetAccessKeyLastUsedResourcesResponseBody build() {
            return new GetAccessKeyLastUsedResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessKeyLastUsedResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessKeyLastUsedResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("UsedTimestamp")
        private Long usedTimestamp;

        private Resources(Builder builder) {
            this.detail = builder.detail;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.source = builder.source;
            this.usedTimestamp = builder.usedTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return usedTimestamp
         */
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

        public static final class Builder {
            private String detail; 
            private String resourceName; 
            private String resourceType; 
            private String source; 
            private Long usedTimestamp; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.detail = model.detail;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
                this.source = model.source;
                this.usedTimestamp = model.usedTimestamp;
            } 

            /**
             * <p>The event details.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
             *   &quot;eventVersion&quot;: 1,
             *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
             *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
             *   &quot;eventType&quot;: &quot;ApiCall&quot;,
             *   &quot;userIdentity&quot;: {
             *     &quot;accountId&quot;: &quot;104758519118****&quot;,
             *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
             *     &quot;type&quot;: &quot;ram-user&quot;,
             *     &quot;userName&quot;: &quot;alice&quot;
             *   },
             *   &quot;serviceName&quot;: &quot;Ecs&quot;,
             *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
             *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
             *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
             *   &quot;isGlobal&quot;: false,
             *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
             *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
             * }</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1ltva99x1a****</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The event source.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Internal</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>other events</p>
             * <!-- -->
             * </li>
             * <li><p>ManagementEvent</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>management events</p>
             * <!-- -->
             * </li>
             * <li><p>DataEvent</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>data events</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManagementEvent</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The timestamp when the resource was used. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1657247532000</p>
             */
            public Builder usedTimestamp(Long usedTimestamp) {
                this.usedTimestamp = usedTimestamp;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
