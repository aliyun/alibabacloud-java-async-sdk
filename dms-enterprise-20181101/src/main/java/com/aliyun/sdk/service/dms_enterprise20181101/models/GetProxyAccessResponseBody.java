// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProxyAccessResponseBody} extends {@link TeaModel}
 *
 * <p>GetProxyAccessResponseBody</p>
 */
public class GetProxyAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProxyAccess")
    private ProxyAccess proxyAccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UserNotExist</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified user not exists.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The authorization information about the secure access proxy feature.</p>
         */
        public Builder proxyAccess(ProxyAccess proxyAccess) {
            this.proxyAccess = proxyAccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3CDB8601-AD74-4A47-8114-08E08CD6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProxyAccessResponseBody build() {
            return new GetProxyAccessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProxyAccessResponseBody} extends {@link TeaModel}
     *
     * <p>GetProxyAccessResponseBody</p>
     */
    public static class ProxyAccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IndepAccount")
        private String indepAccount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("OriginInfo")
        private String originInfo;

        @com.aliyun.core.annotation.NameInMap("ProxyAccessId")
        private Long proxyAccessId;

        @com.aliyun.core.annotation.NameInMap("ProxyId")
        private Long proxyId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserUid")
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
             * <p>The username of the database account that is authorized to enable the secure access proxy feature for an instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hObpgEXoca42q***</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>The time when the user is authorized to enable the secure access proxy feature for an instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1643034647</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The username of the independent database account.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder indepAccount(String indepAccount) {
                this.indepAccount = indepAccount;
                return this;
            }

            /**
             * <p>The ID of the instance for which the secure access proxy feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1922545</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The method that is used to authorize the user to enable the secure access proxy feature for an instance. Valid values:</p>
             * <ul>
             * <li><strong>Authorization by the Alibaba Cloud Account ()</strong>: The information in the parentheses () indicates the ID of the Alibaba Cloud account.</li>
             * <li><strong>Authorization by submitting the ticket ()</strong>:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Authorization by the Alibaba Cloud account (29490401597700****)</p>
             */
            public Builder originInfo(String originInfo) {
                this.originInfo = originInfo;
                return this;
            }

            /**
             * <p>The ID that DMS generates after the user is authorized to enable the secure access proxy feature for an instance. The ID is unique in DMS. You can call the <a href="https://help.aliyun.com/document_detail/295386.html">ListProxyAccesses</a> operation to query the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2002</p>
             */
            public Builder proxyAccessId(Long proxyAccessId) {
                this.proxyAccessId = proxyAccessId;
                return this;
            }

            /**
             * <p>The ID of the secure access proxy.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/295371.html">ListProxies</a> operation to query the ID of the secure access proxy.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1905</p>
             */
            public Builder proxyId(Long proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>12***</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>25936669186260****</p>
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
