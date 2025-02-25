// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link UpdateUserResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserResponseBody</p>
 */
public class UpdateUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("User")
    private User user;

    private UpdateUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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

        public UpdateUserResponseBody build() {
            return new UpdateUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateUserResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("MobilePhone")
        private String mobilePhone;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.comments = builder.comments;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.mobilePhone = builder.mobilePhone;
            this.updateDate = builder.updateDate;
            this.userId = builder.userId;
            this.userName = builder.userName;
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
         * @return mobilePhone
         */
        public String getMobilePhone() {
            return this.mobilePhone;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String comments; 
            private String createDate; 
            private String displayName; 
            private String email; 
            private String mobilePhone; 
            private String updateDate; 
            private String userId; 
            private String userName; 

            /**
             * <p>The description of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a cloud computing engineer.</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The point in time when the RAM user was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The display name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>xiaoq****</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The email address of the RAM user.</p>
             * <blockquote>
             * <p> This parameter can be returned only on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>xiaoq****@example.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The mobile phone number of the RAM user.</p>
             * <blockquote>
             * <p> This parameter can be returned only on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>86-1860000****</p>
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * <p>The point in time when the information about the RAM user was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-02-11T03:15:21Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>122748924538****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>xiaoq****</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
