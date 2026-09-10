// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecSqlTransSingleScriptTranslateRequest} extends {@link RequestModel}
 *
 * <p>ExecSqlTransSingleScriptTranslateRequest</p>
 */
public class ExecSqlTransSingleScriptTranslateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDialect")
    private String sourceDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceSqlScript")
    private String sourceSqlScript;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableMapping")
    private java.util.List<String> tableMapping;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDialect")
    private String targetDialect;

    private ExecSqlTransSingleScriptTranslateRequest(Builder builder) {
        super(builder);
        this.sourceDialect = builder.sourceDialect;
        this.sourceSqlScript = builder.sourceSqlScript;
        this.tableMapping = builder.tableMapping;
        this.targetDialect = builder.targetDialect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecSqlTransSingleScriptTranslateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceDialect
     */
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    /**
     * @return sourceSqlScript
     */
    public String getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    /**
     * @return tableMapping
     */
    public java.util.List<String> getTableMapping() {
        return this.tableMapping;
    }

    /**
     * @return targetDialect
     */
    public String getTargetDialect() {
        return this.targetDialect;
    }

    public static final class Builder extends Request.Builder<ExecSqlTransSingleScriptTranslateRequest, Builder> {
        private String sourceDialect; 
        private String sourceSqlScript; 
        private java.util.List<String> tableMapping; 
        private String targetDialect; 

        private Builder() {
            super();
        } 

        private Builder(ExecSqlTransSingleScriptTranslateRequest request) {
            super(request);
            this.sourceDialect = request.sourceDialect;
            this.sourceSqlScript = request.sourceSqlScript;
            this.tableMapping = request.tableMapping;
            this.targetDialect = request.targetDialect;
        } 

        /**
         * <p>The source SQL dialect type.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder sourceDialect(String sourceDialect) {
            this.putBodyParameter("sourceDialect", sourceDialect);
            this.sourceDialect = sourceDialect;
            return this;
        }

        /**
         * <p>The source script content. It must be Base64-encoded before being passed in. The server decodes the content before performing the conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        public Builder sourceSqlScript(String sourceSqlScript) {
            this.putBodyParameter("sourceSqlScript", sourceSqlScript);
            this.sourceSqlScript = sourceSqlScript;
            return this;
        }

        /**
         * <p>The table name mapping. In string format, the source table and target table are separated by a comma (,).</p>
         */
        public Builder tableMapping(java.util.List<String> tableMapping) {
            this.putBodyParameter("tableMapping", tableMapping);
            this.tableMapping = tableMapping;
            return this;
        }

        /**
         * <p>The target SQL dialect type.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder targetDialect(String targetDialect) {
            this.putBodyParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        @Override
        public ExecSqlTransSingleScriptTranslateRequest build() {
            return new ExecSqlTransSingleScriptTranslateRequest(this);
        } 

    } 

}
