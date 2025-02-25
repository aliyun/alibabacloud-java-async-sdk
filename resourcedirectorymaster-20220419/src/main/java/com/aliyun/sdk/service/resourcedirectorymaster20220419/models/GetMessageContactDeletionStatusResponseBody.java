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
 * {@link GetMessageContactDeletionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageContactDeletionStatusResponseBody</p>
 */
public class GetMessageContactDeletionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactDeletionStatus")
    private ContactDeletionStatus contactDeletionStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessageContactDeletionStatusResponseBody(Builder builder) {
        this.contactDeletionStatus = builder.contactDeletionStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageContactDeletionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return contactDeletionStatus
     */
    public ContactDeletionStatus getContactDeletionStatus() {
        return this.contactDeletionStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ContactDeletionStatus contactDeletionStatus; 
        private String requestId; 

        /**
         * <p>The deletion information of the contact.</p>
         */
        public Builder contactDeletionStatus(ContactDeletionStatus contactDeletionStatus) {
            this.contactDeletionStatus = contactDeletionStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95060F1D-6990-4645-8920-A81D1BBFE992</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageContactDeletionStatusResponseBody build() {
            return new GetMessageContactDeletionStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageContactDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageContactDeletionStatusResponseBody</p>
     */
    public static class FailReasonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("MessageTypes")
        private java.util.List<String> messageTypes;

        private FailReasonList(Builder builder) {
            this.accountId = builder.accountId;
            this.messageTypes = builder.messageTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailReasonList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return messageTypes
         */
        public java.util.List<String> getMessageTypes() {
            return this.messageTypes;
        }

        public static final class Builder {
            private String accountId; 
            private java.util.List<String> messageTypes; 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>199796839435****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The types of messages received by the contact.</p>
             */
            public Builder messageTypes(java.util.List<String> messageTypes) {
                this.messageTypes = messageTypes;
                return this;
            }

            public FailReasonList build() {
                return new FailReasonList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMessageContactDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageContactDeletionStatusResponseBody</p>
     */
    public static class ContactDeletionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("FailReasonList")
        private java.util.List<FailReasonList> failReasonList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ContactDeletionStatus(Builder builder) {
            this.contactId = builder.contactId;
            this.failReasonList = builder.failReasonList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactDeletionStatus create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
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
            private String contactId; 
            private java.util.List<FailReasonList> failReasonList; 
            private String status; 

            /**
             * <p>The ID of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>c-qL4HqKONzOM7****</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The types of messages received by the contact.</p>
             */
            public Builder failReasonList(java.util.List<FailReasonList> failReasonList) {
                this.failReasonList = failReasonList;
                return this;
            }

            /**
             * <p>The deletion status of the contact. Valid values:</p>
             * <ul>
             * <li>Deleting</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deleting</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ContactDeletionStatus build() {
                return new ContactDeletionStatus(this);
            } 

        } 

    }
}
