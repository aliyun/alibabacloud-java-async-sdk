// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribePortRangeListAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortRangeListAssociationsResponseBody</p>
 */
public class DescribePortRangeListAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PortRangeListAssociations")
    private java.util.List<PortRangeListAssociations> portRangeListAssociations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePortRangeListAssociationsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.portRangeListAssociations = builder.portRangeListAssociations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortRangeListAssociationsResponseBody create() {
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
     * @return portRangeListAssociations
     */
    public java.util.List<PortRangeListAssociations> getPortRangeListAssociations() {
        return this.portRangeListAssociations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<PortRangeListAssociations> portRangeListAssociations; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePortRangeListAssociationsResponseBody model) {
            this.nextToken = model.nextToken;
            this.portRangeListAssociations = model.portRangeListAssociations;
            this.requestId = model.requestId;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PortRangeListAssociations.
         */
        public Builder portRangeListAssociations(java.util.List<PortRangeListAssociations> portRangeListAssociations) {
            this.portRangeListAssociations = portRangeListAssociations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortRangeListAssociationsResponseBody build() {
            return new DescribePortRangeListAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortRangeListAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortRangeListAssociationsResponseBody</p>
     */
    public static class PortRangeListAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private PortRangeListAssociations(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRangeListAssociations create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(PortRangeListAssociations model) {
                this.resourceId = model.resourceId;
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
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public PortRangeListAssociations build() {
                return new PortRangeListAssociations(this);
            } 

        } 

    }
}
