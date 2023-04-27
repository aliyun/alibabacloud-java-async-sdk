// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
 *
 * <p>ListLhTaskFlowAndScenarioResponseBody</p>
 */
public class ListLhTaskFlowAndScenarioResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RawDAGList")
    private RawDAGList rawDAGList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScenarioDAGList")
    private ScenarioDAGList scenarioDAGList;

    @NameInMap("Success")
    private Boolean success;

    private ListLhTaskFlowAndScenarioResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.rawDAGList = builder.rawDAGList;
        this.requestId = builder.requestId;
        this.scenarioDAGList = builder.scenarioDAGList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLhTaskFlowAndScenarioResponseBody create() {
        return builder().build();
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
     * @return rawDAGList
     */
    public RawDAGList getRawDAGList() {
        return this.rawDAGList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenarioDAGList
     */
    public ScenarioDAGList getScenarioDAGList() {
        return this.scenarioDAGList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private RawDAGList rawDAGList; 
        private String requestId; 
        private ScenarioDAGList scenarioDAGList; 
        private Boolean success; 

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
         * The extended field. No meaning is specified for this field.
         */
        public Builder rawDAGList(RawDAGList rawDAGList) {
            this.rawDAGList = rawDAGList;
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
         * ScenarioDAGList.
         */
        public Builder scenarioDAGList(ScenarioDAGList scenarioDAGList) {
            this.scenarioDAGList = scenarioDAGList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLhTaskFlowAndScenarioResponseBody build() {
            return new ListLhTaskFlowAndScenarioResponseBody(this);
        } 

    } 

    public static class Dag extends TeaModel {
        @NameInMap("CanEdit")
        private Boolean canEdit;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("CreatorNickName")
        private String creatorNickName;

        @NameInMap("DagName")
        private String dagName;

        @NameInMap("DagOwnerId")
        private String dagOwnerId;

        @NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @NameInMap("DataFlowId")
        private Long dataFlowId;

        @NameInMap("DemoId")
        private String demoId;

        @NameInMap("DeployId")
        private Long deployId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("LatestInstanceStatus")
        private Integer latestInstanceStatus;

        @NameInMap("LatestInstanceTime")
        private Integer latestInstanceTime;

        @NameInMap("ScenarioId")
        private Long scenarioId;

        @NameInMap("SpaceId")
        private Long spaceId;

        @NameInMap("Status")
        private Integer status;

        private Dag(Builder builder) {
            this.canEdit = builder.canEdit;
            this.creatorId = builder.creatorId;
            this.creatorNickName = builder.creatorNickName;
            this.dagName = builder.dagName;
            this.dagOwnerId = builder.dagOwnerId;
            this.dagOwnerNickName = builder.dagOwnerNickName;
            this.dataFlowId = builder.dataFlowId;
            this.demoId = builder.demoId;
            this.deployId = builder.deployId;
            this.id = builder.id;
            this.isDeleted = builder.isDeleted;
            this.latestInstanceStatus = builder.latestInstanceStatus;
            this.latestInstanceTime = builder.latestInstanceTime;
            this.scenarioId = builder.scenarioId;
            this.spaceId = builder.spaceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dag create() {
            return builder().build();
        }

        /**
         * @return canEdit
         */
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorNickName
         */
        public String getCreatorNickName() {
            return this.creatorNickName;
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
         * @return dagOwnerNickName
         */
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        /**
         * @return dataFlowId
         */
        public Long getDataFlowId() {
            return this.dataFlowId;
        }

        /**
         * @return demoId
         */
        public String getDemoId() {
            return this.demoId;
        }

        /**
         * @return deployId
         */
        public Long getDeployId() {
            return this.deployId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return latestInstanceStatus
         */
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        /**
         * @return latestInstanceTime
         */
        public Integer getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        /**
         * @return scenarioId
         */
        public Long getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return spaceId
         */
        public Long getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean canEdit; 
            private String creatorId; 
            private String creatorNickName; 
            private String dagName; 
            private String dagOwnerId; 
            private String dagOwnerNickName; 
            private Long dataFlowId; 
            private String demoId; 
            private Long deployId; 
            private Long id; 
            private Boolean isDeleted; 
            private Integer latestInstanceStatus; 
            private Integer latestInstanceTime; 
            private Long scenarioId; 
            private Long spaceId; 
            private Integer status; 

            /**
             * Indicates whether the task flow is deleted. Valid values:
             * <p>
             * 
             * *   **true**: deleted
             * *   **false**: not deleted
             */
            public Builder canEdit(Boolean canEdit) {
                this.canEdit = canEdit;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The status of the latest execution. Valid values:
             * <p>
             * 
             * *   **0**: invalid
             * *   **1**: scheduling disabled
             * *   **2**: waiting to be scheduled
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
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
             * The ID of the latest deployment record.
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * The name of the task flow owner.
             */
            public Builder dataFlowId(Long dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
             */
            public Builder demoId(String demoId) {
                this.demoId = demoId;
                return this;
            }

            /**
             * The ID of the business scenario.
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * The status of the task flow. Valid values:
             * <p>
             * 
             * *   **0**: invalid
             * *   **1**: scheduling disabled
             * *   **2**: waiting to be scheduled
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the user. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * The name of the task flow.
             */
            public Builder latestInstanceStatus(Integer latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * Queries the task flows corresponding to a specific business scenario in a workspace in Data Management (DMS).
             */
            public Builder latestInstanceTime(Integer latestInstanceTime) {
                this.latestInstanceTime = latestInstanceTime;
                return this;
            }

            /**
             * The task flows in the default business scenario.
             */
            public Builder scenarioId(Long scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * The extended field. No meaning is specified for this field.
             */
            public Builder spaceId(Long spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * The ID of the task flow.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Dag build() {
                return new Dag(this);
            } 

        } 

    }
    public static class RawDAGList extends TeaModel {
        @NameInMap("Dag")
        private java.util.List < Dag> dag;

        private RawDAGList(Builder builder) {
            this.dag = builder.dag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RawDAGList create() {
            return builder().build();
        }

        /**
         * @return dag
         */
        public java.util.List < Dag> getDag() {
            return this.dag;
        }

        public static final class Builder {
            private java.util.List < Dag> dag; 

            /**
             * Dag.
             */
            public Builder dag(java.util.List < Dag> dag) {
                this.dag = dag;
                return this;
            }

            public RawDAGList build() {
                return new RawDAGList(this);
            } 

        } 

    }
    public static class DagListDag extends TeaModel {
        @NameInMap("CanEdit")
        private Boolean canEdit;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("CreatorNickName")
        private String creatorNickName;

        @NameInMap("DagName")
        private String dagName;

        @NameInMap("DagOwnerId")
        private String dagOwnerId;

        @NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @NameInMap("DataFlowId")
        private Long dataFlowId;

        @NameInMap("DemoId")
        private String demoId;

        @NameInMap("DeployId")
        private Long deployId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("LatestInstanceStatus")
        private Integer latestInstanceStatus;

        @NameInMap("LatestInstanceTime")
        private Integer latestInstanceTime;

        @NameInMap("ScenarioId")
        private Long scenarioId;

        @NameInMap("SpaceId")
        private Long spaceId;

        @NameInMap("Status")
        private Integer status;

        private DagListDag(Builder builder) {
            this.canEdit = builder.canEdit;
            this.creatorId = builder.creatorId;
            this.creatorNickName = builder.creatorNickName;
            this.dagName = builder.dagName;
            this.dagOwnerId = builder.dagOwnerId;
            this.dagOwnerNickName = builder.dagOwnerNickName;
            this.dataFlowId = builder.dataFlowId;
            this.demoId = builder.demoId;
            this.deployId = builder.deployId;
            this.id = builder.id;
            this.isDeleted = builder.isDeleted;
            this.latestInstanceStatus = builder.latestInstanceStatus;
            this.latestInstanceTime = builder.latestInstanceTime;
            this.scenarioId = builder.scenarioId;
            this.spaceId = builder.spaceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagListDag create() {
            return builder().build();
        }

        /**
         * @return canEdit
         */
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorNickName
         */
        public String getCreatorNickName() {
            return this.creatorNickName;
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
         * @return dagOwnerNickName
         */
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        /**
         * @return dataFlowId
         */
        public Long getDataFlowId() {
            return this.dataFlowId;
        }

        /**
         * @return demoId
         */
        public String getDemoId() {
            return this.demoId;
        }

        /**
         * @return deployId
         */
        public Long getDeployId() {
            return this.deployId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return latestInstanceStatus
         */
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        /**
         * @return latestInstanceTime
         */
        public Integer getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        /**
         * @return scenarioId
         */
        public Long getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return spaceId
         */
        public Long getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean canEdit; 
            private String creatorId; 
            private String creatorNickName; 
            private String dagName; 
            private String dagOwnerId; 
            private String dagOwnerNickName; 
            private Long dataFlowId; 
            private String demoId; 
            private Long deployId; 
            private Long id; 
            private Boolean isDeleted; 
            private Integer latestInstanceStatus; 
            private Integer latestInstanceTime; 
            private Long scenarioId; 
            private Long spaceId; 
            private Integer status; 

            /**
             * Indicates whether the task flow is deleted. Valid values:
             * <p>
             * 
             * *   **true**: deleted
             * *   **false**: not deleted
             */
            public Builder canEdit(Boolean canEdit) {
                this.canEdit = canEdit;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The status of the latest execution. Valid values:
             * <p>
             * 
             * *   **0**: invalid
             * *   **1**: scheduling disabled
             * *   **2**: waiting to be scheduled
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
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
             * The ID of the latest deployment record.
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * The name of the task flow owner.
             */
            public Builder dataFlowId(Long dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
             */
            public Builder demoId(String demoId) {
                this.demoId = demoId;
                return this;
            }

            /**
             * The ID of the business scenario.
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * The status of the task flow. Valid values:
             * <p>
             * 
             * *   **0**: invalid
             * *   **1**: scheduling disabled
             * *   **2**: waiting to be scheduled
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the user. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * The name of the task flow.
             */
            public Builder latestInstanceStatus(Integer latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * Queries the task flows corresponding to a specific business scenario in a workspace in Data Management (DMS).
             */
            public Builder latestInstanceTime(Integer latestInstanceTime) {
                this.latestInstanceTime = latestInstanceTime;
                return this;
            }

            /**
             * The task flows in the default business scenario.
             */
            public Builder scenarioId(Long scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * The extended field. No meaning is specified for this field.
             */
            public Builder spaceId(Long spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * The ID of the task flow.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DagListDag build() {
                return new DagListDag(this);
            } 

        } 

    }
    public static class DagList extends TeaModel {
        @NameInMap("Dag")
        private java.util.List < DagListDag> dag;

        private DagList(Builder builder) {
            this.dag = builder.dag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagList create() {
            return builder().build();
        }

        /**
         * @return dag
         */
        public java.util.List < DagListDag> getDag() {
            return this.dag;
        }

        public static final class Builder {
            private java.util.List < DagListDag> dag; 

            /**
             * Dag.
             */
            public Builder dag(java.util.List < DagListDag> dag) {
                this.dag = dag;
                return this;
            }

            public DagList build() {
                return new DagList(this);
            } 

        } 

    }
    public static class Scenario extends TeaModel {
        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("ScenarioName")
        private String scenarioName;

        private Scenario(Builder builder) {
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.scenarioName = builder.scenarioName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenario create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return scenarioName
         */
        public String getScenarioName() {
            return this.scenarioName;
        }

        public static final class Builder {
            private String creatorId; 
            private String description; 
            private String scenarioName; 

            /**
             * The ID of the workspace.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
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
             * ScenarioName.
             */
            public Builder scenarioName(String scenarioName) {
                this.scenarioName = scenarioName;
                return this;
            }

            public Scenario build() {
                return new Scenario(this);
            } 

        } 

    }
    public static class ScenarioDAG extends TeaModel {
        @NameInMap("DagList")
        private DagList dagList;

        @NameInMap("Scenario")
        private Scenario scenario;

        private ScenarioDAG(Builder builder) {
            this.dagList = builder.dagList;
            this.scenario = builder.scenario;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenarioDAG create() {
            return builder().build();
        }

        /**
         * @return dagList
         */
        public DagList getDagList() {
            return this.dagList;
        }

        /**
         * @return scenario
         */
        public Scenario getScenario() {
            return this.scenario;
        }

        public static final class Builder {
            private DagList dagList; 
            private Scenario scenario; 

            /**
             * DagList.
             */
            public Builder dagList(DagList dagList) {
                this.dagList = dagList;
                return this;
            }

            /**
             * Scenario.
             */
            public Builder scenario(Scenario scenario) {
                this.scenario = scenario;
                return this;
            }

            public ScenarioDAG build() {
                return new ScenarioDAG(this);
            } 

        } 

    }
    public static class ScenarioDAGList extends TeaModel {
        @NameInMap("ScenarioDAG")
        private java.util.List < ScenarioDAG> scenarioDAG;

        private ScenarioDAGList(Builder builder) {
            this.scenarioDAG = builder.scenarioDAG;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenarioDAGList create() {
            return builder().build();
        }

        /**
         * @return scenarioDAG
         */
        public java.util.List < ScenarioDAG> getScenarioDAG() {
            return this.scenarioDAG;
        }

        public static final class Builder {
            private java.util.List < ScenarioDAG> scenarioDAG; 

            /**
             * ScenarioDAG.
             */
            public Builder scenarioDAG(java.util.List < ScenarioDAG> scenarioDAG) {
                this.scenarioDAG = scenarioDAG;
                return this;
            }

            public ScenarioDAGList build() {
                return new ScenarioDAGList(this);
            } 

        } 

    }
}
