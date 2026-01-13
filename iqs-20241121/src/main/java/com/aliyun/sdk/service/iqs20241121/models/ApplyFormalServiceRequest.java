// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ApplyFormalServiceRequest} extends {@link RequestModel}
 *
 * <p>ApplyFormalServiceRequest</p>
 */
public class ApplyFormalServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ApplyFormalServiceCmd body;

    private ApplyFormalServiceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyFormalServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ApplyFormalServiceCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ApplyFormalServiceRequest, Builder> {
        private ApplyFormalServiceCmd body; 

        private Builder() {
            super();
        } 

        private Builder(ApplyFormalServiceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ApplyFormalServiceCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ApplyFormalServiceRequest build() {
            return new ApplyFormalServiceRequest(this);
        } 

    } 

}
