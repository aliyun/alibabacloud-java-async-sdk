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
         * 推荐索引信息
         */
        public Builder recommendIndex(RecommendIndex recommendIndex) {
            this.recommendIndex = recommendIndex;
            return this;
        }

        /**
         * 请求ID
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
             * 建议索引，如果是主键，就是 PRIMARY，如果不是主键，以用户取名为准
             */
            public Builder suggestIndex(String suggestIndex) {
                this.suggestIndex = suggestIndex;
                return this;
            }

            /**
             * 表信息
             */
            public Builder tableList(String tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * 租户模式
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
