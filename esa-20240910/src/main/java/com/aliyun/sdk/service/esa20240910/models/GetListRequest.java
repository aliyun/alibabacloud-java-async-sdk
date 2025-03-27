// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetListRequest} extends {@link RequestModel}
 *
 * <p>GetListRequest</p>
 */
public class GetListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private GetListRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetListRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetListRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the custom list, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850217.html">ListLists</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetListRequest build() {
            return new GetListRequest(this);
        } 

    } 

}
