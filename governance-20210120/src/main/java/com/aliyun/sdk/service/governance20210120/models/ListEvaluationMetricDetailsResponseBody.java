// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link ListEvaluationMetricDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluationMetricDetailsResponseBody</p>
 */
public class ListEvaluationMetricDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    private ListEvaluationMetricDetailsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationMetricDetailsResponseBody create() {
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

        private Builder(ListEvaluationMetricDetailsResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGEaXR18y1rqykZHIqRuBejOqED4S3Xne33c7zbn****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AC9BD94C-D20C-4D27-88D4-89E8D75C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the non-compliant resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListEvaluationMetricDetailsResponseBody build() {
            return new ListEvaluationMetricDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluationMetricDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetricDetailsResponseBody</p>
     */
    public static class ResourceProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyName")
        private String propertyName;

        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        private ResourceProperties(Builder builder) {
            this.propertyName = builder.propertyName;
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceProperties create() {
            return builder().build();
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private String propertyName; 
            private String propertyValue; 

            private Builder() {
            } 

            private Builder(ResourceProperties model) {
                this.propertyName = model.propertyName;
                this.propertyValue = model.propertyValue;
            } 

            /**
             * <p>The name of the resource attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>DisplayName</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * <p>The value of the resource attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public ResourceProperties build() {
                return new ResourceProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEvaluationMetricDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetricDetailsResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceClassification")
        private String resourceClassification;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceProperties")
        private java.util.List<ResourceProperties> resourceProperties;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resources(Builder builder) {
            this.complianceType = builder.complianceType;
            this.regionId = builder.regionId;
            this.resourceClassification = builder.resourceClassification;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceProperties = builder.resourceProperties;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceClassification
         */
        public String getResourceClassification() {
            return this.resourceClassification;
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
         * @return resourceOwnerId
         */
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return resourceProperties
         */
        public java.util.List<ResourceProperties> getResourceProperties() {
            return this.resourceProperties;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String complianceType; 
            private String regionId; 
            private String resourceClassification; 
            private String resourceId; 
            private String resourceName; 
            private Long resourceOwnerId; 
            private java.util.List<ResourceProperties> resourceProperties; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.complianceType = model.complianceType;
                this.regionId = model.regionId;
                this.resourceClassification = model.resourceClassification;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceProperties = model.resourceProperties;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The compliance status of the resource. Valid values:</p>
             * <ul>
             * <li>NonCompliant: non-compliant.</li>
             * <li>Excluded: ignored.</li>
             * <li>PendingExclusion: to be ignored.</li>
             * <li>PendingInclusion: to be unignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NonCompliant</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The check results further analyzed by auxiliary decision-making.</p>
             * <blockquote>
             * <p> This parameter is returned only when the check item supports the auxiliary decision-making feature.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RecentUnloginRamUser</p>
             */
            public Builder resourceClassification(String resourceClassification) {
                this.resourceClassification = resourceClassification;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>26435103783237****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>176618589410****</p>
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>The attributes of the resource.</p>
             */
            public Builder resourceProperties(java.util.List<ResourceProperties> resourceProperties) {
                this.resourceProperties = resourceProperties;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::RAM::User</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
