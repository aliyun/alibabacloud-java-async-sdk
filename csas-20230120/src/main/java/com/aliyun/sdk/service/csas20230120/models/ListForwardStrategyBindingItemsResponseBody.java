// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListForwardStrategyBindingItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListForwardStrategyBindingItemsResponseBody</p>
 */
public class ListForwardStrategyBindingItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardStrategyBindingItemsList")
    private java.util.List<ForwardStrategyBindingItemsList> forwardStrategyBindingItemsList;

    @com.aliyun.core.annotation.NameInMap("ItemType")
    private String itemType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListForwardStrategyBindingItemsResponseBody(Builder builder) {
        this.forwardStrategyBindingItemsList = builder.forwardStrategyBindingItemsList;
        this.itemType = builder.itemType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListForwardStrategyBindingItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardStrategyBindingItemsList
     */
    public java.util.List<ForwardStrategyBindingItemsList> getForwardStrategyBindingItemsList() {
        return this.forwardStrategyBindingItemsList;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ForwardStrategyBindingItemsList> forwardStrategyBindingItemsList; 
        private String itemType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListForwardStrategyBindingItemsResponseBody model) {
            this.forwardStrategyBindingItemsList = model.forwardStrategyBindingItemsList;
            this.itemType = model.itemType;
            this.requestId = model.requestId;
        } 

        /**
         * ForwardStrategyBindingItemsList.
         */
        public Builder forwardStrategyBindingItemsList(java.util.List<ForwardStrategyBindingItemsList> forwardStrategyBindingItemsList) {
            this.forwardStrategyBindingItemsList = forwardStrategyBindingItemsList;
            return this;
        }

        /**
         * ItemType.
         */
        public Builder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5F79AE39-6622-5292-87EF-DE45631DE4D7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListForwardStrategyBindingItemsResponseBody build() {
            return new ListForwardStrategyBindingItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListForwardStrategyBindingItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardStrategyBindingItemsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
        private String userGroupName;

        private Items(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String applicationId; 
            private String applicationName; 
            private String tagId; 
            private String tagName; 
            private String userGroupId; 
            private String userGroupName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
                this.tagId = model.tagId;
                this.tagName = model.tagName;
                this.userGroupId = model.userGroupId;
                this.userGroupName = model.userGroupName;
            } 

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * UserGroupId.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserGroupName.
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListForwardStrategyBindingItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardStrategyBindingItemsResponseBody</p>
     */
    public static class ForwardStrategyBindingItemsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardId")
        private String forwardId;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        private ForwardStrategyBindingItemsList(Builder builder) {
            this.forwardId = builder.forwardId;
            this.items = builder.items;
            this.matchMode = builder.matchMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardStrategyBindingItemsList create() {
            return builder().build();
        }

        /**
         * @return forwardId
         */
        public String getForwardId() {
            return this.forwardId;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
        }

        public static final class Builder {
            private String forwardId; 
            private java.util.List<Items> items; 
            private String matchMode; 

            private Builder() {
            } 

            private Builder(ForwardStrategyBindingItemsList model) {
                this.forwardId = model.forwardId;
                this.items = model.items;
                this.matchMode = model.matchMode;
            } 

            /**
             * ForwardId.
             */
            public Builder forwardId(String forwardId) {
                this.forwardId = forwardId;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * MatchMode.
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            public ForwardStrategyBindingItemsList build() {
                return new ForwardStrategyBindingItemsList(this);
            } 

        } 

    }
}
