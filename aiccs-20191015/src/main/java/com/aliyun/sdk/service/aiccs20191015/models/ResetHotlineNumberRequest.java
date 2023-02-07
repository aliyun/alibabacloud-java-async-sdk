// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetHotlineNumberRequest} extends {@link RequestModel}
 *
 * <p>ResetHotlineNumberRequest</p>
 */
public class ResetHotlineNumberRequest extends Request {
    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("EnableInbound")
    @Validation(required = true)
    private Boolean enableInbound;

    @Body
    @NameInMap("EnableInboundEvaluation")
    @Validation(required = true)
    private Boolean enableInboundEvaluation;

    @Body
    @NameInMap("EnableOutbound")
    @Validation(required = true)
    private Boolean enableOutbound;

    @Body
    @NameInMap("EnableOutboundEvaluation")
    @Validation(required = true)
    private Boolean enableOutboundEvaluation;

    @Body
    @NameInMap("EvaluationLevel")
    private Integer evaluationLevel;

    @Body
    @NameInMap("HotlineNumber")
    @Validation(required = true)
    private String hotlineNumber;

    @Body
    @NameInMap("InboundFlowId")
    private Long inboundFlowId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("OutboundAllDepart")
    @Validation(required = true)
    private Boolean outboundAllDepart;

    @Body
    @NameInMap("OutboundRangeList")
    private java.util.List < OutboundRangeList> outboundRangeList;

    private ResetHotlineNumberRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.enableInbound = builder.enableInbound;
        this.enableInboundEvaluation = builder.enableInboundEvaluation;
        this.enableOutbound = builder.enableOutbound;
        this.enableOutboundEvaluation = builder.enableOutboundEvaluation;
        this.evaluationLevel = builder.evaluationLevel;
        this.hotlineNumber = builder.hotlineNumber;
        this.inboundFlowId = builder.inboundFlowId;
        this.instanceId = builder.instanceId;
        this.outboundAllDepart = builder.outboundAllDepart;
        this.outboundRangeList = builder.outboundRangeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetHotlineNumberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableInbound
     */
    public Boolean getEnableInbound() {
        return this.enableInbound;
    }

    /**
     * @return enableInboundEvaluation
     */
    public Boolean getEnableInboundEvaluation() {
        return this.enableInboundEvaluation;
    }

    /**
     * @return enableOutbound
     */
    public Boolean getEnableOutbound() {
        return this.enableOutbound;
    }

    /**
     * @return enableOutboundEvaluation
     */
    public Boolean getEnableOutboundEvaluation() {
        return this.enableOutboundEvaluation;
    }

    /**
     * @return evaluationLevel
     */
    public Integer getEvaluationLevel() {
        return this.evaluationLevel;
    }

