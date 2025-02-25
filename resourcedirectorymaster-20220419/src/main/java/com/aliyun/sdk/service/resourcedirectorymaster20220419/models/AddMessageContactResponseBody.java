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
 * {@link AddMessageContactResponseBody} extends {@link TeaModel}
 *
 * <p>AddMessageContactResponseBody</p>
 */
public class AddMessageContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Contact")
    private Contact contact;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddMessageContactResponseBody(Builder builder) {
        this.contact = builder.contact;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMessageContactResponseBody create() {
        return builder().build();
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return this.contact;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Contact contact; 
        private String requestId; 

        /**
         * <p>The information about the contact.</p>
         */
        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2DFCE4C9-04A9-4C83-BB14-FE791275EC53</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddMessageContactResponseBody build() {
            return new AddMessageContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddMessageContactResponseBody} extends {@link TeaModel}
     *
     * <p>AddMessageContactResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        private Contact(Builder builder) {
            this.contactId = builder.contactId;
            this.createDate = builder.createDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        public static final class Builder {
            private String contactId; 
            private String createDate; 

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
             * <p>The time when the contact was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-27 17:19:21</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
}
