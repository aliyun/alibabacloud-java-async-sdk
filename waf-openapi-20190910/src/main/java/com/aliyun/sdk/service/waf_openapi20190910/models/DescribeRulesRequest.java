// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRulesRequest</p>
 */
public class DescribeRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private Integer applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CveIdKey")
    private String cveIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionType")
    private Integer protectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private Integer riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIdKey")
    private String ruleIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeRulesRequest(Builder builder) {
        super(builder);
        this.applicationType = builder.applicationType;
        this.cveIdKey = builder.cveIdKey;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.protectionType = builder.protectionType;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.riskLevel = builder.riskLevel;
        this.ruleGroupId = builder.ruleGroupId;
        this.ruleIdKey = builder.ruleIdKey;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationType
     */
    public Integer getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return cveIdKey
     */
    public String getCveIdKey() {
        return this.cveIdKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return protectionType
     */
    public Integer getProtectionType() {
        return this.protectionType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return ruleGroupId
     */
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * @return ruleIdKey
     */
    public String getRuleIdKey() {
        return this.ruleIdKey;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeRulesRequest, Builder> {
        private Integer applicationType; 
        private String cveIdKey; 
        private String instanceId; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer protectionType; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer riskLevel; 
        private Long ruleGroupId; 
        private String ruleIdKey; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRulesRequest request) {
            super(request);
            this.applicationType = request.applicationType;
            this.cveIdKey = request.cveIdKey;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.protectionType = request.protectionType;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.riskLevel = request.riskLevel;
            this.ruleGroupId = request.ruleGroupId;
            this.ruleIdKey = request.ruleIdKey;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * ApplicationType.
         */
        public Builder applicationType(Integer applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * CVE ID
         */
        public Builder cveIdKey(String cveIdKey) {
            this.putQueryParameter("CveIdKey", cveIdKey);
            this.cveIdKey = cveIdKey;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProtectionType.
         */
        public Builder protectionType(Integer protectionType) {
            this.putQueryParameter("ProtectionType", protectionType);
            this.protectionType = protectionType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * RuleGroupId.
         */
        public Builder ruleGroupId(Long ruleGroupId) {
            this.putQueryParameter("RuleGroupId", ruleGroupId);
            this.ruleGroupId = ruleGroupId;
            return this;
        }

        /**
         * RuleIdKey.
         */
        public Builder ruleIdKey(String ruleIdKey) {
            this.putQueryParameter("RuleIdKey", ruleIdKey);
            this.ruleIdKey = ruleIdKey;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeRulesRequest build() {
            return new DescribeRulesRequest(this);
        } 

    } 

}
