// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDigitalVideoRequest} extends {@link RequestModel}
 *
 * <p>SyncDigitalVideoRequest</p>
 */
public class SyncDigitalVideoRequest extends Request {
    @Body
    @NameInMap("body")
    private SyncDigitalHumanVideoCmd body;

    private SyncDigitalVideoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDigitalVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SyncDigitalHumanVideoCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SyncDigitalVideoRequest, Builder> {
        private SyncDigitalHumanVideoCmd body; 

        private Builder() {
            super();
        } 

        private Builder(SyncDigitalVideoRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(SyncDigitalHumanVideoCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public SyncDigitalVideoRequest build() {
            return new SyncDigitalVideoRequest(this);
        } 

    } 

}
