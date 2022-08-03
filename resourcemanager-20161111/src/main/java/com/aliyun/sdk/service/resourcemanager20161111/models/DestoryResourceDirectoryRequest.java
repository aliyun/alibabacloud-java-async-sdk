// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DestoryResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>DestoryResourceDirectoryRequest</p>
 */
public class DestoryResourceDirectoryRequest extends Request {
    private DestoryResourceDirectoryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DestoryResourceDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DestoryResourceDirectoryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DestoryResourceDirectoryRequest request) {
            super(request);
        } 

        @Override
        public DestoryResourceDirectoryRequest build() {
            return new DestoryResourceDirectoryRequest(this);
        } 

    } 

}
