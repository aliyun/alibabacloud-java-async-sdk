// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddRecognizeRuleRequest} extends {@link RequestModel}
 *
 * <p>AddRecognizeRuleRequest</p>
 */
public class AddRecognizeRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ColExclude")
    private String colExclude;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ColScan")
    private String colScan;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommentScan")
    private String commentScan;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentScan")
    private String contentScan;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HitThreshold")
    private Integer hitThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Level")
    @com.aliyun.core.annotation.Validation(required = true)
    private String level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LevelName")
    private String levelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeParent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeParent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer operationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecognizeRules")
    private String recognizeRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecognizeRulesType")
    private String recognizeRulesType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensitiveDescription")
    private String sensitiveDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensitiveName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sensitiveName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private AddRecognizeRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountName = builder.accountName;
        this.colExclude = builder.colExclude;
        this.colScan = builder.colScan;
        this.commentScan = builder.commentScan;
        this.contentScan = builder.contentScan;
        this.hitThreshold = builder.hitThreshold;
        this.level = builder.level;
        this.levelName = builder.levelName;
        this.nodeId = builder.nodeId;
        this.nodeParent = builder.nodeParent;
        this.operationType = builder.operationType;
        this.recognizeRules = builder.recognizeRules;
        this.recognizeRulesType = builder.recognizeRulesType;
        this.sensitiveDescription = builder.sensitiveDescription;
        this.sensitiveName = builder.sensitiveName;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRecognizeRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return colExclude
     */
    public String getColExclude() {
        return this.colExclude;
    }

    /**
     * @return colScan
     */
    public String getColScan() {
        return this.colScan;
    }

    /**
     * @return commentScan
     */
    public String getCommentScan() {
        return this.commentScan;
    }

    /**
     * @return contentScan
     */
    public String getContentScan() {
        return this.contentScan;
    }

    /**
     * @return hitThreshold
     */
    public Integer getHitThreshold() {
        return this.hitThreshold;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return levelName
     */
    public String getLevelName() {
        return this.levelName;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeParent
     */
    public String getNodeParent() {
        return this.nodeParent;
    }

    /**
     * @return operationType
     */
    public Integer getOperationType() {
        return this.operationType;
    }

    /**
     * @return recognizeRules
     */
    public String getRecognizeRules() {
        return this.recognizeRules;
    }

    /**
     * @return recognizeRulesType
     */
    public String getRecognizeRulesType() {
        return this.recognizeRulesType;
    }

    /**
     * @return sensitiveDescription
     */
    public String getSensitiveDescription() {
        return this.sensitiveDescription;
    }

    /**
     * @return sensitiveName
     */
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<AddRecognizeRuleRequest, Builder> {
        private String regionId; 
        private String accountName; 
        private String colExclude; 
        private String colScan; 
        private String commentScan; 
        private String contentScan; 
        private Integer hitThreshold; 
        private String level; 
        private String levelName; 
        private String nodeId; 
        private String nodeParent; 
        private Integer operationType; 
        private String recognizeRules; 
        private String recognizeRulesType; 
        private String sensitiveDescription; 
        private String sensitiveName; 
        private Integer status; 
        private String templateId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(AddRecognizeRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountName = request.accountName;
            this.colExclude = request.colExclude;
            this.colScan = request.colScan;
            this.commentScan = request.commentScan;
            this.contentScan = request.contentScan;
            this.hitThreshold = request.hitThreshold;
            this.level = request.level;
            this.levelName = request.levelName;
            this.nodeId = request.nodeId;
            this.nodeParent = request.nodeParent;
            this.operationType = request.operationType;
            this.recognizeRules = request.recognizeRules;
            this.recognizeRulesType = request.recognizeRulesType;
            this.sensitiveDescription = request.sensitiveDescription;
            this.sensitiveName = request.sensitiveName;
            this.status = request.status;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account that is used to create a sensitive data identification rule. Enter the username of the Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsg-uat</p>
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Excludes fields. The system does not identify fields that are assigned with values.</p>
         * <ul>
         * <li>The value must be in the ${Project name}.${Table name}.${Field name} or ${Project name}.${Schema name}.${Table name}.${Field name} format.</li>
         * <li>*Wildcards are supported. For example, the asterisk (*) in default.table.column1* can be used to match any content following default.table.column1, such as default.table.column10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default.qujian.*6</p>
         */
        public Builder colExclude(String colExclude) {
            this.putBodyParameter("ColExclude", colExclude);
            this.colExclude = colExclude;
            return this;
        }

        /**
         * <p>Scans fields. The system identifies only fields that are assigned with values.</p>
         * <ul>
         * <li>The value must be in the ${Project name}.${Table name}.${Field name} or ${Project name}.${Schema name}.${Table name}.${Field name} format.</li>
         * <li>*Wildcards are supported. For example, the asterisk (*) in default.table.column1* can be used to match any content following default.table.column1, such as default.table.column10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default.qujian.*</p>
         */
        public Builder colScan(String colScan) {
            this.putBodyParameter("ColScan", colScan);
            this.colScan = colScan;
            return this;
        }

        /**
         * <p>Scans content. The value is the text of each field comment in your data asset. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder commentScan(String commentScan) {
            this.putBodyParameter("CommentScan", commentScan);
            this.commentScan = commentScan;
            return this;
        }

        /**
         * <p>Identifies content. You can call the <a href="https://help.aliyun.com/document_detail/2747189.html">QuerySensNodeInfo</a> operation to query the value of the current parameter for a built-in sensitive field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;_clazz&quot;:&quot;com.alipay.dsgclient.sdk.dsg.fastscan.engine.cond.NationalityCond&quot;}</p>
         */
        public Builder contentScan(String contentScan) {
            this.putBodyParameter("ContentScan", contentScan);
            this.contentScan = contentScan;
            return this;
        }

        /**
         * <p>The hit ratio threshold. If more than 60%, which is a sample hit ratio threshold, of all sample data records hit the Name Entity Recognition (NER) model, the sensitive field is hit. The value can be an integer from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder hitThreshold(Integer hitThreshold) {
            this.putBodyParameter("HitThreshold", hitThreshold);
            this.hitThreshold = hitThreshold;
            return this;
        }

        /**
         * <p>The sensitivity level of the sensitive field. You can select one from all sensitivity levels that are defined in a template as the sensitivity level of the sensitive field, such as level 1 to level 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The name of the sensitivity level. You can call the <a href="https://help.aliyun.com/document_detail/2743948.html">QueryDefaultTemplate</a> operation to obtain the name of the sensitivity level in the related template.</p>
         */
        public Builder levelName(String levelName) {
            this.putBodyParameter("LevelName", levelName);
            this.levelName = levelName;
            return this;
        }

        /**
         * <p>The ID of the data category. You can call the <a href="https://help.aliyun.com/document_detail/2746850.html">QuerySensClassification</a> operation to query the ID of all data categories. Then, you can select a data category to create a sensitive field. Enter the ID of the selected data category.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0ce67949-0810-400f-a24a-cc5ffafe1024</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The information about the parent data category of the current data category. You can call the <a href="https://help.aliyun.com/document_detail/2746850.html">QuerySensClassification</a> operation to obtain the ID of a data category.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeParent(String nodeParent) {
            this.putBodyParameter("NodeParent", nodeParent);
            this.nodeParent = nodeParent;
            return this;
        }

        /**
         * <p>The type of the arithmetic operation. Valid values:</p>
         * <ul>
         * <li>0: OR</li>
         * <li>1: AND</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operationType(Integer operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The content of the sensitive data identification rule. You can call the <a href="https://help.aliyun.com/document_detail/2747189.html">QuerySensNodeInfo</a> operation to query the value of the current parameter for a built-in sensitive field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;contentRule&quot;:{&quot;_clazz&quot;:&quot;com.alipay.dsgclient.sdk.dsg.fastscan.engine.cond.GenderCond&quot;},&quot;_clazz&quot;:&quot;com.alipay.dsg.dal.model.RuleContent&quot;}</p>
         */
        public Builder recognizeRules(String recognizeRules) {
            this.putBodyParameter("RecognizeRules", recognizeRules);
            this.recognizeRules = recognizeRules;
            return this;
        }

        /**
         * <p>The type of the sensitive data identification rule. Valid values:</p>
         * <ul>
         * <li>1: regular expression</li>
         * <li>2: built-in rule</li>
         * <li>3: sample library</li>
         * <li>4: self-generated data identification model</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recognizeRulesType(String recognizeRulesType) {
            this.putBodyParameter("RecognizeRulesType", recognizeRulesType);
            this.recognizeRulesType = recognizeRulesType;
            return this;
        }

        /**
         * <p>The description of the sensitive field. Enter a string that is less than 128 characters in length.</p>
         */
        public Builder sensitiveDescription(String sensitiveDescription) {
            this.putBodyParameter("SensitiveDescription", sensitiveDescription);
            this.sensitiveDescription = sensitiveDescription;
            return this;
        }

        /**
         * <p>The name of the custom sensitive field. Enter a string that is less than 128 characters in length.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * <p>The status of the sensitive field. Valid values:</p>
         * <ul>
         * <li>0: draft</li>
         * <li>1: effective</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The template ID. You can call the <a href="https://help.aliyun.com/document_detail/2743948.html">QueryDefaultTemplate</a> operation to obtain the template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e1970541-6cf5-4d23-b101-d5b66f6e1024</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10241024</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public AddRecognizeRuleRequest build() {
            return new AddRecognizeRuleRequest(this);
        } 

    } 

}
