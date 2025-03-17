// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListProxyAccessesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProxyAccessesResponseBody</p>
 */
public class ListProxyAccessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProxyAccessList")
    private java.util.List<ProxyAccessList> proxyAccessList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ProxyAccessList> getProxyAccessList() {
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
        private java.util.List<ProxyAccessList> proxyAccessList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListProxyAccessesResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.proxyAccessList = model.proxyAccessList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingProxyId</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ProxyId is mandatory for this action.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The information about the users that are authorized to access the database instance by using the secure access proxy feature.</p>
         */
        public Builder proxyAccessList(java.util.List<ProxyAccessList> proxyAccessList) {
            this.proxyAccessList = proxyAccessList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E53D178A-85E9-5E1F-88B6-3CB1FCF2****</p>
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

        public ListProxyAccessesResponseBody build() {
            return new ListProxyAccessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProxyAccessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProxyAccessesResponseBody</p>
     */
    public static class ProxyAccessList extends TeaModel {
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

            private Builder() {
            } 

            private Builder(ProxyAccessList model) {
                this.accessId = model.accessId;
                this.gmtCreate = model.gmtCreate;
                this.indepAccount = model.indepAccount;
                this.instanceId = model.instanceId;
                this.originInfo = model.originInfo;
                this.proxyAccessId = model.proxyAccessId;
                this.proxyId = model.proxyId;
                this.userId = model.userId;
                this.userName = model.userName;
                this.userUid = model.userUid;
            } 

            /**
             * <p>The username of the database account that is authorized to access the database instance by using the secure access proxy feature.</p>
             * 
             * <strong>example:</strong>
             * <p>MXPL8HalI22m****</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>The time when the user is authorized to access the database instance by using the secure access proxy feature.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-31 10:34:18</p>
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
             * <p>The ID of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>164****</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The method that is used to authorize the user to access the database instance by using the secure access proxy feature. Valid values: </p>
             * <ul>
             * <li><strong>Authorization by the Alibaba Cloud Account ()</strong>: The information in the parentheses () indicates the user ID (UID) of the Alibaba Cloud account.</li>
             * <li><strong>Authorization by submitting the ticket ()</strong>:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Authorization by the Alibaba Cloud Account(29490401597700****)</p>
             */
            public Builder originInfo(String originInfo) {
                this.originInfo = originInfo;
                return this;
            }

            /**
             * <p>The ID that DMS generates after the user is authorized to access the database instance by using the secure access proxy feature. The ID is unique in DMS.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder proxyAccessId(Long proxyAccessId) {
                this.proxyAccessId = proxyAccessId;
                return this;
            }

            /**
             * <p>The ID of the secure access proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder proxyId(Long proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>26****</p>
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
             * <p>The UID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>25936669186260****</p>
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
