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
 * {@link CreateVolumeRequest} extends {@link RequestModel}
 *
 * <p>CreateVolumeRequest</p>
 */
public class CreateVolumeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateVolumeInput body;

    private CreateVolumeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVolumeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateVolumeInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateVolumeRequest, Builder> {
        private CreateVolumeInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateVolumeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CreateVolumeInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateVolumeRequest build() {
            return new CreateVolumeRequest(this);
        } 

    } 

}
