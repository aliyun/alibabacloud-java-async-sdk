// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("Marker")
    private String marker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Users")
    private Users users;

    private ListUsersResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
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
     * @return users
     */
    public Users getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 
        private Users users; 

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
         * Users.
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
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
    public static class User extends TeaModel {
        @NameInMap("Comments")
        private String comments;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("LastLoginDate")
        private String lastLoginDate;

        @NameInMap("MobilePhone")
        private String mobilePhone;

        @NameInMap("ProvisionType")
        private String provisionType;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("UpdateDate")
        private String updateDate;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private User(Builder builder) {
            this.comments = builder.comments;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.lastLoginDate = builder.lastLoginDate;
            this.mobilePhone = builder.mobilePhone;
            this.provisionType = builder.provisionType;
            this.tags = builder.tags;
            this.updateDate = builder.updateDate;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return lastLoginDate
         */
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        /**
         * @return mobilePhone
         */
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        /**
         * @return provisionType
         */
        public String getProvisionType() {
            return this.provisionType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
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
            private String comments; 
            private String createDate; 
            private String displayName; 
            private String email; 
            private String lastLoginDate; 
            private String mobilePhone; 
            private String provisionType; 
            private Tags tags; 
            private String updateDate; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * LastLoginDate.
             */
            public Builder lastLoginDate(String lastLoginDate) {
                this.lastLoginDate = lastLoginDate;
                return this;
            }

            /**
             * MobilePhone.
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * ProvisionType.
             */
            public Builder provisionType(String provisionType) {
                this.provisionType = provisionType;
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
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
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

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("User")
        private java.util.List < User> user;

        private Users(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List < User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List < User> user; 

            /**
             * User.
             */
            public Builder user(java.util.List < User> user) {
                this.user = user;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
