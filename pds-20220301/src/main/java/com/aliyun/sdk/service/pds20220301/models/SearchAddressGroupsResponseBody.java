// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAddressGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAddressGroupsResponseBody</p>
 */
public class SearchAddressGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < AddressGroup > items;

    private SearchAddressGroupsResponseBody(Builder builder) {
        this.items = builder.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAddressGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < AddressGroup > getItems() {
        return this.items;
    }

    public static final class Builder {
        private java.util.List < AddressGroup > items; 

        /**
         * The location-based groups.
         */
        public Builder items(java.util.List < AddressGroup > items) {
            this.items = items;
            return this;
        }

        public SearchAddressGroupsResponseBody build() {
            return new SearchAddressGroupsResponseBody(this);
        } 

    } 

}
