// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpectDeductResourcesRequest} extends {@link RequestModel}
 *
 * <p>ExpectDeductResourcesRequest</p>
 */
public class ExpectDeductResourcesRequest extends Request {
    @Body
    @NameInMap("body")
    private ExpectDeductResourceCmd body;

    private ExpectDeductResourcesRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpectDeductResourcesRequest create() {
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

    public static final class Builder extends Request.Builder<ExpectDeductResourcesRequest, Builder> {
        private ExpectDeductResourceCmd body; 

        private Builder() {
            super();
        } 

        private Builder(ExpectDeductResourcesRequest request) {
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
        public ExpectDeductResourcesRequest build() {
            return new ExpectDeductResourcesRequest(this);
        } 

    } 

}
