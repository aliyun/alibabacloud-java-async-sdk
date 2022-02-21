// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersForGroupRequest} extends {@link RequestModel}
 *
 * <p>ListUsersForGroupRequest</p>
 */
public class ListUsersForGroupRequest extends Request {
    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("MaxItems")
    private Integer maxItems;

    private ListUsersForGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersForGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItems
     */
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public static final class Builder extends Request.Builder<ListUsersForGroupRequest, Builder> {
        private String groupName; 
        private String marker; 
        private Integer maxItems; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersForGroupRequest response) {
            super(response);
            this.groupName = response.groupName;
            this.marker = response.marker;
            this.maxItems = response.maxItems;
        } 

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * MaxItems.
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        @Override
        public ListUsersForGroupRequest build() {
            return new ListUsersForGroupRequest(this);
        } 

    } 

}
