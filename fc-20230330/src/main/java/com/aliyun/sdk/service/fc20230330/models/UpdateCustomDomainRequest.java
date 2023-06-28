// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomDomainRequest</p>
 */
public class UpdateCustomDomainRequest extends Request {
    @Path
    @NameInMap("domainName")
    @Validation(required = true)
    private String domainName;

    @Body
    @NameInMap("request")
    @Validation(required = true)
    private UpdateCustomDomainInput request;

    private UpdateCustomDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.request = builder.request;
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
     * @return request
     */
    public UpdateCustomDomainInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<UpdateCustomDomainRequest, Builder> {
        private String domainName; 
        private UpdateCustomDomainInput request; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.request = request.request;
        } 

        /**
         * domainName.
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * request.
         */
        public Builder request(UpdateCustomDomainInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public UpdateCustomDomainRequest build() {
            return new UpdateCustomDomainRequest(this);
        } 

    } 

}
