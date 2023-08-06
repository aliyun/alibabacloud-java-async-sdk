// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountDeletionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountDeletionStatusResponseBody</p>
 */
public class GetAccountDeletionStatusResponseBody extends TeaModel {
    @NameInMap("RdAccountDeletionStatus")
    private RdAccountDeletionStatus rdAccountDeletionStatus;

    @NameInMap("RequestId")
    private String requestId;

    private GetAccountDeletionStatusResponseBody(Builder builder) {
        this.rdAccountDeletionStatus = builder.rdAccountDeletionStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountDeletionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return rdAccountDeletionStatus
     */
    public RdAccountDeletionStatus getRdAccountDeletionStatus() {
        return this.rdAccountDeletionStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RdAccountDeletionStatus rdAccountDeletionStatus; 
        private String requestId; 

        /**
         * The deletion status of the member.
         */
        public Builder rdAccountDeletionStatus(RdAccountDeletionStatus rdAccountDeletionStatus) {
            this.rdAccountDeletionStatus = rdAccountDeletionStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountDeletionStatusResponseBody build() {
            return new GetAccountDeletionStatusResponseBody(this);
        } 

    } 

    public static class FailReasonList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        private FailReasonList(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailReasonList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            /**
             * The description of the check item.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the cloud service to which the check item belongs.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FailReasonList build() {
                return new FailReasonList(this);
            } 

        } 

    }
    public static class RdAccountDeletionStatus extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeletionTime")
        @Validation(required = true)
        private String deletionTime;

        @NameInMap("DeletionType")
        private String deletionType;

        @NameInMap("FailReasonList")
        private java.util.List < FailReasonList> failReasonList;

        @NameInMap("Status")
        private String status;

        private RdAccountDeletionStatus(Builder builder) {
            this.accountId = builder.accountId;
            this.createTime = builder.createTime;
            this.deletionTime = builder.deletionTime;
            this.deletionType = builder.deletionType;
            this.failReasonList = builder.failReasonList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdAccountDeletionStatus create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deletionTime
         */
        public String getDeletionTime() {
            return this.deletionTime;
        }

        /**
         * @return deletionType
         */
        public String getDeletionType() {
            return this.deletionType;
        }

        /**
         * @return failReasonList
         */
        public java.util.List < FailReasonList> getFailReasonList() {
            return this.failReasonList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountId; 
            private String createTime; 
            private String deletionTime; 
            private String deletionType; 
            private java.util.List < FailReasonList> failReasonList; 
            private String status; 

            /**
             * The Alibaba Cloud account ID of the member.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The start time of the deletion.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The end time of the deletion.
             */
            public Builder deletionTime(String deletionTime) {
                this.deletionTime = deletionTime;
                return this;
            }

            /**
             * The type of the deletion. Valid values:
             * <p>
             * 
             * *   0: direct deletion. If the member does not have pay-as-you-go resources that are purchased within the previous 30 days, the system directly deletes the member.
             * *   1: deletion with a silence period. If the member has pay-as-you-go resources that are purchased within the previous 30 days, the member enters a silence period of 45 days. The system starts to delete the member until the silence period ends. For more information about the silence period, see [What is the silence period for member deletion?](~~446079~~)
             */
            public Builder deletionType(String deletionType) {
                this.deletionType = deletionType;
                return this;
            }

            /**
             * The reasons why the member fails to be deleted.
             */
            public Builder failReasonList(java.util.List < FailReasonList> failReasonList) {
                this.failReasonList = failReasonList;
                return this;
            }

            /**
             * The status. Valid values:
             * <p>
             * 
             * *   Success: The member is deleted.
             * *   Checking: A deletion check is being performed for the member.
             * *   Deleting: The member is being deleted.
             * *   CheckFailed: The deletion check for the member fails.
             * *   DeleteFailed: The member fails to be deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RdAccountDeletionStatus build() {
                return new RdAccountDeletionStatus(this);
            } 

        } 

    }
}
