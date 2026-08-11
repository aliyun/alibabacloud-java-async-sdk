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
 * {@link DeleteDomainMetaRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainMetaRequest</p>
 */
public class DeleteDomainMetaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listType;

    private DeleteDomainMetaRequest(Builder builder) {
        super(builder);
        this.listId = builder.listId;
        this.listType = builder.listType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainMetaRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDomainMetaRequest, Builder> {
        private String listId; 
        private String listType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainMetaRequest request) {
            super(request);
            this.listId = request.listId;
            this.listType = request.listType;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>la_domain_white_list</p>
         */
        public Builder listType(String listType) {
            this.putBodyParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        @Override
        public DeleteDomainMetaRequest build() {
            return new DeleteDomainMetaRequest(this);
        } 

    } 

}
