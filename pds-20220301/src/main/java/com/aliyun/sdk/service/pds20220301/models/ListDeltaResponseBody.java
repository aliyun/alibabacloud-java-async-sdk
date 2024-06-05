// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeltaResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeltaResponseBody</p>
 */
public class ListDeltaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    @com.aliyun.core.annotation.NameInMap("has_more")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < Items> items;

    private ListDeltaResponseBody(Builder builder) {
        this.cursor = builder.cursor;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeltaResponseBody create() {
        return builder().build();
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    public static final class Builder {
        private String cursor; 
        private Boolean hasMore; 
        private java.util.List < Items> items; 

        /**
         * The cursor of the incremental information.
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Indicates whether more information is returned.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * The incremental information returned.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        public ListDeltaResponseBody build() {
            return new ListDeltaResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("file")
        private File file;

        @com.aliyun.core.annotation.NameInMap("file_id")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        private Items(Builder builder) {
            this.file = builder.file;
            this.fileId = builder.fileId;
            this.op = builder.op;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return file
         */
        public File getFile() {
            return this.file;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        public static final class Builder {
            private File file; 
            private String fileId; 
            private String op; 

            /**
             * The information about the file.
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * The file ID.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The operation that is performed. Valid values: Valid values:
             * <p>
             * 
             * *   create
             * *   overwrite
             * *   delete
             * *   update
             * *   move
             * *   trash
             * *   restore
             * *   rename
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
