// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListDiagnosticResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnosticResultsResponseBody</p>
 */
public class ListDiagnosticResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnosticResults")
    private java.util.List<DiagnosticResults> diagnosticResults;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDiagnosticResultsResponseBody(Builder builder) {
        this.diagnosticResults = builder.diagnosticResults;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosticResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosticResults
     */
    public java.util.List<DiagnosticResults> getDiagnosticResults() {
        return this.diagnosticResults;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
        private java.util.List<DiagnosticResults> diagnosticResults; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDiagnosticResultsResponseBody model) {
            this.diagnosticResults = model.diagnosticResults;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * DiagnosticResults.
         */
        public Builder diagnosticResults(java.util.List<DiagnosticResults> diagnosticResults) {
            this.diagnosticResults = diagnosticResults;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDiagnosticResultsResponseBody build() {
            return new ListDiagnosticResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDiagnosticResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnosticResultsResponseBody</p>
     */
    public static class DiagnosticResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DiagContent")
        private String diagContent;

        @com.aliyun.core.annotation.NameInMap("DiagId")
        private String diagId;

        @com.aliyun.core.annotation.NameInMap("DiagResult")
        private String diagResult;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DiagnosticResults(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.creationTime = builder.creationTime;
            this.diagContent = builder.diagContent;
            this.diagId = builder.diagId;
            this.diagResult = builder.diagResult;
            this.finishedTime = builder.finishedTime;
            this.resourceId = builder.resourceId;
            this.serverName = builder.serverName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosticResults create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diagContent
         */
        public String getDiagContent() {
            return this.diagContent;
        }

        /**
         * @return diagId
         */
        public String getDiagId() {
            return this.diagId;
        }

        /**
         * @return diagResult
         */
        public String getDiagResult() {
            return this.diagResult;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String creationTime; 
            private String diagContent; 
            private String diagId; 
            private String diagResult; 
            private String finishedTime; 
            private String resourceId; 
            private String serverName; 
            private String status; 

            private Builder() {
            } 

            private Builder(DiagnosticResults model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.creationTime = model.creationTime;
                this.diagContent = model.diagContent;
                this.diagId = model.diagId;
                this.diagResult = model.diagResult;
                this.finishedTime = model.finishedTime;
                this.resourceId = model.resourceId;
                this.serverName = model.serverName;
                this.status = model.status;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DiagContent.
             */
            public Builder diagContent(String diagContent) {
                this.diagContent = diagContent;
                return this;
            }

            /**
             * DiagId.
             */
            public Builder diagId(String diagId) {
                this.diagId = diagId;
                return this;
            }

            /**
             * DiagResult.
             */
            public Builder diagResult(String diagResult) {
                this.diagResult = diagResult;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ServerName.
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DiagnosticResults build() {
                return new DiagnosticResults(this);
            } 

        } 

    }
}
