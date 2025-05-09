// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetResourceComplianceGroupByResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceComplianceGroupByResourceTypeResponseBody</p>
 */
public class GetResourceComplianceGroupByResourceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComplianceResult")
    private ComplianceResult complianceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceComplianceGroupByResourceTypeResponseBody(Builder builder) {
        this.complianceResult = builder.complianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceGroupByResourceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return complianceResult
     */
    public ComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ComplianceResult complianceResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceComplianceGroupByResourceTypeResponseBody model) {
            this.complianceResult = model.complianceResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried evaluation results.</p>
         */
        public Builder complianceResult(ComplianceResult complianceResult) {
            this.complianceResult = complianceResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>84610B68-2DD3-5AF0-B68D-E1FA8F051F7D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceComplianceGroupByResourceTypeResponseBody build() {
            return new GetResourceComplianceGroupByResourceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceComplianceGroupByResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceComplianceGroupByResourceTypeResponseBody</p>
     */
    public static class Compliances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        private Compliances(Builder builder) {
            this.complianceType = builder.complianceType;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compliances create() {
            return builder().build();
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String complianceType; 
            private Long count; 

            private Builder() {
            } 

            private Builder(Compliances model) {
                this.complianceType = model.complianceType;
                this.count = model.count;
            } 

            /**
             * <p>The evaluation result. Valid values:</p>
             * <ul>
             * <li>COMPLIANT: The resource is evaluated as compliant.</li>
             * <li>NON_COMPLIANT: The resource is evaluated as non-compliant.</li>
             * <li>NOT_APPLICABLE: The rule does not apply to the resource.</li>
             * <li>INSUFFICIENT_DATA: No data is available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLIANT</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The total number of evaluation results.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public Compliances build() {
                return new Compliances(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceComplianceGroupByResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceComplianceGroupByResourceTypeResponseBody</p>
     */
    public static class ComplianceResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compliances")
        private java.util.List<Compliances> compliances;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ComplianceResultList(Builder builder) {
            this.compliances = builder.compliances;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceResultList create() {
            return builder().build();
        }

        /**
         * @return compliances
         */
        public java.util.List<Compliances> getCompliances() {
            return this.compliances;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<Compliances> compliances; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ComplianceResultList model) {
                this.compliances = model.compliances;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The queried evaluation results.</p>
             */
            public Builder compliances(java.util.List<Compliances> compliances) {
                this.compliances = compliances;
                return this;
            }

            /**
             * <p>The type of the evaluated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ComplianceResultList build() {
                return new ComplianceResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceComplianceGroupByResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceComplianceGroupByResourceTypeResponseBody</p>
     */
    public static class ComplianceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceResultList")
        private java.util.List<ComplianceResultList> complianceResultList;

        private ComplianceResult(Builder builder) {
            this.complianceResultList = builder.complianceResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceResult create() {
            return builder().build();
        }

        /**
         * @return complianceResultList
         */
        public java.util.List<ComplianceResultList> getComplianceResultList() {
            return this.complianceResultList;
        }

        public static final class Builder {
            private java.util.List<ComplianceResultList> complianceResultList; 

            private Builder() {
            } 

            private Builder(ComplianceResult model) {
                this.complianceResultList = model.complianceResultList;
            } 

            /**
             * <p>The evaluation results grouped by resource type.</p>
             */
            public Builder complianceResultList(java.util.List<ComplianceResultList> complianceResultList) {
                this.complianceResultList = complianceResultList;
                return this;
            }

            public ComplianceResult build() {
                return new ComplianceResult(this);
            } 

        } 

    }
}
