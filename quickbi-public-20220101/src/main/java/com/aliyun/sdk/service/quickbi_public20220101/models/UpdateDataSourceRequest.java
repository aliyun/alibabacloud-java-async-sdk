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
 * {@link UpdateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceRequest</p>
 */
public class UpdateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateModel;

    private UpdateDataSourceRequest(Builder builder) {
        super(builder);
        this.updateModel = builder.updateModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return updateModel
     */
    public String getUpdateModel() {
        return this.updateModel;
    }

    public static final class Builder extends Request.Builder<UpdateDataSourceRequest, Builder> {
        private String updateModel; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceRequest request) {
            super(request);
            this.updateModel = request.updateModel;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateModel(String updateModel) {
            this.putQueryParameter("UpdateModel", updateModel);
            this.updateModel = updateModel;
            return this;
        }

        @Override
        public UpdateDataSourceRequest build() {
            return new UpdateDataSourceRequest(this);
        } 

    } 

}
