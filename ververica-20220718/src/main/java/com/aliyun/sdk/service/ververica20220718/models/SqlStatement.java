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
 * {@link SqlStatement} extends {@link TeaModel}
 *
 * <p>SqlStatement</p>
 */
public class SqlStatement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("sqlScript")
    private String sqlScript;

    @com.aliyun.core.annotation.NameInMap("statusState")
    private String statusState;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private SqlStatement(Builder builder) {
        this.index = builder.index;
        this.message = builder.message;
        this.sqlScript = builder.sqlScript;
        this.statusState = builder.statusState;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlStatement create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return sqlScript
     */
    public String getSqlScript() {
        return this.sqlScript;
    }

    /**
     * @return statusState
     */
    public String getStatusState() {
        return this.statusState;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer index; 
        private String message; 
        private String sqlScript; 
        private String statusState; 
        private String type; 

        private Builder() {
        } 

        private Builder(SqlStatement model) {
            this.index = model.index;
            this.message = model.message;
            this.sqlScript = model.sqlScript;
            this.statusState = model.statusState;
            this.type = model.type;
        } 

        /**
         * index.
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * sqlScript.
         */
        public Builder sqlScript(String sqlScript) {
            this.sqlScript = sqlScript;
            return this;
        }

        /**
         * statusState.
         */
        public Builder statusState(String statusState) {
            this.statusState = statusState;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public SqlStatement build() {
            return new SqlStatement(this);
        } 

    } 

}
