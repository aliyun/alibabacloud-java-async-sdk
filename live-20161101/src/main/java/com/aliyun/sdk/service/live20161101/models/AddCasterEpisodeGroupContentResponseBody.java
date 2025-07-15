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
 * {@link AddCasterEpisodeGroupContentResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterEpisodeGroupContentResponseBody</p>
 */
public class AddCasterEpisodeGroupContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private ItemIds itemIds;

    @com.aliyun.core.annotation.NameInMap("ProgramId")
    private String programId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCasterEpisodeGroupContentResponseBody(Builder builder) {
        this.itemIds = builder.itemIds;
        this.programId = builder.programId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterEpisodeGroupContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddCasterEpisodeGroupContentResponseBody model) {
            this.itemIds = model.itemIds;
            this.programId = model.programId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the episodes.</p>
         */
        public Builder itemIds(ItemIds itemIds) {
            this.itemIds = itemIds;
            return this;
        }

        /**
         * <p>The ID of the episode list. You can use the ID as a request parameter in the API operation that is used to create or add episodes, remove episodes, query episodes, edit an episode list, delete an episode list, query the information about an episode list, start playing an episode list, or stop playing an episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68X****</p>
         */
        public Builder programId(String programId) {
            this.programId = programId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCasterEpisodeGroupContentResponseBody build() {
            return new AddCasterEpisodeGroupContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddCasterEpisodeGroupContentResponseBody} extends {@link TeaModel}
     *
     * <p>AddCasterEpisodeGroupContentResponseBody</p>
     */
    public static class ItemIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private java.util.List<String> itemId;

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
        public java.util.List<String> getItemId() {
            return this.itemId;
        }

        public static final class Builder {
            private java.util.List<String> itemId; 

            private Builder() {
            } 

            private Builder(ItemIds model) {
                this.itemId = model.itemId;
            } 

            /**
             * ItemId.
             */
            public Builder itemId(java.util.List<String> itemId) {
                this.itemId = itemId;
                return this;
            }

            public ItemIds build() {
                return new ItemIds(this);
            } 

        } 

    }
}
