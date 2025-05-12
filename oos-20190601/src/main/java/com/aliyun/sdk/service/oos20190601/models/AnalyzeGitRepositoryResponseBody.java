// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link AnalyzeGitRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>AnalyzeGitRepositoryResponseBody</p>
 */
public class AnalyzeGitRepositoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnalysisResults")
    private java.util.List<AnalysisResults> analysisResults;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AnalyzeGitRepositoryResponseBody(Builder builder) {
        this.analysisResults = builder.analysisResults;
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeGitRepositoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisResults
     */
    public java.util.List<AnalysisResults> getAnalysisResults() {
        return this.analysisResults;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AnalysisResults> analysisResults; 
        private Integer count; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AnalyzeGitRepositoryResponseBody model) {
            this.analysisResults = model.analysisResults;
            this.count = model.count;
            this.requestId = model.requestId;
        } 

        /**
         * AnalysisResults.
         */
        public Builder analysisResults(java.util.List<AnalysisResults> analysisResults) {
            this.analysisResults = analysisResults;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AnalyzeGitRepositoryResponseBody build() {
            return new AnalyzeGitRepositoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AnalyzeGitRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>AnalyzeGitRepositoryResponseBody</p>
     */
    public static class BuildFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        private BuildFiles(Builder builder) {
            this.fileType = builder.fileType;
            this.paths = builder.paths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildFiles create() {
            return builder().build();
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public static final class Builder {
            private String fileType; 
            private java.util.List<String> paths; 

            private Builder() {
            } 

            private Builder(BuildFiles model) {
                this.fileType = model.fileType;
                this.paths = model.paths;
            } 

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            public BuildFiles build() {
                return new BuildFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeGitRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>AnalyzeGitRepositoryResponseBody</p>
     */
    public static class AnalysisResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildFiles")
        private java.util.List<BuildFiles> buildFiles;

        @com.aliyun.core.annotation.NameInMap("BuildType")
        private String buildType;

        @com.aliyun.core.annotation.NameInMap("RuntimeType")
        private String runtimeType;

        private AnalysisResults(Builder builder) {
            this.buildFiles = builder.buildFiles;
            this.buildType = builder.buildType;
            this.runtimeType = builder.runtimeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisResults create() {
            return builder().build();
        }

        /**
         * @return buildFiles
         */
        public java.util.List<BuildFiles> getBuildFiles() {
            return this.buildFiles;
        }

        /**
         * @return buildType
         */
        public String getBuildType() {
            return this.buildType;
        }

        /**
         * @return runtimeType
         */
        public String getRuntimeType() {
            return this.runtimeType;
        }

        public static final class Builder {
            private java.util.List<BuildFiles> buildFiles; 
            private String buildType; 
            private String runtimeType; 

            private Builder() {
            } 

            private Builder(AnalysisResults model) {
                this.buildFiles = model.buildFiles;
                this.buildType = model.buildType;
                this.runtimeType = model.runtimeType;
            } 

            /**
             * BuildFiles.
             */
            public Builder buildFiles(java.util.List<BuildFiles> buildFiles) {
                this.buildFiles = buildFiles;
                return this;
            }

            /**
             * BuildType.
             */
            public Builder buildType(String buildType) {
                this.buildType = buildType;
                return this;
            }

            /**
             * RuntimeType.
             */
            public Builder runtimeType(String runtimeType) {
                this.runtimeType = runtimeType;
                return this;
            }

            public AnalysisResults build() {
                return new AnalysisResults(this);
            } 

        } 

    }
}
