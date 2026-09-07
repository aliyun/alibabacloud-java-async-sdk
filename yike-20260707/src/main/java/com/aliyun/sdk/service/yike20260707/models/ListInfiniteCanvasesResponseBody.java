// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link ListInfiniteCanvasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInfiniteCanvasesResponseBody</p>
 */
public class ListInfiniteCanvasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanvasList")
    private java.util.List<CanvasList> canvasList;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListInfiniteCanvasesResponseBody(Builder builder) {
        this.canvasList = builder.canvasList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInfiniteCanvasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canvasList
     */
    public java.util.List<CanvasList> getCanvasList() {
        return this.canvasList;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CanvasList> canvasList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListInfiniteCanvasesResponseBody model) {
            this.canvasList = model.canvasList;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of infinite canvases.</p>
         */
        public Builder canvasList(java.util.List<CanvasList> canvasList) {
            this.canvasList = canvasList;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of infinite canvases.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInfiniteCanvasesResponseBody build() {
            return new ListInfiniteCanvasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInfiniteCanvasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInfiniteCanvasesResponseBody</p>
     */
    public static class CanvasList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanvasId")
        private String canvasId;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private CanvasList(Builder builder) {
            this.canvasId = builder.canvasId;
            this.coverUrl = builder.coverUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.thumbnail = builder.thumbnail;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CanvasList create() {
            return builder().build();
        }

        /**
         * @return canvasId
         */
        public String getCanvasId() {
            return this.canvasId;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String canvasId; 
            private String coverUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private String thumbnail; 
            private String title; 

            private Builder() {
            } 

            private Builder(CanvasList model) {
                this.canvasId = model.canvasId;
                this.coverUrl = model.coverUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.thumbnail = model.thumbnail;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the infinite canvas.</p>
             * 
             * <strong>example:</strong>
             * <p>canvas_xxx</p>
             */
            public Builder canvasId(String canvasId) {
                this.canvasId = canvasId;
                return this;
            }

            /**
             * <p>The cover URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/cover.png">http://example.com/cover.png</a></p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>The creation time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-26T10:21:17Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-18T10:03:56Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The thumbnail height, in px.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/thumbnail2.png">http://example.com/thumbnail2.png</a></p>
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * <p>The title of the infinite canvas.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public CanvasList build() {
                return new CanvasList(this);
            } 

        } 

    }
}
