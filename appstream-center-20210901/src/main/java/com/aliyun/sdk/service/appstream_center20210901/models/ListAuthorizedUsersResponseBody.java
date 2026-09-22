// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListAuthorizedUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedUsersResponseBody</p>
 */
public class ListAuthorizedUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private ListAuthorizedUsersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Users> users; 

        private Builder() {
        } 

        private Builder(ListAuthorizedUsersResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.users = model.users;
        } 

        /**
         * <p>The current page number, which is the same as the PageNumber request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page, which is the same as the PageSize request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1A4F2D-713A-5C98-8AF6-1B5D0868****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that match the query conditions. Use this value to determine whether to continue paging.</p>
         * <ul>
         * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, this is the number of authorization records. If the same user has multiple authorization records, the user is counted multiple times. Therefore, this value may be greater than the actual number of users.</li>
         * <li>When the authorization mode is <code>Session</code>, this is the deduplicated user count.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of authorized users on the current page. Multiple authorization records for the same user are merged into a single entry. An empty list is returned if no authorized users match the conditions.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public ListAuthorizedUsersResponseBody build() {
            return new ListAuthorizedUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupSetId")
        private String appInstanceGroupSetId;

        @com.aliyun.core.annotation.NameInMap("AppInstancePersistentIds")
        private java.util.List<String> appInstancePersistentIds;

        @com.aliyun.core.annotation.NameInMap("AuthMode")
        private String authMode;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("IsAuthAllApps")
        private String isAuthAllApps;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private Users(Builder builder) {
            this.accountType = builder.accountType;
            this.appId = builder.appId;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupSetId = builder.appInstanceGroupSetId;
            this.appInstancePersistentIds = builder.appInstancePersistentIds;
            this.authMode = builder.authMode;
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.isAuthAllApps = builder.isAuthAllApps;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceGroupSetId
         */
        public String getAppInstanceGroupSetId() {
            return this.appInstanceGroupSetId;
        }

        /**
         * @return appInstancePersistentIds
         */
        public java.util.List<String> getAppInstancePersistentIds() {
            return this.appInstancePersistentIds;
        }

        /**
         * @return authMode
         */
        public String getAuthMode() {
            return this.authMode;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return isAuthAllApps
         */
        public String getIsAuthAllApps() {
            return this.isAuthAllApps;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String accountType; 
            private String appId; 
            private String appInstanceGroupId; 
            private String appInstanceGroupSetId; 
            private java.util.List<String> appInstancePersistentIds; 
            private String authMode; 
            private String email; 
            private String endUserId; 
            private String isAuthAllApps; 
            private String phone; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.accountType = model.accountType;
                this.appId = model.appId;
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupSetId = model.appInstanceGroupSetId;
                this.appInstancePersistentIds = model.appInstancePersistentIds;
                this.authMode = model.authMode;
                this.email = model.email;
                this.endUserId = model.endUserId;
                this.isAuthAllApps = model.isAuthAllApps;
                this.phone = model.phone;
            } 

            /**
             * <p>The account type of the user. Valid values:</p>
             * <ul>
             * <li>simple: Convenience account.</li>
             * <li>ad: Active Directory (AD) domain account, which originates from an enterprise AD domain.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>simple</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The application ID. Returned only when AppId is specified in the request. The value is the same as the request parameter. Not returned if AppId is not specified or when querying by delivery group set.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-i87mycyn419nu****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The delivery group ID associated with the user\&quot;s authorization relationship. When querying by delivery group, this value is the same as the request parameter. When querying by delivery group set, this value is the primary delivery group ID of the set.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The delivery group set ID. Returned only when querying by delivery group set. The value is the same as the AppInstanceGroupSetId request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>set-3jm9d0abc00example</p>
             */
            public Builder appInstanceGroupSetId(String appInstanceGroupSetId) {
                this.appInstanceGroupSetId = appInstanceGroupSetId;
                return this;
            }

            /**
             * <p>The list of persistent session IDs granted to the user. Returned only when the delivery group authorization mode (AuthMode) is <code>Session</code>. This list is not affected by the AppInstancePersistentId request parameter and always includes all persistent sessions granted to the user.</p>
             */
            public Builder appInstancePersistentIds(java.util.List<String> appInstancePersistentIds) {
                this.appInstancePersistentIds = appInstancePersistentIds;
                return this;
            }

            /**
             * <p>The authorization mode of the delivery group, which determines the scope of results returned by this operation. Valid values:</p>
             * <ul>
             * <li>App: Application-level authorization. Applications within the delivery group are authorized to users without restricting which sessions the users can use.</li>
             * <li>Session: Session-level authorization. Persistent sessions within the delivery group are authorized to users without restricting which applications the users can use. In this case, AppInstancePersistentIds returns the persistent sessions granted to the user.</li>
             * <li>AppInstanceGroup: Delivery group-level authorization. The entire delivery group is authorized to users, allowing them to open any application using any session within the delivery group.</li>
             * </ul>
             * <p>When querying by delivery group set, the authorization mode of the primary delivery group in the set is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>AppInstanceGroup</p>
             */
            public Builder authMode(String authMode) {
                this.authMode = authMode;
                return this;
            }

            /**
             * <p>The email address of the user. Returned only when the account information of the user can be retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The username. To remove authorization, pass this value to the UnAuthorizeUserIds parameter of the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>Indicates whether the query is not restricted to a specific application. Valid values:</p>
             * <ul>
             * <li>true: AppId is not specified in the request. All authorized users under the delivery group are returned.</li>
             * <li>false: AppId is specified in the request. Only users authorized for that specific application are returned.</li>
             * </ul>
             * <blockquote>
             * <p>This field is determined by whether the AppId request parameter is specified. It does not reflect the actual scope of applications authorized to the user and cannot be used to determine whether the user is authorized for all applications.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAuthAllApps(String isAuthAllApps) {
                this.isAuthAllApps = isAuthAllApps;
                return this;
            }

            /**
             * <p>The phone number of the user. Returned only when the account information of the user can be retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>138****0000</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
