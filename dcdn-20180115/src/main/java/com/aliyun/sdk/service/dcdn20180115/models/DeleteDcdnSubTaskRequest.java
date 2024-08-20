// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnSubTaskRequest</p>
 */
public class DeleteDcdnSubTaskRequest extends Request {
    private DeleteDcdnSubTaskRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnSubTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DeleteDcdnSubTaskRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnSubTaskRequest request) {
            super(request);
        } 

        @Override
        public DeleteDcdnSubTaskRequest build() {
            return new DeleteDcdnSubTaskRequest(this);
        } 

    } 

}
