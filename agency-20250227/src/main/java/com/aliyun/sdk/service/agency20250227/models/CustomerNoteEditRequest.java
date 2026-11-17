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
 * {@link CustomerNoteEditRequest} extends {@link RequestModel}
 *
 * <p>CustomerNoteEditRequest</p>
 */
public class CustomerNoteEditRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactInformation")
    private String contactInformation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoteContent")
    private String noteContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoteId")
    private Long noteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TouchDate")
    private Long touchDate;

    private CustomerNoteEditRequest(Builder builder) {
        super(builder);
        this.contactInformation = builder.contactInformation;
        this.contactName = builder.contactName;
        this.noteContent = builder.noteContent;
        this.noteId = builder.noteId;
        this.touchDate = builder.touchDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerNoteEditRequest create() {
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
     * @return noteContent
     */
    public String getNoteContent() {
        return this.noteContent;
    }

    /**
     * @return noteId
     */
    public Long getNoteId() {
        return this.noteId;
    }

    /**
     * @return touchDate
     */
    public Long getTouchDate() {
        return this.touchDate;
    }

    public static final class Builder extends Request.Builder<CustomerNoteEditRequest, Builder> {
        private String contactInformation; 
        private String contactName; 
        private String noteContent; 
        private Long noteId; 
        private Long touchDate; 

        private Builder() {
            super();
        } 

        private Builder(CustomerNoteEditRequest request) {
            super(request);
            this.contactInformation = request.contactInformation;
            this.contactName = request.contactName;
            this.noteContent = request.noteContent;
            this.noteId = request.noteId;
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
         * <p>The name of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The content of the note.</p>
         * 
         * <strong>example:</strong>
         * <p>Routine customer visit to discuss the agent development plan for the customer</p>
         */
        public Builder noteContent(String noteContent) {
            this.putBodyParameter("NoteContent", noteContent);
            this.noteContent = noteContent;
            return this;
        }

        /**
         * <p>The ID of the note. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1629862</p>
         */
        public Builder noteId(Long noteId) {
            this.putBodyParameter("NoteId", noteId);
            this.noteId = noteId;
            return this;
        }

        /**
         * <p>The time when the contact was made. The value is a timestamp in milliseconds.</p>
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
        public CustomerNoteEditRequest build() {
            return new CustomerNoteEditRequest(this);
        } 

    } 

}
