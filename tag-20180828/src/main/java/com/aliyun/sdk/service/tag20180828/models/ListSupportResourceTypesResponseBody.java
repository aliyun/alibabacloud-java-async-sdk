// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListSupportResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportResourceTypesResponseBody</p>
 */
public class ListSupportResourceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportResourceTypes")
    private java.util.List<SupportResourceTypes> supportResourceTypes;

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
    public java.util.List<SupportResourceTypes> getSupportResourceTypes() {
        return this.supportResourceTypes;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<SupportResourceTypes> supportResourceTypes; 

        /**
         * <p>Indicates whether the next query is required.</p>
         * <ul>
         * <li>If the value of this parameter is empty, all results are returned, and the next query is not required.</li>
         * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAAAAYws9fJ0Ur4MGm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABC71772-F3A1-59CA-B811-4A5B0E0B72F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The supported resource types.</p>
         */
        public Builder supportResourceTypes(java.util.List<SupportResourceTypes> supportResourceTypes) {
            this.supportResourceTypes = supportResourceTypes;
            return this;
        }

        public ListSupportResourceTypesResponseBody build() {
            return new ListSupportResourceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupportResourceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupportResourceTypesResponseBody</p>
     */
    public static class SupportItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Support")
        private Boolean support;

        @com.aliyun.core.annotation.NameInMap("SupportCode")
        private String supportCode;

        @com.aliyun.core.annotation.NameInMap("SupportDetails")
        private java.util.List<java.util.Map<String, String>> supportDetails;

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
        public java.util.List<java.util.Map<String, String>> getSupportDetails() {
            return this.supportDetails;
        }

        public static final class Builder {
            private Boolean support; 
            private String supportCode; 
            private java.util.List<java.util.Map<String, String>> supportDetails; 

            /**
             * <p>Indicates whether the tag-related capability item is supported. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder support(Boolean support) {
                this.support = support;
                return this;
            }

            /**
             * <p>The code of the tag-related capability item.</p>
             * 
             * <strong>example:</strong>
             * <p>TAG_CONSOLE_SUPPORT</p>
             */
            public Builder supportCode(String supportCode) {
                this.supportCode = supportCode;
                return this;
            }

            /**
             * <p>The details of the support for the tag-related capability item.</p>
             */
            public Builder supportDetails(java.util.List<java.util.Map<String, String>> supportDetails) {
                this.supportDetails = supportDetails;
                return this;
            }

            public SupportItems build() {
                return new SupportItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSupportResourceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupportResourceTypesResponseBody</p>
     */
    public static class SupportResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArnTemplate")
        private String arnTemplate;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SupportItems")
        private java.util.List<SupportItems> supportItems;

        private SupportResourceTypes(Builder builder) {
            this.arnTemplate = builder.arnTemplate;
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
         * @return arnTemplate
         */
        public String getArnTemplate() {
            return this.arnTemplate;
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
        public java.util.List<SupportItems> getSupportItems() {
            return this.supportItems;
        }

        public static final class Builder {
            private String arnTemplate; 
            private String productCode; 
            private String resourceType; 
            private java.util.List<SupportItems> supportItems; 

            /**
             * <p>The resource ARN template.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ecs:<em>:</em>:instance/${ResourceId}</p>
             */
            public Builder arnTemplate(String arnTemplate) {
                this.arnTemplate = arnTemplate;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The supported tag-related capability items.</p>
             * <blockquote>
             * <p> This parameter is returned only if the <code>ShowItems</code> parameter is set to <code>true</code>.</p>
             * </blockquote>
             */
            public Builder supportItems(java.util.List<SupportItems> supportItems) {
                this.supportItems = supportItems;
                return this;
            }

            public SupportResourceTypes build() {
                return new SupportResourceTypes(this);
            } 

        } 

    }
}
