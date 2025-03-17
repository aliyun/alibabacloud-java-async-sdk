// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link BatchCreateVodPackagingAssetRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateVodPackagingAssetRequest</p>
 */
public class BatchCreateVodPackagingAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List<Assets> assets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private BatchCreateVodPackagingAssetRequest(Builder builder) {
        super(builder);
        this.assets = builder.assets;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateVodPackagingAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assets
     */
    public java.util.List<Assets> getAssets() {
        return this.assets;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<BatchCreateVodPackagingAssetRequest, Builder> {
        private java.util.List<Assets> assets; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateVodPackagingAssetRequest request) {
            super(request);
            this.assets = request.assets;
            this.groupName = request.groupName;
        } 

        /**
         * <p>The assets that you want to ingest.</p>
         */
        public Builder assets(java.util.List<Assets> assets) {
            String assetsShrink = shrink(assets, "Assets", "json");
            this.putQueryParameter("Assets", assetsShrink);
            this.assets = assets;
            return this;
        }

        /**
         * <p>The name of the packaging group.</p>
         * 
         * <strong>example:</strong>
         * <p>vod_hls</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public BatchCreateVodPackagingAssetRequest build() {
            return new BatchCreateVodPackagingAssetRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateVodPackagingAssetRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateVodPackagingAssetRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The URL of the media file. You can only specify a M3U8 file stored in Object Storage Service (OSS).</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The input type. Only OSS is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateVodPackagingAssetRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateVodPackagingAssetRequest</p>
     */
    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("ContentId")
        private String contentId;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        private Assets(Builder builder) {
            this.assetName = builder.assetName;
            this.contentId = builder.contentId;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return contentId
         */
        public String getContentId() {
            return this.contentId;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        public static final class Builder {
            private String assetName; 
            private String contentId; 
            private Input input; 

            private Builder() {
            } 

            private Builder(Assets model) {
                this.assetName = model.assetName;
                this.contentId = model.contentId;
                this.input = model.input;
            } 

            /**
             * <p>The name of the asset. The name must be unique and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>30min_movie</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The content ID in the digital rights management (DRM) system. The maximum length is 256 characters. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>movie</p>
             */
            public Builder contentId(String contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * <p>The asset input configurations.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
