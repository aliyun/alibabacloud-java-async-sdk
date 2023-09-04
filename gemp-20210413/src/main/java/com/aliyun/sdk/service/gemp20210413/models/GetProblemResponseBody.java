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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
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
             * actionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * actionTime.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * userId.
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
        @NameInMap("isValid")
        private Long isValid;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("serviceGroupName")
        private String serviceGroupName;

        private CoordinationGroups(Builder builder) {
            this.isValid = builder.isValid;
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
         * @return isValid
         */
        public Long getIsValid() {
            return this.isValid;
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
            private Long isValid; 
            private Long serviceGroupId; 
            private String serviceGroupName; 

            /**
             * isValid.
             */
            public Builder isValid(Long isValid) {
                this.isValid = isValid;
                return this;
            }

            /**
             * serviceGroupId.
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * serviceGroupName.
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

        @NameInMap("serviceDeleteType")
        private Integer serviceDeleteType;

        @NameInMap("serviceName")
        private String serviceName;

        private EffectionServices(Builder builder) {
            this.description = builder.description;
            this.effectionLevel = builder.effectionLevel;
            this.effectionServiceId = builder.effectionServiceId;
            this.effectionStatus = builder.effectionStatus;
            this.serviceDeleteType = builder.serviceDeleteType;
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
         * @return serviceDeleteType
         */
        public Integer getServiceDeleteType() {
            return this.serviceDeleteType;
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
            private Integer serviceDeleteType; 
            private String serviceName; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * effectionLevel.
             */
            public Builder effectionLevel(Long effectionLevel) {
                this.effectionLevel = effectionLevel;
                return this;
            }

            /**
             * effectionServiceId.
             */
            public Builder effectionServiceId(Long effectionServiceId) {
                this.effectionServiceId = effectionServiceId;
                return this;
            }

            /**
             * effectionStatus.
             */
            public Builder effectionStatus(Integer effectionStatus) {
                this.effectionStatus = effectionStatus;
                return this;
            }

            /**
             * serviceDeleteType.
             */
            public Builder serviceDeleteType(Integer serviceDeleteType) {
                this.serviceDeleteType = serviceDeleteType;
                return this;
            }

            /**
             * serviceName.
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

        @NameInMap("userIsValid")
        private Long userIsValid;

        private HandingProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
            this.userIsValid = builder.userIsValid;
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

        /**
         * @return userIsValid
         */
        public Long getUserIsValid() {
            return this.userIsValid;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 
            private Long userIsValid; 

            /**
             * actionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * actionTime.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userIsValid.
             */
            public Builder userIsValid(Long userIsValid) {
                this.userIsValid = userIsValid;
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

        @NameInMap("userIsValid")
        private Long userIsValid;

        private ReplayProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
            this.userIsValid = builder.userIsValid;
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

        /**
         * @return userIsValid
         */
        public Long getUserIsValid() {
            return this.userIsValid;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 
            private Long userIsValid; 

            /**
             * actionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * actionTime.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userIsValid.
             */
            public Builder userIsValid(Long userIsValid) {
                this.userIsValid = userIsValid;
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

        @NameInMap("userIsValid")
        private Long userIsValid;

        private ReplayingProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
            this.userIsValid = builder.userIsValid;
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

        /**
         * @return userIsValid
         */
        public Long getUserIsValid() {
            return this.userIsValid;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 
            private Long userIsValid; 

            /**
             * actionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * actionTime.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userIsValid.
             */
            public Builder userIsValid(Long userIsValid) {
                this.userIsValid = userIsValid;
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

        @NameInMap("userIsValid")
        private Long userIsValid;

        private RestoredProblemOperateLogs(Builder builder) {
            this.actionName = builder.actionName;
            this.actionTime = builder.actionTime;
            this.operator = builder.operator;
            this.userId = builder.userId;
            this.userIsValid = builder.userIsValid;
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

        /**
         * @return userIsValid
         */
        public Long getUserIsValid() {
            return this.userIsValid;
        }

        public static final class Builder {
            private String actionName; 
            private String actionTime; 
            private String operator; 
            private Long userId; 
            private Long userIsValid; 

            /**
             * actionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * actionTime.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userIsValid.
             */
            public Builder userIsValid(Long userIsValid) {
                this.userIsValid = userIsValid;
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
             * keyNode.
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

        @NameInMap("isRuleTrigger")
        private Boolean isRuleTrigger;

        @NameInMap("mainHandler")
        private Long mainHandler;

        @NameInMap("mainHandlerId")
        private Long mainHandlerId;

        @NameInMap("mainHandlerIsValid")
        private Long mainHandlerIsValid;

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

        @NameInMap("serviceDeleteType")
        private Integer serviceDeleteType;

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
            this.isRuleTrigger = builder.isRuleTrigger;
            this.mainHandler = builder.mainHandler;
            this.mainHandlerId = builder.mainHandlerId;
            this.mainHandlerIsValid = builder.mainHandlerIsValid;
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
            this.serviceDeleteType = builder.serviceDeleteType;
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
         * @return isRuleTrigger
         */
        public Boolean getIsRuleTrigger() {
            return this.isRuleTrigger;
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
         * @return mainHandlerIsValid
         */
        public Long getMainHandlerIsValid() {
            return this.mainHandlerIsValid;
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
         * @return serviceDeleteType
         */
        public Integer getServiceDeleteType() {
            return this.serviceDeleteType;
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
            private Boolean isRuleTrigger; 
            private Long mainHandler; 
            private Long mainHandlerId; 
            private Long mainHandlerIsValid; 
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
            private Integer serviceDeleteType; 
            private String serviceName; 
            private java.util.List < Timelines> timelines; 

            /**
             * cancelProblemOperateLogs.
             */
            public Builder cancelProblemOperateLogs(java.util.List < CancelProblemOperateLogs> cancelProblemOperateLogs) {
                this.cancelProblemOperateLogs = cancelProblemOperateLogs;
                return this;
            }

            /**
             * cancelReason.
             */
            public Builder cancelReason(Long cancelReason) {
                this.cancelReason = cancelReason;
                return this;
            }

            /**
             * cancelReasonDescription.
             */
            public Builder cancelReasonDescription(String cancelReasonDescription) {
                this.cancelReasonDescription = cancelReasonDescription;
                return this;
            }

            /**
             * coordinationGroups.
             */
            public Builder coordinationGroups(java.util.List < CoordinationGroups> coordinationGroups) {
                this.coordinationGroups = coordinationGroups;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * discoverTime.
             */
            public Builder discoverTime(String discoverTime) {
                this.discoverTime = discoverTime;
                return this;
            }

            /**
             * durationTime.
             */
            public Builder durationTime(Long durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            /**
             * effectionServices.
             */
            public Builder effectionServices(java.util.List < EffectionServices> effectionServices) {
                this.effectionServices = effectionServices;
                return this;
            }

            /**
             * feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * handingProblemOperateLogs.
             */
            public Builder handingProblemOperateLogs(java.util.List < HandingProblemOperateLogs> handingProblemOperateLogs) {
                this.handingProblemOperateLogs = handingProblemOperateLogs;
                return this;
            }

            /**
             * incidentId.
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * incidentNumber.
             */
            public Builder incidentNumber(String incidentNumber) {
                this.incidentNumber = incidentNumber;
                return this;
            }

            /**
             * isRuleTrigger.
             */
            public Builder isRuleTrigger(Boolean isRuleTrigger) {
                this.isRuleTrigger = isRuleTrigger;
                return this;
            }

            /**
             * mainHandler.
             */
            public Builder mainHandler(Long mainHandler) {
                this.mainHandler = mainHandler;
                return this;
            }

            /**
             * mainHandlerId.
             */
            public Builder mainHandlerId(Long mainHandlerId) {
                this.mainHandlerId = mainHandlerId;
                return this;
            }

            /**
             * mainHandlerIsValid.
             */
            public Builder mainHandlerIsValid(Long mainHandlerIsValid) {
                this.mainHandlerIsValid = mainHandlerIsValid;
                return this;
            }

            /**
             * mainHandlerPhone.
             */
            public Builder mainHandlerPhone(String mainHandlerPhone) {
                this.mainHandlerPhone = mainHandlerPhone;
                return this;
            }

            /**
             * preliminaryReason.
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
             * problemLevel.
             */
            public Builder problemLevel(Integer problemLevel) {
                this.problemLevel = problemLevel;
                return this;
            }

            /**
             * problemName.
             */
            public Builder problemName(String problemName) {
                this.problemName = problemName;
                return this;
            }

            /**
             * problemNumber.
             */
            public Builder problemNumber(String problemNumber) {
                this.problemNumber = problemNumber;
                return this;
            }

            /**
             * problemStatus.
             */
            public Builder problemStatus(Integer problemStatus) {
                this.problemStatus = problemStatus;
                return this;
            }

            /**
             * progressSummary.
             */
            public Builder progressSummary(String progressSummary) {
                this.progressSummary = progressSummary;
                return this;
            }

            /**
             * progressSummaryRichTextId.
             */
            public Builder progressSummaryRichTextId(Long progressSummaryRichTextId) {
                this.progressSummaryRichTextId = progressSummaryRichTextId;
                return this;
            }

            /**
             * recoveryTime.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * relatedServiceId.
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * replayProblemOperateLogs.
             */
            public Builder replayProblemOperateLogs(java.util.List < ReplayProblemOperateLogs> replayProblemOperateLogs) {
                this.replayProblemOperateLogs = replayProblemOperateLogs;
                return this;
            }

            /**
             * replayingProblemOperateLogs.
             */
            public Builder replayingProblemOperateLogs(java.util.List < ReplayingProblemOperateLogs> replayingProblemOperateLogs) {
                this.replayingProblemOperateLogs = replayingProblemOperateLogs;
                return this;
            }

            /**
             * restoredProblemOperateLogs.
             */
            public Builder restoredProblemOperateLogs(java.util.List < RestoredProblemOperateLogs> restoredProblemOperateLogs) {
                this.restoredProblemOperateLogs = restoredProblemOperateLogs;
                return this;
            }

            /**
             * serviceDeleteType
             */
            public Builder serviceDeleteType(Integer serviceDeleteType) {
                this.serviceDeleteType = serviceDeleteType;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * timelines.
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
