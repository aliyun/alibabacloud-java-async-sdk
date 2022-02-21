// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesRequest</p>
 */
public class TagResourcesRequest extends Request {
    private TagResourcesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(TagResourcesRequest response) {
            super(response);
        } 

        @Override
        public TagResourcesRequest build() {
            return new TagResourcesRequest(this);
        } 

    } 

}
