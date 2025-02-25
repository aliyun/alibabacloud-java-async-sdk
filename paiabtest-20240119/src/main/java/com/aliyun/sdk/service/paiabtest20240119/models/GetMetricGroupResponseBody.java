// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetricGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetricGroupResponseBody</p>
 */
public class GetMetricGroupResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetMetricGroupResponseBody(Builder builder) {
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.metricGroupId = builder.metricGroupId;
        this.metrics = builder.metrics;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricGroupResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetMetricGroupResponseBody build() {
            return new GetMetricGroupResponseBody(this);
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

        @com.aliyun.core.annotation.NameInMap("RelatedExperimentNumber")
        private Long relatedExperimentNumber;

        @com.aliyun.core.annotation.NameInMap("SourceTableMetaId")
        private String sourceTableMetaId;

        private Metrics(Builder builder) {
            this.definition = builder.definition;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.metricId = builder.metricId;
            this.name = builder.name;
            this.relatedExperimentNumber = builder.relatedExperimentNumber;
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
         * @return relatedExperimentNumber
         */
        public Long getRelatedExperimentNumber() {
            return this.relatedExperimentNumber;
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
            private Long relatedExperimentNumber; 
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
             * RelatedExperimentNumber.
             */
            public Builder relatedExperimentNumber(Long relatedExperimentNumber) {
                this.relatedExperimentNumber = relatedExperimentNumber;
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
}
