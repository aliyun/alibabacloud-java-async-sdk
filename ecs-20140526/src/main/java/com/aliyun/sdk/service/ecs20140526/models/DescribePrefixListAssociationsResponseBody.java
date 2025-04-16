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
 * {@link DescribePrefixListAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListAssociationsResponseBody</p>
 */
public class DescribePrefixListAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PrefixListAssociations")
    private PrefixListAssociations prefixListAssociations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrefixListAssociationsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.prefixListAssociations = builder.prefixListAssociations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrefixListAssociationsResponseBody create() {
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
     * @return prefixListAssociations
     */
    public PrefixListAssociations getPrefixListAssociations() {
        return this.prefixListAssociations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private PrefixListAssociations prefixListAssociations; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePrefixListAssociationsResponseBody model) {
            this.nextToken = model.nextToken;
            this.prefixListAssociations = model.prefixListAssociations;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The query token that is returned in this call. If the return value is empty, no more data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Details about the resources that are associated with the prefix list.</p>
         */
        public Builder prefixListAssociations(PrefixListAssociations prefixListAssociations) {
            this.prefixListAssociations = prefixListAssociations;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrefixListAssociationsResponseBody build() {
            return new DescribePrefixListAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrefixListAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListAssociationsResponseBody</p>
     */
    public static class PrefixListAssociation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private PrefixListAssociation(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixListAssociation create() {
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

            private Builder(PrefixListAssociation model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp11ujym6xsff6l0****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>securitygroup</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public PrefixListAssociation build() {
                return new PrefixListAssociation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePrefixListAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListAssociationsResponseBody</p>
     */
    public static class PrefixListAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrefixListAssociation")
        private java.util.List<PrefixListAssociation> prefixListAssociation;

        private PrefixListAssociations(Builder builder) {
            this.prefixListAssociation = builder.prefixListAssociation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixListAssociations create() {
            return builder().build();
        }

        /**
         * @return prefixListAssociation
         */
        public java.util.List<PrefixListAssociation> getPrefixListAssociation() {
            return this.prefixListAssociation;
        }

        public static final class Builder {
            private java.util.List<PrefixListAssociation> prefixListAssociation; 

            private Builder() {
            } 

            private Builder(PrefixListAssociations model) {
                this.prefixListAssociation = model.prefixListAssociation;
            } 

            /**
             * PrefixListAssociation.
             */
            public Builder prefixListAssociation(java.util.List<PrefixListAssociation> prefixListAssociation) {
                this.prefixListAssociation = prefixListAssociation;
                return this;
            }

            public PrefixListAssociations build() {
                return new PrefixListAssociations(this);
            } 

        } 

    }
}