    /**
     * @return hotlineNumber
     */
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    /**
     * @return inboundFlowId
     */
    public Long getInboundFlowId() {
        return this.inboundFlowId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return outboundAllDepart
     */
    public Boolean getOutboundAllDepart() {
        return this.outboundAllDepart;
    }

    /**
     * @return outboundRangeList
     */
    public java.util.List < OutboundRangeList> getOutboundRangeList() {
        return this.outboundRangeList;
    }

    public static final class Builder extends Request.Builder<ResetHotlineNumberRequest, Builder> {
        private String description; 
        private Boolean enableInbound; 
        private Boolean enableInboundEvaluation; 
        private Boolean enableOutbound; 
        private Boolean enableOutboundEvaluation; 
        private Integer evaluationLevel; 
        private String hotlineNumber; 
        private Long inboundFlowId; 
        private String instanceId; 
        private Boolean outboundAllDepart; 
        private java.util.List < OutboundRangeList> outboundRangeList; 

        private Builder() {
            super();
        } 

        private Builder(ResetHotlineNumberRequest request) {
            super(request);
            this.description = request.description;
            this.enableInbound = request.enableInbound;
            this.enableInboundEvaluation = request.enableInboundEvaluation;
            this.enableOutbound = request.enableOutbound;
            this.enableOutboundEvaluation = request.enableOutboundEvaluation;
            this.evaluationLevel = request.evaluationLevel;
            this.hotlineNumber = request.hotlineNumber;
            this.inboundFlowId = request.inboundFlowId;
            this.instanceId = request.instanceId;
            this.outboundAllDepart = request.outboundAllDepart;
            this.outboundRangeList = request.outboundRangeList;
        } 

        /**
         * 号码描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 是否用于入呼
         */
        public Builder enableInbound(Boolean enableInbound) {
            this.putBodyParameter("EnableInbound", enableInbound);
            this.enableInbound = enableInbound;
            return this;
        }

        /**
         * 是否开启入呼满意度
         */
        public Builder enableInboundEvaluation(Boolean enableInboundEvaluation) {
            this.putBodyParameter("EnableInboundEvaluation", enableInboundEvaluation);
            this.enableInboundEvaluation = enableInboundEvaluation;
            return this;
        }

        /**
         * 是否用于外呼
         */
        public Builder enableOutbound(Boolean enableOutbound) {
            this.putBodyParameter("EnableOutbound", enableOutbound);
            this.enableOutbound = enableOutbound;
            return this;
        }

        /**
         * 是否开启外呼满意度
         */
        public Builder enableOutboundEvaluation(Boolean enableOutboundEvaluation) {
            this.putBodyParameter("EnableOutboundEvaluation", enableOutboundEvaluation);
            this.enableOutboundEvaluation = enableOutboundEvaluation;
            return this;
        }

        /**
         * 满意度等级
         */
        public Builder evaluationLevel(Integer evaluationLevel) {
            this.putBodyParameter("EvaluationLevel", evaluationLevel);
            this.evaluationLevel = evaluationLevel;
            return this;
        }

        /**
         * 号码
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putBodyParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * 入呼ivr流程id
         */
        public Builder inboundFlowId(Long inboundFlowId) {
            this.putBodyParameter("InboundFlowId", inboundFlowId);
            this.inboundFlowId = inboundFlowId;
            return this;
        }

        /**
         * 实例id
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 外呼是否对所有部门生效
         */
        public Builder outboundAllDepart(Boolean outboundAllDepart) {
            this.putBodyParameter("OutboundAllDepart", outboundAllDepart);
            this.outboundAllDepart = outboundAllDepart;
            return this;
        }

        /**
         * 外呼生效范围
         */
        public Builder outboundRangeList(java.util.List < OutboundRangeList> outboundRangeList) {
            String outboundRangeListShrink = shrink(outboundRangeList, "OutboundRangeList", "json");
            this.putBodyParameter("OutboundRangeList", outboundRangeListShrink);
            this.outboundRangeList = outboundRangeList;
            return this;
        }

        @Override
        public ResetHotlineNumberRequest build() {
            return new ResetHotlineNumberRequest(this);
        } 

    } 

    public static class OutboundRangeList extends TeaModel {
        @NameInMap("DepartmentId")
        private Long departmentId;

        @NameInMap("GroupIdList")
        private java.util.List < Long > groupIdList;

        private OutboundRangeList(Builder builder) {
            this.departmentId = builder.departmentId;
            this.groupIdList = builder.groupIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutboundRangeList create() {
            return builder().build();
        }

        /**
         * @return departmentId
         */
        public Long getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return groupIdList
         */
        public java.util.List < Long > getGroupIdList() {
            return this.groupIdList;
        }

        public static final class Builder {
            private Long departmentId; 
            private java.util.List < Long > groupIdList; 

            /**
             * 生效部门id
             */
            public Builder departmentId(Long departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * 生效技能组列表（部门123下）
             */
            public Builder groupIdList(java.util.List < Long > groupIdList) {
                this.groupIdList = groupIdList;
                return this;
            }

            public OutboundRangeList build() {
                return new OutboundRangeList(this);
            } 

        } 

    }
}
