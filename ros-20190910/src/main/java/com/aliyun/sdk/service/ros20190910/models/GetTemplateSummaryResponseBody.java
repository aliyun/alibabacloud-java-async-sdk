// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetTemplateSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateSummaryResponseBody</p>
 */
public class GetTemplateSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<java.util.Map<String, ?>> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceIdentifierSummaries")
    private java.util.List<ResourceIdentifierSummaries> resourceIdentifierSummaries;

    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<String> resourceTypes;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private GetTemplateSummaryResponseBody(Builder builder) {
        this.description = builder.description;
        this.metadata = builder.metadata;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.resourceIdentifierSummaries = builder.resourceIdentifierSummaries;
        this.resourceTypes = builder.resourceTypes;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return parameters
     */
    public java.util.List<java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceIdentifierSummaries
     */
    public java.util.List<ResourceIdentifierSummaries> getResourceIdentifierSummaries() {
        return this.resourceIdentifierSummaries;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String description; 
        private java.util.Map<String, ?> metadata; 
        private java.util.List<java.util.Map<String, ?>> parameters; 
        private String requestId; 
        private java.util.List<ResourceIdentifierSummaries> resourceIdentifierSummaries; 
        private java.util.List<String> resourceTypes; 
        private String version; 

        private Builder() {
        } 

        private Builder(GetTemplateSummaryResponseBody model) {
            this.description = model.description;
            this.metadata = model.metadata;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
            this.resourceIdentifierSummaries = model.resourceIdentifierSummaries;
            this.resourceTypes = model.resourceTypes;
            this.version = model.version;
        } 

        /**
         * <p>The description of the stack template.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The metadata that is defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The declarations of the parameters in the template.</p>
         */
        public Builder parameters(java.util.List<java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource identifier summaries.<br>A summary describes the resource that you want to import and the properties that are used to identify the resource during the import. For example, VpcId is an identifier property of ALIYUN::ECS::VPC.</p>
         */
        public Builder resourceIdentifierSummaries(java.util.List<ResourceIdentifierSummaries> resourceIdentifierSummaries) {
            this.resourceIdentifierSummaries = resourceIdentifierSummaries;
            return this;
        }

        /**
         * <p>All resource types that are used in the template.</p>
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The version of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-09-01</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetTemplateSummaryResponseBody build() {
            return new GetTemplateSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateSummaryResponseBody</p>
     */
    public static class ResourceIdentifierSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicalResourceIds")
        private java.util.List<String> logicalResourceIds;

        @com.aliyun.core.annotation.NameInMap("ResourceIdentifiers")
        private java.util.List<String> resourceIdentifiers;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceIdentifierSummaries(Builder builder) {
            this.logicalResourceIds = builder.logicalResourceIds;
            this.resourceIdentifiers = builder.resourceIdentifiers;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIdentifierSummaries create() {
            return builder().build();
        }

        /**
         * @return logicalResourceIds
         */
        public java.util.List<String> getLogicalResourceIds() {
            return this.logicalResourceIds;
        }

        /**
         * @return resourceIdentifiers
         */
        public java.util.List<String> getResourceIdentifiers() {
            return this.resourceIdentifiers;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<String> logicalResourceIds; 
            private java.util.List<String> resourceIdentifiers; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceIdentifierSummaries model) {
                this.logicalResourceIds = model.logicalResourceIds;
                this.resourceIdentifiers = model.resourceIdentifiers;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The logical IDs of all resources of the type that is specified by ResouceType in the template.</p>
             */
            public Builder logicalResourceIds(java.util.List<String> logicalResourceIds) {
                this.logicalResourceIds = logicalResourceIds;
                return this;
            }

            /**
             * <p>The resource properties. You can use a resource property to identify the resource that you want to manage. For example, VpcId is an identifier property of ALIYUN::ECS::VPC.</p>
             */
            public Builder resourceIdentifiers(java.util.List<String> resourceIdentifiers) {
                this.resourceIdentifiers = resourceIdentifiers;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <blockquote>
             * <p>The resource import feature is supported for the resource type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceIdentifierSummaries build() {
                return new ResourceIdentifierSummaries(this);
            } 

        } 

    }
}
