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
 * {@link ListPlaylistItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPlaylistItemsResponseBody</p>
 */
public class ListPlaylistItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProgramItems")
    private java.util.List<ProgramItems> programItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListPlaylistItemsResponseBody(Builder builder) {
        this.programItems = builder.programItems;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlaylistItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return programItems
     */
    public java.util.List<ProgramItems> getProgramItems() {
        return this.programItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<ProgramItems> programItems; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListPlaylistItemsResponseBody model) {
            this.programItems = model.programItems;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The episodes.</p>
         */
        public Builder programItems(java.util.List<ProgramItems> programItems) {
            this.programItems = programItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of episodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListPlaylistItemsResponseBody build() {
            return new ListPlaylistItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPlaylistItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlaylistItemsResponseBody</p>
     */
    public static class ProgramItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("ProgramId")
        private String programId;

        @com.aliyun.core.annotation.NameInMap("ProgramItemId")
        private String programItemId;

        @com.aliyun.core.annotation.NameInMap("ProgramItemName")
        private String programItemName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceValue")
        private String resourceValue;

        private ProgramItems(Builder builder) {
            this.index = builder.index;
            this.programId = builder.programId;
            this.programItemId = builder.programItemId;
            this.programItemName = builder.programItemName;
            this.resourceType = builder.resourceType;
            this.resourceValue = builder.resourceValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgramItems create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return programId
         */
        public String getProgramId() {
            return this.programId;
        }

        /**
         * @return programItemId
         */
        public String getProgramItemId() {
            return this.programItemId;
        }

        /**
         * @return programItemName
         */
        public String getProgramItemName() {
            return this.programItemName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceValue
         */
        public String getResourceValue() {
            return this.resourceValue;
        }

        public static final class Builder {
            private Integer index; 
            private String programId; 
            private String programItemId; 
            private String programItemName; 
            private String resourceType; 
            private String resourceValue; 

            private Builder() {
            } 

            private Builder(ProgramItems model) {
                this.index = model.index;
                this.programId = model.programId;
                this.programItemId = model.programItemId;
                this.programItemName = model.programItemName;
                this.resourceType = model.resourceType;
                this.resourceValue = model.resourceValue;
            } 

            /**
             * <p>The sequence number of the episode in the query result.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The ID of the episode list. You can use the ID as a request parameter in the API operation that is used to edit the episode list, delete the episode list, query the information about the episode list, start the episode list, or stop the episode list.</p>
             * 
             * <strong>example:</strong>
             * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
             */
            public Builder programId(String programId) {
                this.programId = programId;
                return this;
            }

            /**
             * <p>The ID of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>c10f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
             */
            public Builder programItemId(String programItemId) {
                this.programItemId = programItemId;
                return this;
            }

            /**
             * <p>The name of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>playlistItem1</p>
             */
            public Builder programItemName(String programItemName) {
                this.programItemName = programItemName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>vod</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfasdf8as9df8sa9df89****</p>
             */
            public Builder resourceValue(String resourceValue) {
                this.resourceValue = resourceValue;
                return this;
            }

            public ProgramItems build() {
                return new ProgramItems(this);
            } 

        } 

    }
}
