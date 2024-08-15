// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DisassociateMembersResponseBody</p>
 */
public class DisassociateMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List < Members> members;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisassociateMembersResponseBody(Builder builder) {
        this.members = builder.members;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return members
     */
    public java.util.List < Members> getMembers() {
        return this.members;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Members> members; 
        private String requestId; 

        /**
         * The time when the contact was unbound from the object.
         */
        public Builder members(java.util.List < Members> members) {
            this.members = members;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisassociateMembersResponseBody build() {
            return new DisassociateMembersResponseBody(this);
        } 

    } 

    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("ModifyDate")
        private String modifyDate;

        private Members(Builder builder) {
            this.contactId = builder.contactId;
            this.memberId = builder.memberId;
            this.modifyDate = builder.modifyDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return modifyDate
         */
        public String getModifyDate() {
            return this.modifyDate;
        }

        public static final class Builder {
            private String contactId; 
            private String memberId; 
            private String modifyDate; 

            /**
             * The ID of the contact.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The ID of the object. Valid values:
             * <p>
             * 
             * - ID of the resource directory
             * - ID of the folder
             * - ID of the member
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * The time when the contact was unbound from the object.
             */
            public Builder modifyDate(String modifyDate) {
                this.modifyDate = modifyDate;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
