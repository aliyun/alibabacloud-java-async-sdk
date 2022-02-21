// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPictureSearchAppRequest} extends {@link RequestModel}
 *
 * <p>QueryPictureSearchAppRequest</p>
 */
public class QueryPictureSearchAppRequest extends Request {
    private QueryPictureSearchAppRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPictureSearchAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryPictureSearchAppRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryPictureSearchAppRequest response) {
            super(response);
        } 

        @Override
        public QueryPictureSearchAppRequest build() {
            return new QueryPictureSearchAppRequest(this);
        } 

    } 

}
