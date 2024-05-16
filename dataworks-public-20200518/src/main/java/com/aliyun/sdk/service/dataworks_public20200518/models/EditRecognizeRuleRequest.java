// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditRecognizeRuleRequest} extends {@link RequestModel}
 *
 * <p>EditRecognizeRuleRequest</p>
 */
public class EditRecognizeRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SensitiveId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sensitiveId;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("level")
    @com.aliyun.core.annotation.Validation(required = true)
    private String level;

    private EditRecognizeRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountName = builder.accountName;
        this.colExclude = builder.colExclude;
        this.colScan = builder.colScan;
        this.commentScan = builder.commentScan;
        this.contentScan = builder.contentScan;
        this.hitThreshold = builder.hitThreshold;
        this.levelName = builder.levelName;
        this.nodeId = builder.nodeId;
        this.nodeParent = builder.nodeParent;
        this.operationType = builder.operationType;
        this.recognizeRules = builder.recognizeRules;
        this.recognizeRulesType = builder.recognizeRulesType;
        this.sensitiveDescription = builder.sensitiveDescription;
        this.sensitiveId = builder.sensitiveId;
        this.sensitiveName = builder.sensitiveName;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
        this.level = builder.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditRecognizeRuleRequest create() {
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
     * @return sensitiveId
     */
    public String getSensitiveId() {
        return this.sensitiveId;
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

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    public static final class Builder extends Request.Builder<EditRecognizeRuleRequest, Builder> {
        private String regionId; 
        private String accountName; 
        private String colExclude; 
        private String colScan; 
        private String commentScan; 
        private String contentScan; 
        private Integer hitThreshold; 
        private String levelName; 
        private String nodeId; 
        private String nodeParent; 
        private Integer operationType; 
        private String recognizeRules; 
        private String recognizeRulesType; 
        private String sensitiveDescription; 
        private String sensitiveId; 
        private String sensitiveName; 
        private Integer status; 
        private String templateId; 
        private String tenantId; 
        private String level; 

        private Builder() {
            super();
        } 

        private Builder(EditRecognizeRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountName = request.accountName;
            this.colExclude = request.colExclude;
            this.colScan = request.colScan;
            this.commentScan = request.commentScan;
            this.contentScan = request.contentScan;
            this.hitThreshold = request.hitThreshold;
            this.levelName = request.levelName;
            this.nodeId = request.nodeId;
            this.nodeParent = request.nodeParent;
            this.operationType = request.operationType;
            this.recognizeRules = request.recognizeRules;
            this.recognizeRulesType = request.recognizeRulesType;
            this.sensitiveDescription = request.sensitiveDescription;
            this.sensitiveId = request.sensitiveId;
            this.sensitiveName = request.sensitiveName;
            this.status = request.status;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
            this.level = request.level;
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
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * ColExclude.
         */
        public Builder colExclude(String colExclude) {
            this.putBodyParameter("ColExclude", colExclude);
            this.colExclude = colExclude;
            return this;
        }

        /**
         * ColScan.
         */
        public Builder colScan(String colScan) {
            this.putBodyParameter("ColScan", colScan);
            this.colScan = colScan;
            return this;
        }

        /**
         * CommentScan.
         */
        public Builder commentScan(String commentScan) {
            this.putBodyParameter("CommentScan", commentScan);
            this.commentScan = commentScan;
            return this;
        }

        /**
         * ContentScan.
         */
        public Builder contentScan(String contentScan) {
            this.putBodyParameter("ContentScan", contentScan);
            this.contentScan = contentScan;
            return this;
        }

        /**
         * HitThreshold.
         */
        public Builder hitThreshold(Integer hitThreshold) {
            this.putBodyParameter("HitThreshold", hitThreshold);
            this.hitThreshold = hitThreshold;
            return this;
        }

        /**
         * LevelName.
         */
        public Builder levelName(String levelName) {
            this.putBodyParameter("LevelName", levelName);
            this.levelName = levelName;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeParent.
         */
        public Builder nodeParent(String nodeParent) {
            this.putBodyParameter("NodeParent", nodeParent);
            this.nodeParent = nodeParent;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(Integer operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * RecognizeRules.
         */
        public Builder recognizeRules(String recognizeRules) {
            this.putBodyParameter("RecognizeRules", recognizeRules);
            this.recognizeRules = recognizeRules;
            return this;
        }

        /**
         * RecognizeRulesType.
         */
        public Builder recognizeRulesType(String recognizeRulesType) {
            this.putBodyParameter("RecognizeRulesType", recognizeRulesType);
            this.recognizeRulesType = recognizeRulesType;
            return this;
        }

        /**
         * SensitiveDescription.
         */
        public Builder sensitiveDescription(String sensitiveDescription) {
            this.putBodyParameter("SensitiveDescription", sensitiveDescription);
            this.sensitiveDescription = sensitiveDescription;
            return this;
        }

        /**
         * SensitiveId.
         */
        public Builder sensitiveId(String sensitiveId) {
            this.putBodyParameter("SensitiveId", sensitiveId);
            this.sensitiveId = sensitiveId;
            return this;
        }

        /**
         * SensitiveName.
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * level.
         */
        public Builder level(String level) {
            this.putBodyParameter("level", level);
            this.level = level;
            return this;
        }

        @Override
        public EditRecognizeRuleRequest build() {
            return new EditRecognizeRuleRequest(this);
        } 

    } 

}
