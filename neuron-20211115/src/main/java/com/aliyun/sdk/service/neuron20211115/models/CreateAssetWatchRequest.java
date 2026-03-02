// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CreateAssetWatchRequest} extends {@link RequestModel}
 *
 * <p>CreateAssetWatchRequest</p>
 */
public class CreateAssetWatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateAssetWatchCmd body;

    private CreateAssetWatchRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssetWatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateAssetWatchCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAssetWatchRequest, Builder> {
        private CreateAssetWatchCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAssetWatchRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CreateAssetWatchCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateAssetWatchRequest build() {
            return new CreateAssetWatchRequest(this);
        } 

    } 

}
