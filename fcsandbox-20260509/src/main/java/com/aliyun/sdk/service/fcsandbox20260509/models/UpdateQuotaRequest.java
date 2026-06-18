// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link UpdateQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaRequest</p>
 */
public class UpdateQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Quota body;

    private UpdateQuotaRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Quota getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateQuotaRequest, Builder> {
        private Quota body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Quota body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateQuotaRequest build() {
            return new UpdateQuotaRequest(this);
        } 

    } 

}
