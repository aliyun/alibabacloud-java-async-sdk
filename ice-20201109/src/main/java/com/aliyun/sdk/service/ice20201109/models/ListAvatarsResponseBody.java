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
 * {@link ListAvatarsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvatarsResponseBody</p>
 */
public class ListAvatarsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAvatarsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvatarsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAvatarsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAvatarsResponseBody build() {
            return new ListAvatarsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvatarsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvatarsResponseBody</p>
     */
    public static class AvatarList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarDescription")
        private String avatarDescription;

        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("AvatarName")
        private String avatarName;

        @com.aliyun.core.annotation.NameInMap("AvatarType")
        private String avatarType;

        @com.aliyun.core.annotation.NameInMap("Portrait")
        private String portrait;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("Transparent")
        private Boolean transparent;

        private AvatarList(Builder builder) {
            this.avatarDescription = builder.avatarDescription;
            this.avatarId = builder.avatarId;
            this.avatarName = builder.avatarName;
            this.avatarType = builder.avatarType;
            this.portrait = builder.portrait;
            this.thumbnail = builder.thumbnail;
            this.transparent = builder.transparent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarList create() {
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

        public static final class Builder {
            private String avatarDescription; 
            private String avatarId; 
            private String avatarName; 
            private String avatarType; 
            private String portrait; 
            private String thumbnail; 
            private Boolean transparent; 

            private Builder() {
            } 

            private Builder(AvatarList model) {
                this.avatarDescription = model.avatarDescription;
                this.avatarId = model.avatarId;
                this.avatarName = model.avatarName;
                this.avatarType = model.avatarType;
                this.portrait = model.portrait;
                this.thumbnail = model.thumbnail;
                this.transparent = model.transparent;
            } 

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
             * <p>Avatar-XXX</p>
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
             * <p>Indicates whether the digital human image supports the alpha channels.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder transparent(Boolean transparent) {
                this.transparent = transparent;
                return this;
            }

            public AvatarList build() {
                return new AvatarList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvatarsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvatarsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarList")
        private java.util.List<AvatarList> avatarList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.avatarList = builder.avatarList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatarList
         */
        public java.util.List<AvatarList> getAvatarList() {
            return this.avatarList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<AvatarList> avatarList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.avatarList = model.avatarList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The queried digital humans.</p>
             */
            public Builder avatarList(java.util.List<AvatarList> avatarList) {
                this.avatarList = avatarList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
