// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeOpenSearchAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenSearchAccountInfoResponseBody</p>
 */
public class DescribeOpenSearchAccountInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenSearchAccountInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenSearchAccountInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOpenSearchAccountInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenSearchAccountInfoResponseBody build() {
            return new DescribeOpenSearchAccountInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenSearchAccountInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchAccountInfoResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The authentication action.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The display name of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The owner ID of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The authentication principal type.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The diagnostic information.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>NoPermissionType</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchAccountInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchAccountInfoResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Accounts(Builder builder) {
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String accountStatus; 
            private String accountType; 
            private String username; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountStatus = model.accountStatus;
                this.accountType = model.accountType;
                this.username = model.username;
            } 

            /**
             * <p>The account status. Valid values: </p>
             * <ul>
             * <li><strong>Creating</strong>: The account is being created.</li>
             * <li><strong>Available</strong>: The account is available.</li>
             * <li><strong>Deleting</strong>: The account is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>The account type.</p>
             * <ul>
             * <li>Before three-role mode is enabled: 0 indicates a standard account, and 1 indicates a privileged account.</li>
             * <li>After three-role mode is enabled: 0 indicates a standard account, 2 indicates a system administrator account, 3 indicates a security administrator account, and 4 indicates an audit administrator account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2,3,4</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The account name of the OpenSearch instance.</p>
             * 
             * <strong>example:</strong>
             * <p>elastic</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchAccountInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchAccountInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        private java.util.List<Accounts> accounts;

        @com.aliyun.core.annotation.NameInMap("PasswordLastModified")
        private String passwordLastModified;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Data(Builder builder) {
            this.accounts = builder.accounts;
            this.passwordLastModified = builder.passwordLastModified;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public java.util.List<Accounts> getAccounts() {
            return this.accounts;
        }

        /**
         * @return passwordLastModified
         */
        public String getPasswordLastModified() {
            return this.passwordLastModified;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private java.util.List<Accounts> accounts; 
            private String passwordLastModified; 
            private String username; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accounts = model.accounts;
                this.passwordLastModified = model.passwordLastModified;
                this.username = model.username;
            } 

            /**
             * <p>The list of accounts.</p>
             */
            public Builder accounts(java.util.List<Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>The time when the password was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-21T12:00:00Z</p>
             */
            public Builder passwordLastModified(String passwordLastModified) {
                this.passwordLastModified = passwordLastModified;
                return this;
            }

            /**
             * <p>The account name of the OpenSearch instance.</p>
             * 
             * <strong>example:</strong>
             * <p>elastic</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
