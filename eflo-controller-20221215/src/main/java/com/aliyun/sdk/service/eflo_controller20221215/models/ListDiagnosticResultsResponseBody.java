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

        /**
         * <p>Diagnostic information</p>
         */
        public Builder diagnosticResults(java.util.List<DiagnosticResults> diagnosticResults) {
            this.diagnosticResults = diagnosticResults;
            return this;
        }

        /**
         * <p>分页查询时每页行数。最大值为100。</p>
         * <p>默认值：</p>
         * <p>•当不设置值或设置的值小于20时，默认值为20。</p>
         * <p>•当设置的值大于100时，默认值为100。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>NextToken for the next page. Include this value when requesting the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>a3f2224a5ec7224116c4f5246120abe4</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AC4F0004-7BCE-52E0-891B-CAC7D64E3368</p>
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

            /**
             * <p>Cluster ID</p>
             * 
             * <strong>example:</strong>
             * <p>i118578141694745246055</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Cluster name</p>
             * 
             * <strong>example:</strong>
             * <p>pjlab-lingjun</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>Creation time of the diagnostic task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-15T02:01:12Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Diagnosis content. For example, in network diagnosis, there are static configuration checks, dynamic operation checks, etc.</p>
             * 
             * <strong>example:</strong>
             * <p>diagcontent</p>
             */
            public Builder diagContent(String diagContent) {
                this.diagContent = diagContent;
                return this;
            }

            /**
             * <p>Diagnosis ID</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder diagId(String diagId) {
                this.diagId = diagId;
                return this;
            }

            /**
             * <p>Diagnosis result, success or failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder diagResult(String diagResult) {
                this.diagResult = diagResult;
                return this;
            }

            /**
             * <p>Completion time of the diagnostic task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16T02:04Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-bl03ofg6206</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>proxy-rps.mos.csvw.com</p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            /**
             * <p>Governance status</p>
             * 
             * <strong>example:</strong>
             * <p>succeed</p>
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
