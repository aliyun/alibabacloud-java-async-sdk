// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrivateAccessTagRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivateAccessTagRequest</p>
 */
public class DeletePrivateAccessTagRequest extends Request {
    @Body
    @NameInMap("TagId")
    @Validation(required = true)
    private String tagId;

    private DeletePrivateAccessTagRequest(Builder builder) {
        super(builder);
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrivateAccessTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<DeletePrivateAccessTagRequest, Builder> {
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrivateAccessTagRequest request) {
            super(request);
            this.tagId = request.tagId;
        } 

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putBodyParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public DeletePrivateAccessTagRequest build() {
            return new DeletePrivateAccessTagRequest(this);
        } 

    } 

}
