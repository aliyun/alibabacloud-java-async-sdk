// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetUserInRecycleBinResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserInRecycleBinResponseBody</p>
 */
public class GetUserInRecycleBinResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("User")
    private User user;

    private GetUserInRecycleBinResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInRecycleBinResponseBody create() {
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
         * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
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

        public GetUserInRecycleBinResponseBody build() {
            return new GetUserInRecycleBinResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserInRecycleBinResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserInRecycleBinResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DeleteDate")
        private String deleteDate;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("RecycleDate")
        private String recycleDate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private User(Builder builder) {
            this.createDate = builder.createDate;
            this.deleteDate = builder.deleteDate;
            this.displayName = builder.displayName;
            this.recycleDate = builder.recycleDate;
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
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return deleteDate
         */
        public String getDeleteDate() {
            return this.deleteDate;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return recycleDate
         */
        public String getRecycleDate() {
            return this.recycleDate;
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
            private String createDate; 
            private String deleteDate; 
            private String displayName; 
            private String recycleDate; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * <p>The time when the RAM user was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-11T09:12:00Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The time when the RAM user will be permanently deleted from the recycle bin.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-12T09:12:00Z</p>
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
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
             * <p>The time when the RAM user was deleted and moved to the recycle bin.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-12T09:12:00Z</p>
             */
            public Builder recycleDate(String recycleDate) {
                this.recycleDate = recycleDate;
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
