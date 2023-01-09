// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserBasicInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserBasicInfosResponseBody</p>
 */
public class ListUserBasicInfosResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("Marker")
    private String marker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserBasicInfos")
    private UserBasicInfos userBasicInfos;

    private ListUserBasicInfosResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
        this.userBasicInfos = builder.userBasicInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserBasicInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userBasicInfos
     */
    public UserBasicInfos getUserBasicInfos() {
        return this.userBasicInfos;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 
        private UserBasicInfos userBasicInfos; 

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserBasicInfos.
         */
        public Builder userBasicInfos(UserBasicInfos userBasicInfos) {
            this.userBasicInfos = userBasicInfos;
            return this;
        }

        public ListUserBasicInfosResponseBody build() {
            return new ListUserBasicInfosResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class UserBasicInfo extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private UserBasicInfo(Builder builder) {
            this.displayName = builder.displayName;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserBasicInfo create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String displayName; 
            private Tags tags; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserPrincipalName.
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public UserBasicInfo build() {
                return new UserBasicInfo(this);
            } 

        } 

    }
    public static class UserBasicInfos extends TeaModel {
        @NameInMap("UserBasicInfo")
        private java.util.List < UserBasicInfo> userBasicInfo;

        private UserBasicInfos(Builder builder) {
            this.userBasicInfo = builder.userBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserBasicInfos create() {
            return builder().build();
        }

        /**
         * @return userBasicInfo
         */
        public java.util.List < UserBasicInfo> getUserBasicInfo() {
            return this.userBasicInfo;
        }

        public static final class Builder {
            private java.util.List < UserBasicInfo> userBasicInfo; 

            /**
             * UserBasicInfo.
             */
            public Builder userBasicInfo(java.util.List < UserBasicInfo> userBasicInfo) {
                this.userBasicInfo = userBasicInfo;
                return this;
            }

            public UserBasicInfos build() {
                return new UserBasicInfos(this);
            } 

        } 

    }
}
