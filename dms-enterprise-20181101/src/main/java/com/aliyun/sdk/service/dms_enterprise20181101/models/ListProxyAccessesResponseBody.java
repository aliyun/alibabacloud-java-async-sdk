// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProxyAccessesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProxyAccessesResponseBody</p>
 */
public class ListProxyAccessesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("ProxyAccessList")
    private java.util.List < ProxyAccessList> proxyAccessList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListProxyAccessesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.proxyAccessList = builder.proxyAccessList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProxyAccessesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return proxyAccessList
     */
    public java.util.List < ProxyAccessList> getProxyAccessList() {
        return this.proxyAccessList;
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
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < ProxyAccessList> proxyAccessList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The information about the users that are authorized to access the database instance by using the secure access proxy feature.
         */
        public Builder proxyAccessList(java.util.List < ProxyAccessList> proxyAccessList) {
            this.proxyAccessList = proxyAccessList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * - **true**: The request was successful.
         * - **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProxyAccessesResponseBody build() {
            return new ListProxyAccessesResponseBody(this);
        } 

    } 

    public static class ProxyAccessList extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("IndepAccount")
        private String indepAccount;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("OriginInfo")
        private String originInfo;

        @NameInMap("ProxyAccessId")
        private Long proxyAccessId;

        @NameInMap("ProxyId")
        private Long proxyId;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserUid")
        private String userUid;

        private ProxyAccessList(Builder builder) {
            this.accessId = builder.accessId;
            this.gmtCreate = builder.gmtCreate;
            this.indepAccount = builder.indepAccount;
            this.instanceId = builder.instanceId;
            this.originInfo = builder.originInfo;
            this.proxyAccessId = builder.proxyAccessId;
            this.proxyId = builder.proxyId;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userUid = builder.userUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyAccessList create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return indepAccount
         */
        public String getIndepAccount() {
            return this.indepAccount;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return originInfo
         */
        public String getOriginInfo() {
            return this.originInfo;
        }

        /**
         * @return proxyAccessId
         */
        public Long getProxyAccessId() {
            return this.proxyAccessId;
        }

        /**
         * @return proxyId
         */
        public Long getProxyId() {
            return this.proxyId;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userUid
         */
        public String getUserUid() {
            return this.userUid;
        }

        public static final class Builder {
            private String accessId; 
            private String gmtCreate; 
            private String indepAccount; 
            private Long instanceId; 
            private String originInfo; 
            private Long proxyAccessId; 
            private Long proxyId; 
            private Long userId; 
            private String userName; 
            private String userUid; 

            /**
             * The username of the database account that is authorized to access the database instance by using the secure access proxy feature.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * The time when the user is authorized to access the database instance by using the secure access proxy feature.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The username of the independent database account.
             */
            public Builder indepAccount(String indepAccount) {
                this.indepAccount = indepAccount;
                return this;
            }

            /**
             * The ID of the database instance.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The method that is used to authorize the user to access the database instance by using the secure access proxy feature. Valid values: 
             * <p>
             * 
             * - **Authorization by the Alibaba Cloud Account ()**: The information in the parentheses () indicates the user ID (UID) of the Alibaba Cloud account.
             * - **Authorization by submitting the ticket ()**:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.
             */
            public Builder originInfo(String originInfo) {
                this.originInfo = originInfo;
                return this;
            }

            /**
             * The ID that DMS generates after the user is authorized to access the database instance by using the secure access proxy feature. The ID is unique in DMS.
             */
            public Builder proxyAccessId(Long proxyAccessId) {
                this.proxyAccessId = proxyAccessId;
                return this;
            }

            /**
             * The ID of the secure access proxy.
             */
            public Builder proxyId(Long proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The nickname of the user.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The UID of the Alibaba Cloud account.
             */
            public Builder userUid(String userUid) {
                this.userUid = userUid;
                return this;
            }

            public ProxyAccessList build() {
                return new ProxyAccessList(this);
            } 

        } 

    }
}
