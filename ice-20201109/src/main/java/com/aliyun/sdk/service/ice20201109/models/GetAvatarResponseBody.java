// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAvatarResponseBody} extends {@link TeaModel}
 *
 * <p>GetAvatarResponseBody</p>
 */
public class GetAvatarResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAvatarResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvatarResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAvatarResponseBody build() {
            return new GetAvatarResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAvatarResponseBody} extends {@link TeaModel}
     *
     * <p>GetAvatarResponseBody</p>
     */
    public static class Avatar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarDescription")
        private String avatarDescription;

        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("AvatarName")
        private String avatarName;

        @com.aliyun.core.annotation.NameInMap("AvatarType")
        private String avatarType;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Portrait")
        private String portrait;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("Transparent")
        private Boolean transparent;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private Avatar(Builder builder) {
            this.avatarDescription = builder.avatarDescription;
            this.avatarId = builder.avatarId;
            this.avatarName = builder.avatarName;
            this.avatarType = builder.avatarType;
            this.height = builder.height;
            this.portrait = builder.portrait;
            this.thumbnail = builder.thumbnail;
            this.transparent = builder.transparent;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Avatar create() {
            return builder().build();
        }

        /**
         * @return avatarDescription
         */
        public String getAvatarDescription() {
            return this.avatarDescription;
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return avatarName
         */
        public String getAvatarName() {
            return this.avatarName;
        }

        /**
         * @return avatarType
         */
        public String getAvatarType() {
            return this.avatarType;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return portrait
         */
        public String getPortrait() {
            return this.portrait;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return transparent
         */
        public Boolean getTransparent() {
            return this.transparent;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String avatarDescription; 
            private String avatarId; 
            private String avatarName; 
            private String avatarType; 
            private Integer height; 
            private String portrait; 
            private String thumbnail; 
            private Boolean transparent; 
            private Integer width; 

            /**
             * <p>The description of the digital human.</p>
             */
            public Builder avatarDescription(String avatarDescription) {
                this.avatarDescription = avatarDescription;
                return this;
            }

            /**
             * <p>The ID of the digital human.</p>
             * 
             * <strong>example:</strong>
             * <p>Avatar-XXXX</p>
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * <p>The name of the digital human.</p>
             */
            public Builder avatarName(String avatarName) {
                this.avatarName = avatarName;
                return this;
            }

            /**
             * <p>The type of the digital human.</p>
             * 
             * <strong>example:</strong>
             * <p>2DAvatar</p>
             */
            public Builder avatarType(String avatarType) {
                this.avatarType = avatarType;
                return this;
            }

            /**
             * <p>The height of the digital human image in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The media asset ID of the portrait image.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
             */
            public Builder portrait(String portrait) {
                this.portrait = portrait;
                return this;
            }

            /**
             * <p>The thumbnail URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * <p>Indicates whether the digital human supports alpha channels.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder transparent(Boolean transparent) {
                this.transparent = transparent;
                return this;
            }

            /**
             * <p>The width of the digital human image in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Avatar build() {
                return new Avatar(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAvatarResponseBody} extends {@link TeaModel}
     *
     * <p>GetAvatarResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private Avatar avatar;

        private Data(Builder builder) {
            this.avatar = builder.avatar;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public Avatar getAvatar() {
            return this.avatar;
        }

        public static final class Builder {
            private Avatar avatar; 

            /**
             * <p>The information about the digital human.</p>
             */
            public Builder avatar(Avatar avatar) {
                this.avatar = avatar;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
