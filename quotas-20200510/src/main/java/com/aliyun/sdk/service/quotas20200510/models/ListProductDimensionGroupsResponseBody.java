// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link ListProductDimensionGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductDimensionGroupsResponseBody</p>
 */
public class ListProductDimensionGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DimensionGroups")
    private java.util.List<DimensionGroups> dimensionGroups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProductDimensionGroupsResponseBody(Builder builder) {
        this.dimensionGroups = builder.dimensionGroups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductDimensionGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimensionGroups
     */
    public java.util.List<DimensionGroups> getDimensionGroups() {
        return this.dimensionGroups;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DimensionGroups> dimensionGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProductDimensionGroupsResponseBody model) {
            this.dimensionGroups = model.dimensionGroups;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The dimension groups.</p>
         */
        public Builder dimensionGroups(java.util.List<DimensionGroups> dimensionGroups) {
            this.dimensionGroups = dimensionGroups;
            return this;
        }

        /**
         * <p>The maximum number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position where the returned query results end. An empty value indicates that all data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>057D210F-F2FC-5329-A536-26C16628BB09</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that match the query.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProductDimensionGroupsResponseBody build() {
            return new ListProductDimensionGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductDimensionGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductDimensionGroupsResponseBody</p>
     */
    public static class DimensionGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DimensionKeys")
        private java.util.List<String> dimensionKeys;

        @com.aliyun.core.annotation.NameInMap("GroupCode")
        private String groupCode;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private DimensionGroups(Builder builder) {
            this.dimensionKeys = builder.dimensionKeys;
            this.groupCode = builder.groupCode;
            this.groupName = builder.groupName;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimensionGroups create() {
            return builder().build();
        }

        /**
         * @return dimensionKeys
         */
        public java.util.List<String> getDimensionKeys() {
            return this.dimensionKeys;
        }

        /**
         * @return groupCode
         */
        public String getGroupCode() {
            return this.groupCode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private java.util.List<String> dimensionKeys; 
            private String groupCode; 
            private String groupName; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(DimensionGroups model) {
                this.dimensionKeys = model.dimensionKeys;
                this.groupCode = model.groupCode;
                this.groupName = model.groupName;
                this.productCode = model.productCode;
            } 

            /**
             * <p>The keys of the dimension group.</p>
             */
            public Builder dimensionKeys(java.util.List<String> dimensionKeys) {
                this.dimensionKeys = dimensionKeys;
                return this;
            }

            /**
             * <p>The code of the dimension group.</p>
             * 
             * <strong>example:</strong>
             * <p>entconsole_zjzp4d****</p>
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * <p>The name of the dimension group.</p>
             * 
             * <strong>example:</strong>
             * <p>Resource sharing</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The code of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>entconsole</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public DimensionGroups build() {
                return new DimensionGroups(this);
            } 

        } 

    }
}
