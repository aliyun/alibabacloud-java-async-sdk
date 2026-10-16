// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateUserResponseBody model) {
            this.requestId = model.requestId;
            this.user = model.user;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The user information.</p>
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
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.status = builder.status;
            this.type = builder.type;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
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
            private String description; 
            private String displayName; 
            private String email; 
            private String status; 
            private String type; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(User model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.email = model.email;
                this.status = model.status;
                this.type = model.type;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>The description of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Analyst</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The status of the user. Valid values:</p>
             * <ul>
             * <li>Enabled: Enabled.</li>
             * <li>Disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the user. Valid values:</p>
             * <ul>
             * <li>Manual: The user is manually created by calling an API operation.</li>
             * <li>JIT: The user is created through JIT.</li>
             * <li>SCIM: The user is synchronized through the System for Cross-domain Identity Management protocol.</li>
             * <li>SYNC_DINGTALK: The user is synchronized from DingTalk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user_xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
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
