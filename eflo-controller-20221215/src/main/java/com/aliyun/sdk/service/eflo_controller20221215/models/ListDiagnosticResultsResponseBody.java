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
         * <p>The diagnostic information.</p>
         */
        public Builder diagnosticResults(java.util.List<DiagnosticResults> diagnosticResults) {
            this.diagnosticResults = diagnosticResults;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Maximum value: 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li><p>If this parameter is not specified or is set to a value less than 20, the default value is 20.</p>
         * </li>
         * <li><p>If this parameter is set to a value greater than 100, the default value is 100.</p>
         * </li>
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
         * <p>The NextToken for the next page. Include this value when you request the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>a3f2224a5ec7224116c4f5246120****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i11857814169474524****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>pjlab-lingjun</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The time when the diagnostic task was created. The time is in ISO 8601 format. Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-15T02:01:12Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The diagnostic content. For example, in the network diagnostic type, the diagnostic content includes static configuration checks and dynamic runtime checks.</p>
             * 
             * <strong>example:</strong>
             * <p>Test diagnostic information</p>
             */
            public Builder diagContent(String diagContent) {
                this.diagContent = diagContent;
                return this;
            }

            /**
             * <p>The diagnostic ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder diagId(String diagId) {
                this.diagId = diagId;
                return this;
            }

            /**
             * <p>The diagnostic result, which indicates success or failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder diagResult(String diagResult) {
                this.diagResult = diagResult;
                return this;
            }

            /**
             * <p>The time when the diagnostic task was completed. The time is in ISO 8601 format. Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16T02:04Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-bl03ofg6****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>proxy-rps.mos.csvw.com</p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            /**
             * <p>The governance status.</p>
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
