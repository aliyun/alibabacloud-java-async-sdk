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
 * {@link UpdateOneMetaSqlTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateOneMetaSqlTemplateRequest</p>
 */
public class UpdateOneMetaSqlTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Expr")
    private String expr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlParams")
    private String sqlParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private UpdateOneMetaSqlTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogUuid = builder.catalogUuid;
        this.databaseUuid = builder.databaseUuid;
        this.description = builder.description;
        this.expr = builder.expr;
        this.knowledgeUuid = builder.knowledgeUuid;
        this.sqlParams = builder.sqlParams;
        this.tag = builder.tag;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOneMetaSqlTemplateRequest create() {
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
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return knowledgeUuid
     */
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    /**
     * @return sqlParams
     */
    public String getSqlParams() {
        return this.sqlParams;
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

    public static final class Builder extends Request.Builder<UpdateOneMetaSqlTemplateRequest, Builder> {
        private String regionId; 
        private String catalogUuid; 
        private String databaseUuid; 
        private String description; 
        private String expr; 
        private String knowledgeUuid; 
        private String sqlParams; 
        private String tag; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOneMetaSqlTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogUuid = request.catalogUuid;
            this.databaseUuid = request.databaseUuid;
            this.description = request.description;
            this.expr = request.expr;
            this.knowledgeUuid = request.knowledgeUuid;
            this.sqlParams = request.sqlParams;
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
         * <p>The description of the SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>sales version 2</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The content of the SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>select count(1) from sales where dt = \&quot;2026-08-01\&quot;</p>
         */
        public Builder expr(String expr) {
            this.putQueryParameter("Expr", expr);
            this.expr = expr;
            return this;
        }

        /**
         * <p>The UUID of the knowledge base.</p>
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
         * <p>The custom template parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dt&quot;: &quot;2026-08-01&quot;}</p>
         */
        public Builder sqlParams(String sqlParams) {
            this.putQueryParameter("SqlParams", sqlParams);
            this.sqlParams = sqlParams;
            return this;
        }

        /**
         * <p>The tag of the SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>new_sales</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The title of the SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>sales_v2</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateOneMetaSqlTemplateRequest build() {
            return new UpdateOneMetaSqlTemplateRequest(this);
        } 

    } 

}
