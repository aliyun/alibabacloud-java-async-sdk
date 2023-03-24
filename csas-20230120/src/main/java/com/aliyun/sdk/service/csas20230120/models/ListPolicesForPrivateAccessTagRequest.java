// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForPrivateAccessTagRequest} extends {@link RequestModel}
 *
 * <p>ListPolicesForPrivateAccessTagRequest</p>
 */
public class ListPolicesForPrivateAccessTagRequest extends Request {
    @Query
    @NameInMap("TagIds")
    @Validation(required = true)
    private java.util.List < String > tagIds;

    private ListPolicesForPrivateAccessTagRequest(Builder builder) {
        super(builder);
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicesForPrivateAccessTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagIds
     */
    public java.util.List < String > getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<ListPolicesForPrivateAccessTagRequest, Builder> {
        private java.util.List < String > tagIds; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicesForPrivateAccessTagRequest request) {
            super(request);
            this.tagIds = request.tagIds;
        } 

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List < String > tagIds) {
            String tagIdsShrink = shrink(tagIds, "TagIds", "json");
            this.putQueryParameter("TagIds", tagIdsShrink);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public ListPolicesForPrivateAccessTagRequest build() {
            return new ListPolicesForPrivateAccessTagRequest(this);
        } 

    } 

}
