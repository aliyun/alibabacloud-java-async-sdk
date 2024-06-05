// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShareLinkResponseBody} extends {@link TeaModel}
 *
 * <p>ListShareLinkResponseBody</p>
 */
public class ListShareLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < ShareLink > items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    private ListShareLinkResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShareLinkResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < ShareLink > getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static final class Builder {
        private java.util.List < ShareLink > items; 
        private String nextMarker; 

        /**
         * The information about the shares.
         */
        public Builder items(java.util.List < ShareLink > items) {
            this.items = items;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        public ListShareLinkResponseBody build() {
            return new ListShareLinkResponseBody(this);
        } 

    } 

}
