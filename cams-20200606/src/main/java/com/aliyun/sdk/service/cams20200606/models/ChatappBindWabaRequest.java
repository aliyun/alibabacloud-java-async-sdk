// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappBindWabaRequest} extends {@link RequestModel}
 *
 * <p>ChatappBindWabaRequest</p>
 */
public class ChatappBindWabaRequest extends Request {
    @Body
    @NameInMap("WabaId")
    @Validation(required = true)
    private String wabaId;

    private ChatappBindWabaRequest(Builder builder) {
        super(builder);
        this.wabaId = builder.wabaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappBindWabaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return wabaId
     */
    public String getWabaId() {
        return this.wabaId;
    }

    public static final class Builder extends Request.Builder<ChatappBindWabaRequest, Builder> {
        private String wabaId; 

        private Builder() {
            super();
        } 

        private Builder(ChatappBindWabaRequest request) {
            super(request);
            this.wabaId = request.wabaId;
        } 

        /**
         * WabaId
         */
        public Builder wabaId(String wabaId) {
            this.putBodyParameter("WabaId", wabaId);
            this.wabaId = wabaId;
            return this;
        }

        @Override
        public ChatappBindWabaRequest build() {
            return new ChatappBindWabaRequest(this);
        } 

    } 

}
