// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWatchItemsRequest} extends {@link RequestModel}
 *
 * <p>AddWatchItemsRequest</p>
 */
public class AddWatchItemsRequest extends Request {
    @Body
    @NameInMap("WatchItemList")
    @Validation(required = true)
    private java.util.List < WatchItemList> watchItemList;

    @Body
    @NameInMap("WatchPolicyId")
    @Validation(required = true)
    private String watchPolicyId;

    private AddWatchItemsRequest(Builder builder) {
        super(builder);
        this.watchItemList = builder.watchItemList;
        this.watchPolicyId = builder.watchPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWatchItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return watchItemList
     */
    public java.util.List < WatchItemList> getWatchItemList() {
        return this.watchItemList;
    }

    /**
     * @return watchPolicyId
     */
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

    public static final class Builder extends Request.Builder<AddWatchItemsRequest, Builder> {
        private java.util.List < WatchItemList> watchItemList; 
        private String watchPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(AddWatchItemsRequest response) {
            super(response);
            this.watchItemList = response.watchItemList;
            this.watchPolicyId = response.watchPolicyId;
        } 

        /**
         * WatchItemList.
         */
        public Builder watchItemList(java.util.List < WatchItemList> watchItemList) {
            this.putBodyParameter("WatchItemList", watchItemList);
            this.watchItemList = watchItemList;
            return this;
        }

        /**
         * WatchPolicyId.
         */
        public Builder watchPolicyId(String watchPolicyId) {
            this.putBodyParameter("WatchPolicyId", watchPolicyId);
            this.watchPolicyId = watchPolicyId;
            return this;
        }

        @Override
        public AddWatchItemsRequest build() {
            return new AddWatchItemsRequest(this);
        } 

    } 

    public static class WatchItemList extends TeaModel {
        @NameInMap("ItemAttributes")
        private String itemAttributes;

        @NameInMap("ItemImageUrl")
        private String itemImageUrl;

        @NameInMap("WatchItemId")
        @Validation(required = true)
        private String watchItemId;

        @NameInMap("WatchItemName")
        private String watchItemName;

        private WatchItemList(Builder builder) {
            this.itemAttributes = builder.itemAttributes;
            this.itemImageUrl = builder.itemImageUrl;
            this.watchItemId = builder.watchItemId;
            this.watchItemName = builder.watchItemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatchItemList create() {
            return builder().build();
        }

        /**
         * @return itemAttributes
         */
        public String getItemAttributes() {
            return this.itemAttributes;
        }

        /**
         * @return itemImageUrl
         */
        public String getItemImageUrl() {
            return this.itemImageUrl;
        }

        /**
         * @return watchItemId
         */
        public String getWatchItemId() {
            return this.watchItemId;
        }

        /**
         * @return watchItemName
         */
        public String getWatchItemName() {
            return this.watchItemName;
        }

        public static final class Builder {
            private String itemAttributes; 
            private String itemImageUrl; 
            private String watchItemId; 
            private String watchItemName; 

            /**
             * ItemAttributes.
             */
            public Builder itemAttributes(String itemAttributes) {
                this.itemAttributes = itemAttributes;
                return this;
            }

            /**
             * ItemImageUrl.
             */
            public Builder itemImageUrl(String itemImageUrl) {
                this.itemImageUrl = itemImageUrl;
                return this;
            }

            /**
             * WatchItemId.
             */
            public Builder watchItemId(String watchItemId) {
                this.watchItemId = watchItemId;
                return this;
            }

            /**
             * WatchItemName.
             */
            public Builder watchItemName(String watchItemName) {
                this.watchItemName = watchItemName;
                return this;
            }

            public WatchItemList build() {
                return new WatchItemList(this);
            } 

        } 

    }
}
