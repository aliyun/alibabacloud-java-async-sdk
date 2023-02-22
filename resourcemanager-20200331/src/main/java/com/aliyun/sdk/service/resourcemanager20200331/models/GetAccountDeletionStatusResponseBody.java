// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
         * RdAccountDeletionStatus.
         */
        public Builder rdAccountDeletionStatus(RdAccountDeletionStatus rdAccountDeletionStatus) {
            this.rdAccountDeletionStatus = rdAccountDeletionStatus;
            return this;
        }

        /**
         * RequestId.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
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
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeletionTime.
             */
            public Builder deletionTime(String deletionTime) {
                this.deletionTime = deletionTime;
                return this;
            }

            /**
             * DeletionType.
             */
            public Builder deletionType(String deletionType) {
                this.deletionType = deletionType;
                return this;
            }

            /**
             * FailReasonList.
             */
            public Builder failReasonList(java.util.List < FailReasonList> failReasonList) {
                this.failReasonList = failReasonList;
                return this;
            }

            /**
             * Status.
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
