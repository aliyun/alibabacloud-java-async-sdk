// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeTransitRouterResourcesListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouterResourcesListResponseBody</p>
 */
public class DescribeTransitRouterResourcesListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachedResources")
    private java.util.List<TransitRouterAttachedResources> transitRouterAttachedResources;

    private DescribeTransitRouterResourcesListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterAttachedResources = builder.transitRouterAttachedResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouterResourcesListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterAttachedResources
     */
    public java.util.List<TransitRouterAttachedResources> getTransitRouterAttachedResources() {
        return this.transitRouterAttachedResources;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TransitRouterAttachedResources> transitRouterAttachedResources; 

        private Builder() {
        } 

        private Builder(DescribeTransitRouterResourcesListResponseBody model) {
            this.requestId = model.requestId;
            this.transitRouterAttachedResources = model.transitRouterAttachedResources;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TransitRouterAttachedResources.
         */
        public Builder transitRouterAttachedResources(java.util.List<TransitRouterAttachedResources> transitRouterAttachedResources) {
            this.transitRouterAttachedResources = transitRouterAttachedResources;
            return this;
        }

        public DescribeTransitRouterResourcesListResponseBody build() {
            return new DescribeTransitRouterResourcesListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransitRouterResourcesListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterResourcesListResponseBody</p>
     */
    public static class TransitRouterAttachedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private TransitRouterAttachedResources(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterAttachedResources create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
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

        public static final class Builder {
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(TransitRouterAttachedResources model) {
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public TransitRouterAttachedResources build() {
                return new TransitRouterAttachedResources(this);
            } 

        } 

    }
}
