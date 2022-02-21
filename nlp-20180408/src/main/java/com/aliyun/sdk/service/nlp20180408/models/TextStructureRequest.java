// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextStructureRequest} extends {@link RequestModel}
 *
 * <p>TextStructureRequest</p>
 */
public class TextStructureRequest extends Request {
    @Path
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private TextStructureRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextStructureRequest create() {
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

    public static final class Builder extends Request.Builder<TextStructureRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(TextStructureRequest response) {
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
        public TextStructureRequest build() {
            return new TextStructureRequest(this);
        } 

    } 

}
