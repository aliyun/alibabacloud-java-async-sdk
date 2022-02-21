// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPlaylistItemsResponseBody} extends {@link TeaModel}
 *
 * <p>AddPlaylistItemsResponseBody</p>
 */
public class AddPlaylistItemsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("ProgramId")
    private String programId;

    @NameInMap("RequestId")
    private String requestId;

    private AddPlaylistItemsResponseBody(Builder builder) {
        this.items = builder.items;
        this.programId = builder.programId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPlaylistItemsResponseBody create() {
        return builder().build();
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
        private Items items; 
        private String programId; 
        private String requestId; 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * ProgramId.
         */
        public Builder programId(String programId) {
            this.programId = programId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPlaylistItemsResponseBody build() {
            return new AddPlaylistItemsResponseBody(this);
        } 

    } 

    public static class FailedItems extends TeaModel {
        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemName")
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

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
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
    public static class SuccessItems extends TeaModel {
        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemName")
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

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
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
    public static class Items extends TeaModel {
        @NameInMap("FailedItems")
        private java.util.List < FailedItems> failedItems;

        @NameInMap("SuccessItems")
        private java.util.List < SuccessItems> successItems;

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
        public java.util.List < FailedItems> getFailedItems() {
            return this.failedItems;
        }

        /**
         * @return successItems
         */
        public java.util.List < SuccessItems> getSuccessItems() {
            return this.successItems;
        }

        public static final class Builder {
            private java.util.List < FailedItems> failedItems; 
            private java.util.List < SuccessItems> successItems; 

            /**
             * FailedItems.
             */
            public Builder failedItems(java.util.List < FailedItems> failedItems) {
                this.failedItems = failedItems;
                return this;
            }

            /**
             * SuccessItems.
             */
            public Builder successItems(java.util.List < SuccessItems> successItems) {
                this.successItems = successItems;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
