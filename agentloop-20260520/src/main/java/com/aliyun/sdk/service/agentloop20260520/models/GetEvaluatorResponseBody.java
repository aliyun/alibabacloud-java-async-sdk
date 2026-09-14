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
 * {@link GetEvaluatorResponseBody} extends {@link TeaModel}
 *
 * <p>GetEvaluatorResponseBody</p>
 */
public class GetEvaluatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("evaluator")
    private Evaluator evaluator;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEvaluatorResponseBody(Builder builder) {
        this.evaluator = builder.evaluator;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEvaluatorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluator
     */
    public Evaluator getEvaluator() {
        return this.evaluator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Evaluator evaluator; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEvaluatorResponseBody model) {
            this.evaluator = model.evaluator;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The evaluator details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;trace_task_completion&quot;,&quot;type&quot;:&quot;AGENT&quot;,&quot;currentVersion&quot;:&quot;1.0.0&quot;}</p>
         */
        public Builder evaluator(Evaluator evaluator) {
            this.evaluator = evaluator;
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

        public GetEvaluatorResponseBody build() {
            return new GetEvaluatorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEvaluatorResponseBody} extends {@link TeaModel}
     *
     * <p>GetEvaluatorResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionDescription")
        private String versionDescription;

        private Versions(Builder builder) {
            this.createdAt = builder.createdAt;
            this.version = builder.version;
            this.versionDescription = builder.versionDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        public static final class Builder {
            private Long createdAt; 
            private String version; 
            private String versionDescription; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.createdAt = model.createdAt;
                this.version = model.version;
                this.versionDescription = model.versionDescription;
            } 

            /**
             * <p>The time when the version was created. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version description.</p>
             * 
             * <strong>example:</strong>
             * <p>初始版本</p>
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEvaluatorResponseBody} extends {@link TeaModel}
     *
     * <p>GetEvaluatorResponseBody</p>
     */
    public static class Evaluator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.List<String> annotations;

        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map<String, ?> config;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("currentVersion")
        private String currentVersion;

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

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<Versions> versions;

        private Evaluator(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.annotations = builder.annotations;
            this.config = builder.config;
            this.createdAt = builder.createdAt;
            this.currentVersion = builder.currentVersion;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.latestVersion = builder.latestVersion;
            this.metricName = builder.metricName;
            this.name = builder.name;
            this.properties = builder.properties;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Evaluator create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return annotations
         */
        public java.util.List<String> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return config
         */
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
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

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String agentSpace; 
            private java.util.List<String> annotations; 
            private java.util.Map<String, ?> config; 
            private Long createdAt; 
            private String currentVersion; 
            private String description; 
            private String displayName; 
            private String latestVersion; 
            private String metricName; 
            private String name; 
            private java.util.Map<String, ?> properties; 
            private String type; 
            private Long updatedAt; 
            private java.util.List<Versions> versions; 

            private Builder() {
            } 

            private Builder(Evaluator model) {
                this.agentSpace = model.agentSpace;
                this.annotations = model.annotations;
                this.config = model.config;
                this.createdAt = model.createdAt;
                this.currentVersion = model.currentVersion;
                this.description = model.description;
                this.displayName = model.displayName;
                this.latestVersion = model.latestVersion;
                this.metricName = model.metricName;
                this.name = model.name;
                this.properties = model.properties;
                this.type = model.type;
                this.updatedAt = model.updatedAt;
                this.versions = model.versions;
            } 

            /**
             * <p>The AgentSpace name.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-agentspace</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
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
             * <p>The configuration of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;prompt&quot;:&quot;请评估任务完成度&quot;}</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the evaluator was created. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The version number returned in the current response.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
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
             * <p>The evaluation metric name.</p>
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
             * <p>The time when the evaluator was last updated. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816600</p>
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The list of versions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;version&quot;:&quot;1.0.0&quot;}]</p>
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Evaluator build() {
                return new Evaluator(this);
            } 

        } 

    }
}
