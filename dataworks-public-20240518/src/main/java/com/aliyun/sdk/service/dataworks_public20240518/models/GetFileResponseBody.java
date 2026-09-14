// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileResponseBody</p>
 */
public class GetFileResponseBody extends TeaModel {
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

    private GetFileResponseBody(Builder builder) {
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

    public static GetFileResponseBody create() {
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

        private Builder(GetFileResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Details of the file.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Request ID. Used for troubleshooting when a fault occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the invocation succeeded. Valid values:</p>
         * <ul>
         * <li><p>true: The invocation succeeded.</p>
         * </li>
         * <li><p>false: Failed to invoke.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFileResponseBody build() {
            return new GetFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class File extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedSettings")
        private String advancedSettings;

        @com.aliyun.core.annotation.NameInMap("AutoParsing")
        private Boolean autoParsing;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private Long bizId;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("CommitStatus")
        private Integer commitStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private Integer currentVersion;

        @com.aliyun.core.annotation.NameInMap("DeletedStatus")
        private String deletedStatus;

        @com.aliyun.core.annotation.NameInMap("FileDescription")
        private String fileDescription;

        @com.aliyun.core.annotation.NameInMap("FileFolderId")
        private String fileFolderId;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("IsMaxCompute")
        private Boolean isMaxCompute;

        @com.aliyun.core.annotation.NameInMap("LastEditTime")
        private Long lastEditTime;

        @com.aliyun.core.annotation.NameInMap("LastEditUser")
        private String lastEditUser;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private File(Builder builder) {
            this.advancedSettings = builder.advancedSettings;
            this.autoParsing = builder.autoParsing;
            this.bizId = builder.bizId;
            this.businessId = builder.businessId;
            this.commitStatus = builder.commitStatus;
            this.connectionName = builder.connectionName;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.currentVersion = builder.currentVersion;
            this.deletedStatus = builder.deletedStatus;
            this.fileDescription = builder.fileDescription;
            this.fileFolderId = builder.fileFolderId;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.isMaxCompute = builder.isMaxCompute;
            this.lastEditTime = builder.lastEditTime;
            this.lastEditUser = builder.lastEditUser;
            this.nodeId = builder.nodeId;
            this.owner = builder.owner;
            this.parentId = builder.parentId;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static File create() {
            return builder().build();
        }

        /**
         * @return advancedSettings
         */
        public String getAdvancedSettings() {
            return this.advancedSettings;
        }

        /**
         * @return autoParsing
         */
        public Boolean getAutoParsing() {
            return this.autoParsing;
        }

        /**
         * @return bizId
         */
        public Long getBizId() {
            return this.bizId;
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return commitStatus
         */
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return currentVersion
         */
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return deletedStatus
         */
        public String getDeletedStatus() {
            return this.deletedStatus;
        }

        /**
         * @return fileDescription
         */
        public String getFileDescription() {
            return this.fileDescription;
        }

        /**
         * @return fileFolderId
         */
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return isMaxCompute
         */
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        /**
         * @return lastEditTime
         */
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        /**
         * @return lastEditUser
         */
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private String advancedSettings; 
            private Boolean autoParsing; 
            private Long bizId; 
            private Long businessId; 
            private Integer commitStatus; 
            private String connectionName; 
            private String content; 
            private Long createTime; 
            private String createUser; 
            private Integer currentVersion; 
            private String deletedStatus; 
            private String fileDescription; 
            private String fileFolderId; 
            private Long fileId; 
            private String fileName; 
            private Integer fileType; 
            private Boolean isMaxCompute; 
            private Long lastEditTime; 
            private String lastEditUser; 
            private Long nodeId; 
            private String owner; 
            private Long parentId; 
            private String useType; 

            private Builder() {
            } 

            private Builder(File model) {
                this.advancedSettings = model.advancedSettings;
                this.autoParsing = model.autoParsing;
                this.bizId = model.bizId;
                this.businessId = model.businessId;
                this.commitStatus = model.commitStatus;
                this.connectionName = model.connectionName;
                this.content = model.content;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.currentVersion = model.currentVersion;
                this.deletedStatus = model.deletedStatus;
                this.fileDescription = model.fileDescription;
                this.fileFolderId = model.fileFolderId;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.isMaxCompute = model.isMaxCompute;
                this.lastEditTime = model.lastEditTime;
                this.lastEditUser = model.lastEditUser;
                this.nodeId = model.nodeId;
                this.owner = model.owner;
                this.parentId = model.parentId;
                this.useType = model.useType;
            } 

            /**
             * <p>Advanced configuration of the job.</p>
             * <p>This parameter corresponds to &quot;Advanced Settings&quot; in the right-side navigation bar on the editing page of an EMR Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * <blockquote>
             * <p>Currently, EMR Shell jobs do not support advanced parameters.</p>
             * </blockquote>
             * <p>For details about advanced parameters for different EMR job types, see <a href="https://help.aliyun.com/document_detail/473077.html">EMR Job Development</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;priority\&quot;:\&quot;1\&quot;,\&quot;ENABLE_SPARKSQL_JDBC\&quot;:false,\&quot;FLOW_SKIP_SQL_ANALYZE\&quot;:false,\&quot;queue\&quot;:\&quot;default\&quot;}</p>
             */
            public Builder advancedSettings(String advancedSettings) {
                this.advancedSettings = advancedSettings;
                return this;
            }

            /**
             * <p>Indicates whether automatic parsing is enabled for the file. Valid values:</p>
             * <ul>
             * <li><p>true: The code in the file is automatically parsed.</p>
             * </li>
             * <li><p>false: The code in the file is not automatically parsed.</p>
             * </li>
             * </ul>
             * <p>This parameter corresponds to the &quot;Code Parsing&quot; option in the DataWorks console (https\://workbench.data.aliyun.com/console) when you select &quot;Same Cycle&quot; under Schedule Configuration &gt; Schedule Dependency for a Data Development job.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoParsing(Boolean autoParsing) {
                this.autoParsing = autoParsing;
                return this;
            }

            /**
             * <p>The ID of the Business Process to which the file belongs. This field is deprecated. Use the BusinessId field instead.</p>
             * 
             * <strong>example:</strong>
             * <p>1000001</p>
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The Business Process ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1000001</p>
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The current commit status of the file. Valid values:</p>
             * <ul>
             * <li><p>0: The latest code has not been submitted.</p>
             * </li>
             * <li><p>1: The latest code has been submitted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder commitStatus(Integer commitStatus) {
                this.commitStatus = commitStatus;
                return this;
            }

            /**
             * <p>The name of the data source used when executing the job corresponding to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_source</p>
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>The code of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW TABLES;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>UNIX timestamp when the file was created, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1593879116000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud User ID of the file creator.</p>
             * 
             * <strong>example:</strong>
             * <p>424732****</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>Version number of the latest submitted version of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder currentVersion(Integer currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The deletion status of the file. Valid values:</p>
             * <ul>
             * <li><p>NORMAL: Not deleted.</p>
             * </li>
             * <li><p>RECYCLE_BIN: In the recycle bin.</p>
             * </li>
             * <li><p>DELETED: Deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RECYCLE</p>
             */
            public Builder deletedStatus(String deletedStatus) {
                this.deletedStatus = deletedStatus;
                return this;
            }

            /**
             * <p>The description of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>My first DataWorks file</p>
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * <p>The ID of the folder to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2735c2****</p>
             */
            public Builder fileFolderId(String fileFolderId) {
                this.fileFolderId = fileFolderId;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>100000001</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info_d</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The code type of the file. Different file types use different code. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks Edge Zone Collection</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>Indicates whether the resource file needs to be uploaded to MaxCompute.
             * Configure this parameter only when the file is a MaxCompute resource file.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isMaxCompute(Boolean isMaxCompute) {
                this.isMaxCompute = isMaxCompute;
                return this;
            }

            /**
             * <p>The UNIX timestamp of the most recent edit to the file, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1593879116000</p>
             */
            public Builder lastEditTime(Long lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud User ID of the user who last edited the file.</p>
             * 
             * <strong>example:</strong>
             * <p>424732****</p>
             */
            public Builder lastEditUser(String lastEditUser) {
                this.lastEditUser = lastEditUser;
                return this;
            }

            /**
             * <p>The ID of the scheduling task generated in the CDN mapping system after the file is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>300001</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Alibaba Cloud User ID of the file owner.</p>
             * 
             * <strong>example:</strong>
             * <p>7775674356****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>If the current file is an internal file of a composite edge zone file, this field identifies the ID of the corresponding composite edge zone file.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The function module to which the file belongs. Valid values:</p>
             * <ul>
             * <li><p>NORMAL: Data Development.</p>
             * </li>
             * <li><p>MANUAL: One-time task.</p>
             * </li>
             * <li><p>MANUAL_BIZ: Manually triggered workflow.</p>
             * </li>
             * <li><p>SKIP: Dry-run scheduling in Data Development.</p>
             * </li>
             * <li><p>ADHOCQUERY: Ad-hoc query.</p>
             * </li>
             * <li><p>COMPONENT: Widget Management.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public File build() {
                return new File(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class InputList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("ParseType")
        private String parseType;

        private InputList(Builder builder) {
            this.input = builder.input;
            this.parseType = builder.parseType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputList create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return parseType
         */
        public String getParseType() {
            return this.parseType;
        }

        public static final class Builder {
            private String input; 
            private String parseType; 

            private Builder() {
            } 

            private Builder(InputList model) {
                this.input = model.input;
                this.parseType = model.parseType;
            } 

            /**
             * <p>The output name of the upstream file on which this file depends.</p>
             * <p>This parameter corresponds to &quot;Parent Node Output Name&quot; when &quot;Same Cycle&quot; is selected under &quot;Schedule Configuration &gt; Schedule Dependency&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>project.001_out</p>
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The method for configuring file dependencies. Valid values:</p>
             * <ul>
             * <li><p>MANUAL: Manually configured.</p>
             * </li>
             * <li><p>AUTO: Automatically parsed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder parseType(String parseType) {
                this.parseType = parseType;
                return this;
            }

            public InputList build() {
                return new InputList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class InputParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ValueSource")
        private String valueSource;

        private InputParameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.valueSource = builder.valueSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputParameters create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return valueSource
         */
        public String getValueSource() {
            return this.valueSource;
        }

        public static final class Builder {
            private String parameterName; 
            private String valueSource; 

            private Builder() {
            } 

            private Builder(InputParameters model) {
                this.parameterName = model.parameterName;
                this.valueSource = model.valueSource;
            } 

            /**
             * <p>The parameter name of the input parameter in the node context. You can reference this parameter in code by using the ${...} syntax.</p>
             * <p>This parameter corresponds to the &quot;Parameter Name&quot; field under &quot;Schedule Configuration &gt; Node Context &gt; Input Parameters of This Node&quot; in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>input</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value source of the input parameter in the node context.</p>
             * <p>This parameter corresponds to the &quot;Value Source&quot; field under &quot;Schedule Configuration &gt; Node Context &gt; Input Parameters of This Node&quot; in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>project_001.parent_node:outputs</p>
             */
            public Builder valueSource(String valueSource) {
                this.valueSource = valueSource;
                return this;
            }

            public InputParameters build() {
                return new InputParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class OutputList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("RefTableName")
        private String refTableName;

        private OutputList(Builder builder) {
            this.output = builder.output;
            this.refTableName = builder.refTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputList create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return refTableName
         */
        public String getRefTableName() {
            return this.refTableName;
        }

        public static final class Builder {
            private String output; 
            private String refTableName; 

            private Builder() {
            } 

            private Builder(OutputList model) {
                this.output = model.output;
                this.refTableName = model.refTableName;
            } 

            /**
             * <p>Output name of the file.</p>
             * <p>This parameter corresponds to the value in the &quot;Output Name&quot; column when &quot;Same Cycle&quot; is selected under &quot;Scan Configuration &gt; Schedule Dependency&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dw_project.002_out</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>Output value of the file.</p>
             * <p>This parameter corresponds to the value in the &quot;Output Table&quot; column when &quot;Same Cycle&quot; is selected under &quot;Scan Configuration &gt; Schedule Dependency&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info_d</p>
             */
            public Builder refTableName(String refTableName) {
                this.refTableName = refTableName;
                return this;
            }

            public OutputList build() {
                return new OutputList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class OutputParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OutputParameters(Builder builder) {
            this.description = builder.description;
            this.parameterName = builder.parameterName;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputParameters create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String parameterName; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(OutputParameters model) {
                this.description = model.description;
                this.parameterName = model.parameterName;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The description of the output parameter in the edge zone context.</p>
             * 
             * <strong>example:</strong>
             * <p>It\&quot;s a context output parameter.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter name of the output parameter in the node context.</p>
             * <p>This parameter corresponds to the &quot;Parameter Name&quot; field under &quot;Schedule Configuration &gt; Node Context &gt; Output Parameters of This Node&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>output</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The type of the expression for the edge zone context output parameter. Valid values are as follows:</p>
             * <ul>
             * <li><p>1: constant</p>
             * </li>
             * <li><p>2: variable</p>
             * </li>
             * <li><p>3: pass-through variable from a parameter node</p>
             * </li>
             * </ul>
             * <p>This parameter corresponds to the &quot;Type&quot; field in the &quot;Scan Configuration &gt; Edge Zone Context &gt; Output Parameters of This Node&quot; section for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The expression of the output parameter in the edge zone context.</p>
             * <p>This parameter corresponds to the &quot;Value&quot; field in the &quot;Scan Configuration &gt; Edge Zone Context &gt; Output Parameters of This Node&quot; section for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>${bizdate}</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OutputParameters build() {
                return new OutputParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class NodeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyScheduleImmediately")
        private String applyScheduleImmediately;

        @com.aliyun.core.annotation.NameInMap("AutoRerunIntervalMillis")
        private Integer autoRerunIntervalMillis;

        @com.aliyun.core.annotation.NameInMap("AutoRerunTimes")
        private Integer autoRerunTimes;

        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("CycleType")
        private String cycleType;

        @com.aliyun.core.annotation.NameInMap("DependentNodeIdList")
        private String dependentNodeIdList;

        @com.aliyun.core.annotation.NameInMap("DependentType")
        private String dependentType;

        @com.aliyun.core.annotation.NameInMap("EndEffectDate")
        private Long endEffectDate;

        @com.aliyun.core.annotation.NameInMap("IgnoreParentSkipRunningProperty")
        private String ignoreParentSkipRunningProperty;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InputList")
        private java.util.List<InputList> inputList;

        @com.aliyun.core.annotation.NameInMap("InputParameters")
        private java.util.List<InputParameters> inputParameters;

        @com.aliyun.core.annotation.NameInMap("OutputList")
        private java.util.List<OutputList> outputList;

        @com.aliyun.core.annotation.NameInMap("OutputParameters")
        private java.util.List<OutputParameters> outputParameters;

        @com.aliyun.core.annotation.NameInMap("ParaValue")
        private String paraValue;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private Long resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("StartEffectDate")
        private Long startEffectDate;

        @com.aliyun.core.annotation.NameInMap("StartImmediately")
        private Boolean startImmediately;

        @com.aliyun.core.annotation.NameInMap("Stop")
        private Boolean stop;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private NodeConfiguration(Builder builder) {
            this.applyScheduleImmediately = builder.applyScheduleImmediately;
            this.autoRerunIntervalMillis = builder.autoRerunIntervalMillis;
            this.autoRerunTimes = builder.autoRerunTimes;
            this.cronExpress = builder.cronExpress;
            this.cycleType = builder.cycleType;
            this.dependentNodeIdList = builder.dependentNodeIdList;
            this.dependentType = builder.dependentType;
            this.endEffectDate = builder.endEffectDate;
            this.ignoreParentSkipRunningProperty = builder.ignoreParentSkipRunningProperty;
            this.imageId = builder.imageId;
            this.inputList = builder.inputList;
            this.inputParameters = builder.inputParameters;
            this.outputList = builder.outputList;
            this.outputParameters = builder.outputParameters;
            this.paraValue = builder.paraValue;
            this.rerunMode = builder.rerunMode;
            this.resourceGroupId = builder.resourceGroupId;
            this.schedulerType = builder.schedulerType;
            this.startEffectDate = builder.startEffectDate;
            this.startImmediately = builder.startImmediately;
            this.stop = builder.stop;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return applyScheduleImmediately
         */
        public String getApplyScheduleImmediately() {
            return this.applyScheduleImmediately;
        }

        /**
         * @return autoRerunIntervalMillis
         */
        public Integer getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        /**
         * @return autoRerunTimes
         */
        public Integer getAutoRerunTimes() {
            return this.autoRerunTimes;
        }

        /**
         * @return cronExpress
         */
        public String getCronExpress() {
            return this.cronExpress;
        }

        /**
         * @return cycleType
         */
        public String getCycleType() {
            return this.cycleType;
        }

        /**
         * @return dependentNodeIdList
         */
        public String getDependentNodeIdList() {
            return this.dependentNodeIdList;
        }

        /**
         * @return dependentType
         */
        public String getDependentType() {
            return this.dependentType;
        }

        /**
         * @return endEffectDate
         */
        public Long getEndEffectDate() {
            return this.endEffectDate;
        }

        /**
         * @return ignoreParentSkipRunningProperty
         */
        public String getIgnoreParentSkipRunningProperty() {
            return this.ignoreParentSkipRunningProperty;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return inputList
         */
        public java.util.List<InputList> getInputList() {
            return this.inputList;
        }

        /**
         * @return inputParameters
         */
        public java.util.List<InputParameters> getInputParameters() {
            return this.inputParameters;
        }

        /**
         * @return outputList
         */
        public java.util.List<OutputList> getOutputList() {
            return this.outputList;
        }

        /**
         * @return outputParameters
         */
        public java.util.List<OutputParameters> getOutputParameters() {
            return this.outputParameters;
        }

        /**
         * @return paraValue
         */
        public String getParaValue() {
            return this.paraValue;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return resourceGroupId
         */
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return startEffectDate
         */
        public Long getStartEffectDate() {
            return this.startEffectDate;
        }

        /**
         * @return startImmediately
         */
        public Boolean getStartImmediately() {
            return this.startImmediately;
        }

        /**
         * @return stop
         */
        public Boolean getStop() {
            return this.stop;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private String applyScheduleImmediately; 
            private Integer autoRerunIntervalMillis; 
            private Integer autoRerunTimes; 
            private String cronExpress; 
            private String cycleType; 
            private String dependentNodeIdList; 
            private String dependentType; 
            private Long endEffectDate; 
            private String ignoreParentSkipRunningProperty; 
            private String imageId; 
            private java.util.List<InputList> inputList; 
            private java.util.List<InputParameters> inputParameters; 
            private java.util.List<OutputList> outputList; 
            private java.util.List<OutputParameters> outputParameters; 
            private String paraValue; 
            private String rerunMode; 
            private Long resourceGroupId; 
            private String schedulerType; 
            private Long startEffectDate; 
            private Boolean startImmediately; 
            private Boolean stop; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(NodeConfiguration model) {
                this.applyScheduleImmediately = model.applyScheduleImmediately;
                this.autoRerunIntervalMillis = model.autoRerunIntervalMillis;
                this.autoRerunTimes = model.autoRerunTimes;
                this.cronExpress = model.cronExpress;
                this.cycleType = model.cycleType;
                this.dependentNodeIdList = model.dependentNodeIdList;
                this.dependentType = model.dependentType;
                this.endEffectDate = model.endEffectDate;
                this.ignoreParentSkipRunningProperty = model.ignoreParentSkipRunningProperty;
                this.imageId = model.imageId;
                this.inputList = model.inputList;
                this.inputParameters = model.inputParameters;
                this.outputList = model.outputList;
                this.outputParameters = model.outputParameters;
                this.paraValue = model.paraValue;
                this.rerunMode = model.rerunMode;
                this.resourceGroupId = model.resourceGroupId;
                this.schedulerType = model.schedulerType;
                this.startEffectDate = model.startEffectDate;
                this.startImmediately = model.startImmediately;
                this.stop = model.stop;
                this.timeout = model.timeout;
            } 

            /**
             * <p>Whether to apply the schedule configuration immediately after publishing.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder applyScheduleImmediately(String applyScheduleImmediately) {
                this.applyScheduleImmediately = applyScheduleImmediately;
                return this;
            }

            /**
             * <p>The time interval between automatic reruns after an error, in milliseconds.</p>
             * <p>This parameter corresponds to the &quot;Rerun Interval&quot; setting under &quot;Schedule Configuration &gt; Time Properties &gt; Auto Rerun on Error&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.<br>
             * Note that the time unit for &quot;Rerun Interval&quot; in the console is minutes; convert the time accordingly when invoking the API.</p>
             * 
             * <strong>example:</strong>
             * <p>120000</p>
             */
            public Builder autoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
                this.autoRerunIntervalMillis = autoRerunIntervalMillis;
                return this;
            }

            /**
             * <p>The number of automatic reruns after an error.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder autoRerunTimes(Integer autoRerunTimes) {
                this.autoRerunTimes = autoRerunTimes;
                return this;
            }

            /**
             * <p>The Cron Expression for timed scheduling of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>00 05 00 * * ?</p>
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * <p>The type of recurrence, including NOT_DAY (minute, hour) and DAY (day, week, month).</p>
             * <p>This parameter corresponds to &quot;Schedule Configuration &gt; Time Properties &gt; Recurrence&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>DAY</p>
             */
            public Builder cycleType(String cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * <p>When the DependentType parameter is set to USER_DEFINE, this parameter specifies the IDs of the nodes on which the current file depends. Separate multiple node IDs with commas (,).</p>
             * <p>This parameter corresponds to the configuration when, in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, the &quot;Schedule Configuration &gt; Schedule Dependency&quot; of a Data Development job is set to &quot;Previous Cycle&quot; and the dependency option is set to &quot;Other Nodes&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>5,10,15,20</p>
             */
            public Builder dependentNodeIdList(String dependentNodeIdList) {
                this.dependentNodeIdList = dependentNodeIdList;
                return this;
            }

            /**
             * <p>The method of depending on the previous cycle. Valid values:</p>
             * <ul>
             * <li><p>SELF: The dependency is the current node itself.</p>
             * </li>
             * <li><p>CHILD: The dependency is direct child nodes.</p>
             * </li>
             * <li><p>USER_DEFINE: The dependency is other specified nodes.</p>
             * </li>
             * <li><p>NONE: No dependency is selected, meaning the node does not depend on the previous cycle.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFINE</p>
             */
            public Builder dependentType(String dependentType) {
                this.dependentType = dependentType;
                return this;
            }

            /**
             * <p>The UNIX timestamp, in milliseconds, when automatic scheduling stops.</p>
             * <p>This parameter corresponds to the millisecond UNIX timestamp of the end time configured in the &quot;Scan Configuration &gt; Time Properties &gt; Effective Date&quot; setting for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>4155787800000</p>
             */
            public Builder endEffectDate(Long endEffectDate) {
                this.endEffectDate = endEffectDate;
                return this;
            }

            /**
             * <p>Schedule Configuration &gt; Previous Cycle &gt; Whether to ignore the upstream dry-run property.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreParentSkipRunningProperty(String ignoreParentSkipRunningProperty) {
                this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
                return this;
            }

            /**
             * <p>Custom image ID</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1h4b5a8ogkbll2f3tr</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Information about outputs from upstream files on which this file depends.</p>
             */
            public Builder inputList(java.util.List<InputList> inputList) {
                this.inputList = inputList;
                return this;
            }

            /**
             * <p>Return Result.</p>
             */
            public Builder inputParameters(java.util.List<InputParameters> inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            /**
             * <p>Output information of the file.</p>
             */
            public Builder outputList(java.util.List<OutputList> outputList) {
                this.outputList = outputList;
                return this;
            }

            /**
             * <p>Return Result.</p>
             */
            public Builder outputParameters(java.util.List<OutputParameters> outputParameters) {
                this.outputParameters = outputParameters;
                return this;
            }

            /**
             * <p>Schedule parameter.</p>
             * <p>This parameter corresponds to the &quot;Scan Configuration &gt; Parameters&quot; setting for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. You can refer to the <a href="https://help.aliyun.com/document_detail/137548.html">Schedule Parameters</a> documentation for configuration details.</p>
             * 
             * <strong>example:</strong>
             * <p>a=x b=y</p>
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            /**
             * <p>Rerun property. Valid values:</p>
             * <ul>
             * <li><p>ALL_ALLOWED: The job can be rerun regardless of whether it previously Succeeded or failed.</p>
             * </li>
             * <li><p>FAILURE_ALLOWED: The job cannot be rerun if it previously Succeeded, but can be rerun if it previously failed.</p>
             * </li>
             * <li><p>ALL_DENIED: The job cannot be rerun regardless of whether it previously Succeeded or failed.</p>
             * </li>
             * </ul>
             * <p>This parameter corresponds to the &quot;Scan Configuration &gt; Time Properties &gt; Rerun Property&quot; setting for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL_ALLOWED</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The resource group used when the file is published as a Job and executed. You can call <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> to obtain the list of available resource groups in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>375827434852437</p>
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The schedule type. Valid values:</p>
             * <ul>
             * <li><p>NORMAL: Normal scheduling task.</p>
             * </li>
             * <li><p>MANUAL: One-time task, which is not included in regular scheduling and corresponds to a node in a manually triggered workflow.</p>
             * </li>
             * <li><p>PAUSE: Paused task.</p>
             * </li>
             * <li><p>SKIP: Dry-run task, which is included in regular scheduling but is immediately marked as Succeeded when scheduled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The UNIX timestamp (in milliseconds) indicating when automatic scheduling starts.</p>
             * <p>This parameter corresponds to the start time (as a UNIX timestamp in milliseconds) configured under &quot;Schedule Configuration &gt; Time Properties &gt; Effective Date&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>936923400000</p>
             */
            public Builder startEffectDate(Long startEffectDate) {
                this.startEffectDate = startEffectDate;
                return this;
            }

            /**
             * <p>Indicates whether to start immediately after publishing.</p>
             * <p>This parameter corresponds to the &quot;Start Method&quot; setting under &quot;Configuration &gt; Time Properties&quot; in the right-side navigation bar on the editing page for EMR Spark Streaming and EMR Streaming SQL Data Development jobs in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder startImmediately(Boolean startImmediately) {
                this.startImmediately = startImmediately;
                return this;
            }

            /**
             * <p>Indicates whether to skip execution. Valid values:</p>
             * <ul>
             * <li><p>true: Skip execution.</p>
             * </li>
             * <li><p>false: Do not skip execution.</p>
             * </li>
             * </ul>
             * <p>This parameter corresponds to the setting &quot;Schedule Type&quot; under &quot;Schedule Configuration &gt; Time Properties&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, when it is set to &quot;skip execution&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stop(Boolean stop) {
                this.stop = stop;
                return this;
            }

            /**
             * <p>Timeout definition for scheduling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public NodeConfiguration build() {
                return new NodeConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class ResourceDownloadLink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("downloadLink")
        private String downloadLink;

        private ResourceDownloadLink(Builder builder) {
            this.downloadLink = builder.downloadLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDownloadLink create() {
            return builder().build();
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public static final class Builder {
            private String downloadLink; 

            private Builder() {
            } 

            private Builder(ResourceDownloadLink model) {
                this.downloadLink = model.downloadLink;
            } 

            /**
             * <p>Link for downloading the resource.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xx">http://xx</a></p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            public ResourceDownloadLink build() {
                return new ResourceDownloadLink(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("File")
        private File file;

        @com.aliyun.core.annotation.NameInMap("NodeConfiguration")
        private NodeConfiguration nodeConfiguration;

        @com.aliyun.core.annotation.NameInMap("ResourceDownloadLink")
        private ResourceDownloadLink resourceDownloadLink;

        private Data(Builder builder) {
            this.file = builder.file;
            this.nodeConfiguration = builder.nodeConfiguration;
            this.resourceDownloadLink = builder.resourceDownloadLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return file
         */
        public File getFile() {
            return this.file;
        }

        /**
         * @return nodeConfiguration
         */
        public NodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        /**
         * @return resourceDownloadLink
         */
        public ResourceDownloadLink getResourceDownloadLink() {
            return this.resourceDownloadLink;
        }

        public static final class Builder {
            private File file; 
            private NodeConfiguration nodeConfiguration; 
            private ResourceDownloadLink resourceDownloadLink; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.file = model.file;
                this.nodeConfiguration = model.nodeConfiguration;
                this.resourceDownloadLink = model.resourceDownloadLink;
            } 

            /**
             * <p>Basic information about the file.</p>
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The schedule configuration of the file.</p>
             */
            public Builder nodeConfiguration(NodeConfiguration nodeConfiguration) {
                this.nodeConfiguration = nodeConfiguration;
                return this;
            }

            /**
             * <p>Resource download link.</p>
             */
            public Builder resourceDownloadLink(ResourceDownloadLink resourceDownloadLink) {
                this.resourceDownloadLink = resourceDownloadLink;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
