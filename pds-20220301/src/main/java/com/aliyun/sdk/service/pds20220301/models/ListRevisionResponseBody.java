// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRevisionResponseBody} extends {@link TeaModel}
 *
 * <p>ListRevisionResponseBody</p>
 */
public class ListRevisionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < Revision > items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    private ListRevisionResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRevisionResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Revision > getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static final class Builder {
        private java.util.List < Revision > items; 
        private String nextMarker; 

        /**
         * The information about the versions.
         */
        public Builder items(java.util.List < Revision > items) {
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

        public ListRevisionResponseBody build() {
            return new ListRevisionResponseBody(this);
        } 

    } 

}
