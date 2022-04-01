// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListAssociationsResponseBody</p>
 */
public class DescribePrefixListAssociationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PrefixListAssociations")
    private PrefixListAssociations prefixListAssociations;

    @NameInMap("RequestId")
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

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PrefixListAssociations.
         */
        public Builder prefixListAssociations(PrefixListAssociations prefixListAssociations) {
            this.prefixListAssociations = prefixListAssociations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrefixListAssociationsResponseBody build() {
            return new DescribePrefixListAssociationsResponseBody(this);
        } 

    } 

    public static class PrefixListAssociation extends TeaModel {
        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
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

            public PrefixListAssociation build() {
                return new PrefixListAssociation(this);
            } 

        } 

    }
    public static class PrefixListAssociations extends TeaModel {
        @NameInMap("PrefixListAssociation")
        private java.util.List < PrefixListAssociation> prefixListAssociation;

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
        public java.util.List < PrefixListAssociation> getPrefixListAssociation() {
            return this.prefixListAssociation;
        }

        public static final class Builder {
            private java.util.List < PrefixListAssociation> prefixListAssociation; 

            /**
             * PrefixListAssociation.
             */
            public Builder prefixListAssociation(java.util.List < PrefixListAssociation> prefixListAssociation) {
                this.prefixListAssociation = prefixListAssociation;
                return this;
            }

            public PrefixListAssociations build() {
                return new PrefixListAssociations(this);
            } 

        } 

    }
}
