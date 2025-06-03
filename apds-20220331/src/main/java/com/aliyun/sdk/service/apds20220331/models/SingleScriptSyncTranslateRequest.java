// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link SingleScriptSyncTranslateRequest} extends {@link RequestModel}
 *
 * <p>SingleScriptSyncTranslateRequest</p>
 */
public class SingleScriptSyncTranslateRequest extends Request {
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

    private SingleScriptSyncTranslateRequest(Builder builder) {
        super(builder);
        this.sourceDialect = builder.sourceDialect;
        this.sourceSqlScript = builder.sourceSqlScript;
        this.tableMapping = builder.tableMapping;
        this.targetDialect = builder.targetDialect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleScriptSyncTranslateRequest create() {
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

    public static final class Builder extends Request.Builder<SingleScriptSyncTranslateRequest, Builder> {
        private String sourceDialect; 
        private String sourceSqlScript; 
        private java.util.List<String> tableMapping; 
        private String targetDialect; 

        private Builder() {
            super();
        } 

        private Builder(SingleScriptSyncTranslateRequest request) {
            super(request);
            this.sourceDialect = request.sourceDialect;
            this.sourceSqlScript = request.sourceSqlScript;
            this.tableMapping = request.tableMapping;
            this.targetDialect = request.targetDialect;
        } 

        /**
         * sourceDialect.
         */
        public Builder sourceDialect(String sourceDialect) {
            this.putBodyParameter("sourceDialect", sourceDialect);
            this.sourceDialect = sourceDialect;
            return this;
        }

        /**
         * sourceSqlScript.
         */
        public Builder sourceSqlScript(String sourceSqlScript) {
            this.putBodyParameter("sourceSqlScript", sourceSqlScript);
            this.sourceSqlScript = sourceSqlScript;
            return this;
        }

        /**
         * tableMapping.
         */
        public Builder tableMapping(java.util.List<String> tableMapping) {
            this.putBodyParameter("tableMapping", tableMapping);
            this.tableMapping = tableMapping;
            return this;
        }

        /**
         * targetDialect.
         */
        public Builder targetDialect(String targetDialect) {
            this.putBodyParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        @Override
        public SingleScriptSyncTranslateRequest build() {
            return new SingleScriptSyncTranslateRequest(this);
        } 

    } 

}
