// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListsResponseBody</p>
 */
public class DescribePrefixListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrefixList")
    private java.util.List < PrefixList> prefixList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrefixListsResponseBody(Builder builder) {
        this.prefixList = builder.prefixList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrefixListsResponseBody create() {
        return builder().build();
    }

    /**
     * @return prefixList
     */
    public java.util.List < PrefixList> getPrefixList() {
        return this.prefixList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PrefixList> prefixList; 
        private String requestId; 

        /**
         * Details about the prefix lists.
         */
        public Builder prefixList(java.util.List < PrefixList> prefixList) {
            this.prefixList = prefixList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrefixListsResponseBody build() {
            return new DescribePrefixListsResponseBody(this);
        } 

    } 

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
             * The IP address family of the prefix list. Valid values:
             * <p>
             * 
             * *   IPv4
             * *   IPv6
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
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
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The maximum number of entries in the prefix list.
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * The ID of the prefix list.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * The name of the prefix list.
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
}
