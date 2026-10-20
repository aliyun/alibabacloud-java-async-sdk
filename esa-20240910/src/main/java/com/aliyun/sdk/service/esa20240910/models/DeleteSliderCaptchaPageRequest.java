// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DeleteSliderCaptchaPageRequest} extends {@link RequestModel}
 *
 * <p>DeleteSliderCaptchaPageRequest</p>
 */
public class DeleteSliderCaptchaPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteSliderCaptchaPageRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSliderCaptchaPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteSliderCaptchaPageRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSliderCaptchaPageRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the custom slider CAPTCHA page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteSliderCaptchaPageRequest build() {
            return new DeleteSliderCaptchaPageRequest(this);
        } 

    } 

}
