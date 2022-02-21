// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListsResponseBody</p>
 */
public class DescribePrefixListsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PrefixLists")
    private PrefixLists prefixLists;

    private DescribePrefixListsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.prefixLists = builder.prefixLists;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return prefixLists
     */
    public PrefixLists getPrefixLists() {
        return this.prefixLists;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private PrefixLists prefixLists; 

        /**
         * The Token returned by this call. If the returned value is null, no more data is returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array of prefix information.
         */
        public Builder prefixLists(PrefixLists prefixLists) {
            this.prefixLists = prefixLists;
            return this;
        }

        public DescribePrefixListsResponseBody build() {
            return new DescribePrefixListsResponseBody(this);
        } 

    } 

    public static class PrefixList extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("AssociationCount")
        private Integer associationCount;

        @NameInMap("MaxEntries")
        private Integer maxEntries;

        @NameInMap("Description")
        private String description;

        @NameInMap("AddressFamily")
        private String addressFamily;

        @NameInMap("PrefixListName")
        private String prefixListName;

        @NameInMap("PrefixListId")
        private String prefixListId;

        private PrefixList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.associationCount = builder.associationCount;
            this.maxEntries = builder.maxEntries;
            this.description = builder.description;
            this.addressFamily = builder.addressFamily;
            this.prefixListName = builder.prefixListName;
            this.prefixListId = builder.prefixListId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return associationCount
         */
        public Integer getAssociationCount() {
            return this.associationCount;
        }

        /**
         * @return maxEntries
         */
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return addressFamily
         */
        public String getAddressFamily() {
            return this.addressFamily;
        }

        /**
         * @return prefixListName
         */
        public String getPrefixListName() {
            return this.prefixListName;
        }

        /**
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public static final class Builder {
            private String creationTime; 
            private Integer associationCount; 
            private Integer maxEntries; 
            private String description; 
            private String addressFamily; 
            private String prefixListName; 
            private String prefixListId; 

            /**
             * The time when the prefix list was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of associated resources.
             */
            public Builder associationCount(Integer associationCount) {
                this.associationCount = associationCount;
                return this;
            }

            /**
             * The maximum number of entries supported by the prefix list.
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * The description of the prefix list.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The address family of the prefix list. Possible values:
             * <p>
             * 
             * -IPv4
             * -IPv6
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * The name of the prefix list.
             */
            public Builder prefixListName(String prefixListName) {
                this.prefixListName = prefixListName;
                return this;
            }

            /**
             * The ID of the prefix list.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            public PrefixList build() {
                return new PrefixList(this);
            } 

        } 

    }
    public static class PrefixLists extends TeaModel {
        @NameInMap("PrefixList")
        private java.util.List < PrefixList> prefixList;

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
        public java.util.List < PrefixList> getPrefixList() {
            return this.prefixList;
        }

        public static final class Builder {
            private java.util.List < PrefixList> prefixList; 

            /**
             * PrefixList.
             */
            public Builder prefixList(java.util.List < PrefixList> prefixList) {
                this.prefixList = prefixList;
                return this;
            }

            public PrefixLists build() {
                return new PrefixLists(this);
            } 

        } 

    }
}
