// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserResponseBody</p>
 */
public class CreateUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("User")
    private User user;

    private CreateUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder {
        private String requestId; 
        private User user; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2BB8C44A-2862-4922-AD43-03924749173B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the RAM user.</p>
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public CreateUserResponseBody build() {
            return new CreateUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUserResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>operator</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
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
    /**
     * 
     * {@link CreateUserResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUserResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link CreateUserResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUserResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("LastLoginDate")
        private String lastLoginDate;

        @com.aliyun.core.annotation.NameInMap("MobilePhone")
        private String mobilePhone;

        @com.aliyun.core.annotation.NameInMap("ProvisionType")
        private String provisionType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
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
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a cloud computing engineer.</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The time when the RAM user was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-12T09:12:00Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The display name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The email address of the RAM user.</p>
             * <blockquote>
             * <p>This parameter is valid only on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The last time when the RAM user logged on to the Alibaba Cloud Management Console.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-12T09:12:00Z</p>
             */
            public Builder lastLoginDate(String lastLoginDate) {
                this.lastLoginDate = lastLoginDate;
                return this;
            }

            /**
             * <p>The mobile phone number of the RAM user.</p>
             * <blockquote>
             * <p>This parameter is valid only on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>86-1868888****</p>
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * <p>The source of the RAM user. Valid values:</p>
             * <ul>
             * <li>Manual: The RAM user is manually created in the RAM console.</li>
             * <li>SCIM: The RAM user is mapped by using System for Cross-domain Identity Management (SCIM).</li>
             * <li>CloudSSO: The RAM user is mapped from a CloudSSO user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder provisionType(String provisionType) {
                this.provisionType = provisionType;
                return this;
            }

            /**
             * <p>The tag value.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the information about the RAM user was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-12T09:12:00Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>20732900249392****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
}
