// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiStatisticsConfig} extends {@link TeaModel}
 *
 * <p>AiStatisticsConfig</p>
 */
public class AiStatisticsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logRequestContent")
    private Boolean logRequestContent;

    @com.aliyun.core.annotation.NameInMap("logResponseContent")
    private Boolean logResponseContent;

    @com.aliyun.core.annotation.NameInMap("pathFieldConfigs")
    private java.util.List<PathFieldConfigs> pathFieldConfigs;

    private AiStatisticsConfig(Builder builder) {
        this.logRequestContent = builder.logRequestContent;
        this.logResponseContent = builder.logResponseContent;
        this.pathFieldConfigs = builder.pathFieldConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiStatisticsConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logRequestContent
     */
    public Boolean getLogRequestContent() {
        return this.logRequestContent;
    }

    /**
     * @return logResponseContent
     */
    public Boolean getLogResponseContent() {
        return this.logResponseContent;
    }

    /**
     * @return pathFieldConfigs
     */
    public java.util.List<PathFieldConfigs> getPathFieldConfigs() {
        return this.pathFieldConfigs;
    }

    public static final class Builder {
        private Boolean logRequestContent; 
        private Boolean logResponseContent; 
        private java.util.List<PathFieldConfigs> pathFieldConfigs; 

        private Builder() {
        } 

        private Builder(AiStatisticsConfig model) {
            this.logRequestContent = model.logRequestContent;
            this.logResponseContent = model.logResponseContent;
            this.pathFieldConfigs = model.pathFieldConfigs;
        } 

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether to record request content (controls whether question-related attributes are generated). This parameter is deprecated in the new version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder logRequestContent(Boolean logRequestContent) {
            this.logRequestContent = logRequestContent;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether to record response content (controls whether answer-related attributes are generated). This parameter is deprecated in the new version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder logResponseContent(Boolean logResponseContent) {
            this.logResponseContent = logResponseContent;
            return this;
        }

        /**
         * <p>The list of AI request log field collection configurations, configured by API path.</p>
         */
        public Builder pathFieldConfigs(java.util.List<PathFieldConfigs> pathFieldConfigs) {
            this.pathFieldConfigs = pathFieldConfigs;
            return this;
        }

        public AiStatisticsConfig build() {
            return new AiStatisticsConfig(this);
        } 

    } 

    /**
     * 
     * {@link AiStatisticsConfig} extends {@link TeaModel}
     *
     * <p>AiStatisticsConfig</p>
     */
    public static class PathFieldConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldPaths")
        private java.util.Map<String, AiStatisticsPathField> fieldPaths;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private PathFieldConfigs(Builder builder) {
            this.fieldPaths = builder.fieldPaths;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathFieldConfigs create() {
            return builder().build();
        }

        /**
         * @return fieldPaths
         */
        public java.util.Map<String, AiStatisticsPathField> getFieldPaths() {
            return this.fieldPaths;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.Map<String, AiStatisticsPathField> fieldPaths; 
            private String path; 

            private Builder() {
            } 

            private Builder(PathFieldConfigs model) {
                this.fieldPaths = model.fieldPaths;
                this.path = model.path;
            } 

            /**
             * <p>The AI request log field configuration groups for the API path, passed in as a Map. The Map keys are fixed to basic and custom, and the values are arrays of log field configurations for the corresponding groups. basic indicates basic log fields, and custom indicates custom log fields. For the current API path, fieldPaths represents the complete desired state of field configurations and does not support incremental appending or diff merging.</p>
             * <p>If pathFieldConfigs is not passed, is null, or is an empty array, the existing log field configurations are not updated. If a non-empty array is passed, the system performs a desired state replacement based on the complete set of Paths in the request, and historical Path configurations not included in the request are deleted.</p>
             * <p>For example, to add a custom field test to the /v1/chat/completions API path on top of existing configurations, the caller must use a &quot;read-merge-write back in full&quot; approach:</p>
             * <ol>
             * <li>Read all current Path configurations.</li>
             * <li>Retain the complete basic array and custom array for the target API path /v1/chat/completions.</li>
             * <li>Append test to the current custom array.</li>
             * <li>Keep configurations for other API paths unchanged.</li>
             * <li>Submit the merged complete pathFieldConfigs.</li>
             * </ol>
             */
            public Builder fieldPaths(java.util.Map<String, AiStatisticsPathField> fieldPaths) {
                this.fieldPaths = fieldPaths;
                return this;
            }

            /**
             * <p>The API path.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public PathFieldConfigs build() {
                return new PathFieldConfigs(this);
            } 

        } 

    }
}
