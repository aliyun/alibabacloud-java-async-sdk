// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(java.util.Map < String, ? > metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List < java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceIdentifierSummaries.
         */
        public Builder resourceIdentifierSummaries(java.util.List < ResourceIdentifierSummaries> resourceIdentifierSummaries) {
            this.resourceIdentifierSummaries = resourceIdentifierSummaries;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(java.util.List < String > resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Version.
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
             * LogicalResourceIds.
             */
            public Builder logicalResourceIds(java.util.List < String > logicalResourceIds) {
                this.logicalResourceIds = logicalResourceIds;
                return this;
            }

            /**
             * ResourceIdentifiers.
             */
            public Builder resourceIdentifiers(java.util.List < String > resourceIdentifiers) {
                this.resourceIdentifiers = resourceIdentifiers;
                return this;
            }

            /**
             * ResourceType.
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
