// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntityRequest} extends {@link RequestModel}
 *
 * <p>EntityRequest</p>
 */
public class EntityRequest extends Request {
    @Path
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private EntityRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityRequest create() {
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

    public static final class Builder extends Request.Builder<EntityRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(EntityRequest response) {
            super(response);
            this.domain = response.domain;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putPathParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public EntityRequest build() {
            return new EntityRequest(this);
        } 

    } 

}
