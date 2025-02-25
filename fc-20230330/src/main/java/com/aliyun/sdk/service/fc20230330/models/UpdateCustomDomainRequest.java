// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo.bar.com</p>
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The information about the custom domain name.</p>
         * <p>This parameter is required.</p>
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
