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
    @NameInMap("body")
    @Validation(required = true)
    private TagResourceInput body;

    private TagResourceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
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
     * @return body
     */
    public TagResourceInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<TagResourceRequest, Builder> {
        private TagResourceInput body; 

        private Builder() {
            super();
        } 

        private Builder(TagResourceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * The configuration of the resource tag.
         */
        public Builder body(TagResourceInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public TagResourceRequest build() {
            return new TagResourceRequest(this);
        } 

    } 

}
