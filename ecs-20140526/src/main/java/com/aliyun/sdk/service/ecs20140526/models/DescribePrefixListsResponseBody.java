// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListsResponseBody</p>
 */
public class DescribePrefixListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PrefixLists")
    private PrefixLists prefixLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrefixListsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.prefixLists = builder.prefixLists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrefixListsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefixLists
     */
    public PrefixLists getPrefixLists() {
        return this.prefixLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private PrefixLists prefixLists; 
        private String requestId; 

        /**
         * <p>The query token returned in this call. If the return value is empty, no more data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Details about the prefix lists.</p>
         */
        public Builder prefixLists(PrefixLists prefixLists) {
            this.prefixLists = prefixLists;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrefixListsResponseBody build() {
            return new DescribePrefixListsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListsResponseBody</p>
     */
    public static class PrefixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressFamily")
        private String addressFamily;

        @com.aliyun.core.annotation.NameInMap("AssociationCount")
        private Integer associationCount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaxEntries")
        private Integer maxEntries;

        @com.aliyun.core.annotation.NameInMap("PrefixListId")
        private String prefixListId;

        @com.aliyun.core.annotation.NameInMap("PrefixListName")
        private String prefixListName;

        private PrefixList(Builder builder) {
            this.addressFamily = builder.addressFamily;
            this.associationCount = builder.associationCount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.maxEntries = builder.maxEntries;
            this.prefixListId = builder.prefixListId;
            this.prefixListName = builder.prefixListName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixList create() {
            return builder().build();
        }

        /**
         * @return addressFamily
         */
        public String getAddressFamily() {
            return this.addressFamily;
        }

        /**
         * @return associationCount
         */
        public Integer getAssociationCount() {
            return this.associationCount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maxEntries
         */
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        /**
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        /**
         * @return prefixListName
         */
        public String getPrefixListName() {
            return this.prefixListName;
        }

        public static final class Builder {
            private String addressFamily; 
            private Integer associationCount; 
            private String creationTime; 
            private String description; 
            private Integer maxEntries; 
            private String prefixListId; 
            private String prefixListName; 

            /**
             * <p>The IP address family of the prefix list. Valid values:</p>
             * <ul>
             * <li>IPv4</li>
             * <li>IPv6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The number of associated resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder associationCount(Integer associationCount) {
                this.associationCount = associationCount;
                return this;
            }

            /**
             * <p>The time when the prefix list was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-20T07:11Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The maximum number of entries that the prefix list can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * <p>The ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-x1j1k5ykzqlixdcy****</p>
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * <p>The name of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>PrefixListNameSample</p>
             */
            public Builder prefixListName(String prefixListName) {
                this.prefixListName = prefixListName;
                return this;
            }

            public PrefixList build() {
                return new PrefixList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListsResponseBody</p>
     */
    public static class PrefixLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrefixList")
        private java.util.List<PrefixList> prefixList;

        private PrefixLists(Builder builder) {
            this.prefixList = builder.prefixList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixLists create() {
            return builder().build();
        }

        /**
         * @return prefixList
         */
        public java.util.List<PrefixList> getPrefixList() {
            return this.prefixList;
        }

        public static final class Builder {
            private java.util.List<PrefixList> prefixList; 

            /**
             * PrefixList.
             */
            public Builder prefixList(java.util.List<PrefixList> prefixList) {
                this.prefixList = prefixList;
                return this;
            }

            public PrefixLists build() {
                return new PrefixLists(this);
            } 

        } 

    }
}
