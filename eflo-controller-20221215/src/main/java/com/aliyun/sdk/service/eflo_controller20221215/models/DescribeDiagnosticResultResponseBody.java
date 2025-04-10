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
 * {@link DescribeDiagnosticResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticResultResponseBody</p>
 */
public class DescribeDiagnosticResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("DiagnosticId")
    private String diagnosticId;

    @com.aliyun.core.annotation.NameInMap("DiagnosticResults")
    private java.util.List<?> diagnosticResults;

    @com.aliyun.core.annotation.NameInMap("DiagnosticState")
    private String diagnosticState;

    @com.aliyun.core.annotation.NameInMap("DiagnosticType")
    private String diagnosticType;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosticResultResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.createdTime = builder.createdTime;
        this.diagnosticId = builder.diagnosticId;
        this.diagnosticResults = builder.diagnosticResults;
        this.diagnosticState = builder.diagnosticState;
        this.diagnosticType = builder.diagnosticType;
        this.endTime = builder.endTime;
        this.nodeIds = builder.nodeIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return diagnosticId
     */
    public String getDiagnosticId() {
        return this.diagnosticId;
    }

    /**
     * @return diagnosticResults
     */
    public java.util.List<?> getDiagnosticResults() {
        return this.diagnosticResults;
    }

    /**
     * @return diagnosticState
     */
    public String getDiagnosticState() {
        return this.diagnosticState;
    }

    /**
     * @return diagnosticType
     */
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String createdTime; 
        private String diagnosticId; 
        private java.util.List<?> diagnosticResults; 
        private String diagnosticState; 
        private String diagnosticType; 
        private String endTime; 
        private java.util.List<String> nodeIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDiagnosticResultResponseBody model) {
            this.clusterId = model.clusterId;
            this.createdTime = model.createdTime;
            this.diagnosticId = model.diagnosticId;
            this.diagnosticResults = model.diagnosticResults;
            this.diagnosticState = model.diagnosticState;
            this.diagnosticType = model.diagnosticType;
            this.endTime = model.endTime;
            this.nodeIds = model.nodeIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>i118913031696573280136</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Device creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-15T10:17:56</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>Diagnostic ID</p>
         * 
         * <strong>example:</strong>
         * <p>diag-i155363241720059671316</p>
         */
        public Builder diagnosticId(String diagnosticId) {
            this.diagnosticId = diagnosticId;
            return this;
        }

        /**
         * <p>Diagnostic Information</p>
         */
        public Builder diagnosticResults(java.util.List<?> diagnosticResults) {
            this.diagnosticResults = diagnosticResults;
            return this;
        }

        /**
         * <p>Diagnostic State</p>
         * 
         * <strong>example:</strong>
         * <p>Fault</p>
         */
        public Builder diagnosticState(String diagnosticState) {
            this.diagnosticState = diagnosticState;
            return this;
        }

        /**
         * <p>Diagnostic Type</p>
         * 
         * <strong>example:</strong>
         * <p>CheckByAiJobLogs</p>
         */
        public Builder diagnosticType(String diagnosticType) {
            this.diagnosticType = diagnosticType;
            return this;
        }

        /**
         * <p>End time of node anomaly issues. Represented according to the ISO8601 standard, in a timezone-aware format, formatted as yyyy-MM-ddTHH:mm:ss+0800</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-11T10:00:30</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>List of Node IDs</p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>8F065DDD-6996-5973-9691-9EC57BD0072E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticResultResponseBody build() {
            return new DescribeDiagnosticResultResponseBody(this);
        } 

    } 

}
