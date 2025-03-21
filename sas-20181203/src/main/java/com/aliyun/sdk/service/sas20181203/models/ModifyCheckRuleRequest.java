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
            this.remark = request.remark;
            this.ruleId = request.ruleId;
            this.ruleType = request.ruleType;
            this.scopeType = request.scopeType;
        } 

        /**
         * <p>The list of instances to be added in this rule update. This parameter does not need to be passed if there are no instances to add.</p>
         */
        public Builder addInstanceList(java.util.List<AddInstanceList> addInstanceList) {
            this.putQueryParameter("AddInstanceList", addInstanceList);
            this.addInstanceList = addInstanceList;
            return this;
        }

        /**
         * <p>The list of instances to be removed in this rule update. This parameter does not need to be passed if there are no instances to remove.</p>
         */
        public Builder deleteInstanceList(java.util.List<DeleteInstanceList> deleteInstanceList) {
            this.putQueryParameter("DeleteInstanceList", deleteInstanceList);
            this.deleteInstanceList = deleteInstanceList;
            return this;
        }

        /**
         * <p>Remarks.</p>
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
         * <p>Rule ID.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/2590599.html">ListCheckRule</a> API.</p>
         * </blockquote>
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
         * <p>Rule type. Default is <strong>WHITE</strong>. Values:</p>
         * <ul>
         * <li><strong>WHITE</strong>: Add to whitelist</li>
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
         * <p>The scope of effect for modifying the rule:</p>
         * <ul>
         * <li><strong>INSTANCE</strong>: Instance</li>
         * <li><strong>ITEM</strong>: Check item</li>
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
