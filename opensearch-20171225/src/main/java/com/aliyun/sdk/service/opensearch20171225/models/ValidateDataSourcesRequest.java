// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ValidateDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ValidateDataSourcesRequest</p>
 */
public class ValidateDataSourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private DataSource body;

    private ValidateDataSourcesRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateDataSourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DataSource getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ValidateDataSourcesRequest, Builder> {
        private DataSource body; 

        private Builder() {
            super();
        } 

        private Builder(ValidateDataSourcesRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The request parameter. For more information, see <a href="https://help.aliyun.com/document_detail/170005.html">DataSource</a>.</p>
         */
        public Builder body(DataSource body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ValidateDataSourcesRequest build() {
            return new ValidateDataSourcesRequest(this);
        } 

    } 

}
