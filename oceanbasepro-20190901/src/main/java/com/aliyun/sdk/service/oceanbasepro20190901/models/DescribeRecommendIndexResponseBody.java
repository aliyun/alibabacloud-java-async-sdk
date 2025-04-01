// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeRecommendIndexResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecommendIndexResponseBody</p>
 */
public class DescribeRecommendIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecommendIndex")
    private RecommendIndex recommendIndex;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRecommendIndexResponseBody model) {
            this.recommendIndex = model.recommendIndex;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the recommended index.</p>
         */
        public Builder recommendIndex(RecommendIndex recommendIndex) {
            this.recommendIndex = recommendIndex;
            return this;
        }

        /**
         * <p>The tenant mode.   Valid values:<br>Oracle<br>MySQL</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRecommendIndexResponseBody build() {
            return new DescribeRecommendIndexResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecommendIndexResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendIndexResponseBody</p>
     */
    public static class RecommendIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SuggestIndex")
        private String suggestIndex;

        @com.aliyun.core.annotation.NameInMap("TableList")
        private String tableList;

        @com.aliyun.core.annotation.NameInMap("TenantMode")
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

            private Builder() {
            } 

            private Builder(RecommendIndex model) {
                this.suggestIndex = model.suggestIndex;
                this.tableList = model.tableList;
                this.tenantMode = model.tenantMode;
            } 

            /**
             * <p>Example 1</p>
             * 
             * <strong>example:</strong>
             * <p>PRIMARY</p>
             */
            public Builder suggestIndex(String suggestIndex) {
                this.suggestIndex = suggestIndex;
                return this;
            }

            /**
             * TableList.
             */
            public Builder tableList(String tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * TenantMode.
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
