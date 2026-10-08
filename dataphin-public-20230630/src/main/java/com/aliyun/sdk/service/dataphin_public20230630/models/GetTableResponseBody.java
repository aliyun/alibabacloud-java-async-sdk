// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetTableResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableResponseBody</p>
 */
public class GetTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTableResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTableResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTableResponseBody build() {
            return new GetTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableResponseBody</p>
     */
    public static class Instructions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerNickName")
        private String ownerNickName;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Instructions(Builder builder) {
            this.content = builder.content;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ownerId = builder.ownerId;
            this.ownerNickName = builder.ownerNickName;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instructions create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerNickName
         */
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String gmtCreate; 
            private String gmtModified; 
            private String ownerId; 
            private String ownerNickName; 
            private String title; 

            private Builder() {
            } 

            private Builder(Instructions model) {
                this.content = model.content;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ownerId = model.ownerId;
                this.ownerNickName = model.ownerNickName;
                this.title = model.title;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * OwnerNickName.
             */
            public Builder ownerNickName(String ownerNickName) {
                this.ownerNickName = ownerNickName;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Instructions build() {
                return new Instructions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableResponseBody</p>
     */
    public static class BizUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitDisplayName")
        private String bizUnitDisplayName;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private String bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        private BizUnit(Builder builder) {
            this.bizUnitDisplayName = builder.bizUnitDisplayName;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizUnit create() {
            return builder().build();
        }

        /**
         * @return bizUnitDisplayName
         */
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        /**
         * @return bizUnitId
         */
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public static final class Builder {
            private String bizUnitDisplayName; 
            private String bizUnitId; 
            private String bizUnitName; 

            private Builder() {
            } 

            private Builder(BizUnit model) {
                this.bizUnitDisplayName = model.bizUnitDisplayName;
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
            } 

            /**
             * BizUnitDisplayName.
             */
            public Builder bizUnitDisplayName(String bizUnitDisplayName) {
                this.bizUnitDisplayName = bizUnitDisplayName;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(String bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            public BizUnit build() {
                return new BizUnit(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableResponseBody</p>
     */
    public static class Owners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Owners(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owners create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Owners model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Owners build() {
                return new Owners(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectDisplayName")
        private String projectDisplayName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private Project(Builder builder) {
            this.projectDisplayName = builder.projectDisplayName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return projectDisplayName
         */
        public String getProjectDisplayName() {
            return this.projectDisplayName;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String projectDisplayName; 
            private String projectId; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.projectDisplayName = model.projectDisplayName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
            } 

            /**
             * ProjectDisplayName.
             */
            public Builder projectDisplayName(String projectDisplayName) {
                this.projectDisplayName = projectDisplayName;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableResponseBody</p>
     */
    public static class SimpleNodeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnit")
        private BizUnit bizUnit;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeScheduleType")
        private String nodeScheduleType;

        @com.aliyun.core.annotation.NameInMap("Owners")
        private java.util.List<Owners> owners;

        @com.aliyun.core.annotation.NameInMap("Project")
        private Project project;

        @com.aliyun.core.annotation.NameInMap("SubBizType")
        private String subBizType;

        private SimpleNodeInfos(Builder builder) {
            this.bizUnit = builder.bizUnit;
            this.env = builder.env;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeScheduleType = builder.nodeScheduleType;
            this.owners = builder.owners;
            this.project = builder.project;
            this.subBizType = builder.subBizType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleNodeInfos create() {
            return builder().build();
        }

        /**
         * @return bizUnit
         */
        public BizUnit getBizUnit() {
            return this.bizUnit;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeScheduleType
         */
        public String getNodeScheduleType() {
            return this.nodeScheduleType;
        }

        /**
         * @return owners
         */
        public java.util.List<Owners> getOwners() {
            return this.owners;
        }

        /**
         * @return project
         */
        public Project getProject() {
            return this.project;
        }

        /**
         * @return subBizType
         */
        public String getSubBizType() {
            return this.subBizType;
        }

        public static final class Builder {
            private BizUnit bizUnit; 
            private String env; 
            private String nodeId; 
            private String nodeName; 
            private String nodeScheduleType; 
            private java.util.List<Owners> owners; 
            private Project project; 
            private String subBizType; 

            private Builder() {
            } 

            private Builder(SimpleNodeInfos model) {
                this.bizUnit = model.bizUnit;
                this.env = model.env;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeScheduleType = model.nodeScheduleType;
                this.owners = model.owners;
                this.project = model.project;
                this.subBizType = model.subBizType;
            } 

            /**
             * BizUnit.
             */
            public Builder bizUnit(BizUnit bizUnit) {
                this.bizUnit = bizUnit;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeScheduleType.
             */
            public Builder nodeScheduleType(String nodeScheduleType) {
                this.nodeScheduleType = nodeScheduleType;
                return this;
            }

            /**
             * Owners.
             */
            public Builder owners(java.util.List<Owners> owners) {
                this.owners = owners;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(Project project) {
                this.project = project;
                return this;
            }

            /**
             * SubBizType.
             */
            public Builder subBizType(String subBizType) {
                this.subBizType = subBizType;
                return this;
            }

            public SimpleNodeInfos build() {
                return new SimpleNodeInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableResponseBody</p>
     */
    public static class StreamTableConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private StreamTableConfig(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamTableConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(StreamTableConfig model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public StreamTableConfig build() {
                return new StreamTableConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetTags")
        private java.util.List<String> assetTags;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataDomainId")
        private Long dataDomainId;

        @com.aliyun.core.annotation.NameInMap("DataDomainName")
        private String dataDomainName;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Instructions")
        private java.util.List<Instructions> instructions;

        @com.aliyun.core.annotation.NameInMap("IsBasicMode")
        private Boolean isBasicMode;

        @com.aliyun.core.annotation.NameInMap("IsPartitionTable")
        private Boolean isPartitionTable;

        @com.aliyun.core.annotation.NameInMap("LastDdlTime")
        private String lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("LastDmlTime")
        private String lastDmlTime;

        @com.aliyun.core.annotation.NameInMap("LastQueryTime")
        private String lastQueryTime;

        @com.aliyun.core.annotation.NameInMap("LifeCycle")
        private Long lifeCycle;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private java.util.List<String> nodeIds;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParentModelId")
        private String parentModelId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Long securityLevel;

        @com.aliyun.core.annotation.NameInMap("SecurityLevelAbbreviation")
        private String securityLevelAbbreviation;

        @com.aliyun.core.annotation.NameInMap("SecurityLevelName")
        private String securityLevelName;

        @com.aliyun.core.annotation.NameInMap("SimpleNodeInfos")
        private java.util.List<SimpleNodeInfos> simpleNodeInfos;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StreamTableConfig")
        private java.util.List<StreamTableConfig> streamTableConfig;

        @com.aliyun.core.annotation.NameInMap("TableSizeInBytes")
        private Long tableSizeInBytes;

        @com.aliyun.core.annotation.NameInMap("VisitCount30d")
        private Long visitCount30d;

        private Data(Builder builder) {
            this.assetTags = builder.assetTags;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.dataDomainId = builder.dataDomainId;
            this.dataDomainName = builder.dataDomainName;
            this.dataSourceId = builder.dataSourceId;
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.fileId = builder.fileId;
            this.guid = builder.guid;
            this.instructions = builder.instructions;
            this.isBasicMode = builder.isBasicMode;
            this.isPartitionTable = builder.isPartitionTable;
            this.lastDdlTime = builder.lastDdlTime;
            this.lastDmlTime = builder.lastDmlTime;
            this.lastQueryTime = builder.lastQueryTime;
            this.lifeCycle = builder.lifeCycle;
            this.name = builder.name;
            this.nodeIds = builder.nodeIds;
            this.owner = builder.owner;
            this.parentModelId = builder.parentModelId;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.securityLevel = builder.securityLevel;
            this.securityLevelAbbreviation = builder.securityLevelAbbreviation;
            this.securityLevelName = builder.securityLevelName;
            this.simpleNodeInfos = builder.simpleNodeInfos;
            this.storageType = builder.storageType;
            this.streamTableConfig = builder.streamTableConfig;
            this.tableSizeInBytes = builder.tableSizeInBytes;
            this.visitCount30d = builder.visitCount30d;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetTags
         */
        public java.util.List<String> getAssetTags() {
            return this.assetTags;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataDomainId
         */
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        /**
         * @return dataDomainName
         */
        public String getDataDomainName() {
            return this.dataDomainName;
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return instructions
         */
        public java.util.List<Instructions> getInstructions() {
            return this.instructions;
        }

        /**
         * @return isBasicMode
         */
        public Boolean getIsBasicMode() {
            return this.isBasicMode;
        }

        /**
         * @return isPartitionTable
         */
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        /**
         * @return lastDdlTime
         */
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return lastDmlTime
         */
        public String getLastDmlTime() {
            return this.lastDmlTime;
        }

        /**
         * @return lastQueryTime
         */
        public String getLastQueryTime() {
            return this.lastQueryTime;
        }

        /**
         * @return lifeCycle
         */
        public Long getLifeCycle() {
            return this.lifeCycle;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeIds
         */
        public java.util.List<String> getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parentModelId
         */
        public String getParentModelId() {
            return this.parentModelId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return securityLevel
         */
        public Long getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return securityLevelAbbreviation
         */
        public String getSecurityLevelAbbreviation() {
            return this.securityLevelAbbreviation;
        }

        /**
         * @return securityLevelName
         */
        public String getSecurityLevelName() {
            return this.securityLevelName;
        }

        /**
         * @return simpleNodeInfos
         */
        public java.util.List<SimpleNodeInfos> getSimpleNodeInfos() {
            return this.simpleNodeInfos;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return streamTableConfig
         */
        public java.util.List<StreamTableConfig> getStreamTableConfig() {
            return this.streamTableConfig;
        }

        /**
         * @return tableSizeInBytes
         */
        public Long getTableSizeInBytes() {
            return this.tableSizeInBytes;
        }

        /**
         * @return visitCount30d
         */
        public Long getVisitCount30d() {
            return this.visitCount30d;
        }

        public static final class Builder {
            private java.util.List<String> assetTags; 
            private Long bizUnitId; 
            private String bizUnitName; 
            private String comment; 
            private String createTime; 
            private String creator; 
            private Long dataDomainId; 
            private String dataDomainName; 
            private Long dataSourceId; 
            private String displayName; 
            private String env; 
            private String fileId; 
            private String guid; 
            private java.util.List<Instructions> instructions; 
            private Boolean isBasicMode; 
            private Boolean isPartitionTable; 
            private String lastDdlTime; 
            private String lastDmlTime; 
            private String lastQueryTime; 
            private Long lifeCycle; 
            private String name; 
            private java.util.List<String> nodeIds; 
            private String owner; 
            private String parentModelId; 
            private Long projectId; 
            private String projectName; 
            private Long securityLevel; 
            private String securityLevelAbbreviation; 
            private String securityLevelName; 
            private java.util.List<SimpleNodeInfos> simpleNodeInfos; 
            private String storageType; 
            private java.util.List<StreamTableConfig> streamTableConfig; 
            private Long tableSizeInBytes; 
            private Long visitCount30d; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetTags = model.assetTags;
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.dataDomainId = model.dataDomainId;
                this.dataDomainName = model.dataDomainName;
                this.dataSourceId = model.dataSourceId;
                this.displayName = model.displayName;
                this.env = model.env;
                this.fileId = model.fileId;
                this.guid = model.guid;
                this.instructions = model.instructions;
                this.isBasicMode = model.isBasicMode;
                this.isPartitionTable = model.isPartitionTable;
                this.lastDdlTime = model.lastDdlTime;
                this.lastDmlTime = model.lastDmlTime;
                this.lastQueryTime = model.lastQueryTime;
                this.lifeCycle = model.lifeCycle;
                this.name = model.name;
                this.nodeIds = model.nodeIds;
                this.owner = model.owner;
                this.parentModelId = model.parentModelId;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.securityLevel = model.securityLevel;
                this.securityLevelAbbreviation = model.securityLevelAbbreviation;
                this.securityLevelName = model.securityLevelName;
                this.simpleNodeInfos = model.simpleNodeInfos;
                this.storageType = model.storageType;
                this.streamTableConfig = model.streamTableConfig;
                this.tableSizeInBytes = model.tableSizeInBytes;
                this.visitCount30d = model.visitCount30d;
            } 

            /**
             * AssetTags.
             */
            public Builder assetTags(java.util.List<String> assetTags) {
                this.assetTags = assetTags;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DataDomainId.
             */
            public Builder dataDomainId(Long dataDomainId) {
                this.dataDomainId = dataDomainId;
                return this;
            }

            /**
             * DataDomainName.
             */
            public Builder dataDomainName(String dataDomainName) {
                this.dataDomainName = dataDomainName;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * Instructions.
             */
            public Builder instructions(java.util.List<Instructions> instructions) {
                this.instructions = instructions;
                return this;
            }

            /**
             * IsBasicMode.
             */
            public Builder isBasicMode(Boolean isBasicMode) {
                this.isBasicMode = isBasicMode;
                return this;
            }

            /**
             * IsPartitionTable.
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * LastDdlTime.
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * LastDmlTime.
             */
            public Builder lastDmlTime(String lastDmlTime) {
                this.lastDmlTime = lastDmlTime;
                return this;
            }

            /**
             * LastQueryTime.
             */
            public Builder lastQueryTime(String lastQueryTime) {
                this.lastQueryTime = lastQueryTime;
                return this;
            }

            /**
             * LifeCycle.
             */
            public Builder lifeCycle(Long lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeIds.
             */
            public Builder nodeIds(java.util.List<String> nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ParentModelId.
             */
            public Builder parentModelId(String parentModelId) {
                this.parentModelId = parentModelId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(Long securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * SecurityLevelAbbreviation.
             */
            public Builder securityLevelAbbreviation(String securityLevelAbbreviation) {
                this.securityLevelAbbreviation = securityLevelAbbreviation;
                return this;
            }

            /**
             * SecurityLevelName.
             */
            public Builder securityLevelName(String securityLevelName) {
                this.securityLevelName = securityLevelName;
                return this;
            }

            /**
             * SimpleNodeInfos.
             */
            public Builder simpleNodeInfos(java.util.List<SimpleNodeInfos> simpleNodeInfos) {
                this.simpleNodeInfos = simpleNodeInfos;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * StreamTableConfig.
             */
            public Builder streamTableConfig(java.util.List<StreamTableConfig> streamTableConfig) {
                this.streamTableConfig = streamTableConfig;
                return this;
            }

            /**
             * TableSizeInBytes.
             */
            public Builder tableSizeInBytes(Long tableSizeInBytes) {
                this.tableSizeInBytes = tableSizeInBytes;
                return this;
            }

            /**
             * VisitCount30d.
             */
            public Builder visitCount30d(Long visitCount30d) {
                this.visitCount30d = visitCount30d;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
