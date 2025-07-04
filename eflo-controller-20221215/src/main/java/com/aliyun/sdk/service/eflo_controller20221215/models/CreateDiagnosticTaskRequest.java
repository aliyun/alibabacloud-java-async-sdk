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
 * {@link CreateDiagnosticTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosticTaskRequest</p>
 */
public class CreateDiagnosticTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AiJobLogInfo")
    private AiJobLogInfo aiJobLogInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiagnosticType")
    private String diagnosticType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    private CreateDiagnosticTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aiJobLogInfo = builder.aiJobLogInfo;
        this.clusterId = builder.clusterId;
        this.diagnosticType = builder.diagnosticType;
        this.nodeIds = builder.nodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aiJobLogInfo
     */
    public AiJobLogInfo getAiJobLogInfo() {
        return this.aiJobLogInfo;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return diagnosticType
     */
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosticTaskRequest, Builder> {
        private String regionId; 
        private AiJobLogInfo aiJobLogInfo; 
        private String clusterId; 
        private String diagnosticType; 
        private java.util.List<String> nodeIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosticTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aiJobLogInfo = request.aiJobLogInfo;
            this.clusterId = request.clusterId;
            this.diagnosticType = request.diagnosticType;
            this.nodeIds = request.nodeIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The log information.</p>
         */
        public Builder aiJobLogInfo(AiJobLogInfo aiJobLogInfo) {
            String aiJobLogInfoShrink = shrink(aiJobLogInfo, "AiJobLogInfo", "json");
            this.putBodyParameter("AiJobLogInfo", aiJobLogInfoShrink);
            this.aiJobLogInfo = aiJobLogInfo;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i118913031696573280136</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The diagnostics type.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckByAiJobLogs</p>
         */
        public Builder diagnosticType(String diagnosticType) {
            this.putBodyParameter("DiagnosticType", diagnosticType);
            this.diagnosticType = diagnosticType;
            return this;
        }

        /**
         * <p>The IDs of the nodes.</p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            String nodeIdsShrink = shrink(nodeIds, "NodeIds", "simple");
            this.putBodyParameter("NodeIds", nodeIdsShrink);
            this.nodeIds = nodeIds;
            return this;
        }

        @Override
        public CreateDiagnosticTaskRequest build() {
            return new CreateDiagnosticTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDiagnosticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDiagnosticTaskRequest</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Datetime")
        private String datetime;

        @com.aliyun.core.annotation.NameInMap("LogContent")
        private String logContent;

        private Logs(Builder builder) {
            this.datetime = builder.datetime;
            this.logContent = builder.logContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return datetime
         */
        public String getDatetime() {
            return this.datetime;
        }

        /**
         * @return logContent
         */
        public String getLogContent() {
            return this.logContent;
        }

        public static final class Builder {
            private String datetime; 
            private String logContent; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.datetime = model.datetime;
                this.logContent = model.logContent;
            } 

            /**
             * <p>The sending date in the yyyymmdd format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-05T10:10:01</p>
             */
            public Builder datetime(String datetime) {
                this.datetime = datetime;
                return this;
            }

            /**
             * <p>The log content.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDiagnosticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDiagnosticTaskRequest</p>
     */
    public static class AiJobLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiInstance")
        private String aiInstance;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<Logs> logs;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private AiJobLogs(Builder builder) {
            this.aiInstance = builder.aiInstance;
            this.logs = builder.logs;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiJobLogs create() {
            return builder().build();
        }

        /**
         * @return aiInstance
         */
        public String getAiInstance() {
            return this.aiInstance;
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String aiInstance; 
            private java.util.List<Logs> logs; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(AiJobLogs model) {
                this.aiInstance = model.aiInstance;
                this.logs = model.logs;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder aiInstance(String aiInstance) {
                this.aiInstance = aiInstance;
                return this;
            }

            /**
             * <p>The logs.</p>
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-tw-p2p2al5u1hn</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public AiJobLogs build() {
                return new AiJobLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDiagnosticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDiagnosticTaskRequest</p>
     */
    public static class AiJobLogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiJobLogs")
        private java.util.List<AiJobLogs> aiJobLogs;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private AiJobLogInfo(Builder builder) {
            this.aiJobLogs = builder.aiJobLogs;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiJobLogInfo create() {
            return builder().build();
        }

        /**
         * @return aiJobLogs
         */
        public java.util.List<AiJobLogs> getAiJobLogs() {
            return this.aiJobLogs;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List<AiJobLogs> aiJobLogs; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(AiJobLogInfo model) {
                this.aiJobLogs = model.aiJobLogs;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The task logs.</p>
             */
            public Builder aiJobLogs(java.util.List<AiJobLogs> aiJobLogs) {
                this.aiJobLogs = aiJobLogs;
                return this;
            }

            /**
             * <p>The end time. The value is in the timestamp format. Unit: seconds.</p>
             * <blockquote>
             * <p> This timestamp must indicate a point in time that is accurate to the minute.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-08-05T10:10:01</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time. The value is in the timestamp format. Unit: seconds.</p>
             * <blockquote>
             * <p> This timestamp must indicate a point in time that is accurate to the minute.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-10-11T00:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public AiJobLogInfo build() {
                return new AiJobLogInfo(this);
            } 

        } 

    }
}
