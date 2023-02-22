// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountDeletionCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountDeletionCheckResultResponseBody</p>
 */
public class GetAccountDeletionCheckResultResponseBody extends TeaModel {
    @NameInMap("AccountDeletionCheckResultInfo")
    private AccountDeletionCheckResultInfo accountDeletionCheckResultInfo;

    @NameInMap("RequestId")
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
         * AccountDeletionCheckResultInfo.
         */
        public Builder accountDeletionCheckResultInfo(AccountDeletionCheckResultInfo accountDeletionCheckResultInfo) {
            this.accountDeletionCheckResultInfo = accountDeletionCheckResultInfo;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("CheckId")
        private String checkId;

        @NameInMap("CheckName")
        private String checkName;

        @NameInMap("Description")
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
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * Description.
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
        @NameInMap("CheckId")
        private String checkId;

        @NameInMap("CheckName")
        private String checkName;

        @NameInMap("Description")
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
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * Description.
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
        @NameInMap("AbandonableChecks")
        private java.util.List < AbandonableChecks> abandonableChecks;

        @NameInMap("AllowDelete")
        private String allowDelete;

        @NameInMap("NotAllowReason")
        private java.util.List < NotAllowReason> notAllowReason;

        @NameInMap("Status")
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
             * AbandonableChecks.
             */
            public Builder abandonableChecks(java.util.List < AbandonableChecks> abandonableChecks) {
                this.abandonableChecks = abandonableChecks;
                return this;
            }

            /**
             * AllowDelete.
             */
            public Builder allowDelete(String allowDelete) {
                this.allowDelete = allowDelete;
                return this;
            }

            /**
             * NotAllowReason.
             */
            public Builder notAllowReason(java.util.List < NotAllowReason> notAllowReason) {
                this.notAllowReason = notAllowReason;
                return this;
            }

            /**
             * Status.
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
