// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticMetricSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticMetricSetsResponseBody</p>
 */
public class DescribeDiagnosticMetricSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricSets")
    private java.util.List < MetricSets> metricSets;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosticMetricSetsResponseBody(Builder builder) {
        this.metricSets = builder.metricSets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticMetricSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricSets
     */
    public java.util.List < MetricSets> getMetricSets() {
        return this.metricSets;
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

    public static final class Builder {
        private java.util.List < MetricSets> metricSets; 
        private String nextToken; 
        private String requestId; 

        /**
         * A collection of diagnostic metrics.
         */
        public Builder metricSets(java.util.List < MetricSets> metricSets) {
            this.metricSets = metricSets;
            return this;
        }

        /**
         * The query token returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticMetricSetsResponseBody build() {
            return new DescribeDiagnosticMetricSetsResponseBody(this);
        } 

    } 

    public static class MetricSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MetricIds")
        private java.util.List < String > metricIds;

        @com.aliyun.core.annotation.NameInMap("MetricSetId")
        private String metricSetId;

        @com.aliyun.core.annotation.NameInMap("MetricSetName")
        private String metricSetName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MetricSets(Builder builder) {
            this.description = builder.description;
            this.metricIds = builder.metricIds;
            this.metricSetId = builder.metricSetId;
            this.metricSetName = builder.metricSetName;
            this.resourceType = builder.resourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricSets create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return metricIds
         */
        public java.util.List < String > getMetricIds() {
            return this.metricIds;
        }

        /**
         * @return metricSetId
         */
        public String getMetricSetId() {
            return this.metricSetId;
        }

        /**
         * @return metricSetName
         */
        public String getMetricSetName() {
            return this.metricSetName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private java.util.List < String > metricIds; 
            private String metricSetId; 
            private String metricSetName; 
            private String resourceType; 
            private String type; 

            /**
             * The description of the diagnostic metric set.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The IDs of the diagnostic metrics.
             */
            public Builder metricIds(java.util.List < String > metricIds) {
                this.metricIds = metricIds;
                return this;
            }

            /**
             * The ID of the diagnostic metric set.
             */
            public Builder metricSetId(String metricSetId) {
                this.metricSetId = metricSetId;
                return this;
            }

            /**
             * The name of the diagnostic metric set.
             */
            public Builder metricSetName(String metricSetName) {
                this.metricSetName = metricSetName;
                return this;
            }

            /**
             * The resource type supported by the diagnostic metric set.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The type of the diagnostic metric set. Valid values:
             * <p>
             * 
             * *   User: user-defined diagnostic metric set
             * *   Common: common diagnostic metric set
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MetricSets build() {
                return new MetricSets(this);
            } 

        } 

    }
}
