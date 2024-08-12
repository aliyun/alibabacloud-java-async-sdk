// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateDeviceRequest} extends {@link RequestModel}
 *
 * <p>ActivateDeviceRequest</p>
 */
public class ActivateDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ActivateDeviceRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ActivateDeviceRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ActivateDeviceRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ActivateDeviceRequest build() {
            return new ActivateDeviceRequest(this);
        } 

    } 

}
