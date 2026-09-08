// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OssieModelView} extends {@link TeaModel}
 *
 * <p>OssieModelView</p>
 */
public class OssieModelView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DocFormat")
    private String docFormat;

    @com.aliyun.core.annotation.NameInMap("DomainTopic")
    private String domainTopic;

    @com.aliyun.core.annotation.NameInMap("Expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private Long gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
    private String knowledgeUuid;

    @com.aliyun.core.annotation.NameInMap("RawDoc")
    private String rawDoc;

    @com.aliyun.core.annotation.NameInMap("SemanticType")
    private String semanticType;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private OssieModelView(Builder builder) {
        this.catalogUuid = builder.catalogUuid;
        this.databaseUuid = builder.databaseUuid;
        this.description = builder.description;
        this.docFormat = builder.docFormat;
        this.domainTopic = builder.domainTopic;
        this.expr = builder.expr;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.knowledgeUuid = builder.knowledgeUuid;
        this.rawDoc = builder.rawDoc;
        this.semanticType = builder.semanticType;
        this.source = builder.source;
        this.summary = builder.summary;
        this.tag = builder.tag;
        this.title = builder.title;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OssieModelView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return docFormat
     */
    public String getDocFormat() {
        return this.docFormat;
    }

    /**
     * @return domainTopic
     */
    public String getDomainTopic() {
        return this.domainTopic;
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return knowledgeUuid
     */
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    /**
     * @return rawDoc
     */
    public String getRawDoc() {
        return this.rawDoc;
    }

    /**
     * @return semanticType
     */
    public String getSemanticType() {
        return this.semanticType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String catalogUuid; 
        private String databaseUuid; 
        private String description; 
        private String docFormat; 
        private String domainTopic; 
        private String expr; 
        private Long gmtCreated; 
        private Long gmtModified; 
        private String knowledgeUuid; 
        private String rawDoc; 
        private String semanticType; 
        private String source; 
        private String summary; 
        private String tag; 
        private String title; 
        private String version; 

        private Builder() {
        } 

        private Builder(OssieModelView model) {
            this.catalogUuid = model.catalogUuid;
            this.databaseUuid = model.databaseUuid;
            this.description = model.description;
            this.docFormat = model.docFormat;
            this.domainTopic = model.domainTopic;
            this.expr = model.expr;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.knowledgeUuid = model.knowledgeUuid;
            this.rawDoc = model.rawDoc;
            this.semanticType = model.semanticType;
            this.source = model.source;
            this.summary = model.summary;
            this.tag = model.tag;
            this.title = model.title;
            this.version = model.version;
        } 

        /**
         * <p>The UUID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-SH-cd3ns***</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The UUID of the associated database.</p>
         * 
         * <strong>example:</strong>
         * <p>md-SH-q8XzcK***</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>The semantic description.</p>
         * 
         * <strong>example:</strong>
         * <p>Order summary</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The semantic document format type.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder docFormat(String docFormat) {
            this.docFormat = docFormat;
            return this;
        }

        /**
         * <p>The domain topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Order</p>
         */
        public Builder domainTopic(String domainTopic) {
            this.domainTopic = domainTopic;
            return this;
        }

        /**
         * <p>The expression content.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1</p>
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1663809374000</p>
         */
        public Builder gmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1780539699000</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The UUID of the semantic knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>dfb58bd***</p>
         */
        public Builder knowledgeUuid(String knowledgeUuid) {
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }

        /**
         * <p>The semantic document content.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;version&quot;: &quot;0.2.0.dev0&quot;,
         *   &quot;semantic_model&quot;: [
         *     {
         *       &quot;name&quot;: &quot;sales&quot;,
         *       &quot;datasets&quot;: [
         *         {
         *           &quot;name&quot;: &quot;orders&quot;,
         *           &quot;source&quot;: &quot;analytics.public.orders&quot;
         *         }
         *       ]
         *     }
         *   ]
         * }</p>
         */
        public Builder rawDoc(String rawDoc) {
            this.rawDoc = rawDoc;
            return this;
        }

        /**
         * <p>The semantic type.</p>
         * 
         * <strong>example:</strong>
         * <p>Ossie</p>
         */
        public Builder semanticType(String semanticType) {
            this.semanticType = semanticType;
            return this;
        }

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_EDIT</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The document summary.</p>
         * 
         * <strong>example:</strong>
         * <p>knowledge summary</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The knowledge base tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1dq7qod8hxtt1***</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The semantic title.</p>
         * 
         * <strong>example:</strong>
         * <p>Order total</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The version information.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public OssieModelView build() {
            return new OssieModelView(this);
        } 

    } 

}
