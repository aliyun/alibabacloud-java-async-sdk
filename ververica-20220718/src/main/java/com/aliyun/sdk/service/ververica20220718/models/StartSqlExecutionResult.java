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
 * {@link StartSqlExecutionResult} extends {@link TeaModel}
 *
 * <p>StartSqlExecutionResult</p>
 */
public class StartSqlExecutionResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("newlyCreated")
    private Boolean newlyCreated;

    @com.aliyun.core.annotation.NameInMap("sqlExecutionId")
    private String sqlExecutionId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private StartSqlExecutionResult(Builder builder) {
        this.newlyCreated = builder.newlyCreated;
        this.sqlExecutionId = builder.sqlExecutionId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSqlExecutionResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newlyCreated
     */
    public Boolean getNewlyCreated() {
        return this.newlyCreated;
    }

    /**
     * @return sqlExecutionId
     */
    public String getSqlExecutionId() {
        return this.sqlExecutionId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean newlyCreated; 
        private String sqlExecutionId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(StartSqlExecutionResult model) {
            this.newlyCreated = model.newlyCreated;
            this.sqlExecutionId = model.sqlExecutionId;
            this.success = model.success;
        } 

        /**
         * newlyCreated.
         */
        public Builder newlyCreated(Boolean newlyCreated) {
            this.newlyCreated = newlyCreated;
            return this;
        }

        /**
         * sqlExecutionId.
         */
        public Builder sqlExecutionId(String sqlExecutionId) {
            this.sqlExecutionId = sqlExecutionId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public StartSqlExecutionResult build() {
            return new StartSqlExecutionResult(this);
        } 

    } 

}
