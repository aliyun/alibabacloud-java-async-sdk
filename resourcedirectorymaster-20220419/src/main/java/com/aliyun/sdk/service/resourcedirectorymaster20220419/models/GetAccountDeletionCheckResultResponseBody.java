// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The result of the deletion check for the member.
         */
        public Builder accountDeletionCheckResultInfo(AccountDeletionCheckResultInfo accountDeletionCheckResultInfo) {
            this.accountDeletionCheckResultInfo = accountDeletionCheckResultInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountDeletionCheckResultResponseBody build() {
            return new GetAccountDeletionCheckResultResponseBody(this);
        } 

    } 

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
             * The ID of the check item.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The name of the cloud service to which the check item belongs.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * The description of the check item.
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
             * The ID of the check item.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The name of the cloud service to which the check item belongs.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * The description of the check item.
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
    public static class AccountDeletionCheckResultInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonableChecks")
        private java.util.List < AbandonableChecks> abandonableChecks;

        @com.aliyun.core.annotation.NameInMap("AllowDelete")
        private String allowDelete;

        @com.aliyun.core.annotation.NameInMap("NotAllowReason")
        private java.util.List < NotAllowReason> notAllowReason;

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
        public java.util.List < AbandonableChecks> getAbandonableChecks() {
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
        public java.util.List < NotAllowReason> getNotAllowReason() {
            return this.notAllowReason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < AbandonableChecks> abandonableChecks; 
            private String allowDelete; 
            private java.util.List < NotAllowReason> notAllowReason; 
            private String status; 

            /**
             * The check items that you can choose to ignore for the member deletion.
             * <p>
             * 
             * > This parameter may be returned if the value of AllowDelete is true.
             */
            public Builder abandonableChecks(java.util.List < AbandonableChecks> abandonableChecks) {
                this.abandonableChecks = abandonableChecks;
                return this;
            }

            /**
             * Indicates whether the member can be deleted. Valid values:
             * <p>
             * 
             * *   true: The member can be deleted.
             * *   false: The member cannot be deleted.
             */
            public Builder allowDelete(String allowDelete) {
                this.allowDelete = allowDelete;
                return this;
            }

            /**
             * The reasons why the member cannot be deleted.
             * <p>
             * 
             * > This parameter is returned only if the value of AllowDelete is false.
             */
            public Builder notAllowReason(java.util.List < NotAllowReason> notAllowReason) {
                this.notAllowReason = notAllowReason;
                return this;
            }

            /**
             * The status of the check. Valid values:
             * <p>
             * 
             * *   PreCheckComplete: The check is complete.
             * *   PreChecking: The check is in progress.
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
