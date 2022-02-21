// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectMembersResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevopsProjectMembersResponseBody</p>
 */
public class GetDevopsProjectMembersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("Object")
    private java.util.List < Object> object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    @NameInMap("Total")
    private Integer total;

    private GetDevopsProjectMembersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.nextPageToken = builder.nextPageToken;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevopsProjectMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return object
     */
    public java.util.List < Object> getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public Boolean getSuccessful() {
        return this.successful;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String nextPageToken; 
        private java.util.List < Object> object; 
        private String requestId; 
        private Boolean successful; 
        private Integer total; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(java.util.List < Object> object) {
            this.object = object;
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
         * Successful.
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetDevopsProjectMembersResponseBody build() {
            return new GetDevopsProjectMembersResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("AvatarUrl")
        private String avatarUrl;

        @NameInMap("Email")
        private String email;

        @NameInMap("MemberId")
        private String memberId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("Role")
        private Integer role;

        @NameInMap("UserId")
        private String userId;

        private Object(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.memberId = builder.memberId;
            this.name = builder.name;
            this.phone = builder.phone;
            this.role = builder.role;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String email; 
            private String memberId; 
            private String name; 
            private String phone; 
            private Integer role; 
            private String userId; 

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
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
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
