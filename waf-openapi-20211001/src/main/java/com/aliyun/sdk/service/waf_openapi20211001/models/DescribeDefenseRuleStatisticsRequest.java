// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseRuleStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseRuleStatisticsRequest</p>
 */
public class DescribeDefenseRuleStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FourthKey")
    private String fourthKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryKey")
    private String secondaryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdKey")
    private String thirdKey;

    private DescribeDefenseRuleStatisticsRequest(Builder builder) {
        super(builder);
        this.fourthKey = builder.fourthKey;
        this.instanceId = builder.instanceId;
        this.primaryKey = builder.primaryKey;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.secondaryKey = builder.secondaryKey;
        this.templateId = builder.templateId;
        this.thirdKey = builder.thirdKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseRuleStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fourthKey
     */
    public String getFourthKey() {
        return this.fourthKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return primaryKey
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return secondaryKey
     */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return thirdKey
     */
    public String getThirdKey() {
        return this.thirdKey;
    }

    public static final class Builder extends Request.Builder<DescribeDefenseRuleStatisticsRequest, Builder> {
        private String fourthKey; 
        private String instanceId; 
        private String primaryKey; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String secondaryKey; 
        private Long templateId; 
        private String thirdKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefenseRuleStatisticsRequest request) {
            super(request);
            this.fourthKey = request.fourthKey;
            this.instanceId = request.instanceId;
            this.primaryKey = request.primaryKey;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.secondaryKey = request.secondaryKey;
            this.templateId = request.templateId;
            this.thirdKey = request.thirdKey;
        } 

        /**
         * FourthKey.
         */
        public Builder fourthKey(String fourthKey) {
            this.putQueryParameter("FourthKey", fourthKey);
            this.fourthKey = fourthKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbqt****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scene</p>
         */
        public Builder primaryKey(String primaryKey) {
            this.putQueryParameter("PrimaryKey", primaryKey);
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * SecondaryKey.
         */
        public Builder secondaryKey(String secondaryKey) {
            this.putQueryParameter("SecondaryKey", secondaryKey);
            this.secondaryKey = secondaryKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>239136</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * ThirdKey.
         */
        public Builder thirdKey(String thirdKey) {
            this.putQueryParameter("ThirdKey", thirdKey);
            this.thirdKey = thirdKey;
            return this;
        }

        @Override
        public DescribeDefenseRuleStatisticsRequest build() {
            return new DescribeDefenseRuleStatisticsRequest(this);
        } 

    } 

}
