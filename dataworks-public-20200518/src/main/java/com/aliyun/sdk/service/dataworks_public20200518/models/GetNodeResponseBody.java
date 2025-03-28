// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetNodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeResponseBody</p>
 */
public class GetNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetNodeResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetNodeResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the node.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the node. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>GetNode</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Other parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>E6F0DBDD-5AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNodeResponseBody build() {
            return new GetNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("Connection")
        private String connection;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("DeployDate")
        private Long deployDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DqcDescription")
        private String dqcDescription;

        @com.aliyun.core.annotation.NameInMap("DqcType")
        private Integer dqcType;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("FileVersion")
        private Integer fileVersion;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ParamValues")
        private String paramValues;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProgramType")
        private String programType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RelatedFlowId")
        private Long relatedFlowId;

        @com.aliyun.core.annotation.NameInMap("RepeatInterval")
        private Long repeatInterval;

        @com.aliyun.core.annotation.NameInMap("RepeatMode")
        private Integer repeatMode;

        @com.aliyun.core.annotation.NameInMap("Repeatability")
        private String repeatability;

        @com.aliyun.core.annotation.NameInMap("ResGroupIdentifier")
        private String resGroupIdentifier;

        @com.aliyun.core.annotation.NameInMap("ResGroupName")
        private String resGroupName;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        private Data(Builder builder) {
            this.baselineId = builder.baselineId;
            this.businessId = builder.businessId;
            this.connection = builder.connection;
            this.createTime = builder.createTime;
            this.cronExpress = builder.cronExpress;
            this.deployDate = builder.deployDate;
            this.description = builder.description;
            this.dqcDescription = builder.dqcDescription;
            this.dqcType = builder.dqcType;
            this.fileId = builder.fileId;
            this.fileType = builder.fileType;
            this.fileVersion = builder.fileVersion;
            this.modifyTime = builder.modifyTime;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.ownerId = builder.ownerId;
            this.paramValues = builder.paramValues;
            this.priority = builder.priority;
            this.programType = builder.programType;
            this.projectId = builder.projectId;
            this.relatedFlowId = builder.relatedFlowId;
            this.repeatInterval = builder.repeatInterval;
            this.repeatMode = builder.repeatMode;
            this.repeatability = builder.repeatability;
            this.resGroupIdentifier = builder.resGroupIdentifier;
            this.resGroupName = builder.resGroupName;
            this.schedulerType = builder.schedulerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return connection
         */
        public String getConnection() {
            return this.connection;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cronExpress
         */
        public String getCronExpress() {
            return this.cronExpress;
        }

        /**
         * @return deployDate
         */
        public Long getDeployDate() {
            return this.deployDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dqcDescription
         */
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        /**
         * @return dqcType
         */
        public Integer getDqcType() {
            return this.dqcType;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return fileVersion
         */
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return paramValues
         */
        public String getParamValues() {
            return this.paramValues;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return programType
         */
        public String getProgramType() {
            return this.programType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return relatedFlowId
         */
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        /**
         * @return repeatInterval
         */
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        /**
         * @return repeatMode
         */
        public Integer getRepeatMode() {
            return this.repeatMode;
        }

        /**
         * @return repeatability
         */
        public String getRepeatability() {
            return this.repeatability;
        }

        /**
         * @return resGroupIdentifier
         */
        public String getResGroupIdentifier() {
            return this.resGroupIdentifier;
        }

        /**
         * @return resGroupName
         */
        public String getResGroupName() {
            return this.resGroupName;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public static final class Builder {
            private Long baselineId; 
            private Long businessId; 
            private String connection; 
            private Long createTime; 
            private String cronExpress; 
            private Long deployDate; 
            private String description; 
            private String dqcDescription; 
            private Integer dqcType; 
            private Long fileId; 
            private Integer fileType; 
            private Integer fileVersion; 
            private Long modifyTime; 
            private Long nodeId; 
            private String nodeName; 
            private String ownerId; 
            private String paramValues; 
            private Integer priority; 
            private String programType; 
            private Long projectId; 
            private Long relatedFlowId; 
            private Long repeatInterval; 
            private Integer repeatMode; 
            private String repeatability; 
            private String resGroupIdentifier; 
            private String resGroupName; 
            private String schedulerType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baselineId = model.baselineId;
                this.businessId = model.businessId;
                this.connection = model.connection;
                this.createTime = model.createTime;
                this.cronExpress = model.cronExpress;
                this.deployDate = model.deployDate;
                this.description = model.description;
                this.dqcDescription = model.dqcDescription;
                this.dqcType = model.dqcType;
                this.fileId = model.fileId;
                this.fileType = model.fileType;
                this.fileVersion = model.fileVersion;
                this.modifyTime = model.modifyTime;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.ownerId = model.ownerId;
                this.paramValues = model.paramValues;
                this.priority = model.priority;
                this.programType = model.programType;
                this.projectId = model.projectId;
                this.relatedFlowId = model.relatedFlowId;
                this.repeatInterval = model.repeatInterval;
                this.repeatMode = model.repeatMode;
                this.repeatability = model.repeatability;
                this.resGroupIdentifier = model.resGroupIdentifier;
                this.resGroupName = model.resGroupName;
                this.schedulerType = model.schedulerType;
            } 

            /**
             * <p>The description of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The operation that you want to perform. Set the value to <strong>GetNode</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first_dev</p>
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1727280000000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 00 * * ?</p>
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * <p>The deployment date.</p>
             * 
             * <strong>example:</strong>
             * <p>1727280000000</p>
             */
            public Builder deployDate(Long deployDate) {
                this.deployDate = deployDate;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the node. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;projectName&quot;:&quot;test_0923001&quot;,&quot;tableName&quot;:&quot;test_table_001&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyymmdd]&quot;},{&quot;projectName&quot;:&quot;test_0923001&quot;,&quot;tableName&quot;:&quot;test_table_002&quot;,&quot;partition&quot;:&quot;NOTAPARTITIONTABLE&quot;}]</p>
             */
            public Builder dqcDescription(String dqcDescription) {
                this.dqcDescription = dqcDescription;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dqcType(Integer dqcType) {
                this.dqcType = dqcType;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The file type. Different file types have different codes. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks node collection</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The version of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fileVersion(Integer fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1727280000000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The HTTP status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The scheduling type of the node. Valid values:</p>
             * <ul>
             * <li>NORMAL: The node is an auto triggered node.</li>
             * <li>MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered.</li>
             * <li>PAUSE: The node is a paused node.</li>
             * <li>SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>The ID of the baseline.</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>17366294****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The CRON expression returned.</p>
             * 
             * <strong>example:</strong>
             * <p>a=b</p>
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * <p>The HTTP status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the owner of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder programType(String programType) {
                this.programType = programType;
                return this;
            }

            /**
             * <p>Indicates whether the node can be rerun.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Indicates whether the node is associated with Data Quality. Valid values: 0 and 1. A value of 0 indicates that the node is associated with Data Quality. A value of 1 indicates that the node is not associated with Data Quality.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder relatedFlowId(Long relatedFlowId) {
                this.relatedFlowId = relatedFlowId;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder repeatInterval(Long repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * <p>Rerun mode. 0 indicates that you can rerun only if you fail, 1 indicates that you can rerun in all cases, and 2 indicates that you cannot rerun in all cases.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder repeatMode(Integer repeatMode) {
                this.repeatMode = repeatMode;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder repeatability(String repeatability) {
                this.repeatability = repeatability;
                return this;
            }

            /**
             * <p>The unique identifier of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>group_123</p>
             */
            public Builder resGroupIdentifier(String resGroupIdentifier) {
                this.resGroupIdentifier = resGroupIdentifier;
                return this;
            }

            /**
             * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
             * 
             * <strong>example:</strong>
             * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
             */
            public Builder resGroupName(String resGroupName) {
                this.resGroupName = resGroupName;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
