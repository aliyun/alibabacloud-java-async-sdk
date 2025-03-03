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
 * {@link GetVodPackagingAssetResponseBody} extends {@link TeaModel}
 *
 * <p>GetVodPackagingAssetResponseBody</p>
 */
public class GetVodPackagingAssetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Asset")
    private Asset asset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVodPackagingAssetResponseBody(Builder builder) {
        this.asset = builder.asset;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodPackagingAssetResponseBody create() {
        return builder().build();
    }

    /**
     * @return asset
     */
    public Asset getAsset() {
        return this.asset;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Asset asset; 
        private String requestId; 

        /**
         * <p>The information about the asset.</p>
         */
        public Builder asset(Asset asset) {
            this.asset = asset;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0622C702-41BE-467E-AF2E-883D4517962E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVodPackagingAssetResponseBody build() {
            return new GetVodPackagingAssetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVodPackagingAssetResponseBody} extends {@link TeaModel}
     *
     * <p>GetVodPackagingAssetResponseBody</p>
     */
    public static class EgressEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigurationName")
        private String configurationName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private EgressEndpoints(Builder builder) {
            this.configurationName = builder.configurationName;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressEndpoints create() {
            return builder().build();
        }

        /**
         * @return configurationName
         */
        public String getConfigurationName() {
            return this.configurationName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String configurationName; 
            private String status; 
            private String url; 

            /**
             * <p>The name of the packaging configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>hls_3s</p>
             */
            public Builder configurationName(String configurationName) {
                this.configurationName = configurationName;
                return this;
            }

            /**
             * <p>The asset status. Valid values:</p>
             * <ul>
             * <li>Queuing: The asset is waiting for packaging.</li>
             * <li>Playable: The asset is packaged and playable.</li>
             * <li>Failed: The asset fails to be packaged.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Playable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The playback URL. If the asset fails to be packaged, no playback URL is returned.</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public EgressEndpoints build() {
                return new EgressEndpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVodPackagingAssetResponseBody} extends {@link TeaModel}
     *
     * <p>GetVodPackagingAssetResponseBody</p>
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
    /**
     * 
     * {@link GetVodPackagingAssetResponseBody} extends {@link TeaModel}
     *
     * <p>GetVodPackagingAssetResponseBody</p>
     */
    public static class Asset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("ContentId")
        private String contentId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EgressEndpoints")
        private java.util.List<EgressEndpoints> egressEndpoints;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        private Asset(Builder builder) {
            this.assetName = builder.assetName;
            this.contentId = builder.contentId;
            this.createTime = builder.createTime;
            this.egressEndpoints = builder.egressEndpoints;
            this.groupName = builder.groupName;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Asset create() {
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return egressEndpoints
         */
        public java.util.List<EgressEndpoints> getEgressEndpoints() {
            return this.egressEndpoints;
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
            private java.util.List<EgressEndpoints> egressEndpoints; 
            private String groupName; 
            private Input input; 

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>30min_movie</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The content ID in the DRM system. The maximum length is 256 characters. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>movie</p>
             */
            public Builder contentId(String contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * <p>The time when the asset was created. It follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-21T06:45:32Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The egress endpoints, each corresponding to a packaging configuration.</p>
             */
            public Builder egressEndpoints(java.util.List<EgressEndpoints> egressEndpoints) {
                this.egressEndpoints = egressEndpoints;
                return this;
            }

            /**
             * <p>The name of the packaging group.</p>
             * 
             * <strong>example:</strong>
             * <p>vod_hls</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The asset input configurations.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public Asset build() {
                return new Asset(this);
            } 

        } 

    }
}
