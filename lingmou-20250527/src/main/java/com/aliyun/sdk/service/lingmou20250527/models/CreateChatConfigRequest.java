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
 * {@link CreateChatConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateChatConfigRequest</p>
 */
public class CreateChatConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("avatarId")
    private String avatarId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("backgroundId")
    private String backgroundId;

    private CreateChatConfigRequest(Builder builder) {
        super(builder);
        this.avatarId = builder.avatarId;
        this.backgroundId = builder.backgroundId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatConfigRequest create() {
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
     * @return backgroundId
     */
    public String getBackgroundId() {
        return this.backgroundId;
    }

    public static final class Builder extends Request.Builder<CreateChatConfigRequest, Builder> {
        private String avatarId; 
        private String backgroundId; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatConfigRequest request) {
            super(request);
            this.avatarId = request.avatarId;
            this.backgroundId = request.backgroundId;
        } 

        /**
         * avatarId.
         */
        public Builder avatarId(String avatarId) {
            this.putQueryParameter("avatarId", avatarId);
            this.avatarId = avatarId;
            return this;
        }

        /**
         * backgroundId.
         */
        public Builder backgroundId(String backgroundId) {
            this.putQueryParameter("backgroundId", backgroundId);
            this.backgroundId = backgroundId;
            return this;
        }

        @Override
        public CreateChatConfigRequest build() {
            return new CreateChatConfigRequest(this);
        } 

    } 

}
