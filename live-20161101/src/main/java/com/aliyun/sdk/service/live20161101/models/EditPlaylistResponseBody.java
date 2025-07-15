// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link EditPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>EditPlaylistResponseBody</p>
 */
public class EditPlaylistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("ProgramId")
    private String programId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EditPlaylistResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.items = builder.items;
        this.programId = builder.programId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditPlaylistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String casterId; 
        private Items items; 
        private String programId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EditPlaylistResponseBody model) {
            this.casterId = model.casterId;
            this.items = model.items;
            this.programId = model.programId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the production studio. You can use the ID as a request parameter in the API operation that is used to configure callbacks or add a virtual studio layout.</p>
         * 
         * <strong>example:</strong>
         * <p>0e94d1f4-1a65-445c-9dcf-de8b3b8d****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The information about the episodes.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the episode list. You can use the ID as a request parameter in the API operation that is used to delete the episode list, query the information about the episode list, start the episode list, or stop the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder programId(String programId) {
            this.programId = programId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditPlaylistResponseBody build() {
            return new EditPlaylistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EditPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>EditPlaylistResponseBody</p>
     */
    public static class FailedItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        private FailedItems(Builder builder) {
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        public static final class Builder {
            private String itemId; 
            private String itemName; 

            private Builder() {
            } 

            private Builder(FailedItems model) {
                this.itemId = model.itemId;
                this.itemName = model.itemName;
            } 

            /**
             * <p>The ID of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The name of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>item2</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            public FailedItems build() {
                return new FailedItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link EditPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>EditPlaylistResponseBody</p>
     */
    public static class SuccessItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        private SuccessItems(Builder builder) {
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        public static final class Builder {
            private String itemId; 
            private String itemName; 

            private Builder() {
            } 

            private Builder(SuccessItems model) {
                this.itemId = model.itemId;
                this.itemName = model.itemName;
            } 

            /**
             * <p>The ID of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The name of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>item1</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            public SuccessItems build() {
                return new SuccessItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link EditPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>EditPlaylistResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedItems")
        private java.util.List<FailedItems> failedItems;

        @com.aliyun.core.annotation.NameInMap("SuccessItems")
        private java.util.List<SuccessItems> successItems;

        private Items(Builder builder) {
            this.failedItems = builder.failedItems;
            this.successItems = builder.successItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return failedItems
         */
        public java.util.List<FailedItems> getFailedItems() {
            return this.failedItems;
        }

        /**
         * @return successItems
         */
        public java.util.List<SuccessItems> getSuccessItems() {
            return this.successItems;
        }

        public static final class Builder {
            private java.util.List<FailedItems> failedItems; 
            private java.util.List<SuccessItems> successItems; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.failedItems = model.failedItems;
                this.successItems = model.successItems;
            } 

            /**
             * <p>The episodes that failed to be added.</p>
             */
            public Builder failedItems(java.util.List<FailedItems> failedItems) {
                this.failedItems = failedItems;
                return this;
            }

            /**
             * <p>The episodes that were added.</p>
             */
            public Builder successItems(java.util.List<SuccessItems> successItems) {
                this.successItems = successItems;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
