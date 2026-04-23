// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link KnowledgeBaseVO} extends {@link TeaModel}
 *
 * <p>KnowledgeBaseVO</p>
 */
public class KnowledgeBaseVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("Confidence")
    private Double confidence;

    @com.aliyun.core.annotation.NameInMap("DbId")
    private Integer dbId;

    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("Expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("IsDelete")
    private Boolean isDelete;

    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    private String knowledgeId;

    @com.aliyun.core.annotation.NameInMap("KnowledgeType")
    private String knowledgeType;

    @com.aliyun.core.annotation.NameInMap("LevelType")
    private String levelType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OldDescription")
    private String oldDescription;

    @com.aliyun.core.annotation.NameInMap("OldSummary")
    private String oldSummary;

    @com.aliyun.core.annotation.NameInMap("ParseDesc")
    private String parseDesc;

    @com.aliyun.core.annotation.NameInMap("ReasoningLogic")
    private String reasoningLogic;

    @com.aliyun.core.annotation.NameInMap("RelationType")
    private String relationType;

    @com.aliyun.core.annotation.NameInMap("ShowType")
    private String showType;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private KnowledgeBaseVO(Builder builder) {
        this.category = builder.category;
        this.confidence = builder.confidence;
        this.dbId = builder.dbId;
        this.dbName = builder.dbName;
        this.description = builder.description;
        this.entityId = builder.entityId;
        this.env = builder.env;
        this.expr = builder.expr;
        this.gmtCreate = builder.gmtCreate;
        this.instanceName = builder.instanceName;
        this.isDelete = builder.isDelete;
        this.knowledgeId = builder.knowledgeId;
        this.knowledgeType = builder.knowledgeType;
        this.levelType = builder.levelType;
        this.name = builder.name;
        this.oldDescription = builder.oldDescription;
        this.oldSummary = builder.oldSummary;
        this.parseDesc = builder.parseDesc;
        this.reasoningLogic = builder.reasoningLogic;
        this.relationType = builder.relationType;
        this.showType = builder.showType;
        this.summary = builder.summary;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBaseVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return confidence
     */
    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isDelete
     */
    public Boolean getIsDelete() {
        return this.isDelete;
    }

    /**
     * @return knowledgeId
     */
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return knowledgeType
     */
    public String getKnowledgeType() {
        return this.knowledgeType;
    }

    /**
     * @return levelType
     */
    public String getLevelType() {
        return this.levelType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oldDescription
     */
    public String getOldDescription() {
        return this.oldDescription;
    }

    /**
     * @return oldSummary
     */
    public String getOldSummary() {
        return this.oldSummary;
    }

    /**
     * @return parseDesc
     */
    public String getParseDesc() {
        return this.parseDesc;
    }

    /**
     * @return reasoningLogic
     */
    public String getReasoningLogic() {
        return this.reasoningLogic;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    /**
     * @return showType
     */
    public String getShowType() {
        return this.showType;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private String category; 
        private Double confidence; 
        private Integer dbId; 
        private String dbName; 
        private String description; 
        private Long entityId; 
        private String env; 
        private String expr; 
        private String gmtCreate; 
        private String instanceName; 
        private Boolean isDelete; 
        private String knowledgeId; 
        private String knowledgeType; 
        private String levelType; 
        private String name; 
        private String oldDescription; 
        private String oldSummary; 
        private String parseDesc; 
        private String reasoningLogic; 
        private String relationType; 
        private String showType; 
        private String summary; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(KnowledgeBaseVO model) {
            this.category = model.category;
            this.confidence = model.confidence;
            this.dbId = model.dbId;
            this.dbName = model.dbName;
            this.description = model.description;
            this.entityId = model.entityId;
            this.env = model.env;
            this.expr = model.expr;
            this.gmtCreate = model.gmtCreate;
            this.instanceName = model.instanceName;
            this.isDelete = model.isDelete;
            this.knowledgeId = model.knowledgeId;
            this.knowledgeType = model.knowledgeType;
            this.levelType = model.levelType;
            this.name = model.name;
            this.oldDescription = model.oldDescription;
            this.oldSummary = model.oldSummary;
            this.parseDesc = model.parseDesc;
            this.reasoningLogic = model.reasoningLogic;
            this.relationType = model.relationType;
            this.showType = model.showType;
            this.summary = model.summary;
            this.tableName = model.tableName;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Confidence.
         */
        public Builder confidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * Expr.
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IsDelete.
         */
        public Builder isDelete(Boolean isDelete) {
            this.isDelete = isDelete;
            return this;
        }

        /**
         * KnowledgeId.
         */
        public Builder knowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * KnowledgeType.
         */
        public Builder knowledgeType(String knowledgeType) {
            this.knowledgeType = knowledgeType;
            return this;
        }

        /**
         * LevelType.
         */
        public Builder levelType(String levelType) {
            this.levelType = levelType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OldDescription.
         */
        public Builder oldDescription(String oldDescription) {
            this.oldDescription = oldDescription;
            return this;
        }

        /**
         * OldSummary.
         */
        public Builder oldSummary(String oldSummary) {
            this.oldSummary = oldSummary;
            return this;
        }

        /**
         * ParseDesc.
         */
        public Builder parseDesc(String parseDesc) {
            this.parseDesc = parseDesc;
            return this;
        }

        /**
         * ReasoningLogic.
         */
        public Builder reasoningLogic(String reasoningLogic) {
            this.reasoningLogic = reasoningLogic;
            return this;
        }

        /**
         * RelationType.
         */
        public Builder relationType(String relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * ShowType.
         */
        public Builder showType(String showType) {
            this.showType = showType;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public KnowledgeBaseVO build() {
            return new KnowledgeBaseVO(this);
        } 

    } 

}
