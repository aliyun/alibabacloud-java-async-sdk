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
 * {@link CreateDomainMetaRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainMetaRequest</p>
 */
public class CreateDomainMetaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListType")
    private String listType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private CreateDomainMetaRequest(Builder builder) {
        super(builder);
        this.listType = builder.listType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateDomainMetaRequest, Builder> {
        private String listType; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainMetaRequest request) {
            super(request);
            this.listType = request.listType;
            this.name = request.name;
        } 

        /**
         * <p>The list type.</p>
         * 
         * <strong>example:</strong>
         * <p>la_domain_black_list</p>
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
         * <p>office_domain</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateDomainMetaRequest build() {
            return new CreateDomainMetaRequest(this);
        } 

    } 

}
