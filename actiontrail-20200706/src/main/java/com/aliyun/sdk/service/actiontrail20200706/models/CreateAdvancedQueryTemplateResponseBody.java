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
 * {@link CreateAdvancedQueryTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAdvancedQueryTemplateResponseBody</p>
 */
public class CreateAdvancedQueryTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimpleQuery")
    private String simpleQuery;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TemplateSql")
    private String templateSql;

    private CreateAdvancedQueryTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.simpleQuery = builder.simpleQuery;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.templateSql = builder.templateSql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdvancedQueryTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return simpleQuery
     */
    public String getSimpleQuery() {
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

    public static final class Builder {
        private String requestId; 
        private String simpleQuery; 
        private String templateId; 
        private String templateName; 
        private String templateSql; 

        private Builder() {
        } 

        private Builder(CreateAdvancedQueryTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.simpleQuery = model.simpleQuery;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.templateSql = model.templateSql;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SimpleQuery.
         */
        public Builder simpleQuery(String simpleQuery) {
            this.simpleQuery = simpleQuery;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateSql.
         */
        public Builder templateSql(String templateSql) {
            this.templateSql = templateSql;
            return this;
        }

        public CreateAdvancedQueryTemplateResponseBody build() {
            return new CreateAdvancedQueryTemplateResponseBody(this);
        } 

    } 

}
