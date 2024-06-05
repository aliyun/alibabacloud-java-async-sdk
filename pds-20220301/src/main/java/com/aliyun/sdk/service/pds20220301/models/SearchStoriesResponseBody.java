// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchStoriesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchStoriesResponseBody</p>
 */
public class SearchStoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < Story > items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    private SearchStoriesResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchStoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Story > getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static final class Builder {
        private java.util.List < Story > items; 
        private String nextMarker; 

        /**
         * items.
         */
        public Builder items(java.util.List < Story > items) {
            this.items = items;
            return this;
        }

        /**
         * next_marker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        public SearchStoriesResponseBody build() {
            return new SearchStoriesResponseBody(this);
        } 

    } 

}
