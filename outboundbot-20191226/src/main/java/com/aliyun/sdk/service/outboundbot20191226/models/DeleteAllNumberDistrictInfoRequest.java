// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DeleteAllNumberDistrictInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteAllNumberDistrictInfoRequest</p>
 */
public class DeleteAllNumberDistrictInfoRequest extends Request {
    private DeleteAllNumberDistrictInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAllNumberDistrictInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DeleteAllNumberDistrictInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DeleteAllNumberDistrictInfoRequest request) {
            super(request);
        } 

        @Override
        public DeleteAllNumberDistrictInfoRequest build() {
            return new DeleteAllNumberDistrictInfoRequest(this);
        } 

    } 

}
