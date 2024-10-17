// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAvatarRequest} extends {@link RequestModel}
 *
 * <p>GetAvatarRequest</p>
 */
public class GetAvatarRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String avatarId;

    private GetAvatarRequest(Builder builder) {
        super(builder);
        this.avatarId = builder.avatarId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvatarRequest create() {
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

    public static final class Builder extends Request.Builder<GetAvatarRequest, Builder> {
        private String avatarId; 

        private Builder() {
            super();
        } 

        private Builder(GetAvatarRequest request) {
            super(request);
            this.avatarId = request.avatarId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Avatar-XXXX</p>
         */
        public Builder avatarId(String avatarId) {
            this.putQueryParameter("AvatarId", avatarId);
            this.avatarId = avatarId;
            return this;
        }

        @Override
        public GetAvatarRequest build() {
            return new GetAvatarRequest(this);
        } 

    } 

}
