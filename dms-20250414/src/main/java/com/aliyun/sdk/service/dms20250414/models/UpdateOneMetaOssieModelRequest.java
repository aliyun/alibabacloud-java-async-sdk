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
 * {@link UpdateOneMetaOssieModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateOneMetaOssieModelRequest</p>
 */
public class UpdateOneMetaOssieModelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocFormat")
    private String docFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Document")
    private String document;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private UpdateOneMetaOssieModelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogUuid = builder.catalogUuid;
        this.databaseUuid = builder.databaseUuid;
        this.description = builder.description;
        this.docFormat = builder.docFormat;
        this.document = builder.document;
        this.knowledgeUuid = builder.knowledgeUuid;
        this.tag = builder.tag;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOneMetaOssieModelRequest create() {
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
     * @return document
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * @return knowledgeUuid
     */
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
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

    public static final class Builder extends Request.Builder<UpdateOneMetaOssieModelRequest, Builder> {
        private String regionId; 
        private String catalogUuid; 
        private String databaseUuid; 
        private String description; 
        private String docFormat; 
        private String document; 
        private String knowledgeUuid; 
        private String tag; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOneMetaOssieModelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogUuid = request.catalogUuid;
            this.databaseUuid = request.databaseUuid;
            this.description = request.description;
            this.docFormat = request.docFormat;
            this.document = request.document;
            this.knowledgeUuid = request.knowledgeUuid;
            this.tag = request.tag;
            this.title = request.title;
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
         * <p>The UUID of the associated folder.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.putQueryParameter("CatalogUuid", catalogUuid);
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The UUID of the associated database.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-fp9K7r***</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.putQueryParameter("DatabaseUuid", databaseUuid);
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
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The document type of the semantic model. Valid values:</p>
         * <ul>
         * <li>JSON</li>
         * <li>YAML</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder docFormat(String docFormat) {
            this.putQueryParameter("DocFormat", docFormat);
            this.docFormat = docFormat;
            return this;
        }

        /**
         * <p>The document definition of the semantic model.</p>
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
        public Builder document(String document) {
            this.putQueryParameter("Document", document);
            this.document = document;
            return this;
        }

        /**
         * <p>The UUID of the knowledge.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86c5c290052147c***</p>
         */
        public Builder knowledgeUuid(String knowledgeUuid) {
            this.putQueryParameter("KnowledgeUuid", knowledgeUuid);
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }

        /**
         * <p>The tag of the semantic model.</p>
         * 
         * <strong>example:</strong>
         * <p>sales</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
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
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateOneMetaOssieModelRequest build() {
            return new UpdateOneMetaOssieModelRequest(this);
        } 

    } 

}
