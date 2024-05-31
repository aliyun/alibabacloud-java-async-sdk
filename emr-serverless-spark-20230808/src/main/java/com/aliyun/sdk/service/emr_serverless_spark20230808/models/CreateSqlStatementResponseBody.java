// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSqlStatementResponseBody build() {
            return new CreateSqlStatementResponseBody(this);
        } 

    } 

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
             * statementId.
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
