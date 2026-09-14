// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ListEvaluatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluatorsResponseBody</p>
 */
public class ListEvaluatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluators> evaluators;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListEvaluatorsResponseBody(Builder builder) {
        this.evaluators = builder.evaluators;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluatorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluators
     */
    public java.util.List<Evaluators> getEvaluators() {
        return this.evaluators;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Evaluators> evaluators; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListEvaluatorsResponseBody model) {
            this.evaluators = model.evaluators;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The list of evaluator summaries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;trace_task_completion&quot;,&quot;type&quot;:&quot;AGENT&quot;,&quot;latestVersion&quot;:&quot;1.0.0&quot;}]</p>
         */
        public Builder evaluators(java.util.List<Evaluators> evaluators) {
            this.evaluators = evaluators;
            return this;
        }

        /**
         * <p>The number of entries per page used in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJsYXN0SWQiOjEzM30=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of evaluators that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListEvaluatorsResponseBody build() {
            return new ListEvaluatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluatorsResponseBody</p>
     */
    public static class Evaluators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.List<String> annotations;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("latestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("metricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private Long updatedAt;

        private Evaluators(Builder builder) {
            this.annotations = builder.annotations;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.latestVersion = builder.latestVersion;
            this.metricName = builder.metricName;
            this.name = builder.name;
            this.properties = builder.properties;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Evaluators create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.List<String> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private java.util.List<String> annotations; 
            private Long createdAt; 
            private String description; 
            private String displayName; 
            private String latestVersion; 
            private String metricName; 
            private String name; 
            private java.util.Map<String, ?> properties; 
            private String type; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(Evaluators model) {
                this.annotations = model.annotations;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.displayName = model.displayName;
                this.latestVersion = model.latestVersion;
                this.metricName = model.metricName;
                this.name = model.name;
                this.properties = model.properties;
                this.type = model.type;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The list of annotations.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;__en&quot;]</p>
             */
            public Builder annotations(java.util.List<String> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The creation time, in seconds-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The evaluator description.</p>
             * 
             * <strong>example:</strong>
             * <p>判断 Agent 是否完成用户任务</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>链路任务完成度</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The latest version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>agent_task_completion</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The evaluator name.</p>
             * 
             * <strong>example:</strong>
             * <p>trace_task_completion</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The evaluator properties.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The evaluator type.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The update time, in seconds-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816600</p>
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Evaluators build() {
                return new Evaluators(this);
            } 

        } 

    }
}
