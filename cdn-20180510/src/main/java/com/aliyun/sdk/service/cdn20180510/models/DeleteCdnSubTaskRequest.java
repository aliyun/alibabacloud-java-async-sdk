// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteCdnSubTaskRequest</p>
 */
public class DeleteCdnSubTaskRequest extends Request {
    private DeleteCdnSubTaskRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCdnSubTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DeleteCdnSubTaskRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DeleteCdnSubTaskRequest request) {
            super(request);
        } 

        @Override
        public DeleteCdnSubTaskRequest build() {
            return new DeleteCdnSubTaskRequest(this);
        } 

    } 

}
