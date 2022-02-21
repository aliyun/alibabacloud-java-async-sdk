// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ASRequest} extends {@link RequestModel}
 *
 * <p>ASRequest</p>
 */
public class ASRequest extends Request {
    private ASRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ASRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ASRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ASRequest response) {
            super(response);
        } 

        @Override
        public ASRequest build() {
            return new ASRequest(this);
        } 

    } 

}
