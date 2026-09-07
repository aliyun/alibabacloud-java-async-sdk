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
 * {@link GetInfiniteCanvasResponseBody} extends {@link TeaModel}
 *
 * <p>GetInfiniteCanvasResponseBody</p>
 */
public class GetInfiniteCanvasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InfiniteCanvas")
    private InfiniteCanvas infiniteCanvas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInfiniteCanvasResponseBody(Builder builder) {
        this.infiniteCanvas = builder.infiniteCanvas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInfiniteCanvasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return infiniteCanvas
     */
    public InfiniteCanvas getInfiniteCanvas() {
        return this.infiniteCanvas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InfiniteCanvas infiniteCanvas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInfiniteCanvasResponseBody model) {
            this.infiniteCanvas = model.infiniteCanvas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The infinite canvas details.</p>
         */
        public Builder infiniteCanvas(InfiniteCanvas infiniteCanvas) {
            this.infiniteCanvas = infiniteCanvas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInfiniteCanvasResponseBody build() {
            return new GetInfiniteCanvasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInfiniteCanvasResponseBody} extends {@link TeaModel}
     *
     * <p>GetInfiniteCanvasResponseBody</p>
     */
    public static class InfiniteCanvas extends TeaModel {
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

        private InfiniteCanvas(Builder builder) {
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

        public static InfiniteCanvas create() {
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

            private Builder(InfiniteCanvas model) {
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
             * <p>canvas_gesad*</p>
             */
            public Builder canvasId(String canvasId) {
                this.canvasId = canvasId;
                return this;
            }

            /**
             * <p>The cover URL.</p>
             * 
             * <strong>example:</strong>
             * <p>https://*uncs.com/cover.png</p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-01T08:42:16Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-01T08:42:16Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The thumbnail URL.</p>
             * 
             * <strong>example:</strong>
             * <p>https://*uncs.com/cover.png</p>
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * <p>The title of the infinite canvas.</p>
             * 
             * <strong>example:</strong>
             * <p>test infinite canvas</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InfiniteCanvas build() {
                return new InfiniteCanvas(this);
            } 

        } 

    }
}
