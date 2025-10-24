// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link ActiveInteractionCreateRequest} extends {@link RequestModel}
 *
 * <p>ActiveInteractionCreateRequest</p>
 */
public class ActiveInteractionCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image")
    @com.aliyun.core.annotation.Validation(required = true)
    private String image;

    private ActiveInteractionCreateRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveInteractionCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    public static final class Builder extends Request.Builder<ActiveInteractionCreateRequest, Builder> {
        private String image; 

        private Builder() {
            super();
        } 

        private Builder(ActiveInteractionCreateRequest request) {
            super(request);
            this.image = request.image;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_1.jpg">https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_1.jpg</a></p>
         */
        public Builder image(String image) {
            this.putBodyParameter("image", image);
            this.image = image;
            return this;
        }

        @Override
        public ActiveInteractionCreateRequest build() {
            return new ActiveInteractionCreateRequest(this);
        } 

    } 

}
