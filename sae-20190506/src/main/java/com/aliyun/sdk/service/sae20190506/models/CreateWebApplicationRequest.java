// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link CreateWebApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateWebApplicationRequest</p>
 */
public class CreateWebApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateWebApplicationInput body;

    private CreateWebApplicationRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return body
     */
    public CreateWebApplicationInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateWebApplicationRequest, Builder> {
        private String namespaceId; 
        private CreateWebApplicationInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebApplicationRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.body = request.body;
        } 

        /**
         * <p>The namespace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The information about the application.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateWebApplicationInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateWebApplicationRequest build() {
            return new CreateWebApplicationRequest(this);
        } 

    } 

}
