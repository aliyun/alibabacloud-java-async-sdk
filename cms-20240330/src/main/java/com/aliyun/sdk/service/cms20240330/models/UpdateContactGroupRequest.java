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
 * {@link UpdateContactGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateContactGroupRequest</p>
 */
public class UpdateContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contactGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List<String> contacts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private UpdateContactGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactGroupId = builder.contactGroupId;
        this.contacts = builder.contacts;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContactGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contactGroupId
     */
    public String getContactGroupId() {
        return this.contactGroupId;
    }

    /**
     * @return contacts
     */
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateContactGroupRequest, Builder> {
        private String regionId; 
        private String contactGroupId; 
        private java.util.List<String> contacts; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContactGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactGroupId = request.contactGroupId;
            this.contacts = request.contacts;
            this.name = request.name;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The unique identifier of the contact group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder contactGroupId(String contactGroupId) {
            this.putPathParameter("contactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * <p>The ID of the contact.</p>
         */
        public Builder contacts(java.util.List<String> contacts) {
            this.putBodyParameter("contacts", contacts);
            this.contacts = contacts;
            return this;
        }

        /**
         * <p>The name of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateContactGroupRequest build() {
            return new UpdateContactGroupRequest(this);
        } 

    } 

}
