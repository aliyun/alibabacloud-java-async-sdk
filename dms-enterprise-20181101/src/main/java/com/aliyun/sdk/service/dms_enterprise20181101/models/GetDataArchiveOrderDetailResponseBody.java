// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataArchiveOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataArchiveOrderDetailResponseBody</p>
 */
public class GetDataArchiveOrderDetailResponseBody extends TeaModel {
    @NameInMap("DataArchiveOrderDetail")
    private DataArchiveOrderDetail dataArchiveOrderDetail;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
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
         * DataArchiveOrderDetail.
         */
        public Builder dataArchiveOrderDetail(DataArchiveOrderDetail dataArchiveOrderDetail) {
            this.dataArchiveOrderDetail = dataArchiveOrderDetail;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        /**
         * Id of the request
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
        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("CronBeginDate")
        private String cronBeginDate;

        @NameInMap("CronEndDate")
        private String cronEndDate;

        @NameInMap("CronTrigger")
        private Boolean cronTrigger;

        @NameInMap("DWDevelop")
        private Boolean DWDevelop;

        @NameInMap("DagName")
        private String dagName;

        @NameInMap("DagOwnerId")
        private String dagOwnerId;

        @NameInMap("DeployId")
        private Long deployId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EditDagId")
        private Long editDagId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsPublic")
        private Long isPublic;

        @NameInMap("Legacy")
        private Boolean legacy;

        @NameInMap("System")
        private Boolean system;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TriggerOnce")
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
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * CronBeginDate.
             */
            public Builder cronBeginDate(String cronBeginDate) {
                this.cronBeginDate = cronBeginDate;
                return this;
            }

            /**
             * CronEndDate.
             */
            public Builder cronEndDate(String cronEndDate) {
                this.cronEndDate = cronEndDate;
                return this;
            }

            /**
             * CronTrigger.
             */
            public Builder cronTrigger(Boolean cronTrigger) {
                this.cronTrigger = cronTrigger;
                return this;
            }

            /**
             * DWDevelop.
             */
            public Builder DWDevelop(Boolean DWDevelop) {
                this.DWDevelop = DWDevelop;
                return this;
            }

            /**
             * DagName.
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * DagOwnerId.
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * DeployId.
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EditDagId.
             */
            public Builder editDagId(Long editDagId) {
                this.editDagId = editDagId;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsPublic.
             */
            public Builder isPublic(Long isPublic) {
                this.isPublic = isPublic;
                return this;
            }

            /**
             * Legacy.
             */
            public Builder legacy(Boolean legacy) {
                this.legacy = legacy;
                return this;
            }

            /**
             * System.
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TriggerOnce.
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
        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Description")
        private String description;

        @NameInMap("FreeOrStable")
        private Boolean freeOrStable;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GroupMode")
        private String groupMode;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LastMenderId")
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
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FreeOrStable.
             */
            public Builder freeOrStable(Boolean freeOrStable) {
                this.freeOrStable = freeOrStable;
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
             * GroupMode.
             */
            public Builder groupMode(String groupMode) {
                this.groupMode = groupMode;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastMenderId.
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
        @NameInMap("Alias")
        private String alias;

        @NameInMap("AlterTimeout")
        private Long alterTimeout;

        @NameInMap("AssetControl")
        private Boolean assetControl;

        @NameInMap("CatalogName")
        private String catalogName;

        @NameInMap("ClusterNode")
        private String clusterNode;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("DbaId")
        private Long dbaId;

        @NameInMap("DbaName")
        private String dbaName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Follow")
        private Boolean follow;

        @NameInMap("Host")
        private String host;

        @NameInMap("Idc")
        private String idc;

        @NameInMap("IdcTitle")
        private String idcTitle;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("InstanceSource")
        private String instanceSource;

        @NameInMap("LastSyncTime")
        private String lastSyncTime;

        @NameInMap("Level")
        private String level;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OwnerIds")
        private java.util.List < Long > ownerIds;

        @NameInMap("OwnerNames")
        private java.util.List < String > ownerNames;

        @NameInMap("Port")
        private Long port;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("StandardGroup")
        private StandardGroup standardGroup;

        @NameInMap("State")
        private String state;

        @NameInMap("TableCount")
        private Long tableCount;

        @NameInMap("TnsName")
        private String tnsName;

        @NameInMap("UnitType")
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
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * AlterTimeout.
             */
            public Builder alterTimeout(Long alterTimeout) {
                this.alterTimeout = alterTimeout;
                return this;
            }

            /**
             * AssetControl.
             */
            public Builder assetControl(Boolean assetControl) {
                this.assetControl = assetControl;
                return this;
            }

            /**
             * CatalogName.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * ClusterNode.
             */
            public Builder clusterNode(String clusterNode) {
                this.clusterNode = clusterNode;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * DbaId.
             */
            public Builder dbaId(Long dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * DbaName.
             */
            public Builder dbaName(String dbaName) {
                this.dbaName = dbaName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Encoding.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Follow.
             */
            public Builder follow(Boolean follow) {
                this.follow = follow;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Idc.
             */
            public Builder idc(String idc) {
                this.idc = idc;
                return this;
            }

            /**
             * IdcTitle.
             */
            public Builder idcTitle(String idcTitle) {
                this.idcTitle = idcTitle;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceSource.
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * LastSyncTime.
             */
            public Builder lastSyncTime(String lastSyncTime) {
                this.lastSyncTime = lastSyncTime;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List < Long > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * OwnerNames.
             */
            public Builder ownerNames(java.util.List < String > ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * SearchName.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * StandardGroup.
             */
            public Builder standardGroup(StandardGroup standardGroup) {
                this.standardGroup = standardGroup;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TableCount.
             */
            public Builder tableCount(Long tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * TnsName.
             */
            public Builder tnsName(String tnsName) {
                this.tnsName = tnsName;
                return this;
            }

            /**
             * UnitType.
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
        @NameInMap("BusinessTime")
        private String businessTime;

        @NameInMap("DagId")
        private Long dagId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HistoryDagId")
        private Long historyDagId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LastRunningContext")
        private String lastRunningContext;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("Status")
        private Long status;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TriggerType")
        private Long triggerType;

        @NameInMap("Version")
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
             * BusinessTime.
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * DagId.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * HistoryDagId.
             */
            public Builder historyDagId(Long historyDagId) {
                this.historyDagId = historyDagId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastRunningContext.
             */
            public Builder lastRunningContext(String lastRunningContext) {
                this.lastRunningContext = lastRunningContext;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(Long triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * Version.
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
        @NameInMap("CronFireType")
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
             * CronFireType.
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
        @NameInMap("DagInfo")
        private DagInfo dagInfo;

        @NameInMap("DbBaseInfo")
        private DbBaseInfo dbBaseInfo;

        @NameInMap("InstanceTotal")
        private Long instanceTotal;

        @NameInMap("Instances")
        private java.util.List < Instances> instances;

        @NameInMap("NextFireTimeResult")
        private NextFireTimeResult nextFireTimeResult;

        @NameInMap("PageIndex")
        private Long pageIndex;

        @NameInMap("PageSize")
        private Long pageSize;

        private PluginExtraData(Builder builder) {
            this.dagInfo = builder.dagInfo;
            this.dbBaseInfo = builder.dbBaseInfo;
            this.instanceTotal = builder.instanceTotal;
            this.instances = builder.instances;
            this.nextFireTimeResult = builder.nextFireTimeResult;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
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

        public static final class Builder {
            private DagInfo dagInfo; 
            private DbBaseInfo dbBaseInfo; 
            private Long instanceTotal; 
            private java.util.List < Instances> instances; 
            private NextFireTimeResult nextFireTimeResult; 
            private Long pageIndex; 
            private Long pageSize; 

            /**
             * DagInfo.
             */
            public Builder dagInfo(DagInfo dagInfo) {
                this.dagInfo = dagInfo;
                return this;
            }

            /**
             * DbBaseInfo.
             */
            public Builder dbBaseInfo(DbBaseInfo dbBaseInfo) {
                this.dbBaseInfo = dbBaseInfo;
                return this;
            }

            /**
             * InstanceTotal.
             */
            public Builder instanceTotal(Long instanceTotal) {
                this.instanceTotal = instanceTotal;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * NextFireTimeResult.
             */
            public Builder nextFireTimeResult(NextFireTimeResult nextFireTimeResult) {
                this.nextFireTimeResult = nextFireTimeResult;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public PluginExtraData build() {
                return new PluginExtraData(this);
            } 

        } 

    }
    public static class TableIncludes extends TeaModel {
        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TableWhere")
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
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableWhere.
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
        @NameInMap("ArchiveMethod")
        private String archiveMethod;

        @NameInMap("DbSchema")
        private String dbSchema;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OrderAfter")
        private java.util.List < String > orderAfter;

        @NameInMap("RunMethod")
        private String runMethod;

        @NameInMap("SourceDatabaseId")
        private Long sourceDatabaseId;

        @NameInMap("TableIncludes")
        private java.util.List < TableIncludes> tableIncludes;

        @NameInMap("TableMapping")
        private java.util.List < String > tableMapping;

        @NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @NameInMap("Variables")
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
             * ArchiveMethod.
             */
            public Builder archiveMethod(String archiveMethod) {
                this.archiveMethod = archiveMethod;
                return this;
            }

            /**
             * DbSchema.
             */
            public Builder dbSchema(String dbSchema) {
                this.dbSchema = dbSchema;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * OrderAfter.
             */
            public Builder orderAfter(java.util.List < String > orderAfter) {
                this.orderAfter = orderAfter;
                return this;
            }

            /**
             * RunMethod.
             */
            public Builder runMethod(String runMethod) {
                this.runMethod = runMethod;
                return this;
            }

            /**
             * SourceDatabaseId.
             */
            public Builder sourceDatabaseId(Long sourceDatabaseId) {
                this.sourceDatabaseId = sourceDatabaseId;
                return this;
            }

            /**
             * TableIncludes.
             */
            public Builder tableIncludes(java.util.List < TableIncludes> tableIncludes) {
                this.tableIncludes = tableIncludes;
                return this;
            }

            /**
             * TableMapping.
             */
            public Builder tableMapping(java.util.List < String > tableMapping) {
                this.tableMapping = tableMapping;
                return this;
            }

            /**
             * TargetInstanceId.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * Variables.
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
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Committer")
        private String committer;

        @NameInMap("CommitterId")
        private Long committerId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("PluginExtraData")
        private PluginExtraData pluginExtraData;

        @NameInMap("PluginParam")
        private PluginParam pluginParam;

        @NameInMap("PluginType")
        private String pluginType;

        @NameInMap("RelatedUserList")
        private java.util.List < Long > relatedUserList;

        @NameInMap("RelatedUserNickList")
        private java.util.List < String > relatedUserNickList;

        @NameInMap("StatusCode")
        private String statusCode;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        @NameInMap("WorkflowStatusDesc")
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Committer.
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * CommitterId.
             */
            public Builder committerId(Long committerId) {
                this.committerId = committerId;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * PluginExtraData.
             */
            public Builder pluginExtraData(PluginExtraData pluginExtraData) {
                this.pluginExtraData = pluginExtraData;
                return this;
            }

            /**
             * PluginParam.
             */
            public Builder pluginParam(PluginParam pluginParam) {
                this.pluginParam = pluginParam;
                return this;
            }

            /**
             * PluginType.
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * RelatedUserList.
             */
            public Builder relatedUserList(java.util.List < Long > relatedUserList) {
                this.relatedUserList = relatedUserList;
                return this;
            }

            /**
             * RelatedUserNickList.
             */
            public Builder relatedUserNickList(java.util.List < String > relatedUserNickList) {
                this.relatedUserNickList = relatedUserNickList;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * WorkflowInstanceId.
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * WorkflowStatusDesc.
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
