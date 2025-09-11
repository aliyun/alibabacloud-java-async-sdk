// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link AddDataSourceRequest} extends {@link RequestModel}
 *
 * <p>AddDataSourceRequest</p>
 */
public class AddDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addModel;

    private AddDataSourceRequest(Builder builder) {
        super(builder);
        this.addModel = builder.addModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addModel
     */
    public String getAddModel() {
        return this.addModel;
    }

    public static final class Builder extends Request.Builder<AddDataSourceRequest, Builder> {
        private String addModel; 

        private Builder() {
            super();
        } 

        private Builder(AddDataSourceRequest request) {
            super(request);
            this.addModel = request.addModel;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder addModel(String addModel) {
            this.putQueryParameter("AddModel", addModel);
            this.addModel = addModel;
            return this;
        }

        @Override
        public AddDataSourceRequest build() {
            return new AddDataSourceRequest(this);
        } 

    } 

}
