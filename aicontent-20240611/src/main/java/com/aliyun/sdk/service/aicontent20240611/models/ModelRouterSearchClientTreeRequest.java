// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterSearchClientTreeRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterSearchClientTreeRequest</p>
 */
public class ModelRouterSearchClientTreeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    private ModelRouterSearchClientTreeRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterSearchClientTreeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    public static final class Builder extends Request.Builder<ModelRouterSearchClientTreeRequest, Builder> {
        private String keyword; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterSearchClientTreeRequest request) {
            super(request);
            this.keyword = request.keyword;
        } 

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        @Override
        public ModelRouterSearchClientTreeRequest build() {
            return new ModelRouterSearchClientTreeRequest(this);
        } 

    } 

}
