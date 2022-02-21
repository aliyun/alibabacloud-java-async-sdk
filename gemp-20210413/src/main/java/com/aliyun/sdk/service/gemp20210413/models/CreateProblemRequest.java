// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemRequest} extends {@link RequestModel}
 *
 * <p>CreateProblemRequest</p>
 */
public class CreateProblemRequest extends Request {
    @Body
    @NameInMap("affectServiceIds")
    private java.util.List < Long > affectServiceIds;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("discoverTime")
    private String discoverTime;

    @Body
    @NameInMap("incidentId")
    private Long incidentId;

    @Body
    @NameInMap("mainHandlerId")
    private Long mainHandlerId;

    @Body
    @NameInMap("preliminaryReason")
    private String preliminaryReason;

    @Body
    @NameInMap("problemLevel")
    private String problemLevel;

    @Body
    @NameInMap("problemName")
    private String problemName;

    @Body
    @NameInMap("problemNotifyType")
    private String problemNotifyType;

    @Body
    @NameInMap("problemStatus")
    private String problemStatus;

    @Body
    @NameInMap("progressSummary")
    private String progressSummary;

    @Body
    @NameInMap("progressSummaryRichTextId")
    private Long progressSummaryRichTextId;

    @Body
    @NameInMap("recoveryTime")
    private String recoveryTime;

    @Body
    @NameInMap("relatedServiceId")
    private Long relatedServiceId;

    @Body
    @NameInMap("serviceGroupIds")
    private java.util.List < Long > serviceGroupIds;

