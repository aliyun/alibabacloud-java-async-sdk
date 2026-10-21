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
         * <p>The maximum number of entries to return in a single call.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request or if there are no more results to return. If a next page exists, set this parameter to the value of NextToken returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of upgrade items.</p>
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
             * <p>The upgrade item ID.</p>
             * 
             * <strong>example:</strong>
             * <p>data_storage_2_upgrade</p>
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
