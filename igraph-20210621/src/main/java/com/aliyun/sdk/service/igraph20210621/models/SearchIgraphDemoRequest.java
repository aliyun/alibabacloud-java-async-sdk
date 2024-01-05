// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchIgraphDemoRequest} extends {@link RequestModel}
 *
 * <p>SearchIgraphDemoRequest</p>
 */
public class SearchIgraphDemoRequest extends Request {
    private SearchIgraphDemoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchIgraphDemoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<SearchIgraphDemoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(SearchIgraphDemoRequest request) {
            super(request);
        } 

        @Override
        public SearchIgraphDemoRequest build() {
            return new SearchIgraphDemoRequest(this);
        } 

    } 

}
