// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntityItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEntityItemsResponseBody</p>
 */
public class ListEntityItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityItems")
    private java.util.List < EntityItems> entityItems;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEntityItemsResponseBody(Builder builder) {
        this.entityItems = builder.entityItems;
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntityItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return entityItems
     */
    public java.util.List < EntityItems> getEntityItems() {
        return this.entityItems;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
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
        private java.util.List < EntityItems> entityItems; 
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * EntityItems.
         */
        public Builder entityItems(java.util.List < EntityItems> entityItems) {
            this.entityItems = entityItems;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
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

        public ListEntityItemsResponseBody build() {
            return new ListEntityItemsResponseBody(this);
        } 

    } 

    public static class EntityItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityData")
        private java.util.Map < String, String > entityData;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        private EntityItems(Builder builder) {
            this.entityData = builder.entityData;
            this.entityName = builder.entityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityItems create() {
            return builder().build();
        }

        /**
         * @return entityData
         */
        public java.util.Map < String, String > getEntityData() {
            return this.entityData;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        public static final class Builder {
            private java.util.Map < String, String > entityData; 
            private String entityName; 

            /**
             * EntityData.
             */
            public Builder entityData(java.util.Map < String, String > entityData) {
                this.entityData = entityData;
                return this;
            }

            /**
             * EntityName.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            public EntityItems build() {
                return new EntityItems(this);
            } 

        } 

    }
}
