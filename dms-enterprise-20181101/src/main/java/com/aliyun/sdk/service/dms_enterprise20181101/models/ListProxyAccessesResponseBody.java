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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * ProxyAccessList.
         */
        public Builder proxyAccessList(java.util.List < ProxyAccessList> proxyAccessList) {
            this.proxyAccessList = proxyAccessList;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * IndepAccount.
             */
            public Builder indepAccount(String indepAccount) {
                this.indepAccount = indepAccount;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OriginInfo.
             */
            public Builder originInfo(String originInfo) {
                this.originInfo = originInfo;
                return this;
            }

            /**
             * ProxyAccessId.
             */
            public Builder proxyAccessId(Long proxyAccessId) {
                this.proxyAccessId = proxyAccessId;
                return this;
            }

            /**
             * ProxyId.
             */
            public Builder proxyId(Long proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserUid.
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
