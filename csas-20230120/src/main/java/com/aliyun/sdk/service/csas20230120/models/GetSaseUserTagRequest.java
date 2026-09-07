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
 * {@link GetSaseUserTagRequest} extends {@link RequestModel}
 *
 * <p>GetSaseUserTagRequest</p>
 */
public class GetSaseUserTagRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    private GetSaseUserTagRequest(Builder builder) {
        super(builder);
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSaseUserTagRequest create() {
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

    public static final class Builder extends Request.Builder<GetSaseUserTagRequest, Builder> {
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(GetSaseUserTagRequest request) {
            super(request);
            this.tagId = request.tagId;
        } 

        /**
         * <p>The user tag ID. You can obtain this value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListSaseUserTags~~">ListSaseUserTags</a>: Lists user tags.</li>
         * <li><a href="~~CreateSaseUserTag~~">CreateSaseUserTag</a>: Creates a user tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>su-tag-1ae52f66039fa0d4****</p>
         */
        public Builder tagId(String tagId) {
            this.putBodyParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public GetSaseUserTagRequest build() {
            return new GetSaseUserTagRequest(this);
        } 

    } 

}
