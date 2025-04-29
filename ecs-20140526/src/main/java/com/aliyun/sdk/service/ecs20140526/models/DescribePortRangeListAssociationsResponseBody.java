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
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If the return value is empty, no more data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resources that are associated with the port list.</p>
         */
        public Builder portRangeListAssociations(java.util.List<PortRangeListAssociations> portRangeListAssociations) {
            this.portRangeListAssociations = portRangeListAssociations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2zefu72****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource. Valid value: SecurityGroup.</p>
             * 
             * <strong>example:</strong>
             * <p>SecurityGroup</p>
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
