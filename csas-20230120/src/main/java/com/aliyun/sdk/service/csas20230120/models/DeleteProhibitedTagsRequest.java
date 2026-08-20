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
 * {@link DeleteProhibitedTagsRequest} extends {@link RequestModel}
 *
 * <p>DeleteProhibitedTagsRequest</p>
 */
public class DeleteProhibitedTagsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tagIds;

    private DeleteProhibitedTagsRequest(Builder builder) {
        super(builder);
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProhibitedTagsRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProhibitedTagsRequest, Builder> {
        private java.util.List<String> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProhibitedTagsRequest request) {
            super(request);
            this.tagIds = request.tagIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public DeleteProhibitedTagsRequest build() {
            return new DeleteProhibitedTagsRequest(this);
        } 

    } 

}
