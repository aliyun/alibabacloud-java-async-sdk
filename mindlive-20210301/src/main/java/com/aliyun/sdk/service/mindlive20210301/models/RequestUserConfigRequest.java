// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestUserConfigRequest} extends {@link RequestModel}
 *
 * <p>RequestUserConfigRequest</p>
 */
public class RequestUserConfigRequest extends Request {
    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    private RequestUserConfigRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestUserConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<RequestUserConfigRequest, Builder> {
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(RequestUserConfigRequest request) {
            super(request);
            this.key = request.key;
        } 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public RequestUserConfigRequest build() {
            return new RequestUserConfigRequest(this);
        } 

    } 

}
