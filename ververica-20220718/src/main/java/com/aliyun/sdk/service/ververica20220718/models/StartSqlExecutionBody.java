// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link StartSqlExecutionBody} extends {@link TeaModel}
 *
 * <p>StartSqlExecutionBody</p>
 */
public class StartSqlExecutionBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("sqlFileId")
    private String sqlFileId;

    @com.aliyun.core.annotation.NameInMap("sqlScript")
    private String sqlScript;

    private StartSqlExecutionBody(Builder builder) {
        this.description = builder.description;
        this.sqlFileId = builder.sqlFileId;
        this.sqlScript = builder.sqlScript;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSqlExecutionBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return sqlFileId
     */
    public String getSqlFileId() {
        return this.sqlFileId;
    }

    /**
     * @return sqlScript
     */
    public String getSqlScript() {
        return this.sqlScript;
    }

    public static final class Builder {
        private String description; 
        private String sqlFileId; 
        private String sqlScript; 

        private Builder() {
        } 

        private Builder(StartSqlExecutionBody model) {
            this.description = model.description;
            this.sqlFileId = model.sqlFileId;
            this.sqlScript = model.sqlScript;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * sqlFileId.
         */
        public Builder sqlFileId(String sqlFileId) {
            this.sqlFileId = sqlFileId;
            return this;
        }

        /**
         * sqlScript.
         */
        public Builder sqlScript(String sqlScript) {
            this.sqlScript = sqlScript;
            return this;
        }

        public StartSqlExecutionBody build() {
            return new StartSqlExecutionBody(this);
        } 

    } 

}
