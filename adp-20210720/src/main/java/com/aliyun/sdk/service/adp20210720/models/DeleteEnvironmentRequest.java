// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentRequest</p>
 */
public class DeleteEnvironmentRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    private DeleteEnvironmentRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentRequest, Builder> {
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentRequest request) {
            super(request);
            this.uid = request.uid;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DeleteEnvironmentRequest build() {
            return new DeleteEnvironmentRequest(this);
        } 

    } 

}
