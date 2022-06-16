// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceStatusNotifyRequest} extends {@link RequestModel}
 *
 * <p>ResourceStatusNotifyRequest</p>
 */
public class ResourceStatusNotifyRequest extends Request {
    @Body
    @NameInMap("data")
    @Validation(required = true)
    private String data;

    private ResourceStatusNotifyRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceStatusNotifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<ResourceStatusNotifyRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(ResourceStatusNotifyRequest request) {
            super(request);
            this.data = request.data;
        } 

        /**
         * data.
         */
        public Builder data(String data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        @Override
        public ResourceStatusNotifyRequest build() {
            return new ResourceStatusNotifyRequest(this);
        } 

    } 

}
