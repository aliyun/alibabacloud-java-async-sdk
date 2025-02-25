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
 * {@link AssociateMembersResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateMembersResponseBody</p>
 */
public class AssociateMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateMembersResponseBody(Builder builder) {
        this.members = builder.members;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Members> members; 
        private String requestId; 

        /**
         * <p>The time when the contact was bound to the object.</p>
         */
        public Builder members(java.util.List<Members> members) {
            this.members = members;
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

        public AssociateMembersResponseBody build() {
            return new AssociateMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssociateMembersResponseBody} extends {@link TeaModel}
     *
     * <p>AssociateMembersResponseBody</p>
     */
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
             * <p>The ID of the object. Valid values:</p>
             * <ul>
             * <li>ID of the resource directory</li>
             * <li>ID of the folder</li>
             * <li>ID of the member</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fd-ZDNPiT****</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The time when the contact was bound to the object.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-27 17:19:21</p>
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
