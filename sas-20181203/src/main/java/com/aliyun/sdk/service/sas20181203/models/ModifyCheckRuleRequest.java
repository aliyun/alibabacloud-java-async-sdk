// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyCheckRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyCheckRuleRequest</p>
 */
public class ModifyCheckRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddInstanceList")
    private java.util.List<AddInstanceList> addInstanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteInstanceList")
    private java.util.List<DeleteInstanceList> deleteInstanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectEndTime")
    private Long effectEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectStartTime")
    private Long effectStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectType")
    private String effectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private String scopeType;

    private ModifyCheckRuleRequest(Builder builder) {
        super(builder);
        this.addInstanceList = builder.addInstanceList;
        this.deleteInstanceList = builder.deleteInstanceList;
        this.effectEndTime = builder.effectEndTime;
        this.effectStartTime = builder.effectStartTime;
        this.effectType = builder.effectType;
        this.remark = builder.remark;
        this.ruleId = builder.ruleId;
        this.ruleType = builder.ruleType;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCheckRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addInstanceList
     */
    public java.util.List<AddInstanceList> getAddInstanceList() {
        return this.addInstanceList;
    }

    /**
     * @return deleteInstanceList
     */
    public java.util.List<DeleteInstanceList> getDeleteInstanceList() {
        return this.deleteInstanceList;
    }

    /**
     * @return effectEndTime
     */
    public Long getEffectEndTime() {
        return this.effectEndTime;
    }

    /**
     * @return effectStartTime
     */
    public Long getEffectStartTime() {
        return this.effectStartTime;
    }

    /**
     * @return effectType
     */
    public String getEffectType() {
        return this.effectType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<ModifyCheckRuleRequest, Builder> {
        private java.util.List<AddInstanceList> addInstanceList; 
        private java.util.List<DeleteInstanceList> deleteInstanceList; 
        private Long effectEndTime; 
        private Long effectStartTime; 
        private String effectType; 
        private String remark; 
        private Long ruleId; 
        private String ruleType; 
        private String scopeType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCheckRuleRequest request) {
            super(request);
            this.addInstanceList = request.addInstanceList;
            this.deleteInstanceList = request.deleteInstanceList;
            this.effectEndTime = request.effectEndTime;
            this.effectStartTime = request.effectStartTime;
            this.effectType = request.effectType;
            this.remark = request.remark;
            this.ruleId = request.ruleId;
            this.ruleType = request.ruleType;
            this.scopeType = request.scopeType;
        } 

        /**
         * <p>The list of instances to be added in this rule update. If no instances need to be added, you do not need to specify this parameter.</p>
         */
        public Builder addInstanceList(java.util.List<AddInstanceList> addInstanceList) {
            this.putQueryParameter("AddInstanceList", addInstanceList);
            this.addInstanceList = addInstanceList;
            return this;
        }

        /**
         * <p>The list of instances to be removed in this rule update. If no instances need to be removed, you do not need to specify this parameter.</p>
         */
        public Builder deleteInstanceList(java.util.List<DeleteInstanceList> deleteInstanceList) {
            this.putQueryParameter("DeleteInstanceList", deleteInstanceList);
            this.deleteInstanceList = deleteInstanceList;
            return this;
        }

        /**
         * <p>The effective end time of the whitelist rule. The value is a UNIX timestamp in milliseconds. This parameter is required when EffectType is set to CUSTOM. The whitelist automatically expires after this time.</p>
         * 
         * <strong>example:</strong>
         * <p>1774915200000</p>
         */
        public Builder effectEndTime(Long effectEndTime) {
            this.putQueryParameter("EffectEndTime", effectEndTime);
            this.effectEndTime = effectEndTime;
            return this;
        }

        /**
         * <p>The effective start time of the whitelist rule. The value is a UNIX timestamp in milliseconds. This parameter is required when EffectType is set to CUSTOM, and the value must be less than or equal to the value of EffectEndTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1767225600000</p>
         */
        public Builder effectStartTime(Long effectStartTime) {
            this.putQueryParameter("EffectStartTime", effectStartTime);
            this.effectStartTime = effectStartTime;
            return this;
        }

        /**
         * <p>The effective pattern of the whitelist rule. Valid values: PERMANENT (permanent, default value) and CUSTOM (custom effective period). If the value is CUSTOM, you must specify both EffectStartTime and EffectEndTime. After the modification, the server immediately recalculates the whitelist status based on the new effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        public Builder effectType(String effectType) {
            this.putQueryParameter("EffectType", effectType);
            this.effectType = effectType;
            return this;
        }

        /**
         * <p>The remark.</p>
         * 
         * <strong>example:</strong>
         * <p>testRemark</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The rule ID. You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListCheckRule</a> operation to obtain this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9000**</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The rule type. Default value: <strong>WHITE</strong>. Valid values:</p>
         * <ul>
         * <li><strong>WHITE</strong>: whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHITE</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The effective scope of the modified rule. Valid values:</p>
         * <ul>
         * <li><strong>INSTNACE</strong>: instance.</li>
         * <li><strong>ITEM</strong>: check item.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public ModifyCheckRuleRequest build() {
            return new ModifyCheckRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCheckRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyCheckRuleRequest</p>
     */
    public static class AddInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private AddInstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddInstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AddInstanceList model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9g8ljygfqs1ez3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AddInstanceList build() {
                return new AddInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCheckRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyCheckRuleRequest</p>
     */
    public static class DeleteInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private DeleteInstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteInstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(DeleteInstanceList model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vb0e8qdaj0yyxjo****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public DeleteInstanceList build() {
                return new DeleteInstanceList(this);
            } 

        } 

    }
}
