// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link GetAccountDeletionCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountDeletionCheckResultResponseBody</p>
 */
public class GetAccountDeletionCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountDeletionCheckResultInfo")
    private AccountDeletionCheckResultInfo accountDeletionCheckResultInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccountDeletionCheckResultResponseBody(Builder builder) {
        this.accountDeletionCheckResultInfo = builder.accountDeletionCheckResultInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountDeletionCheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountDeletionCheckResultInfo
     */
    public AccountDeletionCheckResultInfo getAccountDeletionCheckResultInfo() {
        return this.accountDeletionCheckResultInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountDeletionCheckResultInfo accountDeletionCheckResultInfo; 
        private String requestId; 

        /**
         * <p>The result of the deletion check for the member.</p>
         */
        public Builder accountDeletionCheckResultInfo(AccountDeletionCheckResultInfo accountDeletionCheckResultInfo) {
            this.accountDeletionCheckResultInfo = accountDeletionCheckResultInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54AC391D-4F7F-5F08-B8D3-0AECDE6EC5BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountDeletionCheckResultResponseBody build() {
            return new GetAccountDeletionCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountDeletionCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountDeletionCheckResultResponseBody</p>
     */
    public static class AbandonableChecks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private AbandonableChecks(Builder builder) {
            this.checkId = builder.checkId;
            this.checkName = builder.checkName;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AbandonableChecks create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String checkId; 
            private String checkName; 
            private String description; 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>NON_SP_cs</p>
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The name of the cloud service to which the check item belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Container Service for Kubernetes</p>
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>An instance of a cloud service is running within the member. Submit a ticket to contact Alibaba Cloud technical support.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AbandonableChecks build() {
                return new AbandonableChecks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAccountDeletionCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountDeletionCheckResultResponseBody</p>
     */
    public static class NotAllowReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private NotAllowReason(Builder builder) {
            this.checkId = builder.checkId;
            this.checkName = builder.checkName;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotAllowReason create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String checkId; 
            private String checkName; 
            private String description; 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>NON_SP_efc</p>
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The name of the cloud service to which the check item belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Enterprise finance</p>
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>This account is an Enterprise Finance associated account. Please remove the financial association of this account before deleting it.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public NotAllowReason build() {
                return new NotAllowReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAccountDeletionCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountDeletionCheckResultResponseBody</p>
     */
    public static class AccountDeletionCheckResultInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonableChecks")
        private java.util.List<AbandonableChecks> abandonableChecks;

        @com.aliyun.core.annotation.NameInMap("AllowDelete")
        private String allowDelete;

        @com.aliyun.core.annotation.NameInMap("NotAllowReason")
        private java.util.List<NotAllowReason> notAllowReason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AccountDeletionCheckResultInfo(Builder builder) {
            this.abandonableChecks = builder.abandonableChecks;
            this.allowDelete = builder.allowDelete;
            this.notAllowReason = builder.notAllowReason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountDeletionCheckResultInfo create() {
            return builder().build();
        }

        /**
         * @return abandonableChecks
         */
        public java.util.List<AbandonableChecks> getAbandonableChecks() {
            return this.abandonableChecks;
        }

        /**
         * @return allowDelete
         */
        public String getAllowDelete() {
            return this.allowDelete;
        }

        /**
         * @return notAllowReason
         */
        public java.util.List<NotAllowReason> getNotAllowReason() {
            return this.notAllowReason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<AbandonableChecks> abandonableChecks; 
            private String allowDelete; 
            private java.util.List<NotAllowReason> notAllowReason; 
            private String status; 

            /**
             * <p>The check items that you can choose to ignore for the member deletion.</p>
             * <blockquote>
             * <p>This parameter may be returned if the value of AllowDelete is true.</p>
             * </blockquote>
             */
            public Builder abandonableChecks(java.util.List<AbandonableChecks> abandonableChecks) {
                this.abandonableChecks = abandonableChecks;
                return this;
            }

            /**
             * <p>Indicates whether the member can be deleted. Valid values:</p>
             * <ul>
             * <li>true: The member can be deleted.</li>
             * <li>false: The member cannot be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowDelete(String allowDelete) {
                this.allowDelete = allowDelete;
                return this;
            }

            /**
             * <p>The reasons why the member cannot be deleted.</p>
             * <blockquote>
             * <p>This parameter is returned only if the value of AllowDelete is false.</p>
             * </blockquote>
             */
            public Builder notAllowReason(java.util.List<NotAllowReason> notAllowReason) {
                this.notAllowReason = notAllowReason;
                return this;
            }

            /**
             * <p>The status of the check. Valid values:</p>
             * <ul>
             * <li>PreCheckComplete: The check is complete.</li>
             * <li>PreChecking: The check is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PreCheckComplete</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AccountDeletionCheckResultInfo build() {
                return new AccountDeletionCheckResultInfo(this);
            } 

        } 

    }
}
