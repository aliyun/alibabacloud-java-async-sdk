// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStackOperationRisksResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackOperationRisksResponseBody</p>
 */
public class ListStackOperationRisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MissingPolicyActions")
    private java.util.List < String > missingPolicyActions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskResources")
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
         * <p>The operations on which the permissions are not granted to the Alibaba Cloud account of the caller.</p>
         */
        public Builder missingPolicyActions(java.util.List < String > missingPolicyActions) {
            this.missingPolicyActions = missingPolicyActions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>72108E7A-E874-4A5E-B22C-A61E94AD12CD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources that are at risk.</p>
         */
        public Builder riskResources(java.util.List < RiskResources> riskResources) {
            this.riskResources = riskResources;
            return this;
        }

        public ListStackOperationRisksResponseBody build() {
            return new ListStackOperationRisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackOperationRisksResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackOperationRisksResponseBody</p>
     */
    public static class RiskResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RiskType")
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
             * <p>The error code that is returned when the risk detection fails.</p>
             * <blockquote>
             * <p> This parameter is not returned if the risk detection is successful.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NoPermission</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The logical ID of the resource. The logical ID is the resource name that is defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>MySG</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The error message that is returned when the risk detection fails.</p>
             * <blockquote>
             * <p> This parameter is not returned if the risk detection is successful.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>You are not authorized to complete this action.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The physical ID of the resource. The physical ID is the actual ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1dpioafqphedg9****</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>The cause of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>There are some ECS instances (i-bp18el96s4wq635e****) depending on the security group.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The ID of the request when the risk detection fails.</p>
             * <blockquote>
             * <p> This parameter is not returned if the risk detection is successful.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>DF4296CF-F45F-4845-A72B-BE617601DB25</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::SecurityGroup</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The type of the risk. Valid values:</p>
             * <ul>
             * <li>Referenced: The resource is referenced by other resources.</li>
             * <li>MaybeReferenced: The resource may be referenced by other resources.</li>
             * <li>AdditionalRiskCheckRequired: An additional risk detection is required for a nested stack.</li>
             * <li>OperationIgnored: The operation does not take effect for the resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Referenced</p>
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
