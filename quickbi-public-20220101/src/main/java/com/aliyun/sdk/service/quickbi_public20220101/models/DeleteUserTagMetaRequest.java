// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link DeleteUserTagMetaRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserTagMetaRequest</p>
 */
public class DeleteUserTagMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the tag to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pop_001</p>
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
