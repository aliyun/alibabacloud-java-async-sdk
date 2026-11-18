// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link UpdateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomDomainRequest</p>
 */
public class UpdateCustomDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateCustomDomainInput body;

    private UpdateCustomDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomDomainRequest create() {
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
     * @return body
     */
    public UpdateCustomDomainInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateCustomDomainRequest, Builder> {
        private String domainName; 
        private UpdateCustomDomainInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.body = request.body;
        } 

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.com</p>
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The parameters for updating the domain name.</p>
         */
        public Builder body(UpdateCustomDomainInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomDomainRequest build() {
            return new UpdateCustomDomainRequest(this);
        } 

    } 

}
