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
 * {@link UpdateWebCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebCustomDomainRequest</p>
 */
public class UpdateWebCustomDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateWebCustomDomainInput body;

    private UpdateWebCustomDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.namespaceId = builder.namespaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebCustomDomainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
    public UpdateWebCustomDomainInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateWebCustomDomainRequest, Builder> {
        private String domainName; 
        private String namespaceId; 
        private UpdateWebCustomDomainInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebCustomDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.namespaceId = request.namespaceId;
            this.body = request.body;
        } 

        /**
         * <p>The name of the custom domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.99zuowen.com">www.99zuowen.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
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
         * <p>The information about the custom domain name.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateWebCustomDomainInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateWebCustomDomainRequest build() {
            return new UpdateWebCustomDomainRequest(this);
        } 

    } 

}