    private CreateProblemRequest(Builder builder) {
        super(builder);
        this.affectServiceIds = builder.affectServiceIds;
        this.clientToken = builder.clientToken;
        this.discoverTime = builder.discoverTime;
        this.incidentId = builder.incidentId;
        this.mainHandlerId = builder.mainHandlerId;
        this.preliminaryReason = builder.preliminaryReason;
        this.problemLevel = builder.problemLevel;
        this.problemName = builder.problemName;
        this.problemNotifyType = builder.problemNotifyType;
        this.problemStatus = builder.problemStatus;
        this.progressSummary = builder.progressSummary;
        this.progressSummaryRichTextId = builder.progressSummaryRichTextId;
        this.recoveryTime = builder.recoveryTime;
        this.relatedServiceId = builder.relatedServiceId;
        this.serviceGroupIds = builder.serviceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectServiceIds
     */
    public java.util.List < Long > getAffectServiceIds() {
        return this.affectServiceIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return discoverTime
     */
    public String getDiscoverTime() {
        return this.discoverTime;
    }

    /**
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return mainHandlerId
     */
    public Long getMainHandlerId() {
        return this.mainHandlerId;
    }

    /**
     * @return preliminaryReason
     */
    public String getPreliminaryReason() {
        return this.preliminaryReason;
    }

    /**
     * @return problemLevel
     */
    public String getProblemLevel() {
        return this.problemLevel;
    }

    /**
     * @return problemName
     */
    public String getProblemName() {
        return this.problemName;
    }

    /**
     * @return problemNotifyType
     */
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

    /**
     * @return problemStatus
     */
    public String getProblemStatus() {
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
     * @return serviceGroupIds
     */
    public java.util.List < Long > getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public static final class Builder extends Request.Builder<CreateProblemRequest, Builder> {
        private java.util.List < Long > affectServiceIds; 
        private String clientToken; 
        private String discoverTime; 
        private Long incidentId; 
        private Long mainHandlerId; 
        private String preliminaryReason; 
        private String problemLevel; 
        private String problemName; 
        private String problemNotifyType; 
        private String problemStatus; 
        private String progressSummary; 
        private Long progressSummaryRichTextId; 
        private String recoveryTime; 
        private Long relatedServiceId; 
        private java.util.List < Long > serviceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateProblemRequest response) {
            super(response);
            this.affectServiceIds = response.affectServiceIds;
            this.clientToken = response.clientToken;
            this.discoverTime = response.discoverTime;
            this.incidentId = response.incidentId;
            this.mainHandlerId = response.mainHandlerId;
            this.preliminaryReason = response.preliminaryReason;
            this.problemLevel = response.problemLevel;
            this.problemName = response.problemName;
            this.problemNotifyType = response.problemNotifyType;
            this.problemStatus = response.problemStatus;
            this.progressSummary = response.progressSummary;
            this.progressSummaryRichTextId = response.progressSummaryRichTextId;
            this.recoveryTime = response.recoveryTime;
            this.relatedServiceId = response.relatedServiceId;
            this.serviceGroupIds = response.serviceGroupIds;
        } 

        /**
         * 影响服务列表
         */
        public Builder affectServiceIds(java.util.List < Long > affectServiceIds) {
            this.putBodyParameter("affectServiceIds", affectServiceIds);
            this.affectServiceIds = affectServiceIds;
            return this;
        }

        /**
         * 幂等校验Id
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 发现时间 (XXXX-XX-XX 00:00:00)
         */
        public Builder discoverTime(String discoverTime) {
            this.putBodyParameter("discoverTime", discoverTime);
            this.discoverTime = discoverTime;
            return this;
        }

        /**
         * 事件id
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        /**
         * 主要处理人
         */
        public Builder mainHandlerId(Long mainHandlerId) {
            this.putBodyParameter("mainHandlerId", mainHandlerId);
            this.mainHandlerId = mainHandlerId;
            return this;
        }

        /**
         * 初步原因
         */
        public Builder preliminaryReason(String preliminaryReason) {
            this.putBodyParameter("preliminaryReason", preliminaryReason);
            this.preliminaryReason = preliminaryReason;
            return this;
        }

        /**
         * 故障等级 1=P1 2=P2 3=P3 4=P4
         */
        public Builder problemLevel(String problemLevel) {
            this.putBodyParameter("problemLevel", problemLevel);
            this.problemLevel = problemLevel;
            return this;
        }

        /**
         * 故障名称
         */
        public Builder problemName(String problemName) {
            this.putBodyParameter("problemName", problemName);
            this.problemName = problemName;
            return this;
        }

        /**
         * 通告类型
         */
        public Builder problemNotifyType(String problemNotifyType) {
            this.putBodyParameter("problemNotifyType", problemNotifyType);
            this.problemNotifyType = problemNotifyType;
            return this;
        }

        /**
         * 故障状态  HANDLING 处理中 RECOVERED 已恢复  REPLAYING 复盘中  REPLAYED 已复盘 CANCEL 已取消
         */
        public Builder problemStatus(String problemStatus) {
            this.putBodyParameter("problemStatus", problemStatus);
            this.problemStatus = problemStatus;
            return this;
        }

        /**
         * 进展摘要
         */
        public Builder progressSummary(String progressSummary) {
            this.putBodyParameter("progressSummary", progressSummary);
            this.progressSummary = progressSummary;
            return this;
        }

        /**
         * 进展摘要富文本id
         */
        public Builder progressSummaryRichTextId(Long progressSummaryRichTextId) {
            this.putBodyParameter("progressSummaryRichTextId", progressSummaryRichTextId);
            this.progressSummaryRichTextId = progressSummaryRichTextId;
            return this;
        }

        /**
         * 恢复时间
         */
        public Builder recoveryTime(String recoveryTime) {
            this.putBodyParameter("recoveryTime", recoveryTime);
            this.recoveryTime = recoveryTime;
            return this;
        }

        /**
         * 所属服务
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * 应急协同组
         */
        public Builder serviceGroupIds(java.util.List < Long > serviceGroupIds) {
            this.putBodyParameter("serviceGroupIds", serviceGroupIds);
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }

        @Override
        public CreateProblemRequest build() {
            return new CreateProblemRequest(this);
        } 

    } 

}
