// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link CustomerNoteCreateRequest} extends {@link RequestModel}
 *
 * <p>CustomerNoteCreateRequest</p>
 */
public class CustomerNoteCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactInformation")
    private String contactInformation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerName")
    private String customerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerUid")
    private String customerUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoteContent")
    private String noteContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TouchDate")
    private Long touchDate;

    private CustomerNoteCreateRequest(Builder builder) {
        super(builder);
        this.contactInformation = builder.contactInformation;
        this.contactName = builder.contactName;
        this.customerName = builder.customerName;
        this.customerUid = builder.customerUid;
        this.noteContent = builder.noteContent;
        this.touchDate = builder.touchDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerNoteCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactInformation
     */
    public String getContactInformation() {
        return this.contactInformation;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return customerName
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * @return customerUid
     */
    public String getCustomerUid() {
        return this.customerUid;
    }

    /**
     * @return noteContent
     */
    public String getNoteContent() {
        return this.noteContent;
    }

    /**
     * @return touchDate
     */
    public Long getTouchDate() {
        return this.touchDate;
    }

    public static final class Builder extends Request.Builder<CustomerNoteCreateRequest, Builder> {
        private String contactInformation; 
        private String contactName; 
        private String customerName; 
        private String customerUid; 
        private String noteContent; 
        private Long touchDate; 

        private Builder() {
            super();
        } 

        private Builder(CustomerNoteCreateRequest request) {
            super(request);
            this.contactInformation = request.contactInformation;
            this.contactName = request.contactName;
            this.customerName = request.customerName;
            this.customerUid = request.customerUid;
            this.noteContent = request.noteContent;
            this.touchDate = request.touchDate;
        } 

        /**
         * <p>The contact information.</p>
         * 
         * <strong>example:</strong>
         * <p>13833333333</p>
         */
        public Builder contactInformation(String contactInformation) {
            this.putBodyParameter("ContactInformation", contactInformation);
            this.contactInformation = contactInformation;
            return this;
        }

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The customer name.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX Co., Ltd</p>
         */
        public Builder customerName(String customerName) {
            this.putBodyParameter("CustomerName", customerName);
            this.customerName = customerName;
            return this;
        }

        /**
         * <p>The customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1647796581073291</p>
         */
        public Builder customerUid(String customerUid) {
            this.putBodyParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * <p>The note content.</p>
         * 
         * <strong>example:</strong>
         * <p>Routine customer visit to discuss the agent implementation plan for the customer</p>
         */
        public Builder noteContent(String noteContent) {
            this.putBodyParameter("NoteContent", noteContent);
            this.noteContent = noteContent;
            return this;
        }

        /**
         * <p>The contact time (timestamp, in milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1784266662000</p>
         */
        public Builder touchDate(Long touchDate) {
            this.putBodyParameter("TouchDate", touchDate);
            this.touchDate = touchDate;
            return this;
        }

        @Override
        public CustomerNoteCreateRequest build() {
            return new CustomerNoteCreateRequest(this);
        } 

    } 

}
