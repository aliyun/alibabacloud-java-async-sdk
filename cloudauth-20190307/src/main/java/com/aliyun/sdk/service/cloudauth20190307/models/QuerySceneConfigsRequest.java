// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QuerySceneConfigsRequest} extends {@link RequestModel}
 *
 * <p>QuerySceneConfigsRequest</p>
 */
public class QuerySceneConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private QuerySceneConfigsRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySceneConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QuerySceneConfigsRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QuerySceneConfigsRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * <p>Scene type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VOLUNTARY</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public QuerySceneConfigsRequest build() {
            return new QuerySceneConfigsRequest(this);
        } 

    } 

}
