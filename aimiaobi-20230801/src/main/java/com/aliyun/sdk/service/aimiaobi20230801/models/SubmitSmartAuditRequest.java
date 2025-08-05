// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SubmitSmartAuditRequest} extends {@link RequestModel}
 *
 * <p>SubmitSmartAuditRequest</p>
 */
public class SubmitSmartAuditRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUrlList")
    private java.util.List<ImageUrlList> imageUrlList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubCodes")
    private java.util.List<String> subCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrls")
    private java.util.List<ImageUrls> imageUrls;

    private SubmitSmartAuditRequest(Builder builder) {
        super(builder);
        this.imageUrlList = builder.imageUrlList;
        this.subCodes = builder.subCodes;
        this.text = builder.text;
        this.workspaceId = builder.workspaceId;
        this.imageUrls = builder.imageUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSmartAuditRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrlList
     */
    public java.util.List<ImageUrlList> getImageUrlList() {
        return this.imageUrlList;
    }

    /**
     * @return subCodes
     */
    public java.util.List<String> getSubCodes() {
        return this.subCodes;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return imageUrls
     */
    public java.util.List<ImageUrls> getImageUrls() {
        return this.imageUrls;
    }

    public static final class Builder extends Request.Builder<SubmitSmartAuditRequest, Builder> {
        private java.util.List<ImageUrlList> imageUrlList; 
        private java.util.List<String> subCodes; 
        private String text; 
        private String workspaceId; 
        private java.util.List<ImageUrls> imageUrls; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSmartAuditRequest request) {
            super(request);
            this.imageUrlList = request.imageUrlList;
            this.subCodes = request.subCodes;
            this.text = request.text;
            this.workspaceId = request.workspaceId;
            this.imageUrls = request.imageUrls;
        } 

        /**
         * ImageUrlList.
         */
        public Builder imageUrlList(java.util.List<ImageUrlList> imageUrlList) {
            String imageUrlListShrink = shrink(imageUrlList, "ImageUrlList", "json");
            this.putBodyParameter("ImageUrlList", imageUrlListShrink);
            this.imageUrlList = imageUrlList;
            return this;
        }

        /**
         * SubCodes.
         */
        public Builder subCodes(java.util.List<String> subCodes) {
            String subCodesShrink = shrink(subCodes, "SubCodes", "json");
            this.putBodyParameter("SubCodes", subCodesShrink);
            this.subCodes = subCodes;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * imageUrls.
         */
        public Builder imageUrls(java.util.List<ImageUrls> imageUrls) {
            String imageUrlsShrink = shrink(imageUrls, "imageUrls", "json");
            this.putBodyParameter("imageUrls", imageUrlsShrink);
            this.imageUrls = imageUrls;
            return this;
        }

        @Override
        public SubmitSmartAuditRequest build() {
            return new SubmitSmartAuditRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitSmartAuditRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartAuditRequest</p>
     */
    public static class ImageUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ImageUrlList(Builder builder) {
            this.id = builder.id;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageUrlList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String url; 

            private Builder() {
            } 

            private Builder(ImageUrlList model) {
                this.id = model.id;
                this.url = model.url;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrlList build() {
                return new ImageUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartAuditRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartAuditRequest</p>
     */
    public static class ImageUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ImageUrls(Builder builder) {
            this.id = builder.id;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageUrls create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String url; 

            private Builder() {
            } 

            private Builder(ImageUrls model) {
                this.id = model.id;
                this.url = model.url;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrls build() {
                return new ImageUrls(this);
            } 

        } 

    }
}
