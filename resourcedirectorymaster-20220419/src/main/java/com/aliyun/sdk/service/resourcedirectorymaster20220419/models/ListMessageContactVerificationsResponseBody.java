// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageContactVerificationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageContactVerificationsResponseBody</p>
 */
public class ListMessageContactVerificationsResponseBody extends TeaModel {
    @NameInMap("ContactVerifications")
    private java.util.List < ContactVerifications> contactVerifications;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < ContactVerifications> getContactVerifications() {
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
        private java.util.List < ContactVerifications> contactVerifications; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The record for the contact to be verified.
         */
        public Builder contactVerifications(java.util.List < ContactVerifications> contactVerifications) {
            this.contactVerifications = contactVerifications;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMessageContactVerificationsResponseBody build() {
            return new ListMessageContactVerificationsResponseBody(this);
        } 

    } 

    public static class ContactVerifications extends TeaModel {
        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("Target")
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
             * The ID of the contact.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The object that is used for verification. Valid values:
             * <p>
             * 
             * - Mobile phone number
             * - Email address
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
