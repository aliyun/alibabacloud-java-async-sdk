// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link DeleteFilterRequest} extends {@link RequestModel}
 *
 * <p>DeleteFilterRequest</p>
 */
public class DeleteFilterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterName;

    private DeleteFilterRequest(Builder builder) {
        super(builder);
        this.filterName = builder.filterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterName
     */
    public String getFilterName() {
        return this.filterName;
    }

    public static final class Builder extends Request.Builder<DeleteFilterRequest, Builder> {
        private String filterName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFilterRequest request) {
            super(request);
            this.filterName = request.filterName;
        } 

        /**
         * <p>The name of the filter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder filterName(String filterName) {
            this.putQueryParameter("FilterName", filterName);
            this.filterName = filterName;
            return this;
        }

        @Override
        public DeleteFilterRequest build() {
            return new DeleteFilterRequest(this);
        } 

    } 

}
