// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailProjectRequest} extends {@link RequestModel}
 *
 * <p>DetailProjectRequest</p>
 */
public class DetailProjectRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DetailProjectRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DetailProjectRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DetailProjectRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 项目Id
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DetailProjectRequest build() {
            return new DetailProjectRequest(this);
        } 

    } 

}
