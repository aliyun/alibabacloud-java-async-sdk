// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackSubSceneRequest} extends {@link RequestModel}
 *
 * <p>RollbackSubSceneRequest</p>
 */
public class RollbackSubSceneRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private RollbackSubSceneRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackSubSceneRequest create() {
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

    public static final class Builder extends Request.Builder<RollbackSubSceneRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(RollbackSubSceneRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 子场景ID
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public RollbackSubSceneRequest build() {
            return new RollbackSubSceneRequest(this);
        } 

    } 

}
