// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link UpdateAdvancedQueryTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAdvancedQueryTemplateRequest</p>
 */
public class UpdateAdvancedQueryTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimpleQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean simpleQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateSql")
    private String templateSql;

    private UpdateAdvancedQueryTemplateRequest(Builder builder) {
        super(builder);
        this.simpleQuery = builder.simpleQuery;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.templateSql = builder.templateSql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAdvancedQueryTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return simpleQuery
     */
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateSql
     */
    public String getTemplateSql() {
        return this.templateSql;
    }

    public static final class Builder extends Request.Builder<UpdateAdvancedQueryTemplateRequest, Builder> {
        private Boolean simpleQuery; 
        private String templateId; 
        private String templateName; 
        private String templateSql; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAdvancedQueryTemplateRequest request) {
            super(request);
            this.simpleQuery = request.simpleQuery;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
            this.templateSql = request.templateSql;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder simpleQuery(Boolean simpleQuery) {
            this.putQueryParameter("SimpleQuery", simpleQuery);
            this.simpleQuery = simpleQuery;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>x4a0Tw5dQy2J6IRJxf4kng</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateSql.
         */
        public Builder templateSql(String templateSql) {
            this.putQueryParameter("TemplateSql", templateSql);
            this.templateSql = templateSql;
            return this;
        }

        @Override
        public UpdateAdvancedQueryTemplateRequest build() {
            return new UpdateAdvancedQueryTemplateRequest(this);
        } 

    } 

}
