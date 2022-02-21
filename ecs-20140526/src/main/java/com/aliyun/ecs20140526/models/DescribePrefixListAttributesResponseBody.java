// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListAttributesResponseBody</p>
 */
public class DescribePrefixListAttributesResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("MaxEntries")
    private Integer maxEntries;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Description")
    private String description;

    @NameInMap("AddressFamily")
    private String addressFamily;

    @NameInMap("PrefixListName")
    private String prefixListName;

    @NameInMap("PrefixListId")
    private String prefixListId;

    @NameInMap("Entries")
    private Entries entries;

    private DescribePrefixListAttributesResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.maxEntries = builder.maxEntries;
        this.requestId = builder.requestId;
        this.description = builder.description;
        this.addressFamily = builder.addressFamily;
        this.prefixListName = builder.prefixListName;
        this.prefixListId = builder.prefixListId;
        this.entries = builder.entries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrefixListAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return maxEntries
     */
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return entries
     */
    public Entries getEntries() {
        return this.entries;
    }

    public static final class Builder {
        private String creationTime; 
        private Integer maxEntries; 
        private String requestId; 
        private String description; 
        private String addressFamily; 
        private String prefixListName; 
        private String prefixListId; 
        private Entries entries; 

        /**
         * The time when the prefix list was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * Prefix List ID.
         */
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * An array of entries in the prefix list.
         */
        public Builder entries(Entries entries) {
            this.entries = entries;
            return this;
        }

        public DescribePrefixListAttributesResponseBody build() {
            return new DescribePrefixListAttributesResponseBody(this);
        } 

    } 

    public static class Entry extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Cidr")
        private String cidr;

        private Entry(Builder builder) {
            this.description = builder.description;
            this.cidr = builder.cidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entry create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        public static final class Builder {
            private String description; 
            private String cidr; 

            /**
             * The description of the prefix list entry.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Prefix List entry CIDR address block information.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            public Entry build() {
                return new Entry(this);
            } 

        } 

    }
    public static class Entries extends TeaModel {
        @NameInMap("Entry")
        private java.util.List < Entry> entry;

        private Entries(Builder builder) {
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return entry
         */
        public java.util.List < Entry> getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private java.util.List < Entry> entry; 

            /**
             * Entry.
             */
            public Builder entry(java.util.List < Entry> entry) {
                this.entry = entry;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
