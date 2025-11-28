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
 * {@link ConfirmTrainPicAvatarRequest} extends {@link RequestModel}
 *
 * <p>ConfirmTrainPicAvatarRequest</p>
 */
public class ConfirmTrainPicAvatarRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("avatarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String avatarId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private ConfirmTrainPicAvatarRequest(Builder builder) {
        super(builder);
        this.avatarId = builder.avatarId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmTrainPicAvatarRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatarId
     */
    public String getAvatarId() {
        return this.avatarId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ConfirmTrainPicAvatarRequest, Builder> {
        private String avatarId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmTrainPicAvatarRequest request) {
            super(request);
            this.avatarId = request.avatarId;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>M1_eTNYgO5lOys5g7ObvC_nw</p>
         */
        public Builder avatarId(String avatarId) {
            this.putQueryParameter("avatarId", avatarId);
            this.avatarId = avatarId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER_CONFIRMED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ConfirmTrainPicAvatarRequest build() {
            return new ConfirmTrainPicAvatarRequest(this);
        } 

    } 

}
