// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeleteSaseUserTagRequest} extends {@link RequestModel}
 *
 * <p>DeleteSaseUserTagRequest</p>
 */
public class DeleteSaseUserTagRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    private DeleteSaseUserTagRequest(Builder builder) {
        super(builder);
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSaseUserTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagIds
     */
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<DeleteSaseUserTagRequest, Builder> {
        private java.util.List<String> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSaseUserTagRequest request) {
            super(request);
            this.tagIds = request.tagIds;
        } 

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public DeleteSaseUserTagRequest build() {
            return new DeleteSaseUserTagRequest(this);
        } 

    } 

}
