// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RaiseDevicesStorageRequest} extends {@link RequestModel}
 *
 * <p>RaiseDevicesStorageRequest</p>
 */
public class RaiseDevicesStorageRequest extends Request {
    @Body
    @NameInMap("Json")
    @Validation(required = true)
    private String json;

    private RaiseDevicesStorageRequest(Builder builder) {
        super(builder);
        this.json = builder.json;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RaiseDevicesStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return json
     */
    public String getJson() {
        return this.json;
    }

    public static final class Builder extends Request.Builder<RaiseDevicesStorageRequest, Builder> {
        private String json; 

        private Builder() {
            super();
        } 

        private Builder(RaiseDevicesStorageRequest response) {
            super(response);
            this.json = response.json;
        } 

        /**
         * Json.
         */
        public Builder json(String json) {
            this.putBodyParameter("Json", json);
            this.json = json;
            return this;
        }

        @Override
        public RaiseDevicesStorageRequest build() {
            return new RaiseDevicesStorageRequest(this);
        } 

    } 

}
