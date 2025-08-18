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
 * {@link CreateAdvancedQueryTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateAdvancedQueryTemplateRequest</p>
 */
public class CreateAdvancedQueryTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimpleQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean simpleQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateSql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateSql;

    private CreateAdvancedQueryTemplateRequest(Builder builder) {
        super(builder);
        this.simpleQuery = builder.simpleQuery;
        this.templateName = builder.templateName;
        this.templateSql = builder.templateSql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdvancedQueryTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAdvancedQueryTemplateRequest, Builder> {
        private Boolean simpleQuery; 
        private String templateName; 
        private String templateSql; 

        private Builder() {
            super();
        } 

        private Builder(CreateAdvancedQueryTemplateRequest request) {
            super(request);
            this.simpleQuery = request.simpleQuery;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>event.eventName: ConsoleSignin AND event.userIdentity.type: root-account</p>
         */
        public Builder templateSql(String templateSql) {
            this.putQueryParameter("TemplateSql", templateSql);
            this.templateSql = templateSql;
            return this;
        }

        @Override
        public CreateAdvancedQueryTemplateRequest build() {
            return new CreateAdvancedQueryTemplateRequest(this);
        } 

    } 

}
