// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DeleteTrailRequest} extends {@link RequestModel}
 *
 * <p>DeleteTrailRequest</p>
 */
public class DeleteTrailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteTrailRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteTrailRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrailRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>The name of the trail that you want to delete.</p>
         * <p>The name must be 6 to 36 characters in length. The name must start with a lowercase letter and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
         * <blockquote>
         * <p>The name must be unique within your Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteTrailRequest build() {
            return new DeleteTrailRequest(this);
        } 

    } 

}
