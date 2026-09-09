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
 * {@link DescribeBaseSystemRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBaseSystemRulesRequest</p>
 */
public class DescribeBaseSystemRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectType")
    private String detectType;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List<Long> ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleStatus")
    private Integer ruleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private DescribeBaseSystemRulesRequest(Builder builder) {
        super(builder);
        this.detectType = builder.detectType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.riskLevel = builder.riskLevel;
        this.ruleAction = builder.ruleAction;
        this.ruleId = builder.ruleId;
        this.ruleIds = builder.ruleIds;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBaseSystemRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectType
     */
    public String getDetectType() {
        return this.detectType;
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
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleIds
     */
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleStatus
     */
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeBaseSystemRulesRequest, Builder> {
        private String detectType; 
        private String instanceId; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String riskLevel; 
        private String ruleAction; 
        private Long ruleId; 
        private java.util.List<Long> ruleIds; 
        private String ruleName; 
        private Integer ruleStatus; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBaseSystemRulesRequest request) {
            super(request);
            this.detectType = request.detectType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.riskLevel = request.riskLevel;
            this.ruleAction = request.ruleAction;
            this.ruleId = request.ruleId;
            this.ruleIds = request.ruleIds;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The detection module. Valid values:</p>
         * <ul>
         * <li><strong>sqli</strong>: SQL injection.</li>
         * <li><strong>xss</strong>: cross-site scripting (XSS).</li>
         * <li><strong>cmdi</strong>: OS command injection.</li>
         * <li><strong>expression_injection</strong>: expression injection.</li>
         * <li><strong>java_deserialization</strong>: Java deserialization.</li>
         * <li><strong>dot_net_deserialization</strong>: .NET deserialization.</li>
         * <li><strong>php_deserialization</strong>: PHP deserialization.</li>
         * <li><strong>code_exec</strong>: code execution.</li>
         * <li><strong>ssrf</strong>: server-side request forgery (SSRF).</li>
         * <li><strong>path_traversal</strong>: path traversal.</li>
         * <li><strong>arbitrary_file_uploading</strong>: arbitrary file upload.</li>
         * <li><strong>webshell</strong>: webshell.</li>
         * <li><strong>rfilei</strong>: remote file inclusion (RFI).</li>
         * <li><strong>lfilei</strong>: local file inclusion (LFI).</li>
         * <li><strong>protocol_violation</strong>: protocol violation.</li>
         * <li><strong>scanner_behavior</strong>: scanner behavior.</li>
         * <li><strong>logic_flaw</strong>: business logic bug.</li>
         * <li><strong>arbitrary_file_reading</strong>: arbitrary file read.</li>
         * <li><strong>arbitrary_file_download</strong>: arbitrary file download.</li>
         * <li><strong>xxe</strong>: XML external entity injection.</li>
         * <li><strong>csrf</strong>: cross-site request forgery.</li>
         * <li><strong>crlf</strong>: CRLF injection.</li>
         * <li><strong>other</strong>: other.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sqli</p>
         */
        public Builder detectType(String detectType) {
            this.putQueryParameter("DetectType", detectType);
            this.detectType = detectType;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the returned rules. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The page number to return in a paged query. Default value: <strong>1</strong>, which indicates the first page. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Default value: 100. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>super_strict</strong>: super strict.</p>
         * </li>
         * <li><p><strong>strict</strong>: strict.</p>
         * </li>
         * <li><p><strong>medium</strong>: medium.</p>
         * </li>
         * <li><p><strong>loose</strong>: loose.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>loose</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The rule action. Valid values:</p>
         * <ul>
         * <li><p><strong>block</strong>: Block.</p>
         * </li>
         * <li><p><strong>monitor</strong>: Monitor.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>The ID of the system protection rule to query.</p>
         * 
         * <strong>example:</strong>
         * <p>113089</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The list of system protection rule IDs to query.</p>
         */
        public Builder ruleIds(java.util.List<Long> ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * <p>The name of the system protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>systemRuleTest</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: disabled.</li>
         * <li><strong>0</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleStatus(Integer ruleStatus) {
            this.putQueryParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * <p>The ID of the protection template.</p>
         * <blockquote>
         * <ul>
         * <li>You can set this parameter to query the system protection rules in a specific Web core protection rule template. Settings apply to the specified template.</li>
         * <li>If this parameter is left empty, the default configurations of system protection rules are queried.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>24354</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeBaseSystemRulesRequest build() {
            return new DescribeBaseSystemRulesRequest(this);
        } 

    } 

}
