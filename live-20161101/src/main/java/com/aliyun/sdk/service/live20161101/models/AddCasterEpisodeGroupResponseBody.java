// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterEpisodeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterEpisodeGroupResponseBody</p>
 */
public class AddCasterEpisodeGroupResponseBody extends TeaModel {
    @NameInMap("ItemIds")
    private ItemIds itemIds;

    @NameInMap("ProgramId")
    private String programId;

    @NameInMap("RequestId")
    private String requestId;

    private AddCasterEpisodeGroupResponseBody(Builder builder) {
        this.itemIds = builder.itemIds;
        this.programId = builder.programId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterEpisodeGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return itemIds
     */
    public ItemIds getItemIds() {
        return this.itemIds;
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
        private ItemIds itemIds; 
        private String programId; 
        private String requestId; 

        /**
         * ItemIds.
         */
        public Builder itemIds(ItemIds itemIds) {
            this.itemIds = itemIds;
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

        public AddCasterEpisodeGroupResponseBody build() {
            return new AddCasterEpisodeGroupResponseBody(this);
        } 

    } 

    public static class ItemIds extends TeaModel {
        @NameInMap("ItemId")
        private java.util.List < String > itemId;

        private ItemIds(Builder builder) {
            this.itemId = builder.itemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemIds create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public java.util.List < String > getItemId() {
            return this.itemId;
        }

        public static final class Builder {
            private java.util.List < String > itemId; 

            /**
             * ItemId.
             */
            public Builder itemId(java.util.List < String > itemId) {
                this.itemId = itemId;
                return this;
            }

            public ItemIds build() {
                return new ItemIds(this);
            } 

        } 

    }
}
