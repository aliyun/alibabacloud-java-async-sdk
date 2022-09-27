// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticMetricSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticMetricSetsResponseBody</p>
 */
public class DescribeDiagnosticMetricSetsResponseBody extends TeaModel {
    @NameInMap("MetricSets")
    private java.util.List < MetricSets> metricSets;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * MetricSets.
         */
        public Builder metricSets(java.util.List < MetricSets> metricSets) {
            this.metricSets = metricSets;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("Description")
        private String description;

        @NameInMap("MetricIds")
        private java.util.List < String > metricIds;

        @NameInMap("MetricSetId")
        private String metricSetId;

        @NameInMap("MetricSetName")
        private String metricSetName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Type")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * MetricIds.
             */
            public Builder metricIds(java.util.List < String > metricIds) {
                this.metricIds = metricIds;
                return this;
            }

            /**
             * MetricSetId.
             */
            public Builder metricSetId(String metricSetId) {
                this.metricSetId = metricSetId;
                return this;
            }

            /**
             * MetricSetName.
             */
            public Builder metricSetName(String metricSetName) {
                this.metricSetName = metricSetName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Type.
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
