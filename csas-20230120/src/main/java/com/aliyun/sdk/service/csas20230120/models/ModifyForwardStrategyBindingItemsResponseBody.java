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
 * {@link ModifyForwardStrategyBindingItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyForwardStrategyBindingItemsResponseBody</p>
 */
public class ModifyForwardStrategyBindingItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardStrategyBindingItems")
    private ForwardStrategyBindingItems forwardStrategyBindingItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyForwardStrategyBindingItemsResponseBody(Builder builder) {
        this.forwardStrategyBindingItems = builder.forwardStrategyBindingItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardStrategyBindingItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardStrategyBindingItems
     */
    public ForwardStrategyBindingItems getForwardStrategyBindingItems() {
        return this.forwardStrategyBindingItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ForwardStrategyBindingItems forwardStrategyBindingItems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyForwardStrategyBindingItemsResponseBody model) {
            this.forwardStrategyBindingItems = model.forwardStrategyBindingItems;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The binding items of the forwarding rule after this modification.</p>
         */
        public Builder forwardStrategyBindingItems(ForwardStrategyBindingItems forwardStrategyBindingItems) {
            this.forwardStrategyBindingItems = forwardStrategyBindingItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5F79AE39-6622-5292-87EF-DE45631DE4D7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyForwardStrategyBindingItemsResponseBody build() {
            return new ModifyForwardStrategyBindingItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyForwardStrategyBindingItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyForwardStrategyBindingItemsResponseBody</p>
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
             * <p>The private network access application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-104b6b97b7f0c5d9</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The private network access application name.</p>
             * 
             * <strong>example:</strong>
             * <p>OA System</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The private network access tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-4c8b988bb0ffdfb3</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Finance System</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>usergroup-3f9a2c7e10b4d856</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>The user group name.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D Department</p>
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
     * {@link ModifyForwardStrategyBindingItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyForwardStrategyBindingItemsResponseBody</p>
     */
    public static class ForwardStrategyBindingItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardId")
        private String forwardId;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        private ForwardStrategyBindingItems(Builder builder) {
            this.forwardId = builder.forwardId;
            this.items = builder.items;
            this.matchMode = builder.matchMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardStrategyBindingItems create() {
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

            private Builder(ForwardStrategyBindingItems model) {
                this.forwardId = model.forwardId;
                this.items = model.items;
                this.matchMode = model.matchMode;
            } 

            /**
             * <p>The forwarding rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fs-849ac29396d9ea98</p>
             */
            public Builder forwardId(String forwardId) {
                this.forwardId = forwardId;
                return this;
            }

            /**
             * <p>The binding content. This parameter is not returned when MatchMode is <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The policy matching target type. Valid values:</p>
             * <ul>
             * <li><strong>UserGroupAll</strong>: associates with all users.</li>
             * <li><strong>UserGroupNormal</strong>: associates with specific user groups.</li>
             * <li><strong>ApplicationAll</strong>: all private network applications.</li>
             * <li><strong>Application</strong>: specific private network applications.</li>
             * <li><strong>Tag</strong>: private network application tags.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Application</p>
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            public ForwardStrategyBindingItems build() {
                return new ForwardStrategyBindingItems(this);
            } 

        } 

    }
}
