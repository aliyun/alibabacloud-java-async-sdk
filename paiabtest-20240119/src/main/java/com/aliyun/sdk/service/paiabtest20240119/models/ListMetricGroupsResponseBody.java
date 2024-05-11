// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetricGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetricGroupsResponseBody</p>
 */
public class ListMetricGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricGroups")
    private java.util.List < MetricGroups> metricGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListMetricGroupsResponseBody(Builder builder) {
        this.metricGroups = builder.metricGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetricGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricGroups
     */
    public java.util.List < MetricGroups> getMetricGroups() {
        return this.metricGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < MetricGroups> metricGroups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * MetricGroups.
         */
        public Builder metricGroups(java.util.List < MetricGroups> metricGroups) {
            this.metricGroups = metricGroups;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMetricGroupsResponseBody build() {
            return new ListMetricGroupsResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("MetricId")
        private String metricId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelatedExperimentsNumber")
        private Long relatedExperimentsNumber;

        @com.aliyun.core.annotation.NameInMap("SourceTableMetaId")
        private String sourceTableMetaId;

        private Metrics(Builder builder) {
            this.definition = builder.definition;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.metricId = builder.metricId;
            this.name = builder.name;
            this.relatedExperimentsNumber = builder.relatedExperimentsNumber;
            this.sourceTableMetaId = builder.sourceTableMetaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return metricId
         */
        public String getMetricId() {
            return this.metricId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relatedExperimentsNumber
         */
        public Long getRelatedExperimentsNumber() {
            return this.relatedExperimentsNumber;
        }

        /**
         * @return sourceTableMetaId
         */
        public String getSourceTableMetaId() {
            return this.sourceTableMetaId;
        }

        public static final class Builder {
            private String definition; 
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String metricId; 
            private String name; 
            private Long relatedExperimentsNumber; 
            private String sourceTableMetaId; 

            /**
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * MetricId.
             */
            public Builder metricId(String metricId) {
                this.metricId = metricId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RelatedExperimentsNumber.
             */
            public Builder relatedExperimentsNumber(Long relatedExperimentsNumber) {
                this.relatedExperimentsNumber = relatedExperimentsNumber;
                return this;
            }

            /**
             * SourceTableMetaId.
             */
            public Builder sourceTableMetaId(String sourceTableMetaId) {
                this.sourceTableMetaId = sourceTableMetaId;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    public static class MetricGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("MetricGroupId")
        private String metricGroupId;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List < Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private MetricGroups(Builder builder) {
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.metricGroupId = builder.metricGroupId;
            this.metrics = builder.metrics;
            this.name = builder.name;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricGroups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return metricGroupId
         */
        public String getMetricGroupId() {
            return this.metricGroupId;
        }

        /**
         * @return metrics
         */
        public java.util.List < Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String metricGroupId; 
            private java.util.List < Metrics> metrics; 
            private String name; 
            private String workspaceId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * MetricGroupId.
             */
            public Builder metricGroupId(String metricGroupId) {
                this.metricGroupId = metricGroupId;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(java.util.List < Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public MetricGroups build() {
                return new MetricGroups(this);
            } 

        } 

    }
}
