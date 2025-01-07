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
 * {@link AddCheckInstanceResultWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddCheckInstanceResultWhiteListRequest</p>
 */
public class AddCheckInstanceResultWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckGroupId")
    private String checkGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    private AddCheckInstanceResultWhiteListRequest(Builder builder) {
        super(builder);
        this.checkGroupId = builder.checkGroupId;
        this.checkId = builder.checkId;
        this.instanceIds = builder.instanceIds;
        this.instanceList = builder.instanceList;
        this.remark = builder.remark;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckInstanceResultWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkGroupId
     */
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<AddCheckInstanceResultWhiteListRequest, Builder> {
        private String checkGroupId; 
        private Long checkId; 
        private java.util.List<String> instanceIds; 
        private java.util.List<InstanceList> instanceList; 
        private String remark; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(AddCheckInstanceResultWhiteListRequest request) {
            super(request);
            this.checkGroupId = request.checkGroupId;
            this.checkId = request.checkId;
            this.instanceIds = request.instanceIds;
            this.instanceList = request.instanceList;
            this.remark = request.remark;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The ID of the group to which the check item belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cQFq20UzZ49K6gRSJD1301****</p>
         */
        public Builder checkGroupId(String checkGroupId) {
            this.putQueryParameter("CheckGroupId", checkGroupId);
            this.checkGroupId = checkGroupId;
            return this;
        }

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of check items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The instance IDs of the assets.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The asset instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The description. The value of this parameter can be up to 65,535 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The type of the rule. Default value: <strong>WHITE</strong>. Valid value:</p>
         * <ul>
         * <li>WHITE: adds check items to the whitelist.</li>
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

        @Override
        public AddCheckInstanceResultWhiteListRequest build() {
            return new AddCheckInstanceResultWhiteListRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddCheckInstanceResultWhiteListRequest} extends {@link TeaModel}
     *
     * <p>AddCheckInstanceResultWhiteListRequest</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private InstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
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
             * <blockquote>
             * <p> You can call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> operation to query the instance IDs of assets.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-wz9fdluqx20mp2x7****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * <blockquote>
             * <p> You can call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> operation to query the region ID of the asset.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hongkong</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
