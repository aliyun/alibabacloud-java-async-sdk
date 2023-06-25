// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackOperationRisksResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackOperationRisksResponseBody</p>
 */
public class ListStackOperationRisksResponseBody extends TeaModel {
    @NameInMap("MissingPolicyActions")
    private java.util.List < String > missingPolicyActions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskResources")
    private java.util.List < RiskResources> riskResources;

    private ListStackOperationRisksResponseBody(Builder builder) {
        this.missingPolicyActions = builder.missingPolicyActions;
        this.requestId = builder.requestId;
        this.riskResources = builder.riskResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackOperationRisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return missingPolicyActions
     */
    public java.util.List < String > getMissingPolicyActions() {
        return this.missingPolicyActions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskResources
     */
    public java.util.List < RiskResources> getRiskResources() {
        return this.riskResources;
    }

    public static final class Builder {
        private java.util.List < String > missingPolicyActions; 
        private String requestId; 
        private java.util.List < RiskResources> riskResources; 

        /**
         * The operations on which the permissions are not granted to the Alibaba Cloud account of the caller.
         */
        public Builder missingPolicyActions(java.util.List < String > missingPolicyActions) {
            this.missingPolicyActions = missingPolicyActions;
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
         * The resources that are at risk.
         */
        public Builder riskResources(java.util.List < RiskResources> riskResources) {
            this.riskResources = riskResources;
            return this;
        }

        public ListStackOperationRisksResponseBody build() {
            return new ListStackOperationRisksResponseBody(this);
        } 

    } 

    public static class RiskResources extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("RiskType")
        private String riskType;

        private RiskResources(Builder builder) {
            this.code = builder.code;
            this.logicalResourceId = builder.logicalResourceId;
            this.message = builder.message;
            this.physicalResourceId = builder.physicalResourceId;
            this.reason = builder.reason;
            this.requestId = builder.requestId;
            this.resourceType = builder.resourceType;
            this.riskType = builder.riskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskResources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return physicalResourceId
         */
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        public static final class Builder {
            private String code; 
            private String logicalResourceId; 
            private String message; 
            private String physicalResourceId; 
            private String reason; 
            private String requestId; 
            private String resourceType; 
            private String riskType; 

            /**
             * The error code that is returned when the risk detection fails.
             * <p>
             * 
             * >  This parameter is not returned if the risk detection is successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The logical ID of the resource. The logical ID is the resource name that is defined in the template.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * The error message that is returned when the risk detection fails.
             * <p>
             * 
             * >  This parameter is not returned if the risk detection is successful.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The physical ID of the resource. The physical ID is the actual ID of the resource.
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * The cause of the risk.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The ID of the request when the risk detection fails.
             * <p>
             * 
             * >  This parameter is not returned if the risk detection is successful.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The type of the risk. Valid values:
             * <p>
             * 
             * *   Referenced: The resource is referenced by other resources.
             * *   MaybeReferenced: The resource may be referenced by other resources.
             * *   AdditionalRiskCheckRequired: An additional risk detection is required for a nested stack.
             * *   OperationIgnored: The operation does not take effect for the resource.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            public RiskResources build() {
                return new RiskResources(this);
            } 

        } 

    }
}
