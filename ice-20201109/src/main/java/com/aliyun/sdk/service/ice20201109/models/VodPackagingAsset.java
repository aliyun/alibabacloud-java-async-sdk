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
 * {@link VodPackagingAsset} extends {@link TeaModel}
 *
 * <p>VodPackagingAsset</p>
 */
public class VodPackagingAsset extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    @com.aliyun.core.annotation.NameInMap("ContentId")
    private String contentId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    private VodPackagingAsset(Builder builder) {
        this.assetName = builder.assetName;
        this.contentId = builder.contentId;
        this.createTime = builder.createTime;
        this.groupName = builder.groupName;
        this.input = builder.input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VodPackagingAsset create() {
        return builder().build();
    }

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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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

    public static final class Builder {
        private String assetName; 
        private String contentId; 
        private String createTime; 
        private String groupName; 
        private Input input; 

        private Builder() {
        } 

        private Builder(VodPackagingAsset model) {
            this.assetName = model.assetName;
            this.contentId = model.contentId;
            this.createTime = model.createTime;
            this.groupName = model.groupName;
            this.input = model.input;
        } 

        /**
         * <p>The asset name. It must be unique per user, up to 128 characters in length, and match the format [A-Za-z0-9_-]+.</p>
         * 
         * <strong>example:</strong>
         * <p>example-asset</p>
         */
        public Builder assetName(String assetName) {
            this.assetName = assetName;
            return this;
        }

        /**
         * <p>The content ID in the DRM system. The format is [A-Za-z0-9_-]+, and the maximum length is 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>example-content</p>
         */
        public Builder contentId(String contentId) {
            this.contentId = contentId;
            return this;
        }

        /**
         * <p>The creation time. The format is 2024-11-21T06:45:32Z, which indicates 2024-11-21 14:45:32 in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-21T06:45:32Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The name of the packaging group.</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The input configuration of the asset.</p>
         */
        public Builder input(Input input) {
            this.input = input;
            return this;
        }

        public VodPackagingAsset build() {
            return new VodPackagingAsset(this);
        } 

    } 

    /**
     * 
     * {@link VodPackagingAsset} extends {@link TeaModel}
     *
     * <p>VodPackagingAsset</p>
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
             * <p>The input media asset. Currently, only OSS paths are supported, such as OSS://test-bucket/video/202208/test.m3u8. Only inputs with the .m3u8 extension are supported.</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The input type. Currently, only OSS is supported.</p>
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
