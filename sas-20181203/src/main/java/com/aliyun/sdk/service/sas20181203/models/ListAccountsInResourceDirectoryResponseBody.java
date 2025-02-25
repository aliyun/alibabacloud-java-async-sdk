// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAccountsInResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountsInResourceDirectoryResponseBody</p>
 */
public class ListAccountsInResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccountsInResourceDirectoryResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsInResourceDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return accounts
     */
    public java.util.List<Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Accounts> accounts; 
        private String requestId; 

        /**
         * <p>The members in the resource directory.</p>
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B7A839E8-70AE-591D-8D9E-C5419A2240DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccountsInResourceDirectoryResponseBody build() {
            return new ListAccountsInResourceDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccountsInResourceDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountsInResourceDirectoryResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("IsMaAccount")
        private String isMaAccount;

        @com.aliyun.core.annotation.NameInMap("IsMarked")
        private String isMarked;

        @com.aliyun.core.annotation.NameInMap("IsSasDaAccount")
        private String isSasDaAccount;

        @com.aliyun.core.annotation.NameInMap("IsSiemControlAccount")
        private String isSiemControlAccount;

        @com.aliyun.core.annotation.NameInMap("IsSiemDaAccount")
        private String isSiemDaAccount;

        @com.aliyun.core.annotation.NameInMap("SasVersion")
        private String sasVersion;

        private Accounts(Builder builder) {
            this.accountId = builder.accountId;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.isMaAccount = builder.isMaAccount;
            this.isMarked = builder.isMarked;
            this.isSasDaAccount = builder.isSasDaAccount;
            this.isSiemControlAccount = builder.isSiemControlAccount;
            this.isSiemDaAccount = builder.isSiemDaAccount;
            this.sasVersion = builder.sasVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return isMaAccount
         */
        public String getIsMaAccount() {
            return this.isMaAccount;
        }

        /**
         * @return isMarked
         */
        public String getIsMarked() {
            return this.isMarked;
        }

        /**
         * @return isSasDaAccount
         */
        public String getIsSasDaAccount() {
            return this.isSasDaAccount;
        }

        /**
         * @return isSiemControlAccount
         */
        public String getIsSiemControlAccount() {
            return this.isSiemControlAccount;
        }

        /**
         * @return isSiemDaAccount
         */
        public String getIsSiemDaAccount() {
            return this.isSiemDaAccount;
        }

        /**
         * @return sasVersion
         */
        public String getSasVersion() {
            return this.sasVersion;
        }

        public static final class Builder {
            private String accountId; 
            private String displayName; 
            private String folderId; 
            private String isMaAccount; 
            private String isMarked; 
            private String isSasDaAccount; 
            private String isSiemControlAccount; 
            private String isSiemDaAccount; 
            private String sasVersion; 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>180803538814****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>abc**</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the folder in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-cE2SQP****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>Indicates whether the member is an administrator account of the resource directory. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isMaAccount(String isMaAccount) {
                this.isMaAccount = isMaAccount;
                return this;
            }

            /**
             * <p>Indicates whether the member is marked as followed.</p>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isMarked(String isMarked) {
                this.isMarked = isMarked;
                return this;
            }

            /**
             * <p>Indicates whether the member is a delegated administrator account of Security Center. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSasDaAccount(String isSasDaAccount) {
                this.isSasDaAccount = isSasDaAccount;
                return this;
            }

            /**
             * <p>Indicates whether the member is an account of the threat analysis and response feature. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSiemControlAccount(String isSiemControlAccount) {
                this.isSiemControlAccount = isSiemControlAccount;
                return this;
            }

            /**
             * <p>Indicates whether the member is a delegated administrator account of the threat analysis and response feature. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSiemDaAccount(String isSiemDaAccount) {
                this.isSiemDaAccount = isSiemDaAccount;
                return this;
            }

            /**
             * <p>The edition of Security Center that you use. Valid value:</p>
             * <ul>
             * <li><strong>0</strong> or <strong>1</strong>: Basic</li>
             * <li><strong>2</strong> or <strong>3</strong>: Enterprise</li>
             * <li><strong>5</strong>: Advanced</li>
             * <li><strong>6</strong>: Anti-virus</li>
             * <li><strong>7</strong>: Ultimate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sasVersion(String sasVersion) {
                this.sasVersion = sasVersion;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
