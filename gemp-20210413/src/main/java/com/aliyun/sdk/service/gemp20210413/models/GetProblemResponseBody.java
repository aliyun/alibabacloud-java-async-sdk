// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemResponseBody} extends {@link TeaModel}
 *
 * <p>GetProblemResponseBody</p>
 */
public class GetProblemResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetProblemResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProblemResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * 详情
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProblemResponseBody build() {
            return new GetProblemResponseBody(this);
        } 

    } 

    public static class CancelProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        private String actionName;

        @NameInMap("actionTime")
        private String actionTime;

        @NameInMap("operator")
        private String operator;

        @NameInMap("userId")
        private Long userId;

        private CancelProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CancelProblemOperateLogs create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 

            /**
             * 动作名称
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * 操作时间
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * 操作人
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 用户ID
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public CancelProblemOperateLogs build() {
                return new CancelProblemOperateLogs(this);
            } 

        } 

    }
    public static class CoordinationGroups extends TeaModel {
        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("serviceGroupName")
        private String serviceGroupName;

        private CoordinationGroups(Builder builder) {
            this.serviceGroupId = builder.serviceGroupId;
            this.serviceGroupName = builder.serviceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinationGroups create() {
            return builder().build();
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        /**
         * @return serviceGroupName
         */
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public static final class Builder {
            private Long serviceGroupId; 
            private String serviceGroupName; 

            /**
             * 服务组ID
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * 服务组名字
             */
            public Builder serviceGroupName(String serviceGroupName) {
                this.serviceGroupName = serviceGroupName;
                return this;
            }

            public CoordinationGroups build() {
                return new CoordinationGroups(this);
            } 

        } 

    }
    public static class EffectionServices extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("effectionLevel")
        private Long effectionLevel;

        @NameInMap("effectionServiceId")
        private Long effectionServiceId;

        @NameInMap("effectionStatus")
        private Integer effectionStatus;

        @NameInMap("serviceName")
        private String serviceName;

        private EffectionServices(Builder builder) {
            this.description = builder.description;
            this.effectionLevel = builder.effectionLevel;
            this.effectionServiceId = builder.effectionServiceId;
            this.effectionStatus = builder.effectionStatus;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectionServices create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectionLevel
         */
        public Long getEffectionLevel() {
            return this.effectionLevel;
        }

        /**
         * @return effectionServiceId
         */
        public Long getEffectionServiceId() {
            return this.effectionServiceId;
        }

        /**
         * @return effectionStatus
         */
        public Integer getEffectionStatus() {
            return this.effectionStatus;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String description; 
            private Long effectionLevel; 
            private Long effectionServiceId; 
            private Integer effectionStatus; 
            private String serviceName; 

            /**
             * 影响描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 影响等级 P1 . P2 P3 P4
             */
            public Builder effectionLevel(Long effectionLevel) {
                this.effectionLevel = effectionLevel;
                return this;
            }

            /**
             * 服务ID
             */
            public Builder effectionServiceId(Long effectionServiceId) {
                this.effectionServiceId = effectionServiceId;
                return this;
            }

            /**
             * 影响服务状态  RECOVERED 已经恢复 ,UN_RECOVERED 未恢复
             */
            public Builder effectionStatus(Integer effectionStatus) {
                this.effectionStatus = effectionStatus;
                return this;
            }

            /**
             * 服务名称
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public EffectionServices build() {
                return new EffectionServices(this);
            } 

        } 

    }
    public static class HandingProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        private String actionName;

        @NameInMap("actionTime")
        private String actionTime;

        @NameInMap("operator")
        private String operator;

        @NameInMap("userId")
        private Long userId;

        private HandingProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandingProblemOperateLogs create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 

            /**
             * 动作名称
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * 操作时间
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * 操作人
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 用户id
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public HandingProblemOperateLogs build() {
                return new HandingProblemOperateLogs(this);
            } 

        } 

    }
    public static class ReplayProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        private String actionName;

        @NameInMap("actionTime")
        private String actionTime;

        @NameInMap("operator")
        private String operator;

        @NameInMap("userId")
        private Long userId;

        private ReplayProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplayProblemOperateLogs create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 

            /**
             * 动作名称
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * 操作时间
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * 操作人
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 用户id
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ReplayProblemOperateLogs build() {
                return new ReplayProblemOperateLogs(this);
            } 

        } 

    }
    public static class ReplayingProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        private String actionName;

        @NameInMap("actionTime")
        private String actionTime;

        @NameInMap("operator")
        private String operator;

        @NameInMap("userId")
        private Long userId;

        private ReplayingProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplayingProblemOperateLogs create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 

            /**
             * 动作名称
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * 操作时间
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * 操作人
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 用户id
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ReplayingProblemOperateLogs build() {
                return new ReplayingProblemOperateLogs(this);
            } 

        } 

    }
    public static class RestoredProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        private String actionName;

        @NameInMap("actionTime")
        private String actionTime;

        @NameInMap("operator")
        private String operator;

        @NameInMap("userId")
        private Long userId;

        private RestoredProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoredProblemOperateLogs create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 

            /**
             * 动作名称
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * 操作时间
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * 操作人
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 用户id
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public RestoredProblemOperateLogs build() {
                return new RestoredProblemOperateLogs(this);
            } 

        } 

    }
    public static class Timelines extends TeaModel {
        @NameInMap("keyNode")
        private String keyNode;

        private Timelines(Builder builder) {
            this.keyNode = builder.keyNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timelines create() {
            return builder().build();
        }

        /**
         * @return keyNode
         */
        public String getKeyNode() {
            return this.keyNode;
        }

        public static final class Builder {
            private String keyNode; 

            /**
             * 关键节点 码表:PROBLEM_KEY_NODE (逗号分隔)
             */
            public Builder keyNode(String keyNode) {
                this.keyNode = keyNode;
                return this;
            }

            public Timelines build() {
                return new Timelines(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("cancelProblemOperateLogs")
        private java.util.List < CancelProblemOperateLogs> cancelProblemOperateLogs;

        @NameInMap("cancelReason")
        private Long cancelReason;

        @NameInMap("cancelReasonDescription")
        private String cancelReasonDescription;

        @NameInMap("coordinationGroups")
        private java.util.List < CoordinationGroups> coordinationGroups;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("discoverTime")
        private String discoverTime;

        @NameInMap("durationTime")
        private Long durationTime;

        @NameInMap("effectionServices")
        private java.util.List < EffectionServices> effectionServices;

        @NameInMap("feedback")
        private String feedback;

        @NameInMap("handingProblemOperateLogs")
        private java.util.List < HandingProblemOperateLogs> handingProblemOperateLogs;

        @NameInMap("incidentId")
        private Long incidentId;

        @NameInMap("incidentNumber")
        private String incidentNumber;

        @NameInMap("mainHandler")
        private Long mainHandler;

        @NameInMap("mainHandlerId")
        private Long mainHandlerId;

        @NameInMap("mainHandlerPhone")
        private String mainHandlerPhone;

        @NameInMap("preliminaryReason")
        private String preliminaryReason;

        @NameInMap("problemId")
        @Validation(required = true)
        private Long problemId;

        @NameInMap("problemLevel")
        private Integer problemLevel;

        @NameInMap("problemName")
        private String problemName;

        @NameInMap("problemNumber")
        private String problemNumber;

        @NameInMap("problemStatus")
        private Integer problemStatus;

        @NameInMap("progressSummary")
        private String progressSummary;

        @NameInMap("progressSummaryRichTextId")
        private Long progressSummaryRichTextId;

        @NameInMap("recoveryTime")
        private String recoveryTime;

        @NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @NameInMap("replayProblemOperateLogs")
        private java.util.List < ReplayProblemOperateLogs> replayProblemOperateLogs;

        @NameInMap("replayingProblemOperateLogs")
        private java.util.List < ReplayingProblemOperateLogs> replayingProblemOperateLogs;

        @NameInMap("restoredProblemOperateLogs")
        private java.util.List < RestoredProblemOperateLogs> restoredProblemOperateLogs;

        @NameInMap("serviceName")
        private String serviceName;

        @NameInMap("timelines")
        private java.util.List < Timelines> timelines;

        private Data(Builder builder) {
            this.cancelProblemOperateLogs = builder.cancelProblemOperateLogs;
            this.cancelReason = builder.cancelReason;
            this.cancelReasonDescription = builder.cancelReasonDescription;
            this.coordinationGroups = builder.coordinationGroups;
            this.createTime = builder.createTime;
            this.discoverTime = builder.discoverTime;
            this.durationTime = builder.durationTime;
            this.effectionServices = builder.effectionServices;
            this.feedback = builder.feedback;
            this.handingProblemOperateLogs = builder.handingProblemOperateLogs;
            this.incidentId = builder.incidentId;
            this.incidentNumber = builder.incidentNumber;
            this.mainHandler = builder.mainHandler;
            this.mainHandlerId = builder.mainHandlerId;
            this.mainHandlerPhone = builder.mainHandlerPhone;
            this.preliminaryReason = builder.preliminaryReason;
            this.problemId = builder.problemId;
            this.problemLevel = builder.problemLevel;
            this.problemName = builder.problemName;
            this.problemNumber = builder.problemNumber;
            this.problemStatus = builder.problemStatus;
            this.progressSummary = builder.progressSummary;
            this.progressSummaryRichTextId = builder.progressSummaryRichTextId;
            this.recoveryTime = builder.recoveryTime;
            this.relatedServiceId = builder.relatedServiceId;
            this.replayProblemOperateLogs = builder.replayProblemOperateLogs;
            this.replayingProblemOperateLogs = builder.replayingProblemOperateLogs;
            this.restoredProblemOperateLogs = builder.restoredProblemOperateLogs;
            this.serviceName = builder.serviceName;
            this.timelines = builder.timelines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cancelProblemOperateLogs
         */
        public java.util.List < CancelProblemOperateLogs> getCancelProblemOperateLogs() {
            return this.cancelProblemOperateLogs;
        }

        /**
         * @return cancelReason
         */
        public Long getCancelReason() {
            return this.cancelReason;
        }

        /**
         * @return cancelReasonDescription
         */
        public String getCancelReasonDescription() {
            return this.cancelReasonDescription;
        }

        /**
         * @return coordinationGroups
         */
        public java.util.List < CoordinationGroups> getCoordinationGroups() {
            return this.coordinationGroups;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return discoverTime
         */
        public String getDiscoverTime() {
            return this.discoverTime;
        }

        /**
         * @return durationTime
         */
        public Long getDurationTime() {
            return this.durationTime;
        }

        /**
         * @return effectionServices
         */
        public java.util.List < EffectionServices> getEffectionServices() {
            return this.effectionServices;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return handingProblemOperateLogs
         */
        public java.util.List < HandingProblemOperateLogs> getHandingProblemOperateLogs() {
            return this.handingProblemOperateLogs;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return incidentNumber
         */
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        /**
         * @return mainHandler
         */
        public Long getMainHandler() {
            return this.mainHandler;
        }

        /**
         * @return mainHandlerId
         */
        public Long getMainHandlerId() {
            return this.mainHandlerId;
        }

        /**
         * @return mainHandlerPhone
         */
        public String getMainHandlerPhone() {
            return this.mainHandlerPhone;
        }

        /**
         * @return preliminaryReason
         */
        public String getPreliminaryReason() {
            return this.preliminaryReason;
        }

        /**
         * @return problemId
         */
        public Long getProblemId() {
            return this.problemId;
        }

        /**
         * @return problemLevel
         */
        public Integer getProblemLevel() {
            return this.problemLevel;
        }

        /**
         * @return problemName
         */
        public String getProblemName() {
            return this.problemName;
        }

        /**
         * @return problemNumber
         */
        public String getProblemNumber() {
            return this.problemNumber;
        }

        /**
         * @return problemStatus
         */
        public Integer getProblemStatus() {
            return this.problemStatus;
        }

        /**
         * @return progressSummary
         */
        public String getProgressSummary() {
            return this.progressSummary;
        }

        /**
         * @return progressSummaryRichTextId
         */
        public Long getProgressSummaryRichTextId() {
            return this.progressSummaryRichTextId;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return relatedServiceId
         */
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        /**
         * @return replayProblemOperateLogs
         */
        public java.util.List < ReplayProblemOperateLogs> getReplayProblemOperateLogs() {
            return this.replayProblemOperateLogs;
        }

        /**
         * @return replayingProblemOperateLogs
         */
        public java.util.List < ReplayingProblemOperateLogs> getReplayingProblemOperateLogs() {
            return this.replayingProblemOperateLogs;
        }

        /**
         * @return restoredProblemOperateLogs
         */
        public java.util.List < RestoredProblemOperateLogs> getRestoredProblemOperateLogs() {
            return this.restoredProblemOperateLogs;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return timelines
         */
        public java.util.List < Timelines> getTimelines() {
            return this.timelines;
        }

        public static final class Builder {
            private java.util.List < CancelProblemOperateLogs> cancelProblemOperateLogs; 
            private Long cancelReason; 
            private String cancelReasonDescription; 
            private java.util.List < CoordinationGroups> coordinationGroups; 
            private String createTime; 
            private String discoverTime; 
            private Long durationTime; 
            private java.util.List < EffectionServices> effectionServices; 
            private String feedback; 
            private java.util.List < HandingProblemOperateLogs> handingProblemOperateLogs; 
            private Long incidentId; 
            private String incidentNumber; 
            private Long mainHandler; 
            private Long mainHandlerId; 
            private String mainHandlerPhone; 
            private String preliminaryReason; 
            private Long problemId; 
            private Integer problemLevel; 
            private String problemName; 
            private String problemNumber; 
            private Integer problemStatus; 
            private String progressSummary; 
            private Long progressSummaryRichTextId; 
            private String recoveryTime; 
            private Long relatedServiceId; 
            private java.util.List < ReplayProblemOperateLogs> replayProblemOperateLogs; 
            private java.util.List < ReplayingProblemOperateLogs> replayingProblemOperateLogs; 
            private java.util.List < RestoredProblemOperateLogs> restoredProblemOperateLogs; 
            private String serviceName; 
            private java.util.List < Timelines> timelines; 

            /**
             * 已取消故障操作日志
             */
            public Builder cancelProblemOperateLogs(java.util.List < CancelProblemOperateLogs> cancelProblemOperateLogs) {
                this.cancelProblemOperateLogs = cancelProblemOperateLogs;
                return this;
            }

            /**
             * 取消原因
             */
            public Builder cancelReason(Long cancelReason) {
                this.cancelReason = cancelReason;
                return this;
            }

            /**
             * 取消原因描述
             */
            public Builder cancelReasonDescription(String cancelReasonDescription) {
                this.cancelReasonDescription = cancelReasonDescription;
                return this;
            }

            /**
             * 应急协同组
             */
            public Builder coordinationGroups(java.util.List < CoordinationGroups> coordinationGroups) {
                this.coordinationGroups = coordinationGroups;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 发现时间
             */
            public Builder discoverTime(String discoverTime) {
                this.discoverTime = discoverTime;
                return this;
            }

            /**
             * 持续时间
             */
            public Builder durationTime(Long durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            /**
             * 影响服务
             */
            public Builder effectionServices(java.util.List < EffectionServices> effectionServices) {
                this.effectionServices = effectionServices;
                return this;
            }

            /**
             * 舆情反馈
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * 处理中故障操作日志
             */
            public Builder handingProblemOperateLogs(java.util.List < HandingProblemOperateLogs> handingProblemOperateLogs) {
                this.handingProblemOperateLogs = handingProblemOperateLogs;
                return this;
            }

            /**
             * 事件id
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * 事件编号
             */
            public Builder incidentNumber(String incidentNumber) {
                this.incidentNumber = incidentNumber;
                return this;
            }

            /**
             * 主要处理人
             */
            public Builder mainHandler(Long mainHandler) {
                this.mainHandler = mainHandler;
                return this;
            }

            /**
             * 主要处理人ID
             */
            public Builder mainHandlerId(Long mainHandlerId) {
                this.mainHandlerId = mainHandlerId;
                return this;
            }

            /**
             * 主要处理人手机号
             */
            public Builder mainHandlerPhone(String mainHandlerPhone) {
                this.mainHandlerPhone = mainHandlerPhone;
                return this;
            }

            /**
             * 初步原因
             */
            public Builder preliminaryReason(String preliminaryReason) {
                this.preliminaryReason = preliminaryReason;
                return this;
            }

            /**
             * ID
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * 故障等级 P1 P2 P3 P4
             */
            public Builder problemLevel(Integer problemLevel) {
                this.problemLevel = problemLevel;
                return this;
            }

            /**
             * 故障名称
             */
            public Builder problemName(String problemName) {
                this.problemName = problemName;
                return this;
            }

            /**
             * 故障编号
             */
            public Builder problemNumber(String problemNumber) {
                this.problemNumber = problemNumber;
                return this;
            }

            /**
             * 故障状态  HANDLING    处理中 RECOVERED  已恢复  REPLAYING   复盘中  REPLAYED     已复盘 CANCEL        已取消
             */
            public Builder problemStatus(Integer problemStatus) {
                this.problemStatus = problemStatus;
                return this;
            }

            /**
             * 进展摘要
             */
            public Builder progressSummary(String progressSummary) {
                this.progressSummary = progressSummary;
                return this;
            }

            /**
             * 进展摘要富文本id
             */
            public Builder progressSummaryRichTextId(Long progressSummaryRichTextId) {
                this.progressSummaryRichTextId = progressSummaryRichTextId;
                return this;
            }

            /**
             * 恢复时间
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * 关联服务ID
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * 已复盘故障操作日志
             */
            public Builder replayProblemOperateLogs(java.util.List < ReplayProblemOperateLogs> replayProblemOperateLogs) {
                this.replayProblemOperateLogs = replayProblemOperateLogs;
                return this;
            }

            /**
             * 复盘中故障操作日志
             */
            public Builder replayingProblemOperateLogs(java.util.List < ReplayingProblemOperateLogs> replayingProblemOperateLogs) {
                this.replayingProblemOperateLogs = replayingProblemOperateLogs;
                return this;
            }

            /**
             * 已恢复故障操作日志
             */
            public Builder restoredProblemOperateLogs(java.util.List < RestoredProblemOperateLogs> restoredProblemOperateLogs) {
                this.restoredProblemOperateLogs = restoredProblemOperateLogs;
                return this;
            }

            /**
             * 关联服务 名称
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * 故障操作时间线
             */
            public Builder timelines(java.util.List < Timelines> timelines) {
                this.timelines = timelines;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
