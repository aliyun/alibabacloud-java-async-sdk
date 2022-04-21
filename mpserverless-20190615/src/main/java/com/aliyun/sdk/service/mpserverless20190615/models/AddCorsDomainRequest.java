// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCorsDomainRequest} extends {@link RequestModel}
 *
 * <p>AddCorsDomainRequest</p>
 */
public class AddCorsDomainRequest extends Request {
    @Body
    @NameInMap("Domain")
    @Validation(required = true, maxLength = 253, minLength = 1)
    private String domain;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private AddCorsDomainRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCorsDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<AddCorsDomainRequest, Builder> {
        private String domain; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(AddCorsDomainRequest request) {
            super(request);
            this.domain = request.domain;
            this.spaceId = request.spaceId;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public AddCorsDomainRequest build() {
            return new AddCorsDomainRequest(this);
        } 

    } 

}
