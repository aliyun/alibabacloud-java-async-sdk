// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListUpgradeItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUpgradeItemsResponseBody</p>
 */
public class ListUpgradeItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UpgradeItems")
    private java.util.List<UpgradeItems> upgradeItems;

    private ListUpgradeItemsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.upgradeItems = builder.upgradeItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUpgradeItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return upgradeItems
     */
    public java.util.List<UpgradeItems> getUpgradeItems() {
        return this.upgradeItems;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<UpgradeItems> upgradeItems; 

        private Builder() {
        } 

        private Builder(ListUpgradeItemsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.upgradeItems = model.upgradeItems;
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

        /**
         * UpgradeItems.
         */
        public Builder upgradeItems(java.util.List<UpgradeItems> upgradeItems) {
            this.upgradeItems = upgradeItems;
            return this;
        }

        public ListUpgradeItemsResponseBody build() {
            return new ListUpgradeItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUpgradeItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUpgradeItemsResponseBody</p>
     */
    public static class UpgradeItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpgradeItemId")
        private String upgradeItemId;

        private UpgradeItems(Builder builder) {
            this.upgradeItemId = builder.upgradeItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeItems create() {
            return builder().build();
        }

        /**
         * @return upgradeItemId
         */
        public String getUpgradeItemId() {
            return this.upgradeItemId;
        }

        public static final class Builder {
            private String upgradeItemId; 

            private Builder() {
            } 

            private Builder(UpgradeItems model) {
                this.upgradeItemId = model.upgradeItemId;
            } 

            /**
             * UpgradeItemId.
             */
            public Builder upgradeItemId(String upgradeItemId) {
                this.upgradeItemId = upgradeItemId;
                return this;
            }

            public UpgradeItems build() {
                return new UpgradeItems(this);
            } 

        } 

    }
}
