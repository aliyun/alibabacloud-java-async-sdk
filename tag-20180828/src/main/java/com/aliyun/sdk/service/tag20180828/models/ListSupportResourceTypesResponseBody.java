// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSupportResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportResourceTypesResponseBody</p>
 */
public class ListSupportResourceTypesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportResourceTypes")
    private java.util.List < SupportResourceTypes> supportResourceTypes;

    private ListSupportResourceTypesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.supportResourceTypes = builder.supportResourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportResourceTypesResponseBody create() {
        return builder().build();
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
     * @return supportResourceTypes
     */
    public java.util.List < SupportResourceTypes> getSupportResourceTypes() {
        return this.supportResourceTypes;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < SupportResourceTypes> supportResourceTypes; 

        /**
         * Indicates whether the next query is required.
         * <p>
         * 
         * *   If the value of this parameter is empty, all results are returned, and the next query is not required.
         * *   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The supported resource types.
         */
        public Builder supportResourceTypes(java.util.List < SupportResourceTypes> supportResourceTypes) {
            this.supportResourceTypes = supportResourceTypes;
            return this;
        }

        public ListSupportResourceTypesResponseBody build() {
            return new ListSupportResourceTypesResponseBody(this);
        } 

    } 

    public static class SupportItems extends TeaModel {
        @NameInMap("Support")
        private Boolean support;

        @NameInMap("SupportCode")
        private String supportCode;

        @NameInMap("SupportDetails")
        private java.util.List < java.util.Map<String, String>> supportDetails;

        private SupportItems(Builder builder) {
            this.support = builder.support;
            this.supportCode = builder.supportCode;
            this.supportDetails = builder.supportDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportItems create() {
            return builder().build();
        }

        /**
         * @return support
         */
        public Boolean getSupport() {
            return this.support;
        }

        /**
         * @return supportCode
         */
        public String getSupportCode() {
            return this.supportCode;
        }

        /**
         * @return supportDetails
         */
        public java.util.List < java.util.Map<String, String>> getSupportDetails() {
            return this.supportDetails;
        }

        public static final class Builder {
            private Boolean support; 
            private String supportCode; 
            private java.util.List < java.util.Map<String, String>> supportDetails; 

            /**
             * Indicates whether the tag-related capability item is supported. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder support(Boolean support) {
                this.support = support;
                return this;
            }

            /**
             * The code of the tag-related capability item.
             */
            public Builder supportCode(String supportCode) {
                this.supportCode = supportCode;
                return this;
            }

            /**
             * The details of the support for the tag-related capability item.
             */
            public Builder supportDetails(java.util.List < java.util.Map<String, String>> supportDetails) {
                this.supportDetails = supportDetails;
                return this;
            }

            public SupportItems build() {
                return new SupportItems(this);
            } 

        } 

    }
    public static class SupportResourceTypes extends TeaModel {
        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SupportItems")
        private java.util.List < SupportItems> supportItems;

        private SupportResourceTypes(Builder builder) {
            this.productCode = builder.productCode;
            this.resourceType = builder.resourceType;
            this.supportItems = builder.supportItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResourceTypes create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return supportItems
         */
        public java.util.List < SupportItems> getSupportItems() {
            return this.supportItems;
        }

        public static final class Builder {
            private String productCode; 
            private String resourceType; 
            private java.util.List < SupportItems> supportItems; 

            /**
             * The service code.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The supported tag-related capability items.
             * <p>
             * 
             * >  This parameter is returned only if the `ShowItems` parameter is set to `true`.
             */
            public Builder supportItems(java.util.List < SupportItems> supportItems) {
                this.supportItems = supportItems;
                return this;
            }

            public SupportResourceTypes build() {
                return new SupportResourceTypes(this);
            } 

        } 

    }
}
