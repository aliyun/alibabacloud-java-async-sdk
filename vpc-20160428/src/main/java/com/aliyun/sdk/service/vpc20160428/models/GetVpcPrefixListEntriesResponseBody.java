// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link GetVpcPrefixListEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcPrefixListEntriesResponseBody</p>
 */
public class GetVpcPrefixListEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PrefixListEntry")
    private java.util.List<PrefixListEntry> prefixListEntry;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PrefixListEntry> getPrefixListEntry() {
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
        private java.util.List<PrefixListEntry> prefixListEntry; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetVpcPrefixListEntriesResponseBody model) {
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.prefixListEntry = model.prefixListEntry;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value indicates the token that is used for the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about the prefix list.</p>
         */
        public Builder prefixListEntry(java.util.List<PrefixListEntry> prefixListEntry) {
            this.prefixListEntry = prefixListEntry;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetVpcPrefixListEntriesResponseBody build() {
            return new GetVpcPrefixListEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpcPrefixListEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpcPrefixListEntriesResponseBody</p>
     */
    public static class PrefixListEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PrefixListId")
        private String prefixListId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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

            private Builder() {
            } 

            private Builder(PrefixListEntry model) {
                this.cidr = model.cidr;
                this.description = model.description;
                this.prefixListId = model.prefixListId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The CIDR blocks specified in the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-0b7hwu67****</p>
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * <p>The region ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
