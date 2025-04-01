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
 * {@link CreateWebCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateWebCustomDomainRequest</p>
 */
public class CreateWebCustomDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateWebCustomDomainInput body;

    private CreateWebCustomDomainRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebCustomDomainRequest create() {
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
    public CreateWebCustomDomainInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateWebCustomDomainRequest, Builder> {
        private String namespaceId; 
        private CreateWebCustomDomainInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebCustomDomainRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.body = request.body;
        } 

        /**
         * <p>The namespace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The information about custom domain name.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateWebCustomDomainInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateWebCustomDomainRequest build() {
            return new CreateWebCustomDomainRequest(this);
        } 

    } 

}
