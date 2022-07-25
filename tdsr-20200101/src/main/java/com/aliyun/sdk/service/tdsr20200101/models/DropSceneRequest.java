// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DropSceneRequest} extends {@link RequestModel}
 *
 * <p>DropSceneRequest</p>
 */
public class DropSceneRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DropSceneRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DropSceneRequest create() {
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

    public static final class Builder extends Request.Builder<DropSceneRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DropSceneRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 主场景id
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DropSceneRequest build() {
            return new DropSceneRequest(this);
        } 

    } 

}
