// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceComplianceByPackResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceComplianceByPackResponseBody</p>
 */
public class GetAggregateResourceComplianceByPackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceComplianceResult")
    private ResourceComplianceResult resourceComplianceResult;

    private GetAggregateResourceComplianceByPackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceComplianceResult = builder.resourceComplianceResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceByPackResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceComplianceResult
     */
    public ResourceComplianceResult getResourceComplianceResult() {
        return this.resourceComplianceResult;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceComplianceResult resourceComplianceResult; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The compliance evaluation results returned.
         */
        public Builder resourceComplianceResult(ResourceComplianceResult resourceComplianceResult) {
            this.resourceComplianceResult = resourceComplianceResult;
            return this;
        }

        public GetAggregateResourceComplianceByPackResponseBody build() {
            return new GetAggregateResourceComplianceByPackResponseBody(this);
        } 

    } 

    public static class ResourceComplianceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ResourceComplianceResult(Builder builder) {
            this.compliancePackId = builder.compliancePackId;
            this.nonCompliantCount = builder.nonCompliantCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceComplianceResult create() {
            return builder().build();
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return nonCompliantCount
         */
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String compliancePackId; 
            private Integer nonCompliantCount; 
            private Integer totalCount; 

            /**
             * The ID of the compliance package.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * The number of non-compliant resources.
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * The total number of resources.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ResourceComplianceResult build() {
                return new ResourceComplianceResult(this);
            } 

        } 

    }
}
