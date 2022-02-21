// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductDimensionGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductDimensionGroupsResponseBody</p>
 */
public class ListProductDimensionGroupsResponseBody extends TeaModel {
    @NameInMap("DimensionGroups")
    private java.util.List < DimensionGroups> dimensionGroups;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return dimensionGroups
     */
    public java.util.List < DimensionGroups> getDimensionGroups() {
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
        private java.util.List < DimensionGroups> dimensionGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DimensionGroups.
         */
        public Builder dimensionGroups(java.util.List < DimensionGroups> dimensionGroups) {
            this.dimensionGroups = dimensionGroups;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProductDimensionGroupsResponseBody build() {
            return new ListProductDimensionGroupsResponseBody(this);
        } 

    } 

    public static class DimensionGroups extends TeaModel {
        @NameInMap("DimensionKeys")
        private java.util.List < String > dimensionKeys;

        @NameInMap("GroupCode")
        private String groupCode;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ProductCode")
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
        public java.util.List < String > getDimensionKeys() {
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
            private java.util.List < String > dimensionKeys; 
            private String groupCode; 
            private String groupName; 
            private String productCode; 

            /**
             * DimensionKeys.
             */
            public Builder dimensionKeys(java.util.List < String > dimensionKeys) {
                this.dimensionKeys = dimensionKeys;
                return this;
            }

            /**
             * GroupCode.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ProductCode.
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
