// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link DeleteTagOptionRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagOptionRequest</p>
 */
public class DeleteTagOptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagOptionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagOptionId;

    private DeleteTagOptionRequest(Builder builder) {
        super(builder);
        this.tagOptionId = builder.tagOptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagOptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagOptionId
     */
    public String getTagOptionId() {
        return this.tagOptionId;
    }

    public static final class Builder extends Request.Builder<DeleteTagOptionRequest, Builder> {
        private String tagOptionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTagOptionRequest request) {
            super(request);
            this.tagOptionId = request.tagOptionId;
        } 

        /**
         * <p>The ID of the tag option.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-bp1u6mdf3d****</p>
         */
        public Builder tagOptionId(String tagOptionId) {
            this.putBodyParameter("TagOptionId", tagOptionId);
            this.tagOptionId = tagOptionId;
            return this;
        }

        @Override
        public DeleteTagOptionRequest build() {
            return new DeleteTagOptionRequest(this);
        } 

    } 

}
