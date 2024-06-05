// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupMemberResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupMemberResponseBody</p>
 */
public class ListGroupMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("group_items")
    private java.util.List < Group > groupItems;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("user_items")
    private java.util.List < User > userItems;

    private ListGroupMemberResponseBody(Builder builder) {
        this.groupItems = builder.groupItems;
        this.nextMarker = builder.nextMarker;
        this.userItems = builder.userItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupMemberResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupItems
     */
    public java.util.List < Group > getGroupItems() {
        return this.groupItems;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return userItems
     */
    public java.util.List < User > getUserItems() {
        return this.userItems;
    }

    public static final class Builder {
        private java.util.List < Group > groupItems; 
        private String nextMarker; 
        private java.util.List < User > userItems; 

        /**
         * The information about the groups.
         */
        public Builder groupItems(java.util.List < Group > groupItems) {
            this.groupItems = groupItems;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * The information about the users.
         */
        public Builder userItems(java.util.List < User > userItems) {
            this.userItems = userItems;
            return this;
        }

        public ListGroupMemberResponseBody build() {
            return new ListGroupMemberResponseBody(this);
        } 

    } 

}
