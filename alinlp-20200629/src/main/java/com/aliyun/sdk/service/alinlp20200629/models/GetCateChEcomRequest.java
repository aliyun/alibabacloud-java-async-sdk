// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCateChEcomRequest} extends {@link RequestModel}
 *
 * <p>GetCateChEcomRequest</p>
 */
public class GetCateChEcomRequest extends Request {
    @Body
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("Text")
    @Validation(required = true, maxLength = 800)
    private String text;

    private GetCateChEcomRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCateChEcomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<GetCateChEcomRequest, Builder> {
        private String imageUrl; 
        private String serviceCode; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(GetCateChEcomRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.serviceCode = request.serviceCode;
            this.text = request.text;
        } 

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public GetCateChEcomRequest build() {
            return new GetCateChEcomRequest(this);
        } 

    } 

}
