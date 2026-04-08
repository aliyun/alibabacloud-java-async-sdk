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
         * logRequestContent.
         */
        public Builder logRequestContent(Boolean logRequestContent) {
            this.logRequestContent = logRequestContent;
            return this;
        }

        /**
         * logResponseContent.
         */
        public Builder logResponseContent(Boolean logResponseContent) {
            this.logResponseContent = logResponseContent;
            return this;
        }

        /**
         * pathFieldConfigs.
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
             * fieldPaths.
             */
            public Builder fieldPaths(java.util.Map<String, AiStatisticsPathField> fieldPaths) {
                this.fieldPaths = fieldPaths;
                return this;
            }

            /**
             * path.
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
