// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiagnosticMetricSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticMetricSetsResponseBody</p>
 */
public class DescribeDiagnosticMetricSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricSets")
    private java.util.List<MetricSets> metricSets;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricSets
     */
    public java.util.List<MetricSets> getMetricSets() {
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
        private java.util.List<MetricSets> metricSets; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDiagnosticMetricSetsResponseBody model) {
            this.metricSets = model.metricSets;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The diagnostic metric sets.</p>
         */
        public Builder metricSets(java.util.List<MetricSets> metricSets) {
            this.metricSets = metricSets;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticMetricSetsResponseBody build() {
            return new DescribeDiagnosticMetricSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosticMetricSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticMetricSetsResponseBody</p>
     */
    public static class MetricSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MetricIds")
        private java.util.List<String> metricIds;

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
        public java.util.List<String> getMetricIds() {
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
            private java.util.List<String> metricIds; 
            private String metricSetId; 
            private String metricSetName; 
            private String resourceType; 
            private String type; 

            private Builder() {
            } 

            private Builder(MetricSets model) {
                this.description = model.description;
                this.metricIds = model.metricIds;
                this.metricSetId = model.metricSetId;
                this.metricSetName = model.metricSetName;
                this.resourceType = model.resourceType;
                this.type = model.type;
            } 

            /**
             * <p>The description of the diagnostic metric set.</p>
             * 
             * <strong>example:</strong>
             * <p>connection issue diagnostics</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The IDs of the diagnostic metrics.</p>
             */
            public Builder metricIds(java.util.List<String> metricIds) {
                this.metricIds = metricIds;
                return this;
            }

            /**
             * <p>The ID of the diagnostic metric set.</p>
             * 
             * <strong>example:</strong>
             * <p>dms-bp17p0qwtr72zmu*****</p>
             */
            public Builder metricSetId(String metricSetId) {
                this.metricSetId = metricSetId;
                return this;
            }

            /**
             * <p>The name of the diagnostic metric set.</p>
             * 
             * <strong>example:</strong>
             * <p>connection issue diagnostics</p>
             */
            public Builder metricSetName(String metricSetName) {
                this.metricSetName = metricSetName;
                return this;
            }

            /**
             * <p>The resource type supported by the diagnostic metric set.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The type of the diagnostic metric set. Valid values:</p>
             * <ul>
             * <li>User: user-defined diagnostic metric set</li>
             * <li>Common: common diagnostic metric set</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>User</p>
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
