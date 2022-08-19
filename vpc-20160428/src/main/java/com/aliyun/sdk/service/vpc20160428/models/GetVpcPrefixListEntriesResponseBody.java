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
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
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
         * PrefixListEntry.
         */
        public Builder prefixListEntry(java.util.List < PrefixListEntry> prefixListEntry) {
            this.prefixListEntry = prefixListEntry;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

        private PrefixListEntry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
            this.prefixListId = builder.prefixListId;
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

        public static final class Builder {
            private String cidr; 
            private String description; 
            private String prefixListId; 

            /**
             * 状态
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * 名称
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 前缀列表的实例ID
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            public PrefixListEntry build() {
                return new PrefixListEntry(this);
            } 

        } 

    }
}
