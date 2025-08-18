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
 * {@link GetGovernanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetGovernanceMetricsResponseBody</p>
 */
public class GetGovernanceMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGovernanceMetricsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetGovernanceMetricsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGovernanceMetricsResponseBody build() {
            return new GetGovernanceMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGovernanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceMetricsResponseBody</p>
     */
    public static class GovernanceMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnsSchema")
        private String columnsSchema;

        @com.aliyun.core.annotation.NameInMap("GovernanceItem")
        private String governanceItem;

        @com.aliyun.core.annotation.NameInMap("GovernanceScore")
        private String governanceScore;

        private GovernanceMetrics(Builder builder) {
            this.columnsSchema = builder.columnsSchema;
            this.governanceItem = builder.governanceItem;
            this.governanceScore = builder.governanceScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GovernanceMetrics create() {
            return builder().build();
        }

        /**
         * @return columnsSchema
         */
        public String getColumnsSchema() {
            return this.columnsSchema;
        }

        /**
         * @return governanceItem
         */
        public String getGovernanceItem() {
            return this.governanceItem;
        }

        /**
         * @return governanceScore
         */
        public String getGovernanceScore() {
            return this.governanceScore;
        }

        public static final class Builder {
            private String columnsSchema; 
            private String governanceItem; 
            private String governanceScore; 

            private Builder() {
            } 

            private Builder(GovernanceMetrics model) {
                this.columnsSchema = model.columnsSchema;
                this.governanceItem = model.governanceItem;
                this.governanceScore = model.governanceScore;
            } 

            /**
             * ColumnsSchema.
             */
            public Builder columnsSchema(String columnsSchema) {
                this.columnsSchema = columnsSchema;
                return this;
            }

            /**
             * GovernanceItem.
             */
            public Builder governanceItem(String governanceItem) {
                this.governanceItem = governanceItem;
                return this;
            }

            /**
             * GovernanceScore.
             */
            public Builder governanceScore(String governanceScore) {
                this.governanceScore = governanceScore;
                return this;
            }

            public GovernanceMetrics build() {
                return new GovernanceMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGovernanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceMetricsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("GovernanceMetrics")
        private java.util.List<GovernanceMetrics> governanceMetrics;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.governanceMetrics = builder.governanceMetrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return governanceMetrics
         */
        public java.util.List<GovernanceMetrics> getGovernanceMetrics() {
            return this.governanceMetrics;
        }

        public static final class Builder {
            private String accountId; 
            private java.util.List<GovernanceMetrics> governanceMetrics; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.governanceMetrics = model.governanceMetrics;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * GovernanceMetrics.
             */
            public Builder governanceMetrics(java.util.List<GovernanceMetrics> governanceMetrics) {
                this.governanceMetrics = governanceMetrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
