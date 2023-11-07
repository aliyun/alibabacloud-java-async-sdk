// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrailRequest} extends {@link RequestModel}
 *
 * <p>DeleteTrailRequest</p>
 */
public class DeleteTrailRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
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
         * The name of the trail that you want to delete.
         * <p>
         * 
         * The name must be 6 to 36 characters in length. The name must start with a lowercase letter and can contain lowercase letters, digits, hyphens (-), and underscores (\_).
         * 
         * > The name must be unique within your Alibaba Cloud account.
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
