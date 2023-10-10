// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateSummaryResponseBody</p>
 */
public class GetTemplateSummaryResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Metadata")
    private java.util.Map < String, ? > metadata;

    @NameInMap("Parameters")
    private java.util.List < java.util.Map<String, ?>> parameters;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceIdentifierSummaries")
    private java.util.List < ResourceIdentifierSummaries> resourceIdentifierSummaries;

    @NameInMap("ResourceTypes")
    private java.util.List < String > resourceTypes;

    @NameInMap("Version")
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

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metadata
     */
    public java.util.Map < String, ? > getMetadata() {
        return this.metadata;
    }

    /**
     * @return parameters
     */
    public java.util.List < java.util.Map<String, ?>> getParameters() {
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
    public java.util.List < ResourceIdentifierSummaries> getResourceIdentifierSummaries() {
        return this.resourceIdentifierSummaries;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List < String > getResourceTypes() {
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
        private java.util.Map < String, ? > metadata; 
        private java.util.List < java.util.Map<String, ?>> parameters; 
        private String requestId; 
        private java.util.List < ResourceIdentifierSummaries> resourceIdentifierSummaries; 
        private java.util.List < String > resourceTypes; 
        private String version; 

        /**
         * The description of the stack template.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The metadata that is defined in the template.
         */
        public Builder metadata(java.util.Map < String, ? > metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * The declarations of the parameters in the template.
         */
        public Builder parameters(java.util.List < java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource identifier summaries.\
         * <p>
         * A summary describes the resource that you want to import and the properties that are used to identify the resource during the import. For example, VpcId is an identifier property of ALIYUN::ECS::VPC.
         */
        public Builder resourceIdentifierSummaries(java.util.List < ResourceIdentifierSummaries> resourceIdentifierSummaries) {
            this.resourceIdentifierSummaries = resourceIdentifierSummaries;
            return this;
        }

        /**
         * All resource types that are used in the template.
         */
        public Builder resourceTypes(java.util.List < String > resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * The version of the template.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetTemplateSummaryResponseBody build() {
            return new GetTemplateSummaryResponseBody(this);
        } 

    } 

    public static class ResourceIdentifierSummaries extends TeaModel {
        @NameInMap("LogicalResourceIds")
        private java.util.List < String > logicalResourceIds;

        @NameInMap("ResourceIdentifiers")
        private java.util.List < String > resourceIdentifiers;

        @NameInMap("ResourceType")
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
        public java.util.List < String > getLogicalResourceIds() {
            return this.logicalResourceIds;
        }

        /**
         * @return resourceIdentifiers
         */
        public java.util.List < String > getResourceIdentifiers() {
            return this.resourceIdentifiers;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < String > logicalResourceIds; 
            private java.util.List < String > resourceIdentifiers; 
            private String resourceType; 

            /**
             * The logical IDs of all resources of the type that is specified by ResouceType in the template.
             */
            public Builder logicalResourceIds(java.util.List < String > logicalResourceIds) {
                this.logicalResourceIds = logicalResourceIds;
                return this;
            }

            /**
             * The resource properties. You can use a resource property to identify the resource that you want to manage. For example, VpcId is an identifier property of ALIYUN::ECS::VPC.
             */
            public Builder resourceIdentifiers(java.util.List < String > resourceIdentifiers) {
                this.resourceIdentifiers = resourceIdentifiers;
                return this;
            }

            /**
             * The resource type.
             * <p>
             * 
             * > The resource import feature is supported for the resource type.
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
