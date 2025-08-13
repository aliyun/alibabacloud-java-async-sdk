// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link ModelDeleteRequest} extends {@link RequestModel}
 *
 * <p>ModelDeleteRequest</p>
 */
public class ModelDeleteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    private ModelDeleteRequest(Builder builder) {
        super(builder);
        this.modelName = builder.modelName;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelDeleteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<ModelDeleteRequest, Builder> {
        private String modelName; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(ModelDeleteRequest request) {
            super(request);
            this.modelName = request.modelName;
            this.regId = request.regId;
        } 

        /**
         * <p>Model name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public ModelDeleteRequest build() {
            return new ModelDeleteRequest(this);
        } 

    } 

}
