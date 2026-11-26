// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link CreatePlayingListRequest} extends {@link RequestModel}
 *
 * <p>CreatePlayingListRequest</p>
 */
public class CreatePlayingListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenCreatePlayingListRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private OpenCreatePlayingListRequest openCreatePlayingListRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private CreatePlayingListRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.openCreatePlayingListRequest = builder.openCreatePlayingListRequest;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePlayingListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return openCreatePlayingListRequest
     */
    public OpenCreatePlayingListRequest getOpenCreatePlayingListRequest() {
        return this.openCreatePlayingListRequest;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<CreatePlayingListRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private OpenCreatePlayingListRequest openCreatePlayingListRequest; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreatePlayingListRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.openCreatePlayingListRequest = request.openCreatePlayingListRequest;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device ID information</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>Business parameters</p>
         * <p>This parameter is required.</p>
         */
        public Builder openCreatePlayingListRequest(OpenCreatePlayingListRequest openCreatePlayingListRequest) {
            String openCreatePlayingListRequestShrink = shrink(openCreatePlayingListRequest, "OpenCreatePlayingListRequest", "json");
            this.putBodyParameter("OpenCreatePlayingListRequest", openCreatePlayingListRequestShrink);
            this.openCreatePlayingListRequest = openCreatePlayingListRequest;
            return this;
        }

        /**
         * <p>User identity information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public CreatePlayingListRequest build() {
            return new CreatePlayingListRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePlayingListRequest} extends {@link TeaModel}
     *
     * <p>CreatePlayingListRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private DeviceInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(DeviceInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>Value corresponding to the encoding type.</p>
             * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application&quot;s Skill ID.<br>When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used as the encoding type for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used as the encoding type for the cloud-based link.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>Device ID, set to either deviceOpenId or deviceUnionId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of device ID.</p>
             * <p><code>OPEN_ID</code>: Default device ID identity.<br><code>UNION_ID</code>: Organization-dimension device ID identity. This value is available only after an organization has been requested on the Tmall Genie skill application Open Platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePlayingListRequest} extends {@link TeaModel}
     *
     * <p>CreatePlayingListRequest</p>
     */
    public static class ContentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RawId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String rawId;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private String source;

        private ContentList(Builder builder) {
            this.rawId = builder.rawId;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentList create() {
            return builder().build();
        }

        /**
         * @return rawId
         */
        public String getRawId() {
            return this.rawId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String rawId; 
            private String source; 

            private Builder() {
            } 

            private Builder(ContentList model) {
                this.rawId = model.rawId;
                this.source = model.source;
            } 

            /**
             * <p>Third-party ID.</p>
             * <p>If the content type is &quot;content&quot;, this is the content ID. If it is &quot;album&quot;, this is the album ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder rawId(String rawId) {
                this.rawId = rawId;
                return this;
            }

            /**
             * <p>Source</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xiami</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public ContentList build() {
                return new ContentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePlayingListRequest} extends {@link TeaModel}
     *
     * <p>CreatePlayingListRequest</p>
     */
    public static class OpenCreatePlayingListRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ContentList> contentList;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private java.util.Map<String, ?> extendInfo;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("NeedAlbumContinued")
        private Boolean needAlbumContinued;

        @com.aliyun.core.annotation.NameInMap("PlayFrom")
        private String playFrom;

        @com.aliyun.core.annotation.NameInMap("PlayMode")
        private String playMode;

        private OpenCreatePlayingListRequest(Builder builder) {
            this.contentList = builder.contentList;
            this.contentType = builder.contentType;
            this.extendInfo = builder.extendInfo;
            this.index = builder.index;
            this.needAlbumContinued = builder.needAlbumContinued;
            this.playFrom = builder.playFrom;
            this.playMode = builder.playMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenCreatePlayingListRequest create() {
            return builder().build();
        }

        /**
         * @return contentList
         */
        public java.util.List<ContentList> getContentList() {
            return this.contentList;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return extendInfo
         */
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return needAlbumContinued
         */
        public Boolean getNeedAlbumContinued() {
            return this.needAlbumContinued;
        }

        /**
         * @return playFrom
         */
        public String getPlayFrom() {
            return this.playFrom;
        }

        /**
         * @return playMode
         */
        public String getPlayMode() {
            return this.playMode;
        }

        public static final class Builder {
            private java.util.List<ContentList> contentList; 
            private String contentType; 
            private java.util.Map<String, ?> extendInfo; 
            private Integer index; 
            private Boolean needAlbumContinued; 
            private String playFrom; 
            private String playMode; 

            private Builder() {
            } 

            private Builder(OpenCreatePlayingListRequest model) {
                this.contentList = model.contentList;
                this.contentType = model.contentType;
                this.extendInfo = model.extendInfo;
                this.index = model.index;
                this.needAlbumContinued = model.needAlbumContinued;
                this.playFrom = model.playFrom;
                this.playMode = model.playMode;
            } 

            /**
             * <p>Playback content list.</p>
             * <p>If the content type is &quot;content&quot;, multiple entries are supported. If it is &quot;album&quot;, only the first entry takes effect.</p>
             * <p>This parameter is required.</p>
             */
            public Builder contentList(java.util.List<ContentList> contentList) {
                this.contentList = contentList;
                return this;
            }

            /**
             * <p>Content type for playback.</p>
             * <p>Values: &quot;content&quot; for content, &quot;album&quot; for album, and &quot;collect&quot; for playlist.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>extension information</p>
             */
            public Builder extendInfo(java.util.Map<String, ?> extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>Playback index.</p>
             * <p>Can be empty. Default is 0, indicating playback starts from the beginning.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Whether to resume album playback. For example, if the user previously listened up to episode 5 of an album, whether to continue from episode 5. Default is true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needAlbumContinued(Boolean needAlbumContinued) {
                this.needAlbumContinued = needAlbumContinued;
                return this;
            }

            /**
             * <p>Playback source, the UUID for configuring playback control capabilities.</p>
             * <p>Can be empty. Default is &quot;default&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder playFrom(String playFrom) {
                this.playFrom = playFrom;
                return this;
            }

            /**
             * <p>Playback pattern.</p>
             * <p>Repeat: list loop; Shuffle: random; RepeatOne: single track loop; Normal: sequential playback.</p>
             * 
             * <strong>example:</strong>
             * <p>Repeat</p>
             */
            public Builder playMode(String playMode) {
                this.playMode = playMode;
                return this;
            }

            public OpenCreatePlayingListRequest build() {
                return new OpenCreatePlayingListRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePlayingListRequest} extends {@link TeaModel}
     *
     * <p>CreatePlayingListRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private UserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>Value corresponding to the encoding type.</p>
             * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application&quot;s Skill ID.<br>When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used as the encoding type for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used as the encoding type for the cloud-based link.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>User identifier, set to either userOpenId or userUnionId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of User ID.</p>
             * <p><code>OPEN_ID</code>: Default User ID identity.<br><code>UNION_ID</code>: Organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie skill application Open Platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
