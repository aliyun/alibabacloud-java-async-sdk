// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateDomainMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainMetaRequest</p>
 */
public class UpdateDomainMetaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListId")
    private String listId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListType")
    private String listType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateDomainMetaRequest(Builder builder) {
        super(builder);
        this.listId = builder.listId;
        this.listType = builder.listType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listId
     */
    public String getListId() {
        return this.listId;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateDomainMetaRequest, Builder> {
        private String listId; 
        private String listType; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainMetaRequest request) {
            super(request);
            this.listId = request.listId;
            this.listType = request.listType;
            this.name = request.name;
        } 

        /**
         * <p>The list ID. This is a unique business identifier used for policy references and add, delete, or modify operations.</p>
         * 
         * <strong>example:</strong>
         * <p>ladl-6f1exxxxx6ab59</p>
         */
        public Builder listId(String listId) {
            this.putBodyParameter("ListId", listId);
            this.listId = listId;
            return this;
        }

        /**
         * <p>The list type.</p>
         * 
         * <strong>example:</strong>
         * <p>la_domain_white_list</p>
         */
        public Builder listType(String listType) {
            this.putBodyParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * <p>The list name. Maximum length: 32 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>new_office_domain</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateDomainMetaRequest build() {
            return new UpdateDomainMetaRequest(this);
        } 

    } 

}
