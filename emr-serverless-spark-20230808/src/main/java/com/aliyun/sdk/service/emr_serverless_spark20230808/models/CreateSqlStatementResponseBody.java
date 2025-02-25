// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateSqlStatementResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSqlStatementResponseBody</p>
 */
public class CreateSqlStatementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateSqlStatementResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlStatementResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSqlStatementResponseBody build() {
            return new CreateSqlStatementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSqlStatementResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSqlStatementResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("statementId")
        private String statementId;

        private Data(Builder builder) {
            this.statementId = builder.statementId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return statementId
         */
        public String getStatementId() {
            return this.statementId;
        }

        public static final class Builder {
            private String statementId; 

            /**
             * <p>The ID of the SQL query.</p>
             * 
             * <strong>example:</strong>
             * <p>st-1231dfafadfa***</p>
             */
            public Builder statementId(String statementId) {
                this.statementId = statementId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
