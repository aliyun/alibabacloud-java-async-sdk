// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListDockerhubImageRequest} extends {@link RequestModel}
 *
 * <p>ListDockerhubImageRequest</p>
 */
public class ListDockerhubImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    private ListDockerhubImageRequest(Builder builder) {
        super(builder);
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDockerhubImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<ListDockerhubImageRequest, Builder> {
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(ListDockerhubImageRequest request) {
            super(request);
            this.query = request.query;
        } 

        /**
         * <p>Image query condition, supports the format of <code>[namespace/]repoName[:version]</code>, where the conditions within <code>[]</code> are optional.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python:3.9</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public ListDockerhubImageRequest build() {
            return new ListDockerhubImageRequest(this);
        } 

    } 

}
