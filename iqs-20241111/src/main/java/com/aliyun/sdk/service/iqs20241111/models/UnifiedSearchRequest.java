// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link UnifiedSearchRequest} extends {@link RequestModel}
 *
 * <p>UnifiedSearchRequest</p>
 */
public class UnifiedSearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UnifiedSearchInput body;

    private UnifiedSearchRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public UnifiedSearchInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UnifiedSearchRequest, Builder> {
        private UnifiedSearchInput body; 

        private Builder() {
            super();
        } 

        private Builder(UnifiedSearchRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(UnifiedSearchInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UnifiedSearchRequest build() {
            return new UnifiedSearchRequest(this);
        } 

    } 

}
