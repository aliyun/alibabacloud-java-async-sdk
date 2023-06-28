// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourceRequest} extends {@link RequestModel}
 *
 * <p>TagResourceRequest</p>
 */
public class TagResourceRequest extends Request {
    @Body
    @NameInMap("request")
    @Validation(required = true)
    private TagResourceInput request;

    private TagResourceRequest(Builder builder) {
        super(builder);
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return request
     */
    public TagResourceInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<TagResourceRequest, Builder> {
        private TagResourceInput request; 

        private Builder() {
            super();
        } 

        private Builder(TagResourceRequest request) {
            super(request);
            this.request = request.request;
        } 

        /**
         * request.
         */
        public Builder request(TagResourceInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public TagResourceRequest build() {
            return new TagResourceRequest(this);
        } 

    } 

}
