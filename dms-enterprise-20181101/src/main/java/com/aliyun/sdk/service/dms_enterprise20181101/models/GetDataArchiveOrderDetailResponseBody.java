// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataArchiveOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataArchiveOrderDetailResponseBody</p>
 */
public class GetDataArchiveOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataArchiveOrderDetail")
    private DataArchiveOrderDetail dataArchiveOrderDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private GetDataArchiveOrderDetailResponseBody(Builder builder) {
        this.dataArchiveOrderDetail = builder.dataArchiveOrderDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataArchiveOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataArchiveOrderDetail
     */
    public DataArchiveOrderDetail getDataArchiveOrderDetail() {
        return this.dataArchiveOrderDetail;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private DataArchiveOrderDetail dataArchiveOrderDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The details of data archiving tickets.
         */
        public Builder dataArchiveOrderDetail(DataArchiveOrderDetail dataArchiveOrderDetail) {
            this.dataArchiveOrderDetail = dataArchiveOrderDetail;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message that is returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request, which is used to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tracks service requests.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetDataArchiveOrderDetailResponseBody build() {
            return new GetDataArchiveOrderDetailResponseBody(this);
        } 

    } 

    public static class DagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CronBeginDate")
        private String cronBeginDate;

        @com.aliyun.core.annotation.NameInMap("CronEndDate")
        private String cronEndDate;

        @com.aliyun.core.annotation.NameInMap("CronTrigger")
        private Boolean cronTrigger;

        @com.aliyun.core.annotation.NameInMap("DWDevelop")
        private Boolean DWDevelop;

        @com.aliyun.core.annotation.NameInMap("DagName")
        private String dagName;

        @com.aliyun.core.annotation.NameInMap("DagOwnerId")
        private String dagOwnerId;

        @com.aliyun.core.annotation.NameInMap("DeployId")
        private Long deployId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EditDagId")
        private Long editDagId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsPublic")
        private Long isPublic;

        @com.aliyun.core.annotation.NameInMap("Legacy")
        private Boolean legacy;

        @com.aliyun.core.annotation.NameInMap("System")
        private Boolean system;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TriggerOnce")
        private Boolean triggerOnce;

        private DagInfo(Builder builder) {
            this.creatorId = builder.creatorId;
            this.cronBeginDate = builder.cronBeginDate;
            this.cronEndDate = builder.cronEndDate;
            this.cronTrigger = builder.cronTrigger;
            this.DWDevelop = builder.DWDevelop;
            this.dagName = builder.dagName;
            this.dagOwnerId = builder.dagOwnerId;
            this.deployId = builder.deployId;
            this.description = builder.description;
            this.editDagId = builder.editDagId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isPublic = builder.isPublic;
            this.legacy = builder.legacy;
            this.system = builder.system;
            this.tenantId = builder.tenantId;
            this.triggerOnce = builder.triggerOnce;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagInfo create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return cronBeginDate
         */
        public String getCronBeginDate() {
            return this.cronBeginDate;
        }

        /**
         * @return cronEndDate
         */
        public String getCronEndDate() {
            return this.cronEndDate;
        }

        /**
         * @return cronTrigger
         */
        public Boolean getCronTrigger() {
            return this.cronTrigger;
        }

        /**
         * @return DWDevelop
         */
        public Boolean getDWDevelop() {
            return this.DWDevelop;
        }

        /**
         * @return dagName
         */
        public String getDagName() {
            return this.dagName;
        }

        /**
         * @return dagOwnerId
         */
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        /**
         * @return deployId
         */
        public Long getDeployId() {
            return this.deployId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return editDagId
         */
        public Long getEditDagId() {
            return this.editDagId;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isPublic
         */
        public Long getIsPublic() {
            return this.isPublic;
        }

        /**
         * @return legacy
         */
        public Boolean getLegacy() {
            return this.legacy;
        }

        /**
         * @return system
         */
        public Boolean getSystem() {
            return this.system;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return triggerOnce
         */
        public Boolean getTriggerOnce() {
            return this.triggerOnce;
        }

        public static final class Builder {
            private String creatorId; 
            private String cronBeginDate; 
            private String cronEndDate; 
            private Boolean cronTrigger; 
            private Boolean DWDevelop; 
            private String dagName; 
            private String dagOwnerId; 
            private Long deployId; 
            private String description; 
            private Long editDagId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long isPublic; 
            private Boolean legacy; 
            private Boolean system; 
            private String tenantId; 
            private Boolean triggerOnce; 

            /**
             * The ID of the user who created the task flow.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The start time for scheduling. The task flow is not scheduled before this point in time.
             */
            public Builder cronBeginDate(String cronBeginDate) {
                this.cronBeginDate = cronBeginDate;
                return this;
            }

            /**
             * The end time for scheduling. The task flow is not scheduled after this point in time.
             */
            public Builder cronEndDate(String cronEndDate) {
                this.cronEndDate = cronEndDate;
                return this;
            }

            /**
             * Indicates whether the archiving task is a scheduled task. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder cronTrigger(Boolean cronTrigger) {
                this.cronTrigger = cronTrigger;
                return this;
            }

            /**
             * Indicates whether the task is used to develop warehouses.
             * <p>
             * 
             * >  This field is a retained field that is not in use.
             */
            public Builder DWDevelop(Boolean DWDevelop) {
                this.DWDevelop = DWDevelop;
                return this;
            }

            /**
             * The name of the workflow.
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * The ID of the owner of the workflow.
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * The ID of the deployment record.
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * The description of the workflow.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the editable workflow version.
             */
            public Builder editDagId(Long editDagId) {
                this.editDagId = editDagId;
                return this;
            }

            /**
             * The time when the workflow was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the workflow was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the task flow.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the workflow is public. Valid values:
             * <p>
             * 
             * *   **0**: not public.
             * *   **1**: public.
             */
            public Builder isPublic(Long isPublic) {
                this.isPublic = isPublic;
                return this;
            }

            /**
             * Indicates whether the task is a historical task. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder legacy(Boolean legacy) {
                this.legacy = legacy;
                return this;
            }

            /**
             * Indicates whether the task was created by the system. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Indicates whether the workflow is triggered to run once. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder triggerOnce(Boolean triggerOnce) {
                this.triggerOnce = triggerOnce;
                return this;
            }

            public DagInfo build() {
                return new DagInfo(this);
            } 

        } 

    }
    public static class StandardGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FreeOrStable")
        private Boolean freeOrStable;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupMode")
        private String groupMode;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastMenderId")
        private Long lastMenderId;

        private StandardGroup(Builder builder) {
            this.dbType = builder.dbType;
            this.description = builder.description;
            this.freeOrStable = builder.freeOrStable;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupMode = builder.groupMode;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.lastMenderId = builder.lastMenderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardGroup create() {
            return builder().build();
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return freeOrStable
         */
        public Boolean getFreeOrStable() {
            return this.freeOrStable;
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
         * @return groupMode
         */
        public String getGroupMode() {
            return this.groupMode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastMenderId
         */
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

        public static final class Builder {
            private String dbType; 
            private String description; 
            private Boolean freeOrStable; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupMode; 
            private String groupName; 
            private Long id; 
            private Long lastMenderId; 

            /**
             * The type of the instance engine. For information about the valid values of this parameter, see [DbType parameter](~~198106~~).
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The description of the security rule set.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the instance is managed in Flexible Management or Stable Change mode. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder freeOrStable(Boolean freeOrStable) {
                this.freeOrStable = freeOrStable;
                return this;
            }

            /**
             * The time when the security rule was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the security rule was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The type of the control mode of the instance. Valid values:
             * <p>
             * 
             * *   **COMMON**: The instance is managed in Security Collaboration mode.
             * *   **NONE_CONTROL**: The instance is managed in Flexible Management mode.
             * *   **STABLE**: The instance is managed in Stable Change mode.
             */
            public Builder groupMode(String groupMode) {
                this.groupMode = groupMode;
                return this;
            }

            /**
             * The name of the security rule that corresponds to the control mode.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The ID of the security rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The user ID of the last modified security rule.
             */
            public Builder lastMenderId(Long lastMenderId) {
                this.lastMenderId = lastMenderId;
                return this;
            }

            public StandardGroup build() {
                return new StandardGroup(this);
            } 

        } 

    }
    public static class DbBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AlterTimeout")
        private Long alterTimeout;

        @com.aliyun.core.annotation.NameInMap("AssetControl")
        private Boolean assetControl;

        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("ClusterNode")
        private String clusterNode;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DbaId")
        private Long dbaId;

        @com.aliyun.core.annotation.NameInMap("DbaName")
        private String dbaName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Follow")
        private Boolean follow;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Idc")
        private String idc;

        @com.aliyun.core.annotation.NameInMap("IdcTitle")
        private String idcTitle;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSource")
        private String instanceSource;

        @com.aliyun.core.annotation.NameInMap("LastSyncTime")
        private String lastSyncTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List < Long > ownerIds;

        @com.aliyun.core.annotation.NameInMap("OwnerNames")
        private java.util.List < String > ownerNames;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("StandardGroup")
        private StandardGroup standardGroup;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private Long tableCount;

        @com.aliyun.core.annotation.NameInMap("TnsName")
        private String tnsName;

        @com.aliyun.core.annotation.NameInMap("UnitType")
        private String unitType;

        private DbBaseInfo(Builder builder) {
            this.alias = builder.alias;
            this.alterTimeout = builder.alterTimeout;
            this.assetControl = builder.assetControl;
            this.catalogName = builder.catalogName;
            this.clusterNode = builder.clusterNode;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.dbaId = builder.dbaId;
            this.dbaName = builder.dbaName;
            this.description = builder.description;
            this.encoding = builder.encoding;
            this.envType = builder.envType;
            this.follow = builder.follow;
            this.host = builder.host;
            this.idc = builder.idc;
            this.idcTitle = builder.idcTitle;
            this.instanceId = builder.instanceId;
            this.instanceSource = builder.instanceSource;
            this.lastSyncTime = builder.lastSyncTime;
            this.level = builder.level;
            this.logic = builder.logic;
            this.ownerIds = builder.ownerIds;
            this.ownerNames = builder.ownerNames;
            this.port = builder.port;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.standardGroup = builder.standardGroup;
            this.state = builder.state;
            this.tableCount = builder.tableCount;
            this.tnsName = builder.tnsName;
            this.unitType = builder.unitType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbBaseInfo create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return alterTimeout
         */
        public Long getAlterTimeout() {
            return this.alterTimeout;
        }

        /**
         * @return assetControl
         */
        public Boolean getAssetControl() {
            return this.assetControl;
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return clusterNode
         */
        public String getClusterNode() {
            return this.clusterNode;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return dbaId
         */
        public Long getDbaId() {
            return this.dbaId;
        }

        /**
         * @return dbaName
         */
        public String getDbaName() {
            return this.dbaName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return follow
         */
        public Boolean getFollow() {
            return this.follow;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return idc
         */
        public String getIdc() {
            return this.idc;
        }

        /**
         * @return idcTitle
         */
        public String getIdcTitle() {
            return this.idcTitle;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceSource
         */
        public String getInstanceSource() {
            return this.instanceSource;
        }

        /**
         * @return lastSyncTime
         */
        public String getLastSyncTime() {
            return this.lastSyncTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return ownerIds
         */
        public java.util.List < Long > getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return ownerNames
         */
        public java.util.List < String > getOwnerNames() {
            return this.ownerNames;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return standardGroup
         */
        public StandardGroup getStandardGroup() {
            return this.standardGroup;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tableCount
         */
        public Long getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tnsName
         */
        public String getTnsName() {
            return this.tnsName;
        }

        /**
         * @return unitType
         */
        public String getUnitType() {
            return this.unitType;
        }

        public static final class Builder {
            private String alias; 
            private Long alterTimeout; 
            private Boolean assetControl; 
            private String catalogName; 
            private String clusterNode; 
            private Long dbId; 
            private String dbType; 
            private Long dbaId; 
            private String dbaName; 
            private String description; 
            private String encoding; 
            private String envType; 
            private Boolean follow; 
            private String host; 
            private String idc; 
            private String idcTitle; 
            private Long instanceId; 
            private String instanceSource; 
            private String lastSyncTime; 
            private String level; 
            private Boolean logic; 
            private java.util.List < Long > ownerIds; 
            private java.util.List < String > ownerNames; 
            private Long port; 
            private String schemaName; 
            private String searchName; 
            private StandardGroup standardGroup; 
            private String state; 
            private Long tableCount; 
            private String tnsName; 
            private String unitType; 

            /**
             * The alias of the database instance.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The timeout period of queries on the database.
             */
            public Builder alterTimeout(Long alterTimeout) {
                this.alterTimeout = alterTimeout;
                return this;
            }

            /**
             * Indicates whether access control is enabled for data assets. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder assetControl(Boolean assetControl) {
                this.assetControl = assetControl;
                return this;
            }

            /**
             * The name of the instance in the instance list.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * Indicates whether the instance is added to the DMS whitelist.
             */
            public Builder clusterNode(String clusterNode) {
                this.clusterNode = clusterNode;
                return this;
            }

            /**
             * The ID of the database. You can call the [SearchDatabase](~~141876~~) operation to query the ID of the database.
             * <p>
             * 
             * >  You can call the [ListDatabases](~~141873~~) operation to query the ID of a physical database or the [ListLogicDatabases](~~141874~~) operation to query the ID of a logical database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The type of the database. For information about the valid values of this parameter, see [DbType parameter](~~198106~~).
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The ID of the database administrator (DBA) of the instance.
             */
            public Builder dbaId(Long dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * The nickname of the DBA of the instance.
             */
            public Builder dbaName(String dbaName) {
                this.dbaName = dbaName;
                return this;
            }

            /**
             * The complete endpoint of the database.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The encoding format of the database.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The type of the environment to which the database belongs. Valid values:
             * <p>
             * 
             * *   **product**: production environment
             * *   **dev**: development environment
             * *   **pre**: staging environment
             * *   **test**: test environment
             * *   **sit**: system integration testing (SIT) environment
             * *   **uat**: user acceptance testing (UAT) environment
             * *   **pet**: stress testing environment
             * *   **stag**: STAG environment
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Indicates whether the instance needs special attention. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder follow(Boolean follow) {
                this.follow = follow;
                return this;
            }

            /**
             * The endpoint that is used to connect to the database.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The region in which the database instance resides.
             */
            public Builder idc(String idc) {
                this.idc = idc;
                return this;
            }

            /**
             * The name of the region in which the database instance resides.
             */
            public Builder idcTitle(String idcTitle) {
                this.idcTitle = idcTitle;
                return this;
            }

            /**
             * The ID of the instance to which the database belongs.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The source of the database instance.Valid values:
             * <p>
             * 
             * *   **RDS**: an ApsaraDB RDS instance.
             * *   **ECS_OWN**: a self-managed database deployed on an Elastic Compute Service (ECS) instance.
             * *   **PUBLIC_OWN**: a self-managed database instance that is connected over the Internet.
             * *   **VPC_ID**: a self-managed database instance in a virtual private cloud (VPC) that is connected over Express Connect circuits.
             * *   **GATEWAY**: a database instance connected by using a database gateway.
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * The time when the database information was last obtained.
             */
            public Builder lastSyncTime(String lastSyncTime) {
                this.lastSyncTime = lastSyncTime;
                return this;
            }

            /**
             * The instance level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Indicates whether the database is logical. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The IDs of the owners of the databases, which are stored as an array. You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the IDs of the owners.
             * <p>
             * 
             * >  The value of OwnerIds is the same as the value of UserId
             */
            public Builder ownerIds(java.util.List < Long > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * The usernames of the database owners.
             */
            public Builder ownerNames(java.util.List < String > ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            /**
             * The port that is used to connect to the database.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The details of the control mode of the instance.
             */
            public Builder standardGroup(StandardGroup standardGroup) {
                this.standardGroup = standardGroup;
                return this;
            }

            /**
             * The status of the database. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The database is running as expected.
             * *   **DISABLE**: The database is disabled.
             * *   **OFFLINE**: The database is unpublished.
             * *   **NOT_EXIST**: The database does not exist.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The number of tables.
             */
            public Builder tableCount(Long tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * The name of TNS.
             */
            public Builder tnsName(String tnsName) {
                this.tnsName = tnsName;
                return this;
            }

            /**
             * The unit type.
             */
            public Builder unitType(String unitType) {
                this.unitType = unitType;
                return this;
            }

            public DbBaseInfo build() {
                return new DbBaseInfo(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessTime")
        private String businessTime;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HistoryDagId")
        private Long historyDagId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastRunningContext")
        private String lastRunningContext;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Long triggerType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Instances(Builder builder) {
            this.businessTime = builder.businessTime;
            this.dagId = builder.dagId;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.historyDagId = builder.historyDagId;
            this.id = builder.id;
            this.lastRunningContext = builder.lastRunningContext;
            this.msg = builder.msg;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.triggerType = builder.triggerType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return businessTime
         */
        public String getBusinessTime() {
            return this.businessTime;
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return historyDagId
         */
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastRunningContext
         */
        public String getLastRunningContext() {
            return this.lastRunningContext;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return triggerType
         */
        public Long getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String businessTime; 
            private Long dagId; 
            private String endTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long historyDagId; 
            private Long id; 
            private String lastRunningContext; 
            private String msg; 
            private Long status; 
            private String tenantId; 
            private Long triggerType; 
            private String version; 

            /**
             * The business time of the task flow. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * The task flow ID. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the value of this parameter.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * The time when the task flow ended. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time when the task flow was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the task flow was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the historical task flow.
             */
            public Builder historyDagId(Long historyDagId) {
                this.historyDagId = historyDagId;
                return this;
            }

            /**
             * The ID of the instance in the task flow that is executed.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The context of the previous execution of the task flow.
             */
            public Builder lastRunningContext(String lastRunningContext) {
                this.lastRunningContext = lastRunningContext;
                return this;
            }

            /**
             * The context of the current execution of the task flow.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **0**: The task is waiting for execution.
             * *   **1**: The task is in progress.
             * *   **2**: The task is suspended.
             * *   **3**: The task failed.
             * *   **4**: The task is successful.
             * *   **5**: The task is complete.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The mode in which the task flow was triggered. Valid values:
             * <p>
             * 
             * *   **0**: The task flow was triggered based on a schedule.
             * *   **1**: The task flow was manually triggered.
             */
            public Builder triggerType(Long triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * The version number.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class NextFireTimeResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronFireType")
        private String cronFireType;

        private NextFireTimeResult(Builder builder) {
            this.cronFireType = builder.cronFireType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextFireTimeResult create() {
            return builder().build();
        }

        /**
         * @return cronFireType
         */
        public String getCronFireType() {
            return this.cronFireType;
        }

        public static final class Builder {
            private String cronFireType; 

            /**
             * The type of scheduled triggering.
             */
            public Builder cronFireType(String cronFireType) {
                this.cronFireType = cronFireType;
                return this;
            }

            public NextFireTimeResult build() {
                return new NextFireTimeResult(this);
            } 

        } 

    }
    public static class PluginExtraData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagInfo")
        private DagInfo dagInfo;

        @com.aliyun.core.annotation.NameInMap("DbBaseInfo")
        private DbBaseInfo dbBaseInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceTotal")
        private Long instanceTotal;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < Instances> instances;

        @com.aliyun.core.annotation.NameInMap("NextFireTimeResult")
        private NextFireTimeResult nextFireTimeResult;

        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Long pageIndex;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TempTableNameMap")
        private java.util.Map < String, ? > tempTableNameMap;

        private PluginExtraData(Builder builder) {
            this.dagInfo = builder.dagInfo;
            this.dbBaseInfo = builder.dbBaseInfo;
            this.instanceTotal = builder.instanceTotal;
            this.instances = builder.instances;
            this.nextFireTimeResult = builder.nextFireTimeResult;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.tempTableNameMap = builder.tempTableNameMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginExtraData create() {
            return builder().build();
        }

        /**
         * @return dagInfo
         */
        public DagInfo getDagInfo() {
            return this.dagInfo;
        }

        /**
         * @return dbBaseInfo
         */
        public DbBaseInfo getDbBaseInfo() {
            return this.dbBaseInfo;
        }

        /**
         * @return instanceTotal
         */
        public Long getInstanceTotal() {
            return this.instanceTotal;
        }

        /**
         * @return instances
         */
        public java.util.List < Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return nextFireTimeResult
         */
        public NextFireTimeResult getNextFireTimeResult() {
            return this.nextFireTimeResult;
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return tempTableNameMap
         */
        public java.util.Map < String, ? > getTempTableNameMap() {
            return this.tempTableNameMap;
        }

        public static final class Builder {
            private DagInfo dagInfo; 
            private DbBaseInfo dbBaseInfo; 
            private Long instanceTotal; 
            private java.util.List < Instances> instances; 
            private NextFireTimeResult nextFireTimeResult; 
            private Long pageIndex; 
            private Long pageSize; 
            private java.util.Map < String, ? > tempTableNameMap; 

            /**
             * The information about the workflow.
             */
            public Builder dagInfo(DagInfo dagInfo) {
                this.dagInfo = dagInfo;
                return this;
            }

            /**
             * The database information related to data archiving tickets.
             */
            public Builder dbBaseInfo(DbBaseInfo dbBaseInfo) {
                this.dbBaseInfo = dbBaseInfo;
                return this;
            }

            /**
             * The total number of archiving tasks.
             */
            public Builder instanceTotal(Long instanceTotal) {
                this.instanceTotal = instanceTotal;
                return this;
            }

            /**
             * The list of archiving tasks.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The time when the next task is triggered.
             */
            public Builder nextFireTimeResult(NextFireTimeResult nextFireTimeResult) {
                this.nextFireTimeResult = nextFireTimeResult;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The name of the temporary table that is generated by the archiving task (indicated by the archiving task ID).
             */
            public Builder tempTableNameMap(java.util.Map < String, ? > tempTableNameMap) {
                this.tempTableNameMap = tempTableNameMap;
                return this;
            }

            public PluginExtraData build() {
                return new PluginExtraData(this);
            } 

        } 

    }
    public static class TableIncludes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableWhere")
        private String tableWhere;

        private TableIncludes(Builder builder) {
            this.tableName = builder.tableName;
            this.tableWhere = builder.tableWhere;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableIncludes create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableWhere
         */
        public String getTableWhere() {
            return this.tableWhere;
        }

        public static final class Builder {
            private String tableName; 
            private String tableWhere; 

            /**
             * The table name.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The filter condition.
             */
            public Builder tableWhere(String tableWhere) {
                this.tableWhere = tableWhere;
                return this;
            }

            public TableIncludes build() {
                return new TableIncludes(this);
            } 

        } 

    }
    public static class PluginParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveMethod")
        private String archiveMethod;

        @com.aliyun.core.annotation.NameInMap("DbSchema")
        private String dbSchema;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OrderAfter")
        private java.util.List < String > orderAfter;

        @com.aliyun.core.annotation.NameInMap("RunMethod")
        private String runMethod;

        @com.aliyun.core.annotation.NameInMap("SourceDatabaseId")
        private Long sourceDatabaseId;

        @com.aliyun.core.annotation.NameInMap("TableIncludes")
        private java.util.List < TableIncludes> tableIncludes;

        @com.aliyun.core.annotation.NameInMap("TableMapping")
        private java.util.List < String > tableMapping;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List < String > variables;

        private PluginParam(Builder builder) {
            this.archiveMethod = builder.archiveMethod;
            this.dbSchema = builder.dbSchema;
            this.logic = builder.logic;
            this.orderAfter = builder.orderAfter;
            this.runMethod = builder.runMethod;
            this.sourceDatabaseId = builder.sourceDatabaseId;
            this.tableIncludes = builder.tableIncludes;
            this.tableMapping = builder.tableMapping;
            this.targetInstanceId = builder.targetInstanceId;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginParam create() {
            return builder().build();
        }

        /**
         * @return archiveMethod
         */
        public String getArchiveMethod() {
            return this.archiveMethod;
        }

        /**
         * @return dbSchema
         */
        public String getDbSchema() {
            return this.dbSchema;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return orderAfter
         */
        public java.util.List < String > getOrderAfter() {
            return this.orderAfter;
        }

        /**
         * @return runMethod
         */
        public String getRunMethod() {
            return this.runMethod;
        }

        /**
         * @return sourceDatabaseId
         */
        public Long getSourceDatabaseId() {
            return this.sourceDatabaseId;
        }

        /**
         * @return tableIncludes
         */
        public java.util.List < TableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        /**
         * @return tableMapping
         */
        public java.util.List < String > getTableMapping() {
            return this.tableMapping;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return variables
         */
        public java.util.List < String > getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String archiveMethod; 
            private String dbSchema; 
            private Boolean logic; 
            private java.util.List < String > orderAfter; 
            private String runMethod; 
            private Long sourceDatabaseId; 
            private java.util.List < TableIncludes> tableIncludes; 
            private java.util.List < String > tableMapping; 
            private String targetInstanceId; 
            private java.util.List < String > variables; 

            /**
             * The type of the archiving destination.
             */
            public Builder archiveMethod(String archiveMethod) {
                this.archiveMethod = archiveMethod;
                return this;
            }

            /**
             * The schema of the database and table to be archived.
             */
            public Builder dbSchema(String dbSchema) {
                this.dbSchema = dbSchema;
                return this;
            }

            /**
             * Indicates whether the database is logical.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The post behavior of archiving.
             */
            public Builder orderAfter(java.util.List < String > orderAfter) {
                this.orderAfter = orderAfter;
                return this;
            }

            /**
             * The running method, which indicates whether to run the task immediately or at a specific point in time.
             */
            public Builder runMethod(String runMethod) {
                this.runMethod = runMethod;
                return this;
            }

            /**
             * The ID of the source database.
             */
            public Builder sourceDatabaseId(Long sourceDatabaseId) {
                this.sourceDatabaseId = sourceDatabaseId;
                return this;
            }

            /**
             * The list of the archived tables and the filter conditions.
             */
            public Builder tableIncludes(java.util.List < TableIncludes> tableIncludes) {
                this.tableIncludes = tableIncludes;
                return this;
            }

            /**
             * The mapping of schemas.
             */
            public Builder tableMapping(java.util.List < String > tableMapping) {
                this.tableMapping = tableMapping;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * The time variable defined for scheduled archiving.
             */
            public Builder variables(java.util.List < String > variables) {
                this.variables = variables;
                return this;
            }

            public PluginParam build() {
                return new PluginParam(this);
            } 

        } 

    }
    public static class DataArchiveOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Committer")
        private String committer;

        @com.aliyun.core.annotation.NameInMap("CommitterId")
        private Long committerId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PluginExtraData")
        private PluginExtraData pluginExtraData;

        @com.aliyun.core.annotation.NameInMap("PluginParam")
        private PluginParam pluginParam;

        @com.aliyun.core.annotation.NameInMap("PluginType")
        private String pluginType;

        @com.aliyun.core.annotation.NameInMap("RelatedUserList")
        private java.util.List < Long > relatedUserList;

        @com.aliyun.core.annotation.NameInMap("RelatedUserNickList")
        private java.util.List < String > relatedUserNickList;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("WorkflowStatusDesc")
        private String workflowStatusDesc;

        private DataArchiveOrderDetail(Builder builder) {
            this.comment = builder.comment;
            this.committer = builder.committer;
            this.committerId = builder.committerId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.pluginExtraData = builder.pluginExtraData;
            this.pluginParam = builder.pluginParam;
            this.pluginType = builder.pluginType;
            this.relatedUserList = builder.relatedUserList;
            this.relatedUserNickList = builder.relatedUserNickList;
            this.statusCode = builder.statusCode;
            this.statusDesc = builder.statusDesc;
            this.workflowInstanceId = builder.workflowInstanceId;
            this.workflowStatusDesc = builder.workflowStatusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataArchiveOrderDetail create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return committer
         */
        public String getCommitter() {
            return this.committer;
        }

        /**
         * @return committerId
         */
        public Long getCommitterId() {
            return this.committerId;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return pluginExtraData
         */
        public PluginExtraData getPluginExtraData() {
            return this.pluginExtraData;
        }

        /**
         * @return pluginParam
         */
        public PluginParam getPluginParam() {
            return this.pluginParam;
        }

        /**
         * @return pluginType
         */
        public String getPluginType() {
            return this.pluginType;
        }

        /**
         * @return relatedUserList
         */
        public java.util.List < Long > getRelatedUserList() {
            return this.relatedUserList;
        }

        /**
         * @return relatedUserNickList
         */
        public java.util.List < String > getRelatedUserNickList() {
            return this.relatedUserNickList;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return workflowInstanceId
         */
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workflowStatusDesc
         */
        public String getWorkflowStatusDesc() {
            return this.workflowStatusDesc;
        }

        public static final class Builder {
            private String comment; 
            private String committer; 
            private Long committerId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private PluginExtraData pluginExtraData; 
            private PluginParam pluginParam; 
            private String pluginType; 
            private java.util.List < Long > relatedUserList; 
            private java.util.List < String > relatedUserNickList; 
            private String statusCode; 
            private String statusDesc; 
            private Long workflowInstanceId; 
            private String workflowStatusDesc; 

            /**
             * The description of the data archiving tickets.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The user who submitted the ticket.
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * The ID of the user who submitted the ticket. The ID is a user ID and not the ID of an Alibaba Cloud account.
             */
            public Builder committerId(Long committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * The time when the ticket was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the ticket was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of data archiving tickets.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The additional information about the ticket.
             */
            public Builder pluginExtraData(PluginExtraData pluginExtraData) {
                this.pluginExtraData = pluginExtraData;
                return this;
            }

            /**
             * The ticket creation parameter. The value is a JSON string. For more information, see [PluginType parameter](~~429109~~).
             */
            public Builder pluginParam(PluginParam pluginParam) {
                this.pluginParam = pluginParam;
                return this;
            }

            /**
             * The plug-in type that corresponds to the type of the ticket. The plug-in type for data archiving is DATA_ARCHIVE. For more information, see [PluginType parameter](~~429109~~).
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * The user IDs related to the ticket.
             */
            public Builder relatedUserList(java.util.List < Long > relatedUserList) {
                this.relatedUserList = relatedUserList;
                return this;
            }

            /**
             * The nicknames of the users that are related to the ticket.
             */
            public Builder relatedUserNickList(java.util.List < String > relatedUserNickList) {
                this.relatedUserNickList = relatedUserNickList;
                return this;
            }

            /**
             * The status code of the ticket. Valid values:
             * <p>
             * 
             * *   **new**: newly created.
             * *   **toaudit**: being reviewed.
             * *   **Approved**: approved.
             * *   **reject**: rejected.
             * *   **processing**: being executed.
             * *   **Success**: successful.
             * *   **closed**: disabled.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The status description of the ticket.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The ID of the approval process. You can call the [GetOrderBaseInfo](~~144642~~) operation to obtain the ID of the approval process.
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * The description of the approval process.
             */
            public Builder workflowStatusDesc(String workflowStatusDesc) {
                this.workflowStatusDesc = workflowStatusDesc;
                return this;
            }

            public DataArchiveOrderDetail build() {
                return new DataArchiveOrderDetail(this);
            } 

        } 

    }
}
