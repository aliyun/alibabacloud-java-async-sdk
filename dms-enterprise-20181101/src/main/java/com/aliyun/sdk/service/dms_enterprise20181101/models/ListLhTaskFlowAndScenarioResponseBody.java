// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
 *
 * <p>ListLhTaskFlowAndScenarioResponseBody</p>
 */
public class ListLhTaskFlowAndScenarioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RawDAGList")
    private RawDAGList rawDAGList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScenarioDAGList")
    private ScenarioDAGList scenarioDAGList;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The task flows in the default business scenario.</p>
         */
        public Builder rawDAGList(RawDAGList rawDAGList) {
            this.rawDAGList = rawDAGList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>48602B78-0DDF-414C-8688-70CAB6070115</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task flows in other business scenarios.</p>
         */
        public Builder scenarioDAGList(ScenarioDAGList scenarioDAGList) {
            this.scenarioDAGList = scenarioDAGList;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLhTaskFlowAndScenarioResponseBody build() {
            return new ListLhTaskFlowAndScenarioResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListLhTaskFlowAndScenarioResponseBody</p>
     */
    public static class Dag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanEdit")
        private Boolean canEdit;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorNickName")
        private String creatorNickName;

        @com.aliyun.core.annotation.NameInMap("DagName")
        private String dagName;

        @com.aliyun.core.annotation.NameInMap("DagOwnerId")
        private String dagOwnerId;

        @com.aliyun.core.annotation.NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @com.aliyun.core.annotation.NameInMap("DataFlowId")
        private Long dataFlowId;

        @com.aliyun.core.annotation.NameInMap("DemoId")
        private String demoId;

        @com.aliyun.core.annotation.NameInMap("DeployId")
        private Long deployId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceStatus")
        private Integer latestInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceTime")
        private Integer latestInstanceTime;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private Long scenarioId;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private Long spaceId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>Indicates whether the task flow can be modified. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The task flow can be modified.</li>
             * <li><strong>false</strong>: The task flow cannot be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canEdit(Boolean canEdit) {
                this.canEdit = canEdit;
                return this;
            }

            /**
             * <p>The ID of the user who creates the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The name of the user who creates the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>Creator_Name</p>
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
                return this;
            }

            /**
             * <p>The name of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>Dag_Name</p>
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * <p>The user ID of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * <p>The name of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>Owner_Name</p>
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * <p>The extended field. No meaning is specified for this field.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder dataFlowId(Long dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * <p>The extended field. No meaning is specified for this field.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder demoId(String demoId) {
                this.demoId = demoId;
                return this;
            }

            /**
             * <p>The ID of the latest deployment record.</p>
             * 
             * <strong>example:</strong>
             * <p>12**</p>
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * <p>The ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>134137****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the task flow is deleted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: deleted</li>
             * <li><strong>false</strong>: not deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>The status of the latest execution. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid</li>
             * <li><strong>1</strong>: scheduling disabled</li>
             * <li><strong>2</strong>: waiting to be scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder latestInstanceStatus(Integer latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * <p>The time when the latest execution record was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-14</p>
             */
            public Builder latestInstanceTime(Integer latestInstanceTime) {
                this.latestInstanceTime = latestInstanceTime;
                return this;
            }

            /**
             * <p>The ID of the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>2**</p>
             */
            public Builder scenarioId(Long scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder spaceId(Long spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * <p>The status of the task flow. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid</li>
             * <li><strong>1</strong>: scheduling disabled</li>
             * <li><strong>2</strong>: waiting to be scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListLhTaskFlowAndScenarioResponseBody</p>
     */
    public static class RawDAGList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dag")
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
    /**
     * 
     * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListLhTaskFlowAndScenarioResponseBody</p>
     */
    public static class DagListDag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanEdit")
        private Boolean canEdit;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorNickName")
        private String creatorNickName;

        @com.aliyun.core.annotation.NameInMap("DagName")
        private String dagName;

        @com.aliyun.core.annotation.NameInMap("DagOwnerId")
        private String dagOwnerId;

        @com.aliyun.core.annotation.NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @com.aliyun.core.annotation.NameInMap("DataFlowId")
        private Long dataFlowId;

        @com.aliyun.core.annotation.NameInMap("DemoId")
        private String demoId;

        @com.aliyun.core.annotation.NameInMap("DeployId")
        private Long deployId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceStatus")
        private Integer latestInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceTime")
        private Integer latestInstanceTime;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private Long scenarioId;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private Long spaceId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>Indicates whether the task flow can be modified. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The task flow can be modified.</li>
             * <li><strong>false</strong>: The task flow cannot be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canEdit(Boolean canEdit) {
                this.canEdit = canEdit;
                return this;
            }

            /**
             * <p>The ID of the user who creates the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The name of the user who creates the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>Creator_Name</p>
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
                return this;
            }

            /**
             * <p>The name of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>Dag_Name</p>
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * <p>The user ID of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * <p>The name of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>Owner_Name</p>
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * <p>The extended field. No meaning is specified for this field.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder dataFlowId(Long dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * <p>The extended field. No meaning is specified for this field.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder demoId(String demoId) {
                this.demoId = demoId;
                return this;
            }

            /**
             * <p>The ID of the latest deployment record.</p>
             * 
             * <strong>example:</strong>
             * <p>12**</p>
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * <p>The ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>9***</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the task flow is deleted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: deleted</li>
             * <li><strong>false</strong>: not deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>The status of the latest execution. Valid values:</p>
             * <ul>
             * <li>0: invalid</li>
             * <li>1: scheduling disabled</li>
             * <li>2: waiting to be scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestInstanceStatus(Integer latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * <p>The time when the latest execution record was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-14</p>
             */
            public Builder latestInstanceTime(Integer latestInstanceTime) {
                this.latestInstanceTime = latestInstanceTime;
                return this;
            }

            /**
             * <p>The ID of the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>2**</p>
             */
            public Builder scenarioId(Long scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder spaceId(Long spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * <p>The status of the task flow. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid</li>
             * <li><strong>1</strong>: scheduling disabled</li>
             * <li><strong>2</strong>: waiting to be scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListLhTaskFlowAndScenarioResponseBody</p>
     */
    public static class DagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dag")
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
    /**
     * 
     * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListLhTaskFlowAndScenarioResponseBody</p>
     */
    public static class Scenario extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ScenarioName")
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
             * <p>The ID of the user who creates the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The description of the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Scenario_2</p>
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
    /**
     * 
     * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListLhTaskFlowAndScenarioResponseBody</p>
     */
    public static class ScenarioDAG extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagList")
        private DagList dagList;

        @com.aliyun.core.annotation.NameInMap("Scenario")
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
             * <p>The list of task flows.</p>
             */
            public Builder dagList(DagList dagList) {
                this.dagList = dagList;
                return this;
            }

            /**
             * <p>The information about the business scenario.</p>
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
    /**
     * 
     * {@link ListLhTaskFlowAndScenarioResponseBody} extends {@link TeaModel}
     *
     * <p>ListLhTaskFlowAndScenarioResponseBody</p>
     */
    public static class ScenarioDAGList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScenarioDAG")
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
