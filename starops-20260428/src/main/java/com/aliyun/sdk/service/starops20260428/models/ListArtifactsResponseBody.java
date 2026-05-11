// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link ListArtifactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactsResponseBody</p>
 */
public class ListArtifactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifacts")
    private java.util.List<Artifacts> artifacts;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListArtifactsResponseBody(Builder builder) {
        this.artifacts = builder.artifacts;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifacts
     */
    public java.util.List<Artifacts> getArtifacts() {
        return this.artifacts;
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

    public static final class Builder {
        private java.util.List<Artifacts> artifacts; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListArtifactsResponseBody model) {
            this.artifacts = model.artifacts;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * artifacts.
         */
        public Builder artifacts(java.util.List<Artifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListArtifactsResponseBody build() {
            return new ListArtifactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactsResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isDirectory")
        private Boolean isDirectory;

        @com.aliyun.core.annotation.NameInMap("lastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        private Artifacts(Builder builder) {
            this.isDirectory = builder.isDirectory;
            this.lastModified = builder.lastModified;
            this.path = builder.path;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return isDirectory
         */
        public Boolean getIsDirectory() {
            return this.isDirectory;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private Boolean isDirectory; 
            private String lastModified; 
            private String path; 
            private Long size; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.isDirectory = model.isDirectory;
                this.lastModified = model.lastModified;
                this.path = model.path;
                this.size = model.size;
            } 

            /**
             * isDirectory.
             */
            public Builder isDirectory(Boolean isDirectory) {
                this.isDirectory = isDirectory;
                return this;
            }

            /**
             * lastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
}
