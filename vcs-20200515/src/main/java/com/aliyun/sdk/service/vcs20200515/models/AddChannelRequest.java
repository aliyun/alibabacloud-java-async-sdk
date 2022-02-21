// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddChannelRequest} extends {@link RequestModel}
 *
 * <p>AddChannelRequest</p>
 */
public class AddChannelRequest extends Request {
    @Body
    @NameInMap("ParentDeviceGbId")
    private String parentDeviceGbId;

    private AddChannelRequest(Builder builder) {
        super(builder);
        this.parentDeviceGbId = builder.parentDeviceGbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentDeviceGbId
     */
    public String getParentDeviceGbId() {
        return this.parentDeviceGbId;
    }

    public static final class Builder extends Request.Builder<AddChannelRequest, Builder> {
        private String parentDeviceGbId; 

        private Builder() {
            super();
        } 

        private Builder(AddChannelRequest response) {
            super(response);
            this.parentDeviceGbId = response.parentDeviceGbId;
        } 

        /**
         * ParentDeviceGbId.
         */
        public Builder parentDeviceGbId(String parentDeviceGbId) {
            this.putBodyParameter("ParentDeviceGbId", parentDeviceGbId);
            this.parentDeviceGbId = parentDeviceGbId;
            return this;
        }

        @Override
        public AddChannelRequest build() {
            return new AddChannelRequest(this);
        } 

    } 

}
