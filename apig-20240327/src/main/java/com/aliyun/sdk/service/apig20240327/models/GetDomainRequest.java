// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainRequest} extends {@link RequestModel}
 *
 * <p>GetDomainRequest</p>
 */
public class GetDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("domainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    private GetDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    public static final class Builder extends Request.Builder<GetDomainRequest, Builder> {
        private String domainId; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
        } 

        /**
         * domainId.
         */
        public Builder domainId(String domainId) {
            this.putPathParameter("domainId", domainId);
            this.domainId = domainId;
            return this;
        }

        @Override
        public GetDomainRequest build() {
            return new GetDomainRequest(this);
        } 

    } 

}
