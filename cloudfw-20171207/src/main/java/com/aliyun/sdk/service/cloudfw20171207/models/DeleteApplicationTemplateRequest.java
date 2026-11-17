// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeleteApplicationTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationTemplateRequest</p>
 */
public class DeleteApplicationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    private String applicationTemplateId;

    private DeleteApplicationTemplateRequest(Builder builder) {
        super(builder);
        this.applicationTemplateId = builder.applicationTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationTemplateRequest, Builder> {
        private String applicationTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationTemplateRequest request) {
            super(request);
            this.applicationTemplateId = request.applicationTemplateId;
        } 

        /**
         * <p>The ID of the application program template to delete. This parameter is required. If you leave this parameter empty, a parameter fault is returned. The template must exist within the current Alibaba Cloud account. You cannot delete a template if it contains custom application program rules or is referenced by an access control policy of the Internet border, NAT, or virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>ati-4f0691c56b8d4f06</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        @Override
        public DeleteApplicationTemplateRequest build() {
            return new DeleteApplicationTemplateRequest(this);
        } 

    } 

}
