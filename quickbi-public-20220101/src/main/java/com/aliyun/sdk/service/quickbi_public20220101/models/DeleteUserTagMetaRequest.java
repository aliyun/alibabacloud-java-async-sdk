// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserTagMetaRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserTagMetaRequest</p>
 */
public class DeleteUserTagMetaRequest extends Request {
    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private String tagId;

    private DeleteUserTagMetaRequest(Builder builder) {
        super(builder);
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserTagMetaRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteUserTagMetaRequest, Builder> {
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserTagMetaRequest request) {
            super(request);
            this.tagId = request.tagId;
        } 

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public DeleteUserTagMetaRequest build() {
            return new DeleteUserTagMetaRequest(this);
        } 

    } 

}
