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
 * {@link CreateVodPackagingAssetRequest} extends {@link RequestModel}
 *
 * <p>CreateVodPackagingAssetRequest</p>
 */
public class CreateVodPackagingAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentId")
    private String contentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    private CreateVodPackagingAssetRequest(Builder builder) {
        super(builder);
        this.assetName = builder.assetName;
        this.contentId = builder.contentId;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.input = builder.input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVodPackagingAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    public static final class Builder extends Request.Builder<CreateVodPackagingAssetRequest, Builder> {
        private String assetName; 
        private String contentId; 
        private String description; 
        private String groupName; 
        private Input input; 

        private Builder() {
            super();
        } 

        private Builder(CreateVodPackagingAssetRequest request) {
            super(request);
            this.assetName = request.assetName;
            this.contentId = request.contentId;
            this.description = request.description;
            this.groupName = request.groupName;
            this.input = request.input;
        } 

        /**
         * <p>The name of the asset. The name must be unique and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hls_3s</p>
         */
        public Builder assetName(String assetName) {
            this.putQueryParameter("AssetName", assetName);
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
            this.putQueryParameter("ContentId", contentId);
            this.contentId = contentId;
            return this;
        }

        /**
         * <p>The asset description.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS 3 second packaging</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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

        /**
         * <p>The asset input configurations.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        @Override
        public CreateVodPackagingAssetRequest build() {
            return new CreateVodPackagingAssetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVodPackagingAssetRequest} extends {@link TeaModel}
     *
     * <p>CreateVodPackagingAssetRequest</p>
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
             * <p>The URL of the media file. Only M3U8 files stored in OSS are supported.</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The input type. Only Object Storage Service (OSS) is supported.</p>
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
}
