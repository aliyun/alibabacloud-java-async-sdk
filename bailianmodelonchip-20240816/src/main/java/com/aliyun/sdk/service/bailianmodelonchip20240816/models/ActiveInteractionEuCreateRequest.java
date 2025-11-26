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
 * {@link ActiveInteractionEuCreateRequest} extends {@link RequestModel}
 *
 * <p>ActiveInteractionEuCreateRequest</p>
 */
public class ActiveInteractionEuCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image")
    @com.aliyun.core.annotation.Validation(required = true)
    private String image;

    private ActiveInteractionEuCreateRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveInteractionEuCreateRequest create() {
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

    public static final class Builder extends Request.Builder<ActiveInteractionEuCreateRequest, Builder> {
        private String image; 

        private Builder() {
            super();
        } 

        private Builder(ActiveInteractionEuCreateRequest request) {
            super(request);
            this.image = request.image;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_12.jpg">https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_12.jpg</a></p>
         */
        public Builder image(String image) {
            this.putBodyParameter("image", image);
            this.image = image;
            return this;
        }

        @Override
        public ActiveInteractionEuCreateRequest build() {
            return new ActiveInteractionEuCreateRequest(this);
        } 

    } 

}
