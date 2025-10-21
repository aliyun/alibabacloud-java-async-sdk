// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link DeleteModelInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelInstanceRequest</p>
 */
public class DeleteModelInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelInstanceIdList")
    private java.util.List<Long> modelInstanceIdList;

    private DeleteModelInstanceRequest(Builder builder) {
        super(builder);
        this.modelInstanceIdList = builder.modelInstanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelInstanceIdList
     */
    public java.util.List<Long> getModelInstanceIdList() {
        return this.modelInstanceIdList;
    }

    public static final class Builder extends Request.Builder<DeleteModelInstanceRequest, Builder> {
        private java.util.List<Long> modelInstanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelInstanceRequest request) {
            super(request);
            this.modelInstanceIdList = request.modelInstanceIdList;
        } 

        /**
         * ModelInstanceIdList.
         */
        public Builder modelInstanceIdList(java.util.List<Long> modelInstanceIdList) {
            String modelInstanceIdListShrink = shrink(modelInstanceIdList, "ModelInstanceIdList", "json");
            this.putQueryParameter("ModelInstanceIdList", modelInstanceIdListShrink);
            this.modelInstanceIdList = modelInstanceIdList;
            return this;
        }

        @Override
        public DeleteModelInstanceRequest build() {
            return new DeleteModelInstanceRequest(this);
        } 

    } 

}
