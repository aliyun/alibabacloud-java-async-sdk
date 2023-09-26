// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DimGroupRequest} extends {@link RequestModel}
 *
 * <p>DimGroupRequest</p>
 */
public class DimGroupRequest extends Request {
    private DimGroupRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DimGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DimGroupRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DimGroupRequest request) {
            super(request);
        } 

        @Override
        public DimGroupRequest build() {
            return new DimGroupRequest(this);
        } 

    } 

}
