// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcPrefixListEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcPrefixListEntriesResponseBody</p>
 */
public class GetVpcPrefixListEntriesResponseBody extends TeaModel {
    @NameInMap("Count")
    private Long count;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PrefixListEntry")
    private java.util.List < PrefixListEntry> prefixListEntry;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetVpcPrefixListEntriesResponseBody(Builder builder) {
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.prefixListEntry = builder.prefixListEntry;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcPrefixListEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefixListEntry
     */
    public java.util.List < PrefixListEntry> getPrefixListEntry() {
        return this.prefixListEntry;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long count; 
        private String nextToken; 
        private java.util.List < PrefixListEntry> prefixListEntry; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The number of entries.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value indicates the token that is used for the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about the prefix list.
         */
        public Builder prefixListEntry(java.util.List < PrefixListEntry> prefixListEntry) {
            this.prefixListEntry = prefixListEntry;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetVpcPrefixListEntriesResponseBody build() {
            return new GetVpcPrefixListEntriesResponseBody(this);
        } 

    } 

    public static class PrefixListEntry extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Description")
        private String description;

        @NameInMap("PrefixListId")
        private String prefixListId;

        @NameInMap("RegionId")
        private String regionId;

        private PrefixListEntry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
            this.prefixListId = builder.prefixListId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixListEntry create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 
            private String prefixListId; 
            private String regionId; 

            /**
             * The CIDR blocks specified in the prefix list.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
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
             * The ID of the prefix list.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * The region ID of the prefix list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public PrefixListEntry build() {
                return new PrefixListEntry(this);
            } 

        } 

    }
}
