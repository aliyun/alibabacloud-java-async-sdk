// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
         * InfiniteCanvas.
         */
        public Builder infiniteCanvas(InfiniteCanvas infiniteCanvas) {
            this.infiniteCanvas = infiniteCanvas;
            return this;
        }

        /**
         * RequestId.
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
             * CanvasId.
             */
            public Builder canvasId(String canvasId) {
                this.canvasId = canvasId;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * Title.
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
