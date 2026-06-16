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
 * {@link ListPipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelinesResponseBody</p>
 */
public class ListPipelinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pipelines")
    private java.util.List<Pipelines> pipelines;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPipelinesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pipelines = builder.pipelines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelinesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pipelines
     */
    public java.util.List<Pipelines> getPipelines() {
        return this.pipelines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Pipelines> pipelines; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPipelinesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pipelines = model.pipelines;
            this.requestId = model.requestId;
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
         * pipelines.
         */
        public Builder pipelines(java.util.List<Pipelines> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPipelinesResponseBody build() {
            return new ListPipelinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class Pipelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("pipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Pipelines(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.pipelineName = builder.pipelineName;
            this.regionId = builder.regionId;
            this.updateTime = builder.updateTime;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipelines create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String pipelineName; 
            private String regionId; 
            private String updateTime; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Pipelines model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.pipelineName = model.pipelineName;
                this.regionId = model.regionId;
                this.updateTime = model.updateTime;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * pipelineName.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-02T00:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Pipelines build() {
                return new Pipelines(this);
            } 

        } 

    }
}
