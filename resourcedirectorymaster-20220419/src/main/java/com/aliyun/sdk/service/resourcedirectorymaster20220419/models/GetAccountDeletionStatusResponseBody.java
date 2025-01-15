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
 * {@link GetAccountDeletionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountDeletionStatusResponseBody</p>
 */
public class GetAccountDeletionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RdAccountDeletionStatus")
    private RdAccountDeletionStatus rdAccountDeletionStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The deletion status of the member.</p>
         */
        public Builder rdAccountDeletionStatus(RdAccountDeletionStatus rdAccountDeletionStatus) {
            this.rdAccountDeletionStatus = rdAccountDeletionStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8AA43293-7C8F-5730-8F2D-7F864EC092C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountDeletionStatusResponseBody build() {
            return new GetAccountDeletionStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountDeletionStatusResponseBody</p>
     */
    public static class FailReasonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
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
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>This account has a payer account. Please release the financial relationship of this account first.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the cloud service to which the check item belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Others</p>
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
    /**
     * 
     * {@link GetAccountDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountDeletionStatusResponseBody</p>
     */
    public static class RdAccountDeletionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeletionTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deletionTime;

        @com.aliyun.core.annotation.NameInMap("DeletionType")
        private String deletionType;

        @com.aliyun.core.annotation.NameInMap("FailReasonList")
        private java.util.List<FailReasonList> failReasonList;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<FailReasonList> getFailReasonList() {
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
            private java.util.List<FailReasonList> failReasonList; 
            private String status; 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>169946124551****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The start time of the deletion.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-23T17:05:30+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time of the deletion.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-23T17:06:01+08:00</p>
             */
            public Builder deletionTime(String deletionTime) {
                this.deletionTime = deletionTime;
                return this;
            }

            /**
             * <p>The type of the deletion. Valid values:</p>
             * <ul>
             * <li>0: direct deletion. If the member does not have pay-as-you-go resources that are purchased within the previous 30 days, the system directly deletes the member.</li>
             * <li>1: deletion with a silence period. If the member has pay-as-you-go resources that are purchased within the previous 30 days, the member enters a silence period of 45 days. The system starts to delete the member until the silence period ends. For more information about the silence period, see <a href="https://help.aliyun.com/document_detail/446079.html">What is the silence period for member deletion?</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deletionType(String deletionType) {
                this.deletionType = deletionType;
                return this;
            }

            /**
             * <p>The reasons why the member fails to be deleted.</p>
             */
            public Builder failReasonList(java.util.List<FailReasonList> failReasonList) {
                this.failReasonList = failReasonList;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>Success: The member is deleted.</li>
             * <li>Checking: A deletion check is being performed for the member.</li>
             * <li>Deleting: The member is being deleted.</li>
             * <li>CheckFailed: The deletion check for the member fails.</li>
             * <li>DeleteFailed: The member fails to be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
