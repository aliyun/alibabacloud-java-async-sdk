// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpectDeductResourceRequest} extends {@link RequestModel}
 *
 * <p>ExpectDeductResourceRequest</p>
 */
public class ExpectDeductResourceRequest extends Request {
    @Body
    @NameInMap("body")
    private ExpectDeductResourceCmd body;

    private ExpectDeductResourceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpectDeductResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ExpectDeductResourceCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ExpectDeductResourceRequest, Builder> {
        private ExpectDeductResourceCmd body; 

        private Builder() {
            super();
        } 

        private Builder(ExpectDeductResourceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ExpectDeductResourceCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ExpectDeductResourceRequest build() {
            return new ExpectDeductResourceRequest(this);
        } 

    } 

}
