// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobRequest</p>
 */
public class DeleteJobRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    private DeleteJobRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<DeleteJobRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * The ID of the job template that you want to delete.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DeleteJobRequest build() {
            return new DeleteJobRequest(this);
        } 

    } 

}
