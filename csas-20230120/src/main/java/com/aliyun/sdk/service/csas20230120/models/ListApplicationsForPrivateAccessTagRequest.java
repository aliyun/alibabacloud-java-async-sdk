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
 * {@link ListApplicationsForPrivateAccessTagRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsForPrivateAccessTagRequest</p>
 */
public class ListApplicationsForPrivateAccessTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tagIds;

    private ListApplicationsForPrivateAccessTagRequest(Builder builder) {
        super(builder);
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForPrivateAccessTagRequest create() {
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

    public static final class Builder extends Request.Builder<ListApplicationsForPrivateAccessTagRequest, Builder> {
        private java.util.List<String> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsForPrivateAccessTagRequest request) {
            super(request);
            this.tagIds = request.tagIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putQueryParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public ListApplicationsForPrivateAccessTagRequest build() {
            return new ListApplicationsForPrivateAccessTagRequest(this);
        } 

    } 

}
