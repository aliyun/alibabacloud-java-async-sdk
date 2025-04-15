// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link AddHotlineNumberRequest} extends {@link RequestModel}
 *
 * <p>AddHotlineNumberRequest</p>
 */
public class AddHotlineNumberRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableInbound")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableInbound;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableInboundEvaluation")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableInboundEvaluation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableOutbound")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableOutbound;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableOutboundEvaluation")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableOutboundEvaluation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationLevel")
    private Integer evaluationLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotlineNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotlineNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InboundFlowId")
    private Long inboundFlowId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutboundAllDepart")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean outboundAllDepart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutboundRangeList")
    private java.util.List<OutboundRangeList> outboundRangeList;

    private AddHotlineNumberRequest(Builder builder) {
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

    public static AddHotlineNumberRequest create() {
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
    public java.util.List<OutboundRangeList> getOutboundRangeList() {
        return this.outboundRangeList;
    }

    public static final class Builder extends Request.Builder<AddHotlineNumberRequest, Builder> {
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
        private java.util.List<OutboundRangeList> outboundRangeList; 

        private Builder() {
            super();
        } 

        private Builder(AddHotlineNumberRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInbound(Boolean enableInbound) {
            this.putBodyParameter("EnableInbound", enableInbound);
            this.enableInbound = enableInbound;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInboundEvaluation(Boolean enableInboundEvaluation) {
            this.putBodyParameter("EnableInboundEvaluation", enableInboundEvaluation);
            this.enableInboundEvaluation = enableInboundEvaluation;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOutbound(Boolean enableOutbound) {
            this.putBodyParameter("EnableOutbound", enableOutbound);
            this.enableOutbound = enableOutbound;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOutboundEvaluation(Boolean enableOutboundEvaluation) {
            this.putBodyParameter("EnableOutboundEvaluation", enableOutboundEvaluation);
            this.enableOutboundEvaluation = enableOutboundEvaluation;
            return this;
        }

        /**
         * EvaluationLevel.
         */
        public Builder evaluationLevel(Integer evaluationLevel) {
            this.putBodyParameter("EvaluationLevel", evaluationLevel);
            this.evaluationLevel = evaluationLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>05710000****</p>
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putBodyParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * InboundFlowId.
         */
        public Builder inboundFlowId(Long inboundFlowId) {
            this.putBodyParameter("InboundFlowId", inboundFlowId);
            this.inboundFlowId = inboundFlowId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder outboundAllDepart(Boolean outboundAllDepart) {
            this.putBodyParameter("OutboundAllDepart", outboundAllDepart);
            this.outboundAllDepart = outboundAllDepart;
            return this;
        }

        /**
         * OutboundRangeList.
         */
        public Builder outboundRangeList(java.util.List<OutboundRangeList> outboundRangeList) {
            String outboundRangeListShrink = shrink(outboundRangeList, "OutboundRangeList", "json");
            this.putBodyParameter("OutboundRangeList", outboundRangeListShrink);
            this.outboundRangeList = outboundRangeList;
            return this;
        }

        @Override
        public AddHotlineNumberRequest build() {
            return new AddHotlineNumberRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddHotlineNumberRequest} extends {@link TeaModel}
     *
     * <p>AddHotlineNumberRequest</p>
     */
    public static class OutboundRangeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentId")
        private Long departmentId;

        @com.aliyun.core.annotation.NameInMap("GroupIdList")
        private java.util.List<Long> groupIdList;

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
        public java.util.List<Long> getGroupIdList() {
            return this.groupIdList;
        }

        public static final class Builder {
            private Long departmentId; 
            private java.util.List<Long> groupIdList; 

            private Builder() {
            } 

            private Builder(OutboundRangeList model) {
                this.departmentId = model.departmentId;
                this.groupIdList = model.groupIdList;
            } 

            /**
             * DepartmentId.
             */
            public Builder departmentId(Long departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * GroupIdList.
             */
            public Builder groupIdList(java.util.List<Long> groupIdList) {
                this.groupIdList = groupIdList;
                return this;
            }

            public OutboundRangeList build() {
                return new OutboundRangeList(this);
            } 

        } 

    }
}
