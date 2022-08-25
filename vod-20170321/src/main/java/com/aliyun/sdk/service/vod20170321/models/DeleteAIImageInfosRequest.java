// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAIImageInfosRequest} extends {@link RequestModel}
 *
 * <p>DeleteAIImageInfosRequest</p>
 */
public class DeleteAIImageInfosRequest extends Request {
    @Query
    @NameInMap("AIImageInfoIds")
    @Validation(required = true)
    private String AIImageInfoIds;

    private DeleteAIImageInfosRequest(Builder builder) {
        super(builder);
        this.AIImageInfoIds = builder.AIImageInfoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIImageInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIImageInfoIds
     */
    public String getAIImageInfoIds() {
        return this.AIImageInfoIds;
    }

    public static final class Builder extends Request.Builder<DeleteAIImageInfosRequest, Builder> {
        private String AIImageInfoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAIImageInfosRequest request) {
            super(request);
            this.AIImageInfoIds = request.AIImageInfoIds;
        } 

        /**
         * AIImageInfoIds.
         */
        public Builder AIImageInfoIds(String AIImageInfoIds) {
            this.putQueryParameter("AIImageInfoIds", AIImageInfoIds);
            this.AIImageInfoIds = AIImageInfoIds;
            return this;
        }

        @Override
        public DeleteAIImageInfosRequest build() {
            return new DeleteAIImageInfosRequest(this);
        } 

    } 

}
