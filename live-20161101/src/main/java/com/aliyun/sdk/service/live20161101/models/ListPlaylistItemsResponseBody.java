// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPlaylistItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPlaylistItemsResponseBody</p>
 */
public class ListPlaylistItemsResponseBody extends TeaModel {
    @NameInMap("ProgramItems")
    private java.util.List < ProgramItems> programItems;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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

    /**
     * @return programItems
     */
    public java.util.List < ProgramItems> getProgramItems() {
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
        private java.util.List < ProgramItems> programItems; 
        private String requestId; 
        private Integer total; 

        /**
         * ProgramItems.
         */
        public Builder programItems(java.util.List < ProgramItems> programItems) {
            this.programItems = programItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListPlaylistItemsResponseBody build() {
            return new ListPlaylistItemsResponseBody(this);
        } 

    } 

    public static class ProgramItems extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("ProgramId")
        private String programId;

        @NameInMap("ProgramItemId")
        private String programItemId;

        @NameInMap("ProgramItemName")
        private String programItemName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ResourceValue")
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

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * ProgramItemId.
             */
            public Builder programItemId(String programItemId) {
                this.programItemId = programItemId;
                return this;
            }

            /**
             * ProgramItemName.
             */
            public Builder programItemName(String programItemName) {
                this.programItemName = programItemName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ResourceValue.
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
