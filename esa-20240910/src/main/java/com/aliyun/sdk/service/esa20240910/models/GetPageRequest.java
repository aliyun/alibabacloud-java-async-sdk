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
 * {@link GetPageRequest} extends {@link RequestModel}
 *
 * <p>GetPageRequest</p>
 */
public class GetPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private GetPageRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPageRequest create() {
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

    public static final class Builder extends Request.Builder<GetPageRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetPageRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the custom error page, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850223.html">ListPages</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetPageRequest build() {
            return new GetPageRequest(this);
        } 

    } 

}
