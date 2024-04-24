// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRecognizeRuleRequest} extends {@link RequestModel}
 *
 * <p>AddRecognizeRuleRequest</p>
 */
public class AddRecognizeRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("ColExclude")
    private String colExclude;

    @Body
    @NameInMap("ColScan")
    private String colScan;

    @Body
    @NameInMap("CommentScan")
    private String commentScan;

    @Body
    @NameInMap("ContentScan")
    private String contentScan;

    @Body
    @NameInMap("HitThreshold")
    private Integer hitThreshold;

    @Body
    @NameInMap("Level")
    @Validation(required = true)
    private String level;

    @Body
    @NameInMap("LevelName")
    private String levelName;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Body
    @NameInMap("NodeParent")
    @Validation(required = true)
    private String nodeParent;

    @Body
    @NameInMap("OperationType")
    @Validation(required = true)
    private Integer operationType;

    @Body
    @NameInMap("RecognizeRules")
    private String recognizeRules;

    @Body
    @NameInMap("RecognizeRulesType")
    private String recognizeRulesType;

    @Body
    @NameInMap("SensitiveDescription")
    private String sensitiveDescription;

    @Body
    @NameInMap("SensitiveName")
    @Validation(required = true)
    private String sensitiveName;

    @Body
    @NameInMap("Status")
    private Integer status;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
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
         * Level.
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
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

        @Override
        public AddRecognizeRuleRequest build() {
            return new AddRecognizeRuleRequest(this);
        } 

    } 

}
