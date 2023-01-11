// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsvGetAppIdRequest} extends {@link RequestModel}
 *
 * <p>IsvGetAppIdRequest</p>
 */
public class IsvGetAppIdRequest extends Request {
    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private IsvGetAppIdRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsvGetAppIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<IsvGetAppIdRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(IsvGetAppIdRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * app类型，取值：WHATSAPP
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public IsvGetAppIdRequest build() {
            return new IsvGetAppIdRequest(this);
        } 

    } 

}
