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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAggregateResourceComplianceByPackResponseBody model) {
            this.requestId = model.requestId;
            this.resourceComplianceResult = model.resourceComplianceResult;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The compliance evaluation results returned.</p>
         */
        public Builder resourceComplianceResult(ResourceComplianceResult resourceComplianceResult) {
            this.resourceComplianceResult = resourceComplianceResult;
            return this;
        }

        public GetAggregateResourceComplianceByPackResponseBody build() {
            return new GetAggregateResourceComplianceByPackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateResourceComplianceByPackResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceComplianceByPackResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResourceComplianceResult model) {
                this.compliancePackId = model.compliancePackId;
                this.nonCompliantCount = model.nonCompliantCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The ID of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-fdc8626622af00f9****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The number of non-compliant resources.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * <p>The total number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
