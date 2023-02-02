// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecommendIndexResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecommendIndexResponseBody</p>
 */
public class DescribeRecommendIndexResponseBody extends TeaModel {
    @NameInMap("RecommendIndex")
    private RecommendIndex recommendIndex;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRecommendIndexResponseBody(Builder builder) {
        this.recommendIndex = builder.recommendIndex;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return recommendIndex
     */
    public RecommendIndex getRecommendIndex() {
        return this.recommendIndex;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecommendIndex recommendIndex; 
        private String requestId; 

        /**
         * The information about the recommended index.
         */
        public Builder recommendIndex(RecommendIndex recommendIndex) {
            this.recommendIndex = recommendIndex;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRecommendIndexResponseBody build() {
            return new DescribeRecommendIndexResponseBody(this);
        } 

    } 

    public static class RecommendIndex extends TeaModel {
        @NameInMap("SuggestIndex")
        private String suggestIndex;

        @NameInMap("TableList")
        private String tableList;

        @NameInMap("TenantMode")
        private String tenantMode;

        private RecommendIndex(Builder builder) {
            this.suggestIndex = builder.suggestIndex;
            this.tableList = builder.tableList;
            this.tenantMode = builder.tenantMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendIndex create() {
            return builder().build();
        }

        /**
         * @return suggestIndex
         */
        public String getSuggestIndex() {
            return this.suggestIndex;
        }

        /**
         * @return tableList
         */
        public String getTableList() {
            return this.tableList;
        }

        /**
         * @return tenantMode
         */
        public String getTenantMode() {
            return this.tenantMode;
        }

        public static final class Builder {
            private String suggestIndex; 
            private String tableList; 
            private String tenantMode; 

            /**
             * The index recommended for the SQL statement after calculation by the diagnostic system.   
             * <p>
             * - If the recommended index is the primary key, PRIMARY is returned.  
             * - If an index created by the user is recommended, the index name is returned.   
             * The system recommends only one index for an SQL statement. You can call the DescribeIndexes operation to view the indexes of a table.
             */
            public Builder suggestIndex(String suggestIndex) {
                this.suggestIndex = suggestIndex;
                return this;
            }

            /**
             * The tables.   
             * <p>
             * The data tables involved in the SQL statement corresponding to the SQL ID are returned. For a single-table query, the data table accessed is returned. For a join query, all data tables accessed by the SQL statement are returned and separated with vertical bars (|), for example, "Table1|Table2".
             */
            public Builder tableList(String tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * The tenant mode.   Valid values:  
             * <p>
             * Oracle   
             * MySQL
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            public RecommendIndex build() {
                return new RecommendIndex(this);
            } 

        } 

    }
}
