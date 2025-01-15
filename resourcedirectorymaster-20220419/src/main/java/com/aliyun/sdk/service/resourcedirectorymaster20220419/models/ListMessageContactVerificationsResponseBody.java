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
 * {@link ListMessageContactVerificationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageContactVerificationsResponseBody</p>
 */
public class ListMessageContactVerificationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactVerifications")
    private java.util.List<ContactVerifications> contactVerifications;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMessageContactVerificationsResponseBody(Builder builder) {
        this.contactVerifications = builder.contactVerifications;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageContactVerificationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return contactVerifications
     */
    public java.util.List<ContactVerifications> getContactVerifications() {
        return this.contactVerifications;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ContactVerifications> contactVerifications; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The record for the contact to be verified.</p>
         */
        public Builder contactVerifications(java.util.List<ContactVerifications> contactVerifications) {
            this.contactVerifications = contactVerifications;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD76D376-2517-4924-92C5-DBC52262F93A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMessageContactVerificationsResponseBody build() {
            return new ListMessageContactVerificationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageContactVerificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageContactVerificationsResponseBody</p>
     */
    public static class ContactVerifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        private ContactVerifications(Builder builder) {
            this.contactId = builder.contactId;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactVerifications create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String contactId; 
            private String target; 

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
             * <p>The object that is used for verification. Valid values:</p>
             * <ul>
             * <li>Mobile phone number</li>
             * <li>Email address</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>someone***@example.com</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public ContactVerifications build() {
                return new ContactVerifications(this);
            } 

        } 

    }
}
