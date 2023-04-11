// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProxyAccessResponseBody} extends {@link TeaModel}
 *
 * <p>GetProxyAccessResponseBody</p>
 */
public class GetProxyAccessResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("ProxyAccess")
    private ProxyAccess proxyAccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetProxyAccessResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.proxyAccess = builder.proxyAccess;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProxyAccessResponseBody create() {
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
     * @return proxyAccess
     */
    public ProxyAccess getProxyAccess() {
        return this.proxyAccess;
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
        private ProxyAccess proxyAccess; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The authorization information about the secure access proxy feature.
         */
        public Builder proxyAccess(ProxyAccess proxyAccess) {
            this.proxyAccess = proxyAccess;
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
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProxyAccessResponseBody build() {
            return new GetProxyAccessResponseBody(this);
        } 

    } 

    public static class ProxyAccess extends TeaModel {
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

        private ProxyAccess(Builder builder) {
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

        public static ProxyAccess create() {
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
             * The username of the database account that is authorized to enable the secure access proxy feature for an instance.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * The time when the user is authorized to enable the secure access proxy feature for an instance.
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
             * The ID of the instance for which the secure access proxy feature is enabled.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The method that is used to authorize the user to enable the secure access proxy feature for an instance. Valid values:
             * <p>
             * 
             * *   **Authorization by the Alibaba Cloud Account ()**: The information in the parentheses () indicates the ID of the Alibaba Cloud account.
             * *   **Authorization by submitting the ticket ()**:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.
             */
            public Builder originInfo(String originInfo) {
                this.originInfo = originInfo;
                return this;
            }

            /**
             * The ID that DMS generates after the user is authorized to enable the secure access proxy feature for an instance. The ID is unique in DMS. You can call the [ListProxyAccesses](~~295386~~) operation to query the ID.
             */
            public Builder proxyAccessId(Long proxyAccessId) {
                this.proxyAccessId = proxyAccessId;
                return this;
            }

            /**
             * The ID of the secure access proxy.
             * <p>
             * 
             * >  You can call the [ListProxies](~~295371~~) operation to query the ID of the secure access proxy.
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
             * The ID of the Alibaba Cloud account.
             */
            public Builder userUid(String userUid) {
                this.userUid = userUid;
                return this;
            }

            public ProxyAccess build() {
                return new ProxyAccess(this);
            } 

        } 

    }
}
