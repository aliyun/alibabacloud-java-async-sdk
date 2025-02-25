// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCurrentItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateCurrentItemRequest</p>
 */
public class UpdateCurrentItemRequest extends Request {
    @Query
    @NameInMap("ItemId")
    @Validation(required = true)
    private String itemId;

    private UpdateCurrentItemRequest(Builder builder) {
        super(builder);
        this.itemId = builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCurrentItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    public static final class Builder extends Request.Builder<UpdateCurrentItemRequest, Builder> {
        private String itemId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCurrentItemRequest request) {
            super(request);
            this.itemId = request.itemId;
        } 

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        @Override
        public UpdateCurrentItemRequest build() {
            return new UpdateCurrentItemRequest(this);
        } 

    } 

}
