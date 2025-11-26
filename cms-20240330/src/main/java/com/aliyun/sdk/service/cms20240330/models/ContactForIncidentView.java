// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ContactForIncidentView} extends {@link TeaModel}
 *
 * <p>ContactForIncidentView</p>
 */
public class ContactForIncidentView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactId")
    private String contactId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ContactForIncidentView(Builder builder) {
        this.contactId = builder.contactId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContactForIncidentView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String contactId; 
        private String name; 

        private Builder() {
        } 

        private Builder(ContactForIncidentView model) {
            this.contactId = model.contactId;
            this.name = model.name;
        } 

        /**
         * contactId.
         */
        public Builder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ContactForIncidentView build() {
            return new ContactForIncidentView(this);
        } 

    } 

}
