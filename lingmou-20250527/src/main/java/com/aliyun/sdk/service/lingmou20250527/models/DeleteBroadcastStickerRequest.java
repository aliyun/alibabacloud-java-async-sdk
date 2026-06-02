// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteBroadcastStickerRequest} extends {@link RequestModel}
 *
 * <p>DeleteBroadcastStickerRequest</p>
 */
public class DeleteBroadcastStickerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stickerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stickerId;

    private DeleteBroadcastStickerRequest(Builder builder) {
        super(builder);
        this.stickerId = builder.stickerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBroadcastStickerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stickerId
     */
    public String getStickerId() {
        return this.stickerId;
    }

    public static final class Builder extends Request.Builder<DeleteBroadcastStickerRequest, Builder> {
        private String stickerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBroadcastStickerRequest request) {
            super(request);
            this.stickerId = request.stickerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>M1lhKArheOyYdeYybDFqS1-Q</p>
         */
        public Builder stickerId(String stickerId) {
            this.putPathParameter("stickerId", stickerId);
            this.stickerId = stickerId;
            return this;
        }

        @Override
        public DeleteBroadcastStickerRequest build() {
            return new DeleteBroadcastStickerRequest(this);
        } 

    } 

}
