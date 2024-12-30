// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    private java.util.List<Items> items;

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
    public java.util.List<Items> getItems() {
        return this.items;
    }

    public static final class Builder {
        private String cursor; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 

        /**
         * <p>The cursor of the incremental information.</p>
         * 
         * <strong>example:</strong>
         * <p>1WQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>Indicates whether more information is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The incremental information returned.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        public ListDeltaResponseBody build() {
            return new ListDeltaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeltaResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeltaResponseBody</p>
     */
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
             * <p>The information about the file.</p>
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>122fb09598ae66777c7040109a16f49381f6abe2</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The operation that is performed. Valid values: Valid values:</p>
             * <ul>
             * <li>create</li>
             * <li>overwrite</li>
             * <li>delete</li>
             * <li>update</li>
             * <li>move</li>
             * <li>trash</li>
             * <li>restore</li>
             * <li>rename</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>create</p>
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
